/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import controller.CheckoutController;
import model.Author;
import model.BookCopy;
import model.LibraryMember;

import javax.swing.*;
import java.time.LocalDate;

/**
 * @author PHEARUN PHIN
 */
public class IssueBookV extends javax.swing.JFrame {

    private CheckoutController checkoutController = new CheckoutController();
    private BookCopy bookCopy;
    private LibraryMember member;

    public IssueBookV() {
        initComponents();
    }

    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBookISBN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnMemberId = new javax.swing.JButton();
        txtDueDate = new javax.swing.JLabel();
        btnCloseWIndow = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ac = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtMemberId1 = new javax.swing.JLabel();
        txtMemberName = new javax.swing.JLabel();
        txtPhone = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtBookISBN1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 5));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("CheckOut Book");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel3.setText("Book ISBN ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel3.add(txtBookISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 230, -1));

        jLabel6.setText("Due Date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel3.add(txtMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 230, -1));

        jLabel16.setText("Member ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnSubmit.setText("Checkout");
        jPanel3.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel3.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 60, -1));

        btnMemberId.setText("Find");
        btnMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberIdActionPerformed(evt);
            }
        });
        jPanel3.add(btnMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 60, -1));
        jPanel3.add(txtDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        btnCloseWIndow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/close.png"))); // NOI18N
        btnCloseWIndow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseWIndowMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ac.setText("Member Name     : ");
        jPanel6.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        a.setText("Member ID           :  ");
        jPanel6.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel12.setText("Phone Number     :");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Students Details");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 5));
        jPanel6.add(txtMemberId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));
        jPanel6.add(txtMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));
        jPanel6.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Title                 : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setText("Book ISBN       :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel8.setText("Author(s)         :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Book Detail");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 5));
        jPanel1.add(txtBookISBN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(439, 439, 439)
                                .addComponent(btnCloseWIndow))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCloseWIndow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseWIndowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWIndowMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCloseWIndowMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String isbn = txtBookISBN.getText();
        try {
            bookCopy = checkoutController.findBook(isbn);

            txtBookISBN1.setText(bookCopy.getBook().getIsbn());
            txtTitle.setText(bookCopy.getBook().getTitle());
            txtDueDate.setText(String.valueOf(LocalDate.now().plusDays(bookCopy.getBook().getMaxCheckoutLength())));

            StringBuilder authors = new StringBuilder();
            for (Author a: bookCopy.getBook().getAuthors()) {
                if(authors.length() > 0)
                    authors.append(", ");
                authors.append(a.getFirstName()).append(" ").append(a.getLastName());
            }

            txtAuthor.setText(authors.toString());

        } catch (Exception e) {
            resetBookDetail();
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void resetBookDetail() {
        txtBookISBN1.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtDueDate.setText("");
        txtBookISBN.setText("");
    }
    private void resetMemberDetail() {
        txtPhone.setText("");
        txtMemberId1.setText("");
        txtMemberName.setText("");
        txtMemberId.setText("");
    }
    private void btnMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberIdActionPerformed
        String id = txtMemberId.getText();
        try {
            member = checkoutController.findMember(id);

            txtMemberId1.setText(member.getMemberId());
            txtMemberName.setText(member.getFirstName() + " "+ member.getLastName());
            txtPhone.setText(member.getPhone());

        } catch (Exception e) {
            resetMemberDetail();
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnMemberIdActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try {
            if (checkoutController.checkoutBook(bookCopy, member)) {
                JOptionPane.showMessageDialog(this, "Checkout success!");
                resetBookDetail();
                resetMemberDetail();
            } else {
                JOptionPane.showMessageDialog(this,"Checkout failed!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBookV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel ac;
    private javax.swing.JLabel btnCloseWIndow;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnMemberId;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel txtAuthor;
    private javax.swing.JTextField txtBookISBN;
    private javax.swing.JLabel txtBookISBN1;
    private javax.swing.JLabel txtDueDate;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JLabel txtMemberId1;
    private javax.swing.JLabel txtMemberName;
    private javax.swing.JLabel txtPhone;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
