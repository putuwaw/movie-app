/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movieapp.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.swing.JButton;
import movieapp.entity.Film;
import movieapp.entity.Snack;
import movieapp.util.AppUtil;

import movieapp.entity.SnackDetail;

/**
 *
 * @author Putu Widyantara
 */
public class OrderConfirmation extends javax.swing.JFrame {
    private Film film;
    private String time;
    private Integer ticket;
    private ArrayList<String> chair;
    private String chairString;
    private ArrayList<JButton> buttonList;
    private Snack[] topThree;
    
    private ArrayList<SnackDetail> snackDetail;
    private Integer totalPrice;
    
    private String dateOrder;
    
    /**
     * Creates new form OrderConfirmation
     */
    public OrderConfirmation() {
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
        jLabel21 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Konfirmasi Pembelian?");
        jDialog1.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jButton5.setText("YA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, -1));

        jButton7.setText("TIDAK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 50, 100, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(197, 163, 99));
        jLabel9.setText("2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 20, -1));

        jLabel10.setForeground(new java.awt.Color(197, 163, 99));
        jLabel10.setText("Studio Movieapp 2");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 130, -1));

        jLabel11.setForeground(new java.awt.Color(197, 163, 99));
        jLabel11.setText("A3, A2");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel12.setForeground(new java.awt.Color(197, 163, 99));
        jLabel12.setText("12.00");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 40, -1));

