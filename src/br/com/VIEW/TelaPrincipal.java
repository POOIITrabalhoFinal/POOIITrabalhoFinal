/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.VIEW;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        lblData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        sMenuClientes = new javax.swing.JMenuItem();
        sMenuUsuarios = new javax.swing.JMenuItem();
        sMenuAgenda = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        sMenuSair = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Candara", 1, 68)); // NOI18N
        jLabel1.setText("Tela Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jDesktopPane2.setBackground(new java.awt.Color(51, 51, 51));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblData.setBackground(new java.awt.Color(0, 0, 0));
        lblData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblData.setText("Data");
        jDesktopPane2.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 415, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ichigobg.jpg"))); // NOI18N
        jDesktopPane2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 450));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastroicon.jpeg"))); // NOI18N
        menuCadastro.setText("Cadastro");
        menuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clienteicon.png"))); // NOI18N
        sMenuClientes.setText("Clientes");
        sMenuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMenuClientesActionPerformed(evt);
            }
        });
        menuCadastro.add(sMenuClientes);

        sMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarioicon.png"))); // NOI18N
        sMenuUsuarios.setText("Usuários");
        sMenuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMenuUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(sMenuUsuarios);

        sMenuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agendaicon.jpeg"))); // NOI18N
        sMenuAgenda.setText("Agenda");
        sMenuAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sMenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMenuAgendaActionPerformed(evt);
            }
        });
        menuCadastro.add(sMenuAgenda);

        jMenuBar1.add(menuCadastro);

        menuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/optionsicon.png"))); // NOI18N
        menuOpcoes.setText("Opções");
        menuOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sairicon.png"))); // NOI18N
        sMenuSair.setText("Sair");
        sMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMenuSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(sMenuSair);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMenuClientesActionPerformed
        TelaCadastroClientes tCadClientes = new TelaCadastroClientes();
        tCadClientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_sMenuClientesActionPerformed

    private void sMenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMenuAgendaActionPerformed
        TelaAgenda tAgenda = new TelaAgenda();
        tAgenda.setVisible(true);
        dispose();
    }//GEN-LAST:event_sMenuAgendaActionPerformed

    private void sMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMenuUsuariosActionPerformed
        TelaCadastroUsuarios tUsuarios = new TelaCadastroUsuarios();
        tUsuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_sMenuUsuariosActionPerformed

    private void sMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMenuSairActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?",
                "Sair", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_sMenuSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem sMenuAgenda;
    private javax.swing.JMenuItem sMenuClientes;
    private javax.swing.JMenuItem sMenuSair;
    private javax.swing.JMenuItem sMenuUsuarios;
    // End of variables declaration//GEN-END:variables
}
