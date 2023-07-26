package ui;

import constance.AppController;

import java.awt.*;

public class HomPageV extends javax.swing.JFrame {

    Color mouseOn = new Color(0, 0, 0);
    Color mouseOut = new Color(51, 51, 51);

    public HomPageV() {
        initComponents();
        checkRoles();
    }

    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        jPanelStudents123 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelStudent = new javax.swing.JPanel();
        jLabelMgSutdents = new javax.swing.JLabel();
        jPanelMgBooks = new javax.swing.JPanel();
        jLabelMgBooks = new javax.swing.JLabel();
        jPanelMemberCheckoutRecord = new javax.swing.JPanel();
        btnCheckOutMember = new javax.swing.JLabel();
        jPanelIssBooks = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanelReturnBook = new javax.swing.JPanel();
        jLabelReturnBook = new javax.swing.JLabel();
        jPanelAddBookCopy = new javax.swing.JPanel();
        btnBookCopy = new javax.swing.JLabel();
        jPanelAddBook = new javax.swing.JPanel();
        btnAddBook = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanelLogOut1 = new javax.swing.JPanel();
        btnLogOut1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderPanel.setBackground(new java.awt.Color(102, 102, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Library Management System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 520, 40));

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
                HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1752, Short.MAX_VALUE)
                        .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1740, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        HeaderPanelLayout.setVerticalGroup(
                HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        LeftPanel.setBackground(new java.awt.Color(0, 0, 0));
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelStudents123.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Features");

        javax.swing.GroupLayout jPanelStudents123Layout = new javax.swing.GroupLayout(jPanelStudents123);
        jPanelStudents123.setLayout(jPanelStudents123Layout);
        jPanelStudents123Layout.setHorizontalGroup(
                jPanelStudents123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelStudents123Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanelStudents123Layout.setVerticalGroup(
                jPanelStudents123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        LeftPanel.add(jPanelStudents123, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 50));

        jPanelHome.setBackground(new java.awt.Color(153, 0, 51));
        jPanelHome.setForeground(new java.awt.Color(204, 204, 204));
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/male_user_50px.png"))); // NOI18N
        jLabel9.setText("    Welcome " + AppController.getInstance().getUser().getUsername().toUpperCase());
        jPanelHome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 240, 50));

        LeftPanel.add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 270, 50));

        jPanelStudent.setBackground(new java.awt.Color(0, 0, 0));
        jPanelStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // checkout book
        jPanelIssBooks.setBackground(new java.awt.Color(0, 0, 0));
        jPanelIssBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8_Book_26px.png"))); // NOI18N
        jLabel10.setText("    Checkout Book");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanelIssBooks.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 240, 50));
        LeftPanel.add(jPanelIssBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 50));


        // return book
        jPanelReturnBook.setBackground(new java.awt.Color(0, 0, 0));
        jPanelReturnBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabelReturnBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReturnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8_Book_26px.png"))); // NOI18N
        jLabelReturnBook.setText("    Return Book");
        jLabelReturnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReturnBookMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelReturnBookMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelReturnBookMouseExited(evt);
            }
        });
        jPanelReturnBook.add(jLabelReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 240, 50));
        LeftPanel.add(jPanelReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 270, 50));


        // book list
        jPanelMgBooks.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMgBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabelMgBooks.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMgBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8_Books_26px.png"))); // NOI18N
        jLabelMgBooks.setText("    Book List");
        jLabelMgBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMgBooksMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMgBooksMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMgBooksMouseExited(evt);
            }
        });
        jPanelMgBooks.add(jLabelMgBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 240, 50));
        LeftPanel.add(jPanelMgBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, 50));


        // add book
        jPanelAddBook.setBackground(new java.awt.Color(0, 0, 0));
        jPanelAddBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnAddBook.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8_Books_26px.png"))); // NOI18N
        btnAddBook.setText("    Add Book");
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBookMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddBookMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddBookMouseExited(evt);
            }
        });
        jPanelAddBook.add(btnAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 240, 50));
        LeftPanel.add(jPanelAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 270, 50));

        // add book copy
        jPanelAddBookCopy.setBackground(new java.awt.Color(0, 0, 0));
        jPanelAddBookCopy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnBookCopy.setForeground(new java.awt.Color(255, 255, 255));
        btnBookCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8_Books_26px.png"))); // NOI18N
        btnBookCopy.setText("    Add Book Copy");
        btnBookCopy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookCopyMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookCopyMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookCopyMouseExited(evt);
            }
        });
        jPanelAddBookCopy.add(btnBookCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 240, 50));
        LeftPanel.add(jPanelAddBookCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 270, 50));


        // manage member
        jLabelMgSutdents.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMgSutdents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8_Conference_26px.png"))); // NOI18N
        jLabelMgSutdents.setText("    Manage Member");
        jLabelMgSutdents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMgSutdentsMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMgSutdentsMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMgSutdentsMouseExited(evt);
            }
        });
        jPanelStudent.add(jLabelMgSutdents, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 240, 50));
        LeftPanel.add(jPanelStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 270, 50));

        // member checkout record
        jPanelMemberCheckoutRecord.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMemberCheckoutRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnCheckOutMember.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOutMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8_Book_Shelf_50px.png"))); // NOI18N
        btnCheckOutMember.setText("    Member Checkout Record");
        btnCheckOutMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckOutMemberMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckOutMemberMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckOutMemberMouseExited(evt);
            }
        });
        jPanelMemberCheckoutRecord.add(btnCheckOutMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 220, 50));
        LeftPanel.add(jPanelMemberCheckoutRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 50));


        // log out
        jPanelLogOut1.setBackground(new java.awt.Color(102, 102, 255));
        jPanelLogOut1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnLogOut1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/icons8-logout-rounded-26.png"))); // NOI18N
        btnLogOut1.setText("    Log Out");
        btnLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOut1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOut1MouseExited(evt);
            }
        });
        jPanelLogOut1.add(btnLogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, 240, 50));
        LeftPanel.add(jPanelLogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 270, 50));


        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/library1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 66, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 42, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }

    private void jLabelMgSutdentsMouseClicked(java.awt.event.MouseEvent evt) {
        jPanelStudent.setBackground(mouseOut);
        ManageMembersV manageMembersV = new ManageMembersV();
        manageMembersV.setLocationRelativeTo(null);
        manageMembersV.setVisible(true);
    }

    private void jLabelMgSutdentsMouseEntered(java.awt.event.MouseEvent evt) {
        jPanelStudent.setBackground(mouseOut);
    }

    private void jLabelMgSutdentsMouseExited(java.awt.event.MouseEvent evt) {
        jPanelStudent.setBackground(mouseOn);
    }

    private void jLabelMgBooksMouseClicked(java.awt.event.MouseEvent evt) {
        jPanelMgBooks.setBackground(mouseOut);
        ManageBookV manageBookV = new ManageBookV();
        manageBookV.setLocationRelativeTo(null);
        manageBookV.setVisible(true);
    }
    private void jLabelMgBooksMouseEntered(java.awt.event.MouseEvent evt) {
        jPanelMgBooks.setBackground(mouseOut);
    }

    private void jLabelMgBooksMouseExited(java.awt.event.MouseEvent evt) {
        jPanelMgBooks.setBackground(mouseOn);
    }

    private void btnCheckOutMemberMouseClicked(java.awt.event.MouseEvent evt) {
        MemberCheckOut memberCheckOut = new MemberCheckOut();
        memberCheckOut.setLocationRelativeTo(null);
        memberCheckOut.setVisible(true);
    }

    private void btnCheckOutMemberMouseEntered(java.awt.event.MouseEvent evt) {
        jPanelMemberCheckoutRecord.setBackground(mouseOut);
    }

    private void btnCheckOutMemberMouseExited(java.awt.event.MouseEvent evt) {
       jPanelMemberCheckoutRecord.setBackground(mouseOn);
    }

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {
        jPanelIssBooks.setBackground(mouseOut);
        IssueBookV issueBookView = new IssueBookV();
        issueBookView.setLocationRelativeTo(null);
        issueBookView.setVisible(true);
    }

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {
        jPanelIssBooks.setBackground(mouseOut);
    }

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jPanelIssBooks.setBackground(mouseOn);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabelReturnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnBookMouseClicked
        // TODO add your handling code here:
        jPanelReturnBook.setBackground(mouseOut);
        //dispose();
        ReturnBookV returnBookV = new ReturnBookV();
        returnBookV.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
        returnBookV.setVisible(true);
    }//GEN-LAST:event_jLabelReturnBookMouseClicked

    private void jLabelReturnBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnBookMouseEntered
        // TODO add your handling code here:
        jPanelReturnBook.setBackground(mouseOut);
    }//GEN-LAST:event_jLabelReturnBookMouseEntered

    private void jLabelReturnBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnBookMouseExited
        // TODO add your handling code here:
        jPanelReturnBook.setBackground(mouseOn);
    }//GEN-LAST:event_jLabelReturnBookMouseExited

    private void btnBookCopyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookCopyMouseClicked
        // TODO add your handling code here:
        // cardLayout.show(cardRight, "cardRight2");
        BookCopyV bookCopyV = new BookCopyV();
        bookCopyV.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
        bookCopyV.setVisible(true);
    }//GEN-LAST:event_btnBookCopyMouseClicked

    private void btnBookCopyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookCopyMouseEntered
        // TODO add your handling code here:
        jPanelAddBookCopy.setBackground(mouseOut);
    }//GEN-LAST:event_btnBookCopyMouseEntered

    private void btnBookCopyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookCopyMouseExited
        // TODO add your handling code here:
        jPanelAddBookCopy.setBackground(mouseOn);
    }//GEN-LAST:event_btnBookCopyMouseExited

    private void btnAddBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseExited
        jPanelAddBook.setBackground(mouseOn);
    }//GEN-LAST:event_btnAddBookMouseExited

    private void btnAddBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseEntered
        jPanelAddBook.setBackground(mouseOut);
    }//GEN-LAST:event_btnAddBookMouseEntered

    private void btnAddBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseClicked
        jPanelAddBook.setBackground(mouseOn);
        AddBookV addBookV = new AddBookV();
        addBookV.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
        addBookV.setVisible(true);

    }
    private void btnLogOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut1MouseClicked
        AppController.getInstance().setUser(null);

        dispose();
        LoginView loginView = new LoginView();
        loginView.setLocationRelativeTo(null);
        loginView.setVisible(true);
    }//GEN-LAST:event_btnLogOut1MouseClicked

    private void btnLogOut1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOut1MouseEntered

    private void btnLogOut1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut1MouseExited
        // TODO add your handling code here:
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomPageV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomPageV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomPageV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomPageV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new HomPageV().setVisible(true));
    }


    private void checkRoles() {
        String role = AppController.getInstance().getUser().getRole().getName();
        if (role.equalsIgnoreCase("admin")) {
            jPanelIssBooks.setVisible(false);
            jPanelReturnBook.setVisible(false);
        }

        if (role.equalsIgnoreCase("librarian")) {
            jPanelMgBooks.setVisible(false);
            jPanelStudent.setVisible(false);
            jPanelAddBookCopy.setVisible(false);
            jPanelAddBook.setVisible(false);
            jPanelMemberCheckoutRecord.setVisible(false);
        }
    }
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JLabel btnAddBook;
    private javax.swing.JLabel btnBookCopy;
    private javax.swing.JLabel btnCheckOutMember;
    private javax.swing.JLabel btnLogOut1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMgBooks;
    private javax.swing.JLabel jLabelMgSutdents;
    private javax.swing.JLabel jLabelReturnBook;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelIssBooks;
    private javax.swing.JPanel jPanelMemberCheckoutRecord;
    private javax.swing.JPanel jPanelLogOut1;
    private javax.swing.JPanel jPanelMgBooks;
    private javax.swing.JPanel jPanelReturnBook;
    private javax.swing.JPanel jPanelStudent;
    private javax.swing.JPanel jPanelStudents123;
    private javax.swing.JPanel jPanelAddBook;
    private javax.swing.JPanel jPanelAddBookCopy;
}
