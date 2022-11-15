/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movieapp.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JButton;
import movieapp.entity.Film;
import movieapp.util.AppUtil;

/**
 *
 * @author Putu Widyantara
 */
public class SeatSelect extends javax.swing.JFrame {
    private Film film;
    private String time;
    private Integer ticket;
    private ArrayList<String> seatStatus;
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
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 320, 80, 40));

        jButton1.setText("A1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jButton2.setText("A2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jButton3.setText("A3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jButton4.setText("A4");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jButton5.setText("B1");
        jButton5.setToolTipText("");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jButton6.setText("B2");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jButton7.setText("B3");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jButton8.setText("B4");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jButton9.setText("C1");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jButton10.setText("C2");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jButton11.setText("C3");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jButton12.setText("C4");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jButton13.setText("D1");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jButton14.setText("D2");
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jButton15.setText("D3");
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        jButton16.setText("D4");
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));
        getContentPane().add(ticketLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/select_seat.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        StudioSelect ss = new StudioSelect();
        ss.view(film);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    public void view(Film film, String time, Integer ticket){
        this.film = film;
        this.time = time;
        this.ticket = ticket;
        ticketLeft.setText(this.ticket.toString());
        this.seatStatus = AppUtil.getStudioTimeRepository().getAvailSeat(film.getIdStudio(), this.time);
        
        ArrayList<JButton> buttonList = new ArrayList<>();
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel ticketLeft;
    // End of variables declaration//GEN-END:variables
}