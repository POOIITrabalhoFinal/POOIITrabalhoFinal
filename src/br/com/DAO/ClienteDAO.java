package br.com.DAO;

import br.com.DTO.ClienteDTO;
import br.com.VIEW.InternalFrameCadastroClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void cadastrarCliente(ClienteDTO objClienteDTO) {
        String sql = "insert into tb_clientes(id_clientes, nome, endereco, telefone, email, cpf_cnpj) values(?, ?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClienteDTO.getId_cliente());
            pst.setString(2, objClienteDTO.getNomeCliente());
            pst.setString(3, objClienteDTO.getEndCliente());
            pst.setString(4, objClienteDTO.getTelCliente());
            pst.setString(5, objClienteDTO.getEmailCliente());
            pst.setString(6, objClienteDTO.getCpf_cnpjCliente());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCadastro feito com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            if (e.getMessage().contains("tb_clientes.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "ERRO: ID já está em uso.");
            } else if (e.getMessage().contains("tb_clientes.telefone_UNIQUE")) {
                JOptionPane.showMessageDialog(null, "ERRO: Telefone já está em uso.");
            } else if (e.getMessage().contains("tb_clientes.cpf_cnpj_UNIQUE")) {
                JOptionPane.showMessageDialog(null, "ERRO: CPF ou CNPJ já está em uso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente: " + e);
            }
        }

    }

    public void pesquisar(ClienteDTO objClienteDTO) {
        String sql = "select * from tb_clientes where id_clientes = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClienteDTO.getId_cliente());
            rs = pst.executeQuery();
            if (rs.next()) {
                InternalFrameCadastroClientes.txtNomeCliente.setText(rs.getString(2));
                InternalFrameCadastroClientes.txtEnderecoCliente.setText(rs.getString(3));
                InternalFrameCadastroClientes.txtTelefoneCliente.setText(rs.getString(4));
                InternalFrameCadastroClientes.txtEmailCliente.setText(rs.getString(5));
                InternalFrameCadastroClientes.txtCpfCliente.setText(rs.getString(6));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Cliente não cadastrado.");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisar: " + e);
            limpar();
        }
    }

    public void editar(ClienteDTO objClienteDTO) {
        String sql = "update tb_clientes set nome = ?, endereco = ?, telefone = ?, email = ?, cpf_cnpj = ? where id_clientes = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(6, objClienteDTO.getId_cliente());
            pst.setString(1, objClienteDTO.getNomeCliente());
            pst.setString(2, objClienteDTO.getEndCliente());
            pst.setString(3, objClienteDTO.getTelCliente());
            pst.setString(4, objClienteDTO.getEmailCliente());
            pst.setString(5, objClienteDTO.getCpf_cnpjCliente());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCliente editado com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Cliente não existe.");
                conexao.close();
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Editar: " + e);
        }
    }

    public void apagar(ClienteDTO objClienteDTO) {
        String sql = "delete from tb_clientes where id_clientes = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClienteDTO.getId_cliente());
            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCliente excluído com êxito.");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Apagar: " + e);
        }
    }

    public void limpar() {
        InternalFrameCadastroClientes.txtIDCliente.setText(null);
        InternalFrameCadastroClientes.txtNomeCliente.setText(null);
        InternalFrameCadastroClientes.txtEnderecoCliente.setText(null);
        InternalFrameCadastroClientes.txtTelefoneCliente.setText(null);
        InternalFrameCadastroClientes.txtEmailCliente.setText(null);
        InternalFrameCadastroClientes.txtCpfCliente.setText(null);
    }
}
