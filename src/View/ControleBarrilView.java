/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Débora
 */
public class ControleBarrilView extends javax.swing.JDialog {

    /**
     * Creates new form EngarrafamentoView
     */
    
    
    
    public ControleBarrilView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        txtLabelCadastroUsuário = new javax.swing.JLabel();
        cbxNumBarril = new javax.swing.JComboBox<>();
        lblBarril = new javax.swing.JLabel();
        lblNumGarrafas = new javax.swing.JLabel();
        lblTipoCachaça = new javax.swing.JLabel();
        txtTipoCachaça = new javax.swing.JTextField();
        lblTipoGarrafa = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblLote = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        txtTipoCachaça1 = new javax.swing.JTextField();
        txtTipoCachaça2 = new javax.swing.JTextField();
        txtLabelControleBarril = new javax.swing.JLabel();

        txtLabelCadastroUsuário.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLabelCadastroUsuário.setText("Cadastro de Usuário");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBarril.setText("Barril:");

        lblNumGarrafas.setText("Estado do Barril");

        lblTipoCachaça.setText("Volume Atual");

        txtTipoCachaça.setEditable(false);
        txtTipoCachaça.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCachaçaActionPerformed(evt);
            }
        });

        lblTipoGarrafa.setText("Ultima data");

        btnCancelar.setText("Voltar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblLote.setText("Proxima data");

        txtLote.setEditable(false);

        txtTipoCachaça1.setEditable(false);
        txtTipoCachaça1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCachaça1ActionPerformed(evt);
            }
        });

        txtTipoCachaça2.setEditable(false);
        txtTipoCachaça2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCachaça2ActionPerformed(evt);
            }
        });

        txtLabelControleBarril.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLabelControleBarril.setText("Controle Barril");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLabelControleBarril)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoCachaça)
                            .addComponent(lblBarril))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoCachaça, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNumBarril, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblLote)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTipoGarrafa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTipoCachaça1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNumGarrafas)
                            .addGap(18, 18, 18)
                            .addComponent(txtTipoCachaça2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnCancelar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtLabelControleBarril)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarril)
                    .addComponent(cbxNumBarril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoCachaça)
                    .addComponent(txtTipoCachaça, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoGarrafa)
                    .addComponent(txtTipoCachaça1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumGarrafas)
                    .addComponent(txtTipoCachaça2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLote)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoCachaçaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCachaçaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoCachaçaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTipoCachaça1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCachaça1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoCachaça1ActionPerformed

    private void txtTipoCachaça2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCachaça2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoCachaça2ActionPerformed

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
            java.util.logging.Logger.getLogger(ControleBarrilView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleBarrilView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleBarrilView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleBarrilView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ControleBarrilView dialog = new ControleBarrilView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxNumBarril;
    private javax.swing.JLabel lblBarril;
    private javax.swing.JLabel lblLote;
    private javax.swing.JLabel lblNumGarrafas;
    private javax.swing.JLabel lblTipoCachaça;
    private javax.swing.JLabel lblTipoGarrafa;
    private javax.swing.JLabel txtLabelCadastroUsuário;
    private javax.swing.JLabel txtLabelControleBarril;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtTipoCachaça;
    private javax.swing.JTextField txtTipoCachaça1;
    private javax.swing.JTextField txtTipoCachaça2;
    // End of variables declaration//GEN-END:variables
}