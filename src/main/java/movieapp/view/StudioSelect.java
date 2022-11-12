/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movieapp.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import movieapp.entity.Film;
import movieapp.util.AppUtil;

/**
 *
 * @author Putu Widyantara
 */
public class StudioSelect extends javax.swing.JFrame {
    private Film film;
    private List<JButton> listTime;
    private Integer ticket;
    private Integer availTicket;
    /**
     * Creates new form StudioSelect
     */
    public StudioSelect() {
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        DecreaseButton = new javax.swing.JButton();
        IncreaseButton = new javax.swing.JButton();
        StudioButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TicketAvailLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 190));

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 60, 40));

        jButton3.setText("12.00");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 143, 80, 40));

        jButton4.setText("14.00");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 143, 80, 40));

        jButton5.setText("16.00");
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 143, 80, 40));

        jButton6.setText("18.00");
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 90, 40));

        DecreaseButton.setText("-");
        DecreaseButton.setEnabled(false);
        DecreaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecreaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DecreaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 40, 30));

        IncreaseButton.setText("+");
        IncreaseButton.setEnabled(false);
        IncreaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncreaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IncreaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 50, 30));

        StudioButton.setBorderPainted(false);
        StudioButton.setContentAreaFilled(false);
        getContentPane().add(StudioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, 40));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 80, 30));

        TicketAvailLabel.setText("Silakan pilih film terlebih dahulu!");
        getContentPane().add(TicketAvailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/select_studio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        MovieDetail movieDetail = new MovieDetail();
        movieDetail.view(film);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jButton3.getBackground() != Color.red){
            jButton3.setBackground(Color.red);
            availTicket = AppUtil.getStudioTimeRepository().countAvailable(film.getIdStudio(), jButton3.getText());
            TicketAvailLabel.setText(availTicket.toString());
            jButton4.setBackground(null);
            jButton5.setBackground(null);
            jButton6.setBackground(null);
        }else{
            TicketAvailLabel.setText("Silakan pilih film terlebih dahulu!");
            jButton3.setBackground(null);
            jButton4.setBackground(null);
            jButton5.setBackground(null);
            jButton6.setBackground(null);
        }
        IncreaseButton.setEnabled(false);
        DecreaseButton.setEnabled(false);
        for (JButton button : listTime){
            if (button.getBackground() == Color.red){
                IncreaseButton.setEnabled(true);
                DecreaseButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jButton4.getBackground() != Color.red){
            jButton4.setBackground(Color.red);
            availTicket = AppUtil.getStudioTimeRepository().countAvailable(film.getIdStudio(), jButton4.getText());
            TicketAvailLabel.setText(availTicket.toString());

            jButton3.setBackground(null);
            jButton5.setBackground(null);
            jButton6.setBackground(null);
        }else{
            TicketAvailLabel.setText("Silakan pilih film terlebih dahulu!");
            jButton3.setBackground(null);
            jButton4.setBackground(null);
            jButton5.setBackground(null);
            jButton6.setBackground(null);
        }
        IncreaseButton.setEnabled(false);
        DecreaseButton.setEnabled(false);
        for (JButton button : listTime){
            if (button.getBackground() == Color.red){
                IncreaseButton.setEnabled(true);
                DecreaseButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jButton5.getBackground() != Color.red){
            jButton5.setBackground(Color.red);
            availTicket = AppUtil.getStudioTimeRepository().countAvailable(film.getIdStudio(), jButton5.getText());
            TicketAvailLabel.setText(availTicket.toString());

            jButton3.setBackground(null);
            jButton4.setBackground(null);
            jButton6.setBackground(null);
        }else{
            TicketAvailLabel.setText("Silakan pilih film terlebih dahulu!");
            jButton3.setBackground(null);
            jButton4.setBackground(null);
            jButton5.setBackground(null);
            jButton6.setBackground(null);
        }
        IncreaseButton.setEnabled(false);
        DecreaseButton.setEnabled(false);
        for (JButton button : listTime){
            if (button.getBackground() == Color.red){
                IncreaseButton.setEnabled(true);
                DecreaseButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jButton6.getBackground() != Color.red){
            jButton6.setBackground(Color.red);
            availTicket = AppUtil.getStudioTimeRepository().countAvailable(film.getIdStudio(), jButton6.getText());
            TicketAvailLabel.setText(availTicket.toString());

            jButton4.setBackground(null);
            jButton5.setBackground(null);
            jButton3.setBackground(null);
        }else{
            TicketAvailLabel.setText("Silakan pilih film terlebih dahulu!");
            jButton3.setBackground(null);
            jButton4.setBackground(null);
            jButton5.setBackground(null);
            jButton6.setBackground(null);
        }
        IncreaseButton.setEnabled(false);
        DecreaseButton.setEnabled(false);
        for (JButton button : listTime){
            if (button.getBackground() == Color.red){
                IncreaseButton.setEnabled(true);
                DecreaseButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void DecreaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecreaseButtonActionPerformed
        if (ticket > 1){
            ticket--;
            jButton2.setText(ticket.toString());
        }
    }//GEN-LAST:event_DecreaseButtonActionPerformed

    private void IncreaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncreaseButtonActionPerformed
        if (ticket < availTicket){
            ticket++;
        }
        jButton2.setText(ticket.toString());
    }//GEN-LAST:event_IncreaseButtonActionPerformed

    public void view(Film film){
        availTicket = 0;
        ticket = 1;
        jButton2.setText(ticket.toString());
        
        this.film = film;
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + film.getId()+ ".jpg")));
        
        List<JButton> buttonList = new ArrayList<>();
        listTime = buttonList;
        
        buttonList.add(jButton3);
        buttonList.add(jButton4);
        buttonList.add(jButton5);
        buttonList.add(jButton6);
                
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DecreaseButton;
    private javax.swing.JButton IncreaseButton;
    private javax.swing.JButton StudioButton;
    private javax.swing.JLabel TicketAvailLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}