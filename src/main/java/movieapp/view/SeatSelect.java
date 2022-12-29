/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movieapp.view;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import javax.swing.JButton;
import movieapp.entity.Film;
import movieapp.util.AppUtil;

import movieapp.entity.SnackDetail;

/**
 *
 * @author Putu Widyantara
 */
public class SeatSelect extends javax.swing.JFrame {
    private Film film;
    private String time;
    private Integer ticket;
    private Integer absTicket;
    private ArrayList<String> seatStatus;
    private ArrayList<JButton> buttonList;
    /**
     * Creates new form SeatSelect
     */
    public SeatSelect() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        ticketLeft = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Error! Masih ada tiket tersisa!");
        jDialog1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 20));

        jButton17.setText("OK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 50, 190, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 90, 40));

        jButton1.setText("A1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, 40));

        jButton2.setText("A2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, 40));

        jButton3.setText("A3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, 40));

        jButton4.setText("A4");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, 40));

        jButton5.setText("B1");
        jButton5.setToolTipText("");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, 40));

        jButton6.setText("B2");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, 40));

        jButton7.setText("B3");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, 40));

        jButton8.setText("B4");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, 40));

        jButton9.setText("C1");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 40));

        jButton10.setText("C2");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, 40));

        jButton11.setText("C3");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, 40));

        jButton12.setText("C4");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, 40));

        jButton13.setText("D1");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, 40));

        jButton14.setText("D2");
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, 40));

        jButton15.setText("D3");
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, 40));

        jButton16.setText("D4");
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, 40));

        ticketLeft.setForeground(new java.awt.Color(197, 163, 99));
        ticketLeft.setText("2");
        getContentPane().add(ticketLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 40, 60));

        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.setFocusPainted(false);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 190, 50));

        jButton18.setText("Area Layar");
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 400, 30));

        jLabel5.setForeground(new java.awt.Color(197, 163, 99));
        jLabel5.setText("Tiket tersisa:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, -1, -1));

        jLabel6.setForeground(new java.awt.Color(197, 163, 99));
        jLabel6.setText("MovieApp - Studio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel7.setForeground(new java.awt.Color(197, 163, 99));
        jLabel7.setText("Date: 11-11-2022, Time: 13.00");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seatselect.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        StudioSelect ss = new StudioSelect();
        ss.view(film);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        if (ticket > 0){
            jDialog1.pack();
            jDialog1.setLocationRelativeTo(null);
            jDialog1.setVisible(true);
        }else{
            ArrayList<String> selectedChair = new ArrayList<>();
            for (JButton button : buttonList){
                if (button.getBackground() == Color.green){
                    selectedChair.add(button.getText());
                }
            }
            ArrayList<SnackDetail> snackDetail = new ArrayList<>();
            OrderConfirmation oc = new OrderConfirmation();
            oc.view(this.film, this.time, this.absTicket, selectedChair, snackDetail);
            dispose();
        }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    public void view(Film film, String time, Integer ticket){
        this.film = film;
        this.time = time;
        this.ticket = ticket;
        this.absTicket = ticket;
        ticketLeft.setText(this.ticket.toString());
        this.seatStatus = AppUtil.getStudioTimeRepository().getAvailSeat(film.getIdStudio(), this.time);
        
        buttonList = new ArrayList<>();
        buttonList.add(jButton1);
        buttonList.add(jButton2);
        buttonList.add(jButton3);
        buttonList.add(jButton4);
        buttonList.add(jButton5);
        buttonList.add(jButton6);
        buttonList.add(jButton7);
        buttonList.add(jButton8);
        buttonList.add(jButton9);
        buttonList.add(jButton10);
        buttonList.add(jButton11);
        buttonList.add(jButton12);
        buttonList.add(jButton13);
        buttonList.add(jButton14);
        buttonList.add(jButton15);
        buttonList.add(jButton16);
        
        jLabel6.setText(AppUtil.getStudioTimeRepository().getStudioName(film.getIdStudio()));
        
        String dateForLabel = "Tanggal: ";
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = new Date();
        String timeNow = formatter.format(date);
        dateForLabel += timeNow;
        dateForLabel += ", Waktu: ";
        dateForLabel += this.time;
        jLabel7.setText(dateForLabel);
        
        
        int counter = 0;
        for (JButton button : buttonList){
            button.addActionListener((java.awt.event.ActionEvent evt) -> {
                if (button.getBackground() == Color.green){
                    button.setBackground(null);
                    this.ticket++;
                    ticketLeft.setText(this.ticket.toString());
                }else {
                    if (this.ticket > 0){
                        button.setBackground(Color.green);
                        this.ticket--;
                        ticketLeft.setText(this.ticket.toString());
                    }
                }             
            });
            if (!Objects.equals(this.seatStatus.get(counter), "Available")){
                button.setEnabled(false);
            }
            counter++;
        }
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel ticketLeft;
    // End of variables declaration//GEN-END:variables
}
