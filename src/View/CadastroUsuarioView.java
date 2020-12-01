/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Bean.Users;
import Model.DAO.UsersDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author delri
 */
public class CadastroUsuarioView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuarioView
     */
    public CadastroUsuarioView() {
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelCadastro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtRecebeNome = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtRecebeLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        passRecebeSenha = new javax.swing.JPasswordField();
        lblSenha1 = new javax.swing.JLabel();
        passConfirmaSenha = new javax.swing.JPasswordField();
        ccbAdministrador = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtLabelCadastroUsuário = new javax.swing.JLabel();
        painelBusca = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBuscaNome = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnSalvarLista = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltarLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(111, 148, 148));

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setText("Nome:");

        txtRecebeNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecebeNomeActionPerformed(evt);
            }
        });

        lblLogin.setText("Login:");

        lblSenha.setText("Senha:");

        lblSenha1.setText("Confirme sua senha:");

        ccbAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        ccbAdministrador.setText("Administrador");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtLabelCadastroUsuário.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtLabelCadastroUsuário.setText("Cadastro de Usuário");

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLabelCadastroUsuário)
                    .addComponent(ccbAdministrador)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRecebeLogin)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(passRecebeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSenha1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRecebeNome, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(lblSenha))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap())
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(txtLabelCadastroUsuário)
                .addGap(35, 35, 35)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSenha)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRecebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRecebeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogin))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSenha1)
                            .addComponent(passConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passRecebeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(ccbAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Cadastrar", painelCadastro);

        painelBusca.setBackground(new java.awt.Color(255, 255, 255));

        lblBuscaNome.setText("Nome:");

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Login", "Senha", "Adm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLista);

        btnSalvarLista.setText("Salvar");
        btnSalvarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarListaActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltarLista.setText("Voltar");
        btnVoltarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBuscaLayout = new javax.swing.GroupLayout(painelBusca);
        painelBusca.setLayout(painelBuscaLayout);
        painelBuscaLayout.setHorizontalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBuscaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBuscaNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscaNome)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusca))
                    .addGroup(painelBuscaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscaLayout.createSequentialGroup()
                        .addGap(0, 378, Short.MAX_VALUE)
                        .addComponent(btnVoltarLista)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarLista)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        painelBuscaLayout.setVerticalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaNome)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarLista)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltarLista))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar", painelBusca);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarListaActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_btnVoltarListaActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
        // Instanciamento da Classe de acesso ao banco de dados de usuarios
        UsersDAO UD = new UsersDAO();
        // caso o campo de busca esteja vazio o programa ira exibir todos os usuarios
        if (txtBuscaNome.getText().equals("")) {
            // instanciamento da lista de usuarios onde os resultados serao armazenados
            List<Users> usuarios = new ArrayList<Users>();
            // comando da classe de acesso ao banco de usuarios para buscar todos os usuarios cadastrados
            usuarios = UD.Read();
            // instanciamentdo de objeto para manipulacao de tabela
            DefaultTableModel modelo = (DefaultTableModel) tblLista.getModel();
            // zerar o numero de linha da tabela
            modelo.setNumRows(0);
            // para cada usuario que iremos nos referir genericamente por U iremos realizar a açao entre chaves
            usuarios.forEach(U -> {
                // adiciona uma linha na tabela com os dados do usuario U em questao
                modelo.addRow(new Object[]{
                    U.getNome(), U.getLogin(), U.getPassword(), U.isAdm()
                });
            });
        } // caso o campo tenha um nome a tabela sera preenchida apenas com os usuarios com o nome semelhantes
        else {
            // instanciamento da lista de usuarios onde os resultados serao armazenados
            List<Users> usuarios = new ArrayList<Users>();
            // comando da classe de acesso ao banco de usuatios onde retorna a busca no banco para o nome do usuario
            usuarios = UD.Busca(txtBuscaNome.getText());
            // instanciamentdo de objeto para manipulacao de tabela
            DefaultTableModel modelo = (DefaultTableModel) tblLista.getModel();
            // zerar o numero de linha da tabela
            modelo.setNumRows(0);
            // para cada usuario que iremos nos referir genericamente por U iremos realizar a açao entre chaves
            usuarios.forEach(U -> {
                // adiciona uma linha na tabela com os dados do usuario U em questao
                modelo.addRow(new Object[]{
                    U.getNome(), U.getLogin(), U.getPassword(), U.isAdm()
                });
            });
        }

    }//GEN-LAST:event_btnBuscaActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        UsersDAO UD = new UsersDAO();
        List<Users> usuarios = new ArrayList<Users>();
        // comando da classe de acesso ao banco de usuarios para buscar todos os usuarios cadastrados
        usuarios = UD.Read();
        // instanciamentdo de objeto para manipulacao de tabela
        DefaultTableModel modelo = (DefaultTableModel) tblLista.getModel();
        // zerar o numero de linha da tabela
        modelo.setNumRows(0);
        // para cada usuario que iremos nos referir genericamente por U iremos realizar a açao entre chaves
        usuarios.forEach(U -> {
            // adiciona uma linha na tabela com os dados do usuario U em questao
            modelo.addRow(new Object[]{
                U.getNome(), U.getLogin(), U.getPassword(), U.isAdm()
            });
        });
    }//GEN-LAST:event_formWindowActivated

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        //executar caso tenha uma linha selecionada
        if (tblLista.getSelectedRow() != -1){
            // intanciar a um objeto de manipulacao de banco de usuarios
            UsersDAO udao = new UsersDAO();
            // instanciar um usuario
            Users u = new Users();
            // adicionar um login no objeto usuario previamente instanciado
            u.setLogin((String)tblLista.getValueAt(tblLista.getSelectedRow(),1));
            // executar a acao de deletar o usuario
            udao.Delete(u);
        }else{
            // exibir mensagem para selecionar uma linha
            JOptionPane.showMessageDialog(null,"Selecione uma linha/usuário!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarListaActionPerformed
        // TODO add your handling code here:
        //executar caso tenha uma linha selecionada
        if(tblLista.getSelectedRow() != -1){
            // intanciar a um objeto de manipulacao de banco de usuarios
            UsersDAO udao = new UsersDAO();
            // instanciar um usuario
            Users u = new Users();
            // criacao do usuario
            u.setNome((String)tblLista.getValueAt(tblLista.getSelectedRow(),0));
            u.setLogin((String)tblLista.getValueAt(tblLista.getSelectedRow(),1));
            u.setPassword((String)tblLista.getValueAt(tblLista.getSelectedRow(),2));
            u.setAdm((Boolean)tblLista.getValueAt(tblLista.getSelectedRow(),3));
            udao.Update(u, u.getLogin());
            
        }else{
            // exibir mensagem para selecionar uma linha
            JOptionPane.showMessageDialog(null,"Selecione uma linha/usuário!");
        }
    }//GEN-LAST:event_btnSalvarListaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:

        if (passRecebeSenha.getText().equals(passConfirmaSenha.getText())) {
            Users usuario = new Users();
            usuario.setNome(txtRecebeNome.getText());
            usuario.setLogin(txtRecebeLogin.getText());
            usuario.setPassword(passRecebeSenha.getText());
            usuario.setAdm(ccbAdministrador.isSelected());

            UsersDAO UD = new UsersDAO();
            UD.Create(usuario);

        } else {
            JOptionPane.showMessageDialog(this, "Senhas diferentes");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtRecebeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecebeNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecebeNomeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarLista;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltarLista;
    private javax.swing.JCheckBox ccbAdministrador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBuscaNome;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JPanel painelBusca;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPasswordField passConfirmaSenha;
    private javax.swing.JPasswordField passRecebeSenha;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JLabel txtLabelCadastroUsuário;
    private javax.swing.JTextField txtRecebeLogin;
    private javax.swing.JTextField txtRecebeNome;
    // End of variables declaration//GEN-END:variables
}
