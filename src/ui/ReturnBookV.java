/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import controller.CheckinController;
import model.CheckoutRecord;
import utils.Utils;

import javax.swing.*;

/**
 *
 * @author PHEARUN PHIN
 */
public class ReturnBookV extends javax.swing.JFrame {

    private CheckinController checkinController = new CheckinController();
    private CheckoutRecord record;
    public ReturnBookV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbMemberName = new javax.swing.JLabel();
        lbIsbn = new javax.swing.JLabel();
        lbIssueDate = new javax.swing.JLabel();
        lbDueDate = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtMemberId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnCloseWIndow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setText("Title  : ");
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lbMemberName.setText("Member Name  : ");
        jPanel1.add(lbMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        lbIsbn.setText("ISBN  :  ");
        jPanel1.add(lbIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lbIssueDate.setText("Issue Date  : ");
        jPanel1.add(lbIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lbDueDate.setText("Due Date  : ");
        jPanel1.add(lbDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 5));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Return Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 283, 380));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Return Books");

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel2.setText("ISBN       :");

        btnFind.addActionListener(evt -> btnFindClicked(evt));

        btnReturn.addActionListener(evt -> btnReturnClicked(evt));
        jLabel3.setText("Member ID :");
        btnFind.setText("Find");
        btnReturn.setText("Return Book");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnFind)
                        .addGap(28, 28, 28)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel6)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFind)
                    .addComponent(btnReturn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 36, 660, 290));

        btnCloseWIndow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/close.png"))); // NOI18N
        btnCloseWIndow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseWIndowMouseClicked(evt);
            }
        });
        getContentPane().add(btnCloseWIndow, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseWIndowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWIndowMouseClicked
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCloseWIndowMouseClicked


    private void btnFindClicked(java.awt.event.ActionEvent evt) {
        try {
            record = checkinController.findCheckoutRecord(txtIsbn.getText(), txtMemberId.getText());
            lbIsbn.setText("ISBN  :  " + record.getCheckoutRecordEntry().getBookCopy().getBook().getIsbn());
            lbTitle.setText("Title  :  " + record.getCheckoutRecordEntry().getBookCopy().getBook().getTitle());
            lbIssueDate.setText("Issue date  :  " + record.getCheckoutRecordEntry().getCheckoutDate());
            lbDueDate.setText("Due date  :  " + record.getCheckoutRecordEntry().getDueDate());
            lbMemberName.setText("Member Name  :  " + record.getMember().getFirstName() + " " + record.getMember().getLastName());

            computeFine();
        } catch (Exception e) {
            resetReturnDetail();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void computeFine() {
        int days = Utils.calculateLateDays(record.getCheckoutRecordEntry().getDueDate());
        if( days > 0) {
            double totalFee = days * 0.25;
            JOptionPane.showMessageDialog(this, "Returning book is overdue " + days + " day(s), there will be a fine at $0.25 per day. \nTotal late fee: $" + totalFee);
        }
    }
    private void resetReturnDetail() {
        lbIsbn.setText("ISBN  :  ");
        lbTitle.setText("Title  :  ");
        lbIssueDate.setText("Issue date  :  ");
        lbDueDate.setText("Due date  :  ");
        lbMemberName.setText("Member Name  :  ");
    }

    private void resetTextField() {
        resetReturnDetail();
        txtIsbn.setText("");
        txtMemberId.setText("");
    }
    private void btnReturnClicked(java.awt.event.ActionEvent evt) {
        try {
            if (checkinController.checkinBook(record.getCheckoutRecordEntry().getBookCopy().getBook().getId(),
                    record.getCheckoutRecordEntry().getBookCopy().getCopyNum(),
                    record.getCheckoutRecordEntry().getId())) {
                resetTextField();
                JOptionPane.showMessageDialog(this, "Return book success!");
            } else {
                JOptionPane.showMessageDialog(this, "Return book failed!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCloseWIndow;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbMemberName;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbIsbn;
    private javax.swing.JLabel lbIssueDate;
    private javax.swing.JLabel lbDueDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtMemberId;
    // End of variables declaration//GEN-END:variables
}
