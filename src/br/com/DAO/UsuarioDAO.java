package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import br.com.VIEW.TelaCadastroUsuarios;
import br.com.VIEW.TelaPrincipal;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void inserirUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "insert into tb_usuarios(id_usuarios, nome, email, nome_usuario, senha) values(?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());
            pst.setString(2, objUsuarioDTO.getNome());
            pst.setString(3, objUsuarioDTO.getEmail());
            pst.setString(4, objUsuarioDTO.getUsername());
            pst.setString(5, objUsuarioDTO.getSenha());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCadastro feito com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            if (e.getMessage().contains("tb_usuarios.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "ERRO: ID já está em uso.");
            } else if (e.getMessage().contains("tb_usuarios.nome_usuario_UNIQUE")) {
                JOptionPane.showMessageDialog(null, "ERRO: Nome de usuário já está em uso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir usuário: " + e);
            }
        }

    }

    public void pesquisar(UsuarioDTO objUsuarioDTO) {
        String sql = "select * from tb_usuarios where id_usuarios = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());
            rs = pst.executeQuery();
            if (rs.next()) {
                TelaCadastroUsuarios.txtUsernameUsuario.setText(rs.getString(2));
                TelaCadastroUsuarios.txtEmailUsuario.setText(rs.getString(3));
                TelaCadastroUsuarios.txtUsernameUsuario.setText(rs.getString(4));
                TelaCadastroUsuarios.txtSenha.setText(rs.getString(5));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Usuário não cadastrado.");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisar: " + e);
            limpar();
        }
    }

    public void logar(UsuarioDTO objUsuarioDTO) {
        String sql = "select * from tb_usuarios where nome_usuario = ? and senha = ?";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            //pst.setString(1, txtUsuario.getText());
            //pst.setString(2, txtSenha.getText());
            pst.setString(1, objUsuarioDTO.getNome());
            pst.setString(2, objUsuarioDTO.getSenha());

            rs = pst.executeQuery();

            if (rs.next()) {
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Usuário e/ou senha inválidos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Login: " + e);
        }
    }

    public void editar(UsuarioDTO objUsuarioDTO) {
        String sql = "update tb_usuarios set nome = ?, email = ?, nome_usuario = ?, senha = ? where id_usuarios = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(5, objUsuarioDTO.getId_usuario());
            pst.setString(1, objUsuarioDTO.getNome());
            pst.setString(2, objUsuarioDTO.getEmail());
            pst.setString(3, objUsuarioDTO.getUsername());
            pst.setString(4, objUsuarioDTO.getSenha());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nUsuário editado com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Usuário não existe.");
                conexao.close();
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Editar: " + e);
        }
    }

    public void apagar(UsuarioDTO objUsuarioDTO) {
        String sql = "delete from tb_usuarios where id_usuarios = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());
            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nUsuário excluído com êxito.");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Apagar: " + e);
        }
    }

    public void limpar() {
        TelaCadastroUsuarios.txtIDUsuario.setText(null);
        TelaCadastroUsuarios.txtNomeUsuario.setText(null);
        TelaCadastroUsuarios.txtEmailUsuario.setText(null);
        TelaCadastroUsuarios.txtUsernameUsuario.setText(null);
        TelaCadastroUsuarios.txtSenha.setText(null);
    }
}
