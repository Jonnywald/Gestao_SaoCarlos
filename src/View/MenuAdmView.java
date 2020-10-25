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
        lblBemVindo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnVenda.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnVenda.setText("VENDAS");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnEngarrafamento.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnEngarrafamento.setText("ENGARRAFAMENTO DE BEBIDAS");
        btnEngarrafamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngarrafamentoActionPerformed(evt);
            }
        });

        btnRelatorios.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnRelatorios.setText("RELATÓRIOS");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        btnMelado.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnMelado.setText("PRODUÇÃO MELADO");
        btnMelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeladoActionPerformed(evt);
            }
        });

        btnBebidasMistas.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnBebidasMistas.setText("CADASTRO TIPO DE BEBIDA MISTA");
        btnBebidasMistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasMistasActionPerformed(evt);
            }
        });

        btnCachaça.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnCachaça.setText("PRODUÇÃO CACHAÇA");
        btnCachaça.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCachaçaActionPerformed(evt);
            }
        });

        btnEstoque.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnEstoque.setText("ESTOQUE");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnBarril.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnBarril.setText("CONTROLE DE BARRIL");
        btnBarril.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarrilActionPerformed(evt);
            }
        });

        btnRapadura.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnRapadura.setText("PRODUÇÃO RAPADURA");
        btnRapadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapaduraActionPerformed(evt);
            }
        });

        btnUsuarios.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnUsuarios.setText("ADMINISTRAR USUÁRIOS");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        lblBemVindo.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        lblBemVindo.setText("Bem Vindo! ");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBebidasMistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCachaça, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBarril, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMelado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEngarrafamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRapadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCachaça, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMelado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRapadura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEngarrafamento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBebidasMistas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBarril, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnEngarrafamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngarrafamentoActionPerformed
        // TODO add your handling code here:
          EngarrafamentoView tela = new EngarrafamentoView(null, true);
            tela.setVisible(true);
        
    }//GEN-LAST:event_btnEngarrafamentoActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnMeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMeladoActionPerformed

    private void btnBebidasMistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasMistasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBebidasMistasActionPerformed

    private void btnCachaçaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCachaçaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCachaçaActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnBarrilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarrilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBarrilActionPerformed

    private void btnRapaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRapaduraActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:

        WindowEvent event = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(event);

    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        if (JOptionPane.showConfirmDialog(this, "Deseja sair do programa?", "Atenção",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }

    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JLabel lblBemVindo;
    // End of variables declaration//GEN-END:variables
}
