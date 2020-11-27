/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Bean.Footer;
import Model.Bean.Header;
import Model.DAO.CachacaDAO;
import com.itextpdf.kernel.events.IEventHandler;
import javax.swing.JFileChooser;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anaco
 */
public class RelatoriosView extends javax.swing.JPanel {

    /**
     * Creates new form RelatoriosView
     */
    public RelatoriosView() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDados = new javax.swing.JPanel();
        lblRendimento28d = new javax.swing.JLabel();
        lblRendimentoGeral = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnVoltar = new javax.swing.JButton();
        lblCachaca28 = new javax.swing.JLabel();
        lblRapadura28 = new javax.swing.JLabel();
        lblMelado28 = new javax.swing.JLabel();
        lblCachacaGeral = new javax.swing.JLabel();
        lblRapaduraGeral = new javax.swing.JLabel();
        lblMeladoGeral = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCachaca28 = new javax.swing.JTextField();
        txtRapadura28 = new javax.swing.JTextField();
        txtMelado28 = new javax.swing.JTextField();
        txtCachacaGeral = new javax.swing.JTextField();
        txtRapaduraGeral = new javax.swing.JTextField();
        txtMeladoGeral = new javax.swing.JTextField();
        painelRelatorio = new javax.swing.JPanel();
        cbxVenda = new javax.swing.JCheckBox();
        cbxProducao = new javax.swing.JCheckBox();
        cbxLote = new javax.swing.JCheckBox();
        lblDtInicio = new javax.swing.JLabel();
        txtDtInicio = new javax.swing.JTextField();
        lblDtFinal = new javax.swing.JLabel();
        txtDtFinal = new javax.swing.JTextField();
        btnGerar = new javax.swing.JButton();
        btnVoltarGerar = new javax.swing.JButton();

        lblRendimento28d.setText("Rendimento dos últimos 28 dias:");

        lblRendimentoGeral.setText("Rendimento geral:");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblCachaca28.setText("Cachaça:");

        lblRapadura28.setText("Rapadura:");

        lblMelado28.setText("Melado:");

        lblCachacaGeral.setText("Cachaça:");

        lblRapaduraGeral.setText("Rapadura:");

