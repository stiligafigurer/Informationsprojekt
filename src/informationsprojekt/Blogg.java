/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informationsprojekt;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author Rasmus & Felix
 */
public class Blogg extends javax.swing.JFrame {

    private DefaultListModel dmInlaggFU = new DefaultListModel();
    private DefaultListModel dmInlaggFritid = new DefaultListModel();

    //private final InfDB db;
    /**
     * Creates new form Main
     */
    public Blogg() {
        initComponents();
        fyllInlaggFU();
        fyllInlaggFritid();
    }

    // Fyll listan med blogginlägg under forskning/utbildning
    private void fyllInlaggFU() {
        try {
                        
            ArrayList<HashMap<String, String>> inlaggen;
            inlaggen = Databas.getDB().fetchRows("SELECT TITEL, ANSTALLDID FROM BLOGGINLAGG");

            if (inlaggen != null) {
                for (HashMap<String, String> inlagg : inlaggen) {
                    String titel = inlagg.get("TITEL");
                    String anstalldId = inlagg.get("ANSTALLDID");
                    dmInlaggFU.addElement(titel + " " + anstalldId);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        jlInlaggFU.setModel(dmInlaggFU);
    }

    // Fyll listan med blogginlägg under fritid
    private void fyllInlaggFritid() {
        /*try {
            ArrayList<HashMap<String, String>> inlaggen;
            inlaggen = db.fetchRows("");

            if (inlaggen != null) {
                for (HashMap<String, String> inlagg : inlaggen) {
                    String nått1 = inlagg.get("");
                    String nått2 = inlagg.get("");
                    String nått3 = inlagg.get("");
                    dmInlagg.addElement("");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        } */
        dmInlaggFritid.addElement("BLOGG-ID 5");
        dmInlaggFritid.addElement("BLOGG-ID 4");
        dmInlaggFritid.addElement("BLOGG-ID 3");
        dmInlaggFritid.addElement("BLOGG-ID 2");
        dmInlaggFritid.addElement("BLOGG-ID 1");
        jlInlaggFritid.setModel(dmInlaggFritid);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnSkrivFU = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlInlaggFU = new javax.swing.JList<>();
        btnUppdateraFU = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSkrivFritid = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlInlaggFritid = new javax.swing.JList<>();
        btnUppdateraFritid = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORU - Blogg");
        setIconImage(new ImageIcon(getClass().getResource("/img" + "/oru_favicon.png")).getImage());

        btnSkrivFU.setText("Skriv Inlägg");
        btnSkrivFU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivFUActionPerformed(evt);
            }
        });

        jlInlaggFU.setToolTipText("");
        jlInlaggFU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlInlaggFUMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jlInlaggFU);

        btnUppdateraFU.setText("Uppdatera");
        btnUppdateraFU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraFUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUppdateraFU)
                    .addComponent(btnSkrivFU))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUppdateraFU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSkrivFU)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Forskning/Utbildning", jPanel2);

        btnSkrivFritid.setText("Skriv Inlägg");
        btnSkrivFritid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivFritidActionPerformed(evt);
            }
        });

        jlInlaggFritid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlInlaggFritidMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlInlaggFritid);

        btnUppdateraFritid.setText("Uppdatera");
        btnUppdateraFritid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraFritidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUppdateraFritid)
                    .addComponent(btnSkrivFritid))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnUppdateraFritid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSkrivFritid))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Fritid", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Öppnar ett NewPostWindow
    private void btnSkrivFUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivFUActionPerformed
        new NewPostWindow().setVisible(true);
    }//GEN-LAST:event_btnSkrivFUActionPerformed

    // Öppnar ett blogginlägg när användaren klickar på det
    private void jlInlaggFUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInlaggFUMouseClicked
        int valtInlagg = jlInlaggFU.getSelectedIndex();
        if (valtInlagg != -1) {

            int bloggId;
            bloggId = +dmInlaggFU.getSize() - valtInlagg;
            System.out.println(bloggId);
        }
    }//GEN-LAST:event_jlInlaggFUMouseClicked

    private void btnSkrivFritidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivFritidActionPerformed
        new NewPostWindow().setVisible(true);
    }//GEN-LAST:event_btnSkrivFritidActionPerformed

    private void jlInlaggFritidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInlaggFritidMouseClicked
        int valtInlagg = jlInlaggFritid.getSelectedIndex();
        if (valtInlagg != -1) {

            int bloggId;
            bloggId = +dmInlaggFritid.getSize() - valtInlagg;
            System.out.println(bloggId);
        }
    }//GEN-LAST:event_jlInlaggFritidMouseClicked

    private void btnUppdateraFUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraFUActionPerformed
        dmInlaggFU.clear();
        fyllInlaggFU();
    }//GEN-LAST:event_btnUppdateraFUActionPerformed

    private void btnUppdateraFritidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraFritidActionPerformed
        dmInlaggFritid.clear();
        fyllInlaggFritid();
    }//GEN-LAST:event_btnUppdateraFritidActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkrivFU;
    private javax.swing.JButton btnSkrivFritid;
    private javax.swing.JButton btnUppdateraFU;
    private javax.swing.JButton btnUppdateraFritid;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList<String> jlInlaggFU;
    private javax.swing.JList<String> jlInlaggFritid;
    // End of variables declaration//GEN-END:variables

}
