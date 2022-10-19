/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import Modelo.Usuario;
import dao.usuarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class usuarioGUI extends javax.swing.JFrame {

    /**
     * Creates new form usuarioGUI
     */
    public usuarioGUI() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        campoRg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoCEP = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setFocusCycleRoot(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuário");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Cadastrar novo usuário:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Nome: ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("E-mail: ");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Telefone:");

        campoNome.setBackground(new java.awt.Color(131, 133, 134));
        campoNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoNome.setForeground(new java.awt.Color(0, 0, 0));
        campoNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNome.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoNome.setSelectionColor(new java.awt.Color(151, 186, 252));

        campoEmail.setBackground(new java.awt.Color(131, 133, 134));
        campoEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(0, 0, 0));
        campoEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoEmail.setSelectionColor(new java.awt.Color(151, 186, 252));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        campoTelefone.setBackground(new java.awt.Color(131, 133, 134));
        campoTelefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoTelefone.setForeground(new java.awt.Color(0, 0, 0));
        campoTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTelefone.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoTelefone.setSelectionColor(new java.awt.Color(151, 186, 252));

        campoCPF.setBackground(new java.awt.Color(131, 133, 134));
        campoCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoCPF.setForeground(new java.awt.Color(0, 0, 0));
        campoCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCPF.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoCPF.setSelectionColor(new java.awt.Color(151, 186, 252));
        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });

        btnCadastro.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnCadastro.setText("Cadastrar");
        btnCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        campoRg.setBackground(new java.awt.Color(131, 133, 134));
        campoRg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoRg.setForeground(new java.awt.Color(0, 0, 0));
        campoRg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoRg.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoRg.setSelectionColor(new java.awt.Color(151, 186, 252));
        campoRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRgActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Rg:");

        campoSenha.setBackground(new java.awt.Color(131, 133, 134));
        campoSenha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(0, 0, 0));
        campoSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSenha.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoSenha.setSelectionColor(new java.awt.Color(151, 186, 252));

        campoLogin.setBackground(new java.awt.Color(131, 133, 134));
        campoLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoLogin.setForeground(new java.awt.Color(0, 0, 0));
        campoLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoLogin.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoLogin.setSelectionColor(new java.awt.Color(151, 186, 252));

        campoBairro.setBackground(new java.awt.Color(131, 133, 134));
        campoBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoBairro.setForeground(new java.awt.Color(0, 0, 0));
        campoBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoBairro.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoBairro.setSelectionColor(new java.awt.Color(151, 186, 252));
        campoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairroActionPerformed(evt);
            }
        });

        campoCEP.setBackground(new java.awt.Color(131, 133, 134));
        campoCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoCEP.setForeground(new java.awt.Color(0, 0, 0));
        campoCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCEP.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoCEP.setSelectionColor(new java.awt.Color(151, 186, 252));
        campoCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCEPActionPerformed(evt);
            }
        });

        campoEndereco.setBackground(new java.awt.Color(131, 133, 134));
        campoEndereco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoEndereco.setForeground(new java.awt.Color(0, 0, 0));
        campoEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoEndereco.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoEndereco.setSelectionColor(new java.awt.Color(151, 186, 252));
        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Endereço:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("CEP");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setText("Bairro: ");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setText("Login:");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel12.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(campoTelefone))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoEmail))))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoLogin)
                            .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(campoBairro)
                            .addComponent(campoCEP))))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoRg, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel8))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel12))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        Usuario usuarios = new Usuario();
        
        usuarios.setNome(campoNome.getText());
        usuarios.setCpf(campoCPF.getText());
        usuarios.setEmail(campoEmail.getText());
        usuarios.setTelefone(campoTelefone.getText());
        usuarios.setRg(campoRg.getText());
        usuarios.setEndereco(campoEndereco.getText());
        usuarios.setCep(campoCEP.getText());
        usuarios.setBairro(campoBairro.getText());
        usuarios.setLogin(campoLogin.getText());
        usuarios.setSenha(campoSenha.getText());
        
        if ((campoNome.getText().isEmpty()) || (campoCPF.getText().isEmpty()) || (campoEmail.getText().isEmpty()) || (campoTelefone.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Campo Inválido!");
        }
        
        else {
            usuarioDAO dao = new usuarioDAO();
            
            dao.adiciona(usuarios);
            
            JOptionPane.showMessageDialog( null, "Usuário " + campoNome.getText() + " adicionado com sucesso!");
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        campoNome.setText("");
        campoEmail.setText("");
        campoTelefone.setText("");
        campoCPF.setText("");
        campoRg.setText("");
        campoEndereco.setText("");
        campoCEP.setText("");
        campoBairro.setText("");
        campoLogin.setText("");
        campoSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void campoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairroActionPerformed

    private void campoCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCEPActionPerformed

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed

    private void campoRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRgActionPerformed

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
            java.util.logging.Logger.getLogger(usuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastro;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoRg;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