        lblMeladoGeral.setText("Melado:");

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRendimentoGeral)
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblRendimento28d)
                                .addGroup(painelDadosLayout.createSequentialGroup()
                                    .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCachaca28)
                                        .addComponent(lblRapadura28)
                                        .addComponent(lblMelado28))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMelado28, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                        .addComponent(txtRapadura28)
                                        .addComponent(txtCachaca28))))
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCachacaGeral)
                                    .addComponent(lblRapaduraGeral)
                                    .addComponent(lblMeladoGeral))
                                .addGap(31, 31, 31)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCachacaGeral)
                                    .addComponent(txtRapaduraGeral)
                                    .addComponent(txtMeladoGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))))
                        .addGap(0, 400, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRendimento28d)
                .addGap(18, 18, 18)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCachaca28)
                    .addComponent(txtCachaca28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRapadura28)
                    .addComponent(txtRapadura28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblMelado28))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMelado28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRendimentoGeral)
                .addGap(20, 20, 20)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCachacaGeral)
                    .addComponent(txtCachacaGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRapaduraGeral)
                    .addComponent(txtRapaduraGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMeladoGeral)
                    .addComponent(txtMeladoGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Relatório", painelDados);

        cbxVenda.setText("Vendas");
        cbxVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVendaActionPerformed(evt);
            }
        });

        cbxProducao.setText("Produção");
        cbxProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProducaoActionPerformed(evt);
            }
        });

        cbxLote.setText("Lotes");

        lblDtInicio.setText("Data de Início:");

        lblDtFinal.setText("Data Final:");

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        btnVoltarGerar.setText("Voltar");
        btnVoltarGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRelatorioLayout = new javax.swing.GroupLayout(painelRelatorio);
        painelRelatorio.setLayout(painelRelatorioLayout);
        painelRelatorioLayout.setHorizontalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxVenda)
                    .addComponent(cbxProducao)
                    .addComponent(cbxLote)
                    .addGroup(painelRelatorioLayout.createSequentialGroup()
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDtInicio)
                            .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDtFinal)
                            .addComponent(txtDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(322, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarGerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerar)
                .addContainerGap())
        );
        painelRelatorioLayout.setVerticalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxProducao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxLote)
                .addGap(18, 18, 18)
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtInicio)
                    .addComponent(lblDtFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerar)
                    .addComponent(btnVoltarGerar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gerar Relatório", painelRelatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxVendaActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        // TODO add your handling code here:
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        j.showSaveDialog(this);
        path = j.getSelectedFile().getPath();

        try {
            //gerendo documento pdf
            PdfWriter writer = new PdfWriter(path + "/RelatorioRendimento.pdf");
            PdfDocument pdf = new PdfDocument(writer);
            pdf.setTagged();
            pdf.setDefaultPageSize(PageSize.A4);
            Document doc = new Document(pdf);
            doc.setMargins(93, 36, 55, 36);

            //Criando cabeçalho
            Header header = new Header("Listagem de Rendimento por Lote");
            Footer footer = new Footer();

            pdf.addEventHandler(PdfDocumentEvent.START_PAGE, header);
            pdf.addEventHandler(PdfDocumentEvent.END_PAGE, footer);

            ///Criando a tabela
            Table tbl = new Table(2).useAllAvailableWidth();
            tbl.addCell("Lote");
            tbl.addCell("Data");
            tbl.addCell("Rendimento");

            //chamar método do DAO que retorna resultset
            ResultSet rs = new CachacaDAO().selecionarTabela();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                while (rs.next()) {
                    tbl.addCell(rs.getString("lote"));
                    tbl.addCell(formato.format(rs.getDate("dtAlambicagem")));
                    tbl.addCell(rs.getDouble("rendimento") + "");
                }
            } catch (SQLException ex) {
                Logger.getLogger(RelatoriosView.class.getName()).log(Level.SEVERE, null, ex);
            }
            //  for (int i = 0; i < cbxProducao.getRowCount(); i++) {
            // tbl.addCell(cbxProducao.getValueAt(i, 0).toString());
            // tbl.addCell(cbxProducao.getValueAt(i, 1).toString());
            //  }
            doc.add(tbl);
            footer.writeTotal(pdf);
            doc.close();

            //Abrir PDF
            File f = new File(path + "/Rendimento.pdf");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
        }


    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarGerarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarGerarActionPerformed

    private void cbxProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProducaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProducaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltarGerar;
    private javax.swing.JCheckBox cbxLote;
    private javax.swing.JCheckBox cbxProducao;
    private javax.swing.JCheckBox cbxVenda;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCachaca28;
    private javax.swing.JLabel lblCachacaGeral;
    private javax.swing.JLabel lblDtFinal;
    private javax.swing.JLabel lblDtInicio;
    private javax.swing.JLabel lblMelado28;
    private javax.swing.JLabel lblMeladoGeral;
    private javax.swing.JLabel lblRapadura28;
    private javax.swing.JLabel lblRapaduraGeral;
    private javax.swing.JLabel lblRendimento28d;
    private javax.swing.JLabel lblRendimentoGeral;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelRelatorio;
    private javax.swing.JTextField txtCachaca28;
    private javax.swing.JTextField txtCachacaGeral;
    private javax.swing.JTextField txtDtFinal;
    private javax.swing.JTextField txtDtInicio;
    private javax.swing.JTextField txtMelado28;
    private javax.swing.JTextField txtMeladoGeral;
    private javax.swing.JTextField txtRapadura28;
    private javax.swing.JTextField txtRapaduraGeral;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