        jLabel13.setForeground(new java.awt.Color(197, 163, 99));
        jLabel13.setText("Senin, 1 Desember 2022");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 160, -1));

        jLabel14.setForeground(new java.awt.Color(197, 163, 99));
        jLabel14.setText("-");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 180, 30));

        jLabel15.setForeground(new java.awt.Color(197, 163, 99));
        jLabel15.setText("Rp 45000");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 90, 100));

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 90, 100));

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 90, 90));

        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 120, 40));

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 90, 30));

        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 130, 50));

        jLabel18.setForeground(new java.awt.Color(197, 163, 99));
        jLabel18.setText("Toy Story 2");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderconfirmation.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        SeatSelect ss = new SeatSelect();
        ss.view(this.film, this.time, this.ticket);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SnackSelect snackSelect = new SnackSelect();
        snackSelect.view(this.film, this.time, this.ticket, this.chair, this.snackDetail);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SnackDetailSelect sds = new SnackDetailSelect();
        sds.view(this.film, this.time, this.ticket, this.chair, this.snackDetail, 1, topThree[0].getId());
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SnackDetailSelect sds = new SnackDetailSelect();
        sds.view(this.film, this.time, this.ticket, this.chair, this.snackDetail, 1, topThree[1].getId());
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SnackDetailSelect sds = new SnackDetailSelect();
        sds.view(this.film, this.time, this.ticket, this.chair, this.snackDetail, 1, topThree[2].getId());
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // confirm order
        String idTransaction = "MVAPP";
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");  
        String timeNow = formatter.format(date);
        idTransaction += timeNow;
        
        //iduser
        // id film

        System.out.println(idTransaction);

        System.out.println(this.film.getId());
        
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String mysqlDate = formatter.format(date);
        System.out.println(mysqlDate);
        System.out.println(this.totalPrice);
        
        Integer rowAffected = AppUtil.getTransactionRepository().insertTransaction(idTransaction, AppUtil.getUser().getUsername(), this.film.getId(), mysqlDate, this.totalPrice);  
        if (rowAffected == 1){
            Integer tempTotal = this.film.getPrice() * this.ticket;
            AppUtil.getTransactionRepository().insertFilmTransaction(idTransaction, this.film.getId(), this.chairString, this.time, this.film.getPrice(), this.ticket, tempTotal);
            for (SnackDetail items : this.snackDetail){
                items.getId();
                items.getSize();
                items.getStock();
                items.getPrice();
                tempTotal = items.getStock() * items.getPrice();
                AppUtil.getTransactionRepository().insertSnackTransaction(idTransaction, items.getId(), items.getSize(), items.getStock(), items.getPrice(), tempTotal);
            }
            PaymentSuccess ps = new PaymentSuccess();
            ps.view(this.film, this.time, this.chairString, this.totalPrice, idTransaction, this.dateOrder);
            dispose();
            
            
            // decrease
            // film chair
            AppUtil.getStudioTimeRepository().setNotAvailChair(this.film.getIdStudio(), this.time, this.chair);
            for (SnackDetail sd : this.snackDetail){
                AppUtil.getSnackDetailRepository().setDecreaceStock(sd.getId(), sd.getSize());
            }
            // snack
            
        }
        jDialog1.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    public void view(Film film, String time, Integer ticket, ArrayList<String> chair, ArrayList<SnackDetail> snackDetail){
        this.film = film;
        this.time = time;
        this.ticket = ticket;
        this.chair = chair;
        
        jLabel9.setText(this.ticket.toString());
        jLabel10.setText(AppUtil.getStudioTimeRepository().getStudioName(this.film.getIdStudio()));
        jLabel12.setText(time);
        jLabel14.setText("-");
        
        // chair
        String temp = "";
        int counter = 1;
        for (String ch : chair){
            temp += ch;
            if (counter != ticket){
                counter++;
                temp += ", ";
            }
        }
        jLabel11.setText(temp);
        this.chairString = temp;
        
        this.totalPrice = film.getPrice() * this.ticket;
        
        // mapping
        Map<String, String> mapMonth = new HashMap<>();
        mapMonth.put("January", "Januari");
        mapMonth.put("February", "Februari");
        mapMonth.put("March", "Maret");
        mapMonth.put("November", "November");
        mapMonth.put("December", "Desember");
        
        Map<String, String> mapDay = new HashMap<>();
        mapDay.put("Sunday", "Minggu");
        mapDay.put("Monday", "Senin");
        mapDay.put("Tuesday", "Selasa");
        mapDay.put("Wednesday", "Rabu");
        mapDay.put("Thursday", "Kamis");
        mapDay.put("Friday", "Jumat");
        mapDay.put("Saturday", "Sabtu");
        

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd");  
        String timeNow = formatter.format(date);
        
        dateOrder = "";
        Calendar c = Calendar.getInstance();
        dateOrder += (mapDay.get(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH )) + ", ");
        dateOrder += (timeNow + " ");
        dateOrder += (mapMonth.get(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH )) + " ");
        
        formatter = new SimpleDateFormat("yyyy");  
        timeNow = formatter.format(date);
        
        dateOrder += timeNow;
        
        // Saturday, 14 November 2022
        
        jLabel13.setText(dateOrder);    
        
        jLabel18.setText(this.film.getName());
        
        // button
        buttonList = new ArrayList<>();
        buttonList.add(jButton1);
        buttonList.add(jButton2);
        buttonList.add(jButton3);
        topThree = AppUtil.getSnackRepository().getTopThree();
        int i = 0;
        for (JButton button : buttonList){
            // button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + topThree[i].getId()+ ".jpg")));
            i++;
        }
        
        // snack
        Integer tempSnackPrice = 0;
        this.snackDetail = snackDetail;
        
        if (this.snackDetail.isEmpty()){
            jLabel14.setText("-");
        }else{
            // clean up
            Iterator itr = this.snackDetail.iterator();
            while(itr.hasNext()){
                SnackDetail item = (SnackDetail) itr.next();
                if (item.getStock() == 0){
                    itr.remove();
                }
            }
            
            String tempString = "";
            for (SnackDetail items : this.snackDetail){
                if (items.getStock() > 0){
                    tempString += AppUtil.getSnackRepository().getNameById(items.getId());
                    tempString = tempString + "(" + items.getSize() + ")@" + items.getStock().toString();
                    if (items != this.snackDetail.get(this.snackDetail.size() - 1)){
                        tempString += ", ";
                    }
                    tempSnackPrice += (items.getPrice() * items.getStock());
                }
            }
            jLabel14.setText(tempString);
        }
        this.totalPrice += tempSnackPrice;
        jLabel15.setText("Rp " + this.totalPrice.toString());
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        // snack
        for (String ch : chair){
            System.out.println(ch.charAt(0));
        }
        for (SnackDetail sc : snackDetail){
            System.out.println(sc.getId() + " " + sc.getStock() + sc.getSize());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
