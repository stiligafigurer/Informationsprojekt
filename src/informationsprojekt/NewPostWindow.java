/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informationsprojekt;

/**
 *
 * @author adamlilienberg
 */
public class NewPostWindow extends javax.swing.JFrame {

    /**
     * Creates new form newPostwindow
     */
    public NewPostWindow() {
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

        jdIngetAmneFU = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lblDialogIngetAmneFU = new javax.swing.JLabel();
        btnDialogIngenAmneFU = new javax.swing.JButton();
        jdIngenTextFU = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        lblDialogIngenTextFU = new javax.swing.JLabel();
        btnDialogIngenTextFU = new javax.swing.JButton();
        jdIngenKategoriFU = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        lblDialogIngenKategoriFU = new javax.swing.JLabel();
        btnDialogIngenKategoriFU = new javax.swing.JButton();
        jpNyPostFU = new javax.swing.JPanel();
        btnSkickaPost1 = new javax.swing.JButton();
        btnTillbaka1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        epPostTitelFU = new javax.swing.JEditorPane();
        lblPostTitelFU = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        epPostFonsterFU = new javax.swing.JEditorPane();
        lblForsUtbHead = new javax.swing.JLabel();
        cbKategoriFU = new javax.swing.JComboBox<>();
        lblKategoriFU = new javax.swing.JLabel();

        jdIngetAmneFU.setLocation(new java.awt.Point(400, 400));
        jdIngetAmneFU.setMaximumSize(new java.awt.Dimension(400, 150));
        jdIngetAmneFU.setMinimumSize(new java.awt.Dimension(400, 150));
        jdIngetAmneFU.setPreferredSize(new java.awt.Dimension(400, 150));
        jdIngetAmneFU.setSize(new java.awt.Dimension(400, 150));

        lblDialogIngetAmneFU.setText("Du måste skriva ett ämne för inlägget");

        btnDialogIngenAmneFU.setText("Okej");
        btnDialogIngenAmneFU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogIngenAmneFUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnDialogIngenAmneFU))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblDialogIngetAmneFU)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDialogIngetAmneFU)
                .addGap(18, 18, 18)
                .addComponent(btnDialogIngenAmneFU)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdIngetAmneFULayout = new javax.swing.GroupLayout(jdIngetAmneFU.getContentPane());
        jdIngetAmneFU.getContentPane().setLayout(jdIngetAmneFULayout);
        jdIngetAmneFULayout.setHorizontalGroup(
            jdIngetAmneFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdIngetAmneFULayout.setVerticalGroup(
            jdIngetAmneFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jdIngenTextFU.setLocation(new java.awt.Point(400, 400));
        jdIngenTextFU.setMaximumSize(new java.awt.Dimension(400, 150));
        jdIngenTextFU.setMinimumSize(new java.awt.Dimension(400, 150));
        jdIngenTextFU.setPreferredSize(new java.awt.Dimension(400, 150));
        jdIngenTextFU.setSize(new java.awt.Dimension(400, 150));

        lblDialogIngenTextFU.setText("Du måste skriva en text i inlägget");

        btnDialogIngenTextFU.setText("Okej");
        btnDialogIngenTextFU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogIngenTextFUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnDialogIngenTextFU))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblDialogIngenTextFU)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDialogIngenTextFU)
                .addGap(18, 18, 18)
                .addComponent(btnDialogIngenTextFU)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdIngenTextFULayout = new javax.swing.GroupLayout(jdIngenTextFU.getContentPane());
        jdIngenTextFU.getContentPane().setLayout(jdIngenTextFULayout);
        jdIngenTextFULayout.setHorizontalGroup(
            jdIngenTextFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdIngenTextFULayout.setVerticalGroup(
            jdIngenTextFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jdIngenKategoriFU.setLocation(new java.awt.Point(400, 400));
        jdIngenKategoriFU.setMaximumSize(new java.awt.Dimension(400, 150));
        jdIngenKategoriFU.setMinimumSize(new java.awt.Dimension(400, 150));
        jdIngenKategoriFU.setPreferredSize(new java.awt.Dimension(400, 150));
        jdIngenKategoriFU.setSize(new java.awt.Dimension(400, 150));

        lblDialogIngenKategoriFU.setText("Du måste välja en kategori för ditt inlägg");

        btnDialogIngenKategoriFU.setText("Okej");
        btnDialogIngenKategoriFU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogIngenKategoriFUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnDialogIngenKategoriFU))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblDialogIngenKategoriFU)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDialogIngenKategoriFU)
                .addGap(18, 18, 18)
                .addComponent(btnDialogIngenKategoriFU)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdIngenKategoriFULayout = new javax.swing.GroupLayout(jdIngenKategoriFU.getContentPane());
        jdIngenKategoriFU.getContentPane().setLayout(jdIngenKategoriFULayout);
        jdIngenKategoriFULayout.setHorizontalGroup(
            jdIngenKategoriFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdIngenKategoriFULayout.setVerticalGroup(
            jdIngenKategoriFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 400));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        jpNyPostFU.setPreferredSize(new java.awt.Dimension(500, 500));

        btnSkickaPost1.setText("Send Post");
        btnSkickaPost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkickaPost1ActionPerformed(evt);
            }
        });

        btnTillbaka1.setText("Back");
        btnTillbaka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbaka1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(epPostTitelFU);

        lblPostTitelFU.setText("Titel:");

        jScrollPane2.setViewportView(epPostFonsterFU);

        lblForsUtbHead.setText("Forskning/Utbildning");

        cbKategoriFU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj kategori", "Forskning", "Utbildning", "Möte", "Övrigt" }));
        cbKategoriFU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKategoriFUActionPerformed(evt);
            }
        });

        lblKategoriFU.setText("Kategori:");

        javax.swing.GroupLayout jpNyPostFULayout = new javax.swing.GroupLayout(jpNyPostFU);
        jpNyPostFU.setLayout(jpNyPostFULayout);
        jpNyPostFULayout.setHorizontalGroup(
            jpNyPostFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNyPostFULayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblKategoriFU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbKategoriFU, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(jpNyPostFULayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jpNyPostFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNyPostFULayout.createSequentialGroup()
                        .addComponent(btnTillbaka1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSkickaPost1)
                        .addGap(58, 58, 58))
                    .addGroup(jpNyPostFULayout.createSequentialGroup()
                        .addGroup(jpNyPostFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpNyPostFULayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblPostTitelFU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpNyPostFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblForsUtbHead)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        jpNyPostFULayout.setVerticalGroup(
            jpNyPostFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNyPostFULayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblForsUtbHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpNyPostFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPostTitelFU, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpNyPostFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKategoriFU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKategoriFU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jpNyPostFULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSkickaPost1)
                    .addComponent(btnTillbaka1))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNyPostFU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNyPostFU, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkickaPost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkickaPost1ActionPerformed
     //skicka post till mainpostwindow jlInlaggFU
     if(!epPostTitelFU.getText().isEmpty()) {
         if(!epPostFonsterFU.getText().isEmpty()) {
             if(cbKategoriFU.getSelectedIndex() != 0) {
                String title = epPostTitelFU.getText();
                String post = epPostFonsterFU.getText();
                String kategori = cbKategoriFU.getSelectedItem().toString();
             }
             else {
                 jdIngenKategoriFU.setVisible(true);
             }
         }
         else {
             jdIngenTextFU.setVisible(true);
         }
     }
     else {
         jdIngetAmneFU.setVisible(true);
     }
        
        
        
    }//GEN-LAST:event_btnSkickaPost1ActionPerformed

    private void btnTillbaka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbaka1ActionPerformed
        // TODO add your handling code here:
        epPostTitelFU.removeAll();
        epPostFonsterFU.removeAll();
        dispose();
    }//GEN-LAST:event_btnTillbaka1ActionPerformed

    private void cbKategoriFUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategoriFUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKategoriFUActionPerformed

    private void btnDialogIngenAmneFUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogIngenAmneFUActionPerformed
       //Stänger ner dialogfönstret för inget-ämne
       jdIngetAmneFU.dispose();
    }//GEN-LAST:event_btnDialogIngenAmneFUActionPerformed

    private void btnDialogIngenTextFUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogIngenTextFUActionPerformed
        jdIngenTextFU.dispose();
    }//GEN-LAST:event_btnDialogIngenTextFUActionPerformed

    private void btnDialogIngenKategoriFUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogIngenKategoriFUActionPerformed
        jdIngenKategoriFU.dispose();
    }//GEN-LAST:event_btnDialogIngenKategoriFUActionPerformed

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
            java.util.logging.Logger.getLogger(NewPostWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPostWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPostWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPostWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewPostWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDialogIngenAmneFU;
    private javax.swing.JButton btnDialogIngenKategoriFU;
    private javax.swing.JButton btnDialogIngenTextFU;
    private javax.swing.JButton btnSkickaPost1;
    private javax.swing.JButton btnTillbaka1;
    private javax.swing.JComboBox<String> cbKategoriFU;
    private javax.swing.JEditorPane epPostFonsterFU;
    private javax.swing.JEditorPane epPostTitelFU;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jdIngenKategoriFU;
    private javax.swing.JDialog jdIngenTextFU;
    private javax.swing.JDialog jdIngetAmneFU;
    private javax.swing.JPanel jpNyPostFU;
    private javax.swing.JLabel lblDialogIngenKategoriFU;
    private javax.swing.JLabel lblDialogIngenTextFU;
    private javax.swing.JLabel lblDialogIngetAmneFU;
    private javax.swing.JLabel lblForsUtbHead;
    private javax.swing.JLabel lblKategoriFU;
    private javax.swing.JLabel lblPostTitelFU;
    // End of variables declaration//GEN-END:variables
}
