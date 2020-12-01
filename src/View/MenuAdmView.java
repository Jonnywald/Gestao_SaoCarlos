/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


/**
 *
 * @author Débora
 */
public class MenuAdmView extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmView
     */
    private static MenuAdmView myInstance;

    public static MenuAdmView getInstance() {
        if (myInstance == null) {
            myInstance = new MenuAdmView();
        }
        return myInstance;
    }
    public MenuAdmView() {
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
        lblBemVindo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVenda = new javax.swing.JButton();
        btnEngarrafamento = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnMelado = new javax.swing.JButton();
        btnBebidasMistas = new javax.swing.JButton();
        btnCachaça = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnBarril = new javax.swing.JButton();
        btnRapadura = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        lblBemVindo1 = new javax.swing.JLabel();
        lblBemVindo2 = new javax.swing.JLabel();
        lblBemVindo3 = new javax.swing.JLabel();
        lblBemVindo4 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(111, 148, 148));

        lblBemVindo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setText("Bem Vindo! ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnVenda.setBackground(new java.awt.Color(204, 204, 204));
        btnVenda.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnVenda.setText("VENDAS");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnEngarrafamento.setBackground(new java.awt.Color(204, 204, 204));
        btnEngarrafamento.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnEngarrafamento.setText("ENGARRAFAMENTO DE BEBIDAS");
        btnEngarrafamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngarrafamentoActionPerformed(evt);
            }
        });

        btnRelatorios.setBackground(new java.awt.Color(204, 204, 204));
        btnRelatorios.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnRelatorios.setText("RELATÓRIOS");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        btnMelado.setBackground(new java.awt.Color(204, 204, 204));
        btnMelado.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnMelado.setText("PRODUÇÃO MELADO");
        btnMelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeladoActionPerformed(evt);
            }
        });

        btnBebidasMistas.setBackground(new java.awt.Color(204, 204, 204));
        btnBebidasMistas.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnBebidasMistas.setText("CADASTRO TIPO DE BEBIDA MISTA");
        btnBebidasMistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasMistasActionPerformed(evt);
            }
        });

        btnCachaça.setBackground(new java.awt.Color(204, 204, 204));
        btnCachaça.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnCachaça.setText("PRODUÇÃO CACHAÇA");
        btnCachaça.setToolTipText("");
        btnCachaça.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCachaça.setBorderPainted(false);
        btnCachaça.setMaximumSize(new java.awt.Dimension(100, 20));
        btnCachaça.setMinimumSize(new java.awt.Dimension(100, 20));
        btnCachaça.setPreferredSize(new java.awt.Dimension(100, 20));
        btnCachaça.setRequestFocusEnabled(false);
        btnCachaça.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCachaçaActionPerformed(evt);
            }
        });

        btnEstoque.setBackground(new java.awt.Color(204, 204, 204));
        btnEstoque.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnEstoque.setText("ESTOQUE");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnBarril.setBackground(new java.awt.Color(204, 204, 204));
        btnBarril.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnBarril.setText("CONTROLE DE BARRIL");
        btnBarril.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarrilActionPerformed(evt);
            }
        });

        btnRapadura.setBackground(new java.awt.Color(204, 204, 204));
        btnRapadura.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnRapadura.setText("PRODUÇÃO RAPADURA");
        btnRapadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapaduraActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        btnUsuarios.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnUsuarios.setText("ADMINISTRAR USUÁRIOS");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        lblBemVindo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBemVindo1.setText("Produto e controle");

        lblBemVindo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBemVindo2.setText("Produção ");

        lblBemVindo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBemVindo3.setText("Administrativo");

        lblBemVindo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBemVindo4.setText("Comercial");

        btnSair.setBackground(new java.awt.Color(204, 204, 204));
        btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBemVindo1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCachaça, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(btnEngarrafamento, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnBebidasMistas, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnMelado, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBarril, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRapadura, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBemVindo2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBemVindo3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBemVindo4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblBemVindo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCachaça, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMelado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapadura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBemVindo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEngarrafamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBebidasMistas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBarril, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBemVindo4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBemVindo3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
        new LancamentoDeVendasView().setVisible(true);
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnEngarrafamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngarrafamentoActionPerformed
        // TODO add your handling code here:
          EngarrafamentoView tela = new EngarrafamentoView(null, true);
            tela.setVisible(true);
        
    }//GEN-LAST:event_btnEngarrafamentoActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        // TODO add your handling code here:
        new RelatoriosView().setVisible(true);
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnMeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeladoActionPerformed
        // TODO add your handling code here:
        ProducaoRapaduraMeladoView tela = new ProducaoRapaduraMeladoView();
        tela.SelecionaPainel(0);
        tela.setVisible(true);
    }//GEN-LAST:event_btnMeladoActionPerformed

    private void btnBebidasMistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasMistasActionPerformed
        // TODO add your handling code here:
        new CadastroBebidasMistas().setVisible(true);
    }//GEN-LAST:event_btnBebidasMistasActionPerformed

    private void btnCachaçaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCachaçaActionPerformed
        // TODO add your handling code here:
        new ProducaoCachacaView().setVisible(true);
    }//GEN-LAST:event_btnCachaçaActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        // TODO add your handling code here:
        new EstoqueView().setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnBarrilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarrilActionPerformed
        // TODO add your handling code here:
        new ControleBarrilView().setVisible(true);
    }//GEN-LAST:event_btnBarrilActionPerformed

    private void btnRapaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapaduraActionPerformed
        // TODO add your handling code here:
        ProducaoRapaduraMeladoView tela = new ProducaoRapaduraMeladoView();
        tela.SelecionaPainel(1);
        tela.setVisible(true);
    }//GEN-LAST:event_btnRapaduraActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        new CadastroUsuarioView().setVisible(true);
            
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        if (JOptionPane.showConfirmDialog(this, "Deseja sair do programa?", "Atenção",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }

    }//GEN-LAST:event_formWindowClosing

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:

        WindowEvent event = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(event);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarril;
    private javax.swing.JButton btnBebidasMistas;
    private javax.swing.JButton btnCachaça;
    private javax.swing.JButton btnEngarrafamento;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnMelado;
    private javax.swing.JButton btnRapadura;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblBemVindo1;
    private javax.swing.JLabel lblBemVindo2;
    private javax.swing.JLabel lblBemVindo3;
    private javax.swing.JLabel lblBemVindo4;
    // End of variables declaration//GEN-END:variables
}
