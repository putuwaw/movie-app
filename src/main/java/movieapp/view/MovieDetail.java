/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movieapp.view;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import movieapp.entity.Film;
/**
 *
 * @author Putu Widyantara
 */
public class MovieDetail extends javax.swing.JFrame {
    private Film selectedFilm;
    /**
     * Creates new form MovieDetail
     */
    public MovieDetail() {
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

        jButton1 = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        TrailerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BuyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 190));

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 60, 40));

        TrailerButton.setBorderPainted(false);
        TrailerButton.setContentAreaFilled(false);
        TrailerButton.setFocusPainted(false);
        TrailerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrailerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TrailerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 273, 130, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 130, 30));

        BuyButton.setBorderPainted(false);
        BuyButton.setContentAreaFilled(false);
        BuyButton.setFocusPainted(false);
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BuyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 273, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/detail_film.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        HomePage homePage = new HomePage();
        homePage.view();
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void TrailerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrailerButtonActionPerformed
        Desktop desktop = Desktop.getDesktop();
        String url = selectedFilm.getTrailer();
        try {
            desktop.browse(new URL(url).toURI());
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_TrailerButtonActionPerformed

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed
        StudioSelect ss = new StudioSelect();
        ss.view(selectedFilm);
        dispose();
    }//GEN-LAST:event_BuyButtonActionPerformed

    public void view(Film film){
        this.selectedFilm = film;
        jLabel2.setText(film.getName());
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + film.getId()+ ".jpg")));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BuyButton;
    private javax.swing.JButton TrailerButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}