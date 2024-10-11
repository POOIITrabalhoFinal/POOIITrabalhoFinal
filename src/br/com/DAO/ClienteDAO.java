
package br.com.DAO;

import br.com.DTO.ClienteDTO;
import br.com.VIEW.TelaCadastroClientes;
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
            pst.setInt(4, objClienteDTO.getTelCliente());
            pst.setString(5, objClienteDTO.getEmailCliente());
            pst.setInt(6, objClienteDTO.getCpf_cnpjCliente());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            if (e.getMessage().contains("tb_clientes.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "ID já está em uso.");
            } else if (e.getMessage().contains("tb_clientes.telefone_UNIQUE")) {
                JOptionPane.showMessageDialog(null, "Telefone já está em uso.");
            } else if (e.getMessage().contains("tb_clientes.cpf_cnpj_UNIQUE")) {
                JOptionPane.showMessageDialog(null, "CPF ou CNPJ já está em uso.");
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
                TelaCadastroClientes.txtNomeCliente.setText(rs.getString(2));
                TelaCadastroClientes.txtEnderecoCliente.setText(rs.getString(3));
                TelaCadastroClientes.txtTelefoneCliente.setText(rs.getString(4));
                TelaCadastroClientes.txtEmailCliente.setText(rs.getString(5));
                TelaCadastroClientes.txtCpfCliente.setText(rs.getString(6));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado.");
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
            pst.setInt(3, objClienteDTO.getTelCliente());
            pst.setString(4, objClienteDTO.getEmailCliente());
            pst.setInt(5, objClienteDTO.getCpf_cnpjCliente());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Cliente editado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não existe.");
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
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Apagar: " + e);
        }
    }

    public void limpar() {
        TelaCadastroClientes.txtIDCliente.setText(null);
        TelaCadastroClientes.txtNomeCliente.setText(null);
        TelaCadastroClientes.txtEnderecoCliente.setText(null);
        TelaCadastroClientes.txtTelefoneCliente.setText(null);
        TelaCadastroClientes.txtEmailCliente.setText(null);
        TelaCadastroClientes.txtCpfCliente.setText(null);
    }
}
