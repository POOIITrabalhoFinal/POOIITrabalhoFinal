/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.VIEW;

import br.com.DAO.ClienteDAO;
import br.com.DAO.ConexaoDAO;
import br.com.DTO.ClienteDTO;
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
        btnPesquisar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtIDCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

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
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/searchicon.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deleteicon.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

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

        txtIDCliente.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtIDCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel5.setText("ID");

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
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConexaoSql))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnLimpar)
                    .addComponent(btnDeletar)
                    .addComponent(btnEditar)
                    .addComponent(btnPesquisar))
                .addContainerGap(37, Short.MAX_VALUE))
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

        if (txtIDCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo ID");
        } else if (txtNomeCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Nome");
        } else if (txtEnderecoCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Endereço");
        } else if (txtTelefoneCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Telefone.");
        } else if (txtCpfCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo CPF/CNPJ");
        } else if (txtEmailCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo E-mail");
        } else {

            // Captura de dados no JFrame
            int id_cliente = Integer.parseInt(txtIDCliente.getText());
            String nome_cliente = txtNomeCliente.getText();
            String endereco_cliente = txtEnderecoCliente.getText();
            String telefone_cliente = txtTelefoneCliente.getText();
            String email_cliente = txtEmailCliente.getText();
            String cpfcnpj_cliente = txtCpfCliente.getText();

            // Transferência
            ClienteDTO objClienteDTO = new ClienteDTO();
            objClienteDTO.setId_cliente(id_cliente);
            objClienteDTO.setNomeCliente(nome_cliente);
            objClienteDTO.setEndCliente(endereco_cliente);
            objClienteDTO.setTelCliente(telefone_cliente);
            objClienteDTO.setEmailCliente(email_cliente);
            objClienteDTO.setCpf_cnpjCliente(cpfcnpj_cliente);

            // Instanciando
            ClienteDAO objClienteDAO = new ClienteDAO();
            objClienteDAO.cadastrarCliente(objClienteDTO);
            objClienteDAO.limpar();
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // Captura de dados no JFrames
        String id_cliente = txtIDCliente.getText();

        // Transferência
        ClienteDTO objClienteDTO = new ClienteDTO();
        objClienteDTO.setId_cliente(Integer.parseInt(id_cliente));

        // Instanciando
        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.pesquisar(objClienteDTO);

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        if (txtIDCliente.getText().isEmpty() && txtNomeCliente.getText().isEmpty()
                && txtEnderecoCliente.getText().isEmpty() && txtTelefoneCliente.getText().isEmpty()
                && txtEmailCliente.getText().isEmpty() && txtCpfCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Não há nada a ser limpado.");
        } else {

            // Instanciando
            ClienteDAO objClienteDAO = new ClienteDAO();
            objClienteDAO.limpar();
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar este cliente?",
                "Deletar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {  
            // Captura de dados no JFrames
            String id_cliente = txtIDCliente.getText();

            // Transferência
            ClienteDTO objClienteDTO = new ClienteDTO();
            objClienteDTO.setId_cliente(Integer.parseInt(id_cliente));

            // Instanciando
            ClienteDAO objClienteDAO = new ClienteDAO();
            objClienteDAO.apagar(objClienteDTO);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Captura de dados no JFrames
        int id_cliente = Integer.parseInt(txtIDCliente.getText());
        String nome_cliente = txtNomeCliente.getText();
        String endereco_cliente = txtEnderecoCliente.getText();
        String telefone_cliente = txtTelefoneCliente.getText();
        String email_cliente = txtEmailCliente.getText();
        String cpfcnpj_cliente = txtCpfCliente.getText();

        // Transferência
        ClienteDTO objClienteDTO = new ClienteDTO();
        objClienteDTO.setId_cliente(id_cliente);
        objClienteDTO.setNomeCliente(nome_cliente);
        objClienteDTO.setEndCliente(endereco_cliente);
        objClienteDTO.setTelCliente(telefone_cliente);
        objClienteDTO.setEmailCliente(email_cliente);
        objClienteDTO.setCpf_cnpjCliente(cpfcnpj_cliente);

        // Instanciando
        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.editar(objClienteDTO);
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
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
