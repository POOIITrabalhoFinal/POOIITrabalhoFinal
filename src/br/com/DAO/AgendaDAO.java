package br.com.DAO;

import br.com.DTO.AgendaDTO;
import br.com.VIEW.TelaAgenda;
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
    
    public void pesquisaAuto(AgendaDTO objAgendaDTO){
        String sql = "select * from tb_agenda";
        conexao = ConexaoDAO.conector();
        
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaAgenda.tblAgenda.getModel();
            model.setNumRows(0);
            
            while (rs.next()){
                int id = rs.getInt("id_agenda");
                Date data = rs.getDate("data_agenda");
                Time hora = rs.getTime("hora");
                String desc = rs.getString("descricao");
                int fk = rs.getInt("fk_clientes");
                model.addRow(new Object[]{id, data, hora, desc, fk});
            }
            conexao.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: "+e);
        }
        
    }
    
    
}
