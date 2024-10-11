/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.VIEW;

import br.com.DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TelaCadastroClientes extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaCadastroClientes() {
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
    
     public void cadastrar() {
        String sql = "insert into clientes(id_clientes, nome, endereco, telefone, email, cpf_cnpj) values(?, ?, ?, ?, ?, ?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(2, txtNomeCliente.getText());
            pst.setString(3, txtEnderecoCliente.getText());
            pst.setString(4, txtTelefoneCliente.getText());
            pst.setString(5, txtEmailCliente.getText());
            pst.setString(6, txtCpfCliente.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

            } else {
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
                txtNomeCliente.setText(null);
                txtEnderecoCliente.setText(null);
                txtTelefoneCliente.setText(null);
                txtEmailCliente.setText(null);
                txtCpfCliente.setText(null);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisar " + e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblConexaoSql = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefoneCliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtIDCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblConexaoSql.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblConexaoSql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/conexaofail.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel4.setText("Email");

        txtEmailCliente.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        txtNomeCliente.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtNomeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel6.setText("Endereço");

        txtEnderecoCliente.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel3.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel7.setText("CPF/CNPJ");

        txtTelefoneCliente.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneClienteActionPerformed(evt);
            }
        });

        txtCpfCliente.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteActionPerformed(evt);
            }
        });

        btnCadastro.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registericon.png"))); // NOI18N
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/searchicon.png"))); // NOI18N
        jButton1.setText("Pesquisar");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deleteicon.png"))); // NOI18N
        jButton2.setText("Deletar");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editicon.png"))); // NOI18N
        jButton3.setText("Editar");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cleanicon.png"))); // NOI18N
        jButton4.setText("Limpar");

        txtIDCliente.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtIDCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel5.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblConexaoSql)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCadastro)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(55, 55, 55)
                                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel4))
                                                    .addGap(15, 15, 15)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEnderecoCliente)
                                                .addComponent(txtTelefoneCliente)
                                                .addComponent(txtCpfCliente)
                                                .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(35, 35, 35)
                                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConexaoSql))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneClienteActionPerformed

    private void txtCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfClienteActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        cadastrar();
    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblConexaoSql;
    public static javax.swing.JTextField txtCpfCliente;
    public static javax.swing.JTextField txtEmailCliente;
    public static javax.swing.JTextField txtEnderecoCliente;
    public static javax.swing.JTextField txtIDCliente;
    public static javax.swing.JTextField txtNomeCliente;
    public static javax.swing.JTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
