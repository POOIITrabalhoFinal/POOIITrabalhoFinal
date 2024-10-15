/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.VIEW;

import br.com.DAO.ConexaoDAO;
import br.com.DAO.UsuarioDAO;
import br.com.DTO.UsuarioDTO;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TelaCadastroUsuarios extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaCadastroUsuarios() {
        initComponents();
        conexao = ConexaoDAO.conector();

        if (conexao != null) {
            ImageIcon iconeSuccess = new ImageIcon("src/img/conexaosuccess.png");
            lblConexaoSql.setIcon(iconeSuccess);
        } else {
            ImageIcon iconeFail = new ImageIcon("src/img/conexaofail.png");
            lblConexaoSql.setIcon(iconeFail);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtIDUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsernameUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        lblConexaoSql = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JTextField();
        btnApagar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editicon.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cleanicon.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtIDUsuario.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtIDUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel3.setText("Nome Usuário");

        jLabel5.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel5.setText("ID");

        jLabel7.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel7.setText("Senha");

        txtUsernameUsuario.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtUsernameUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameUsuarioActionPerformed(evt);
            }
        });

        txtSenha.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lblConexaoSql.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblConexaoSql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/conexaofail.png"))); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registericon.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel4.setText("Email");

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");

        txtEmailUsuario.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/searchicon.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtNomeUsuario.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtNomeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deleteicon.png"))); // NOI18N
        btnApagar.setText("Deletar");
        btnApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return_icon.png"))); // NOI18N
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblConexaoSql)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCadastrar)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(15, 15, 15)
                                    .addComponent(txtUsernameUsuario))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(56, 56, 56)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConexaoSql))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsernameUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnApagar)
                    .addComponent(btnEditar)
                    .addComponent(btnPesquisar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameUsuarioActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtIDUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Coloque um ID.");
        } else if (txtNomeUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Coloque um nome.");
        } else if (txtUsernameUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Coloque um nome de Usuário.");
        } else if (txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Coloque uma senha.");
        } else if (txtEmailUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Coloque um email.");
        } else {

            int id_usuario = Integer.parseInt(txtIDUsuario.getText());
            String nome_usuario = txtNomeUsuario.getText();
            String email_usuario = txtEmailUsuario.getText();
            String login_usuario = txtUsernameUsuario.getText();
            String senha_usuario = txtSenha.getText();

            UsuarioDTO objUsuarioDTO = new UsuarioDTO();
            objUsuarioDTO.setId_usuario(id_usuario);
            objUsuarioDTO.setNome(nome_usuario);
            objUsuarioDTO.setEmail(email_usuario);
            objUsuarioDTO.setUsername(login_usuario);
            objUsuarioDTO.setSenha(senha_usuario);

            UsuarioDAO uDAO = new UsuarioDAO();
            uDAO.inserirUsuario(objUsuarioDTO);

            uDAO.limpar();
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUsuarioActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String id_usuario = txtIDUsuario.getText();

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setId_usuario(Integer.parseInt(id_usuario));

        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.pesquisar(objUsuarioDTO);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String id_usuario = txtIDUsuario.getText();
        String nome_usuario = txtNomeUsuario.getText();
        String email_usuario = txtEmailUsuario.getText();
        String login_usuario = txtUsernameUsuario.getText();
        String senha_usuario = txtSenha.getText();

        // Transferência de informações para classe UsuarioDTO
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setId_usuario(Integer.parseInt(id_usuario));
        objUsuarioDTO.setNome(nome_usuario);
        objUsuarioDTO.setEmail(email_usuario);
        objUsuarioDTO.setUsername(login_usuario);
        objUsuarioDTO.setSenha(senha_usuario);

        // Criação do objeto DAO
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.editar(objUsuarioDTO);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar este usuário?",
                "Deletar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        
        String id_usuario = txtIDUsuario.getText();

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setId_usuario(Integer.parseInt(id_usuario));

        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.apagar(objUsuarioDTO);
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal tPrincipal = new TelaPrincipal();
        tPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblConexaoSql;
    public static javax.swing.JTextField txtEmailUsuario;
    public static javax.swing.JTextField txtIDUsuario;
    public static javax.swing.JTextField txtNomeUsuario;
    public static javax.swing.JTextField txtSenha;
    public static javax.swing.JTextField txtUsernameUsuario;
    // End of variables declaration//GEN-END:variables
}
