/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informationsprojekt;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author user
 */
public class AvaktiveraAnvandare extends javax.swing.JFrame {

    private ArrayList<HashMap<String, String>> anstalld;
    /**
     * Creates new form AvaktiveraAnvandare
     */
    public AvaktiveraAnvandare() {
        initComponents();
        
        fetchDB();
        fillCombobox();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbAnstalld = new javax.swing.JComboBox<>();
        btnavaktivera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välj lärare att avaktivera");

        cmbAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnstalldActionPerformed(evt);
            }
        });

        btnavaktivera.setText("Avaktivera");
        btnavaktivera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavaktiveraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cmbAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnavaktivera)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnavaktivera))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnstalldActionPerformed
        
        
    }//GEN-LAST:event_cmbAnstalldActionPerformed

    private void btnavaktiveraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavaktiveraActionPerformed
        try {
            String namn = cmbAnstalld.getSelectedItem().toString();
            String [] split = namn.split(" ");
            String fornamn = split[0];
            String efternamn = split[1];
            String anstalldID = "select anstalld from anstalld where fornamn = '" + fornamn + "' and efternamn = '" + efternamn + "'";
            String hamtaAnstalldID = Databas.getDB().fetchSingle(anstalldID);
            String andraStatus = "update anstalld set aktiverad = 'F' where anstalldid = '" + hamtaAnstalldID + "'";
            Databas.getDB().update(andraStatus);
            JOptionPane.showMessageDialog(null, "Användaren har blivit avaktiverad");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_btnavaktiveraActionPerformed
    
    private void fillCombobox() {
        for (int i=0; i <anstalld.size(); i++) {
            cmbAnstalld.addItem(anstalld.get(i).get("FORNAMN") + " " + anstalld.get(i).get("EFTERNAMN"));
        }
    }
   
    private void fetchDB () {
        try {
            anstalld = Databas.getDB().fetchRows("select fornamn, efternamn from anstalld");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }


    
    
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
            java.util.logging.Logger.getLogger(AvaktiveraAnvandare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvaktiveraAnvandare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvaktiveraAnvandare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvaktiveraAnvandare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvaktiveraAnvandare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnavaktivera;
    private javax.swing.JComboBox<String> cmbAnstalld;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
