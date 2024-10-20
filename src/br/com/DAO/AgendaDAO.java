package br.com.DAO;

import net.proteanit.sql.DbUtils;
import br.com.DTO.AgendaDTO;
import br.com.VIEW.InternalFrameAgenda;
import static br.com.VIEW.InternalFrameAgenda.tblAgenda;
import static br.com.VIEW.InternalFrameAgenda.txtPesquisa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.Time;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgendaDAO {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void pesquisa(AgendaDTO objAgendaDTO){
        String sql = "select * from tb_agenda where nome_clientes like ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisa.getText() + "%");
            rs = pst.executeQuery();
            
            tblAgenda.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa: "+e);
        }
    }
    
    
    public void pesquisaAuto(){
        String sql = "select * from tb_agenda";
        conexao = ConexaoDAO.conector();
        
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) InternalFrameAgenda.tblAgenda.getModel();
            model.setNumRows(0);
            
            while (rs.next()){
                int id = rs.getInt("id_agenda");
                Date data = rs.getDate("data_agenda");
                Time hora = rs.getTime("hora");
                String desc = rs.getString("descricao");
                String nomeCli = rs.getString("nome_clientes");
                model.addRow(new Object[]{id, data, hora, desc, nomeCli});
            }
            conexao.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: "+e);
        }
        
    }
    
    public void deletar(AgendaDTO objAgendaDTO) {
        String sql = "delete from tb_agenda where id_agenda = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objAgendaDTO.getId_agenda());
            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nEvento excluído com êxito.");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Deletar: " + e);
        }
    }
    
    public void registrarEvento(AgendaDTO objAgendaDTO) {
        String sql = "insert into tb_agenda(id_agenda, data_agenda, hora, descricao, nome_clientes) values (?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objAgendaDTO.getId_agenda());
            pst.setString(2, objAgendaDTO.getData_agenda());
            pst.setString(3, objAgendaDTO.getHora());
            pst.setString(4, objAgendaDTO.getDesc());
            pst.setString(5, objAgendaDTO.getNome_cliente());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nEvento registrado com êxito");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao registrar evento.");
            }
            pst.close();

        } catch (Exception e) {
            if (e.getMessage().contains("tb_clientes.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "ERRO: ID já está em uso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente: " + e);
            }
        }
    }
    
    public void editar(AgendaDTO objAgendaDTO) {
        String sql = "update tb_agenda set data_agenda = ?, hora = ?, descricao = ?, nome_clientes  = ? where id_agenda = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(5, objAgendaDTO.getId_agenda());
            pst.setString(1, objAgendaDTO.getData_agenda());
            pst.setString(2, objAgendaDTO.getHora());
            pst.setString(3, objAgendaDTO.getDesc());
            pst.setString(4, objAgendaDTO.getNome_cliente());

            int add = pst.executeUpdate();

            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO!\nEvento editada com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Evento não existe.");
                conexao.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Editar " + e);
        }

    }

public void limpar() {
        InternalFrameAgenda.txtIDAgenda.setText(null);
        InternalFrameAgenda.txtNomeCliente.setText(null);
        InternalFrameAgenda.txtDia.setText(null);
        InternalFrameAgenda.txtMes.setText(null);
        InternalFrameAgenda.txtAno.setText(null);
        InternalFrameAgenda.txtHora.setText(null);
        InternalFrameAgenda.txtMin.setText(null);
        InternalFrameAgenda.txtDesc.setText(null);
    }    
    
}
