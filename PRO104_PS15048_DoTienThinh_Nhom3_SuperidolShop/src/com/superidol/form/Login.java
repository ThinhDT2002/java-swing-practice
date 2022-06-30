/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.form;

import com.superidol.dao.NhanVienDAO;
import com.superidol.main.Main;
import com.superidol.model.NhanVien;
import com.superidol.utils.Authorize;
import com.superidol.utils.MsgBox;
import com.superidol.utils.XImage;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author DUYAN
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.lblSignUp.setVisible(false);
        this.lblRoleIcon.setVisible(false);
        this.lblEmail.setVisible(false);
        this.btnsignup.setVisible(false);
        this.cboRole.setVisible(false);
        this.lblRole.setVisible(false);
        setLocationRelativeTo(null);
        txtPass.setEchoChar((char) 0);
        this.btnShowPass1.setVisible(false);
        this.setIconImage(XImage.getIconApp());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        btnsignup = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        cboRole = new javax.swing.JComboBox<>();
        lblRoleIcon = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnShowPass1 = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();
        pnlSign = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblPass = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblSignIn = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnShowPass = new javax.swing.JLabel();
        lblQR = new javax.swing.JLabel();
        lblQuenMatKhau = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSignIn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSIGNUP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/icons8_sign_out_50px.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 50, 40));

        btnsignup.setBackground(new java.awt.Color(51, 51, 51));
        btnsignup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("                           Sign up");
        btnsignup.setToolTipText("");
        btnsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsignupMousePressed(evt);
            }
        });
        jPanel1.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 280, 50));

        lblRole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Role:");
        jPanel1.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        cboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên" }));
        jPanel1.add(cboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 100, -1));

        lblRoleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/icons8_checked_user_male_32px.png"))); // NOI18N
        lblRoleIcon.setText("jLabel3");
        jPanel1.add(lblRoleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 40, 50));

        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/icons8_New_Post_32px.png"))); // NOI18N
        lblEmail.setText("jLabel3");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 40, 50));

        btnShowPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/icons8_Invisible_23px.png"))); // NOI18N
        btnShowPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnShowPass1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnShowPass1MouseReleased(evt);
            }
        });
        jPanel1.add(btnShowPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, -1));

        lblSignUp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lblSignUp.setText("Sign up");
        jPanel1.add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 150, 60));

        pnlSign.setBackground(new java.awt.Color(252, 73, 178));
        pnlSign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlSign.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 10));

        txtUser.setBackground(new java.awt.Color(252, 73, 178));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setText("Username");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        pnlSign.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 230, 30));

        txtPass.setBackground(new java.awt.Color(252, 73, 178));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setText("Password");
        txtPass.setToolTipText("");
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        pnlSign.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 20));

        lblPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/icons8_Lock_32px.png"))); // NOI18N
        pnlSign.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 50));

        jPanel5.setBackground(new java.awt.Color(204, 0, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("                              Login");
        login.setToolTipText("");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });
        jPanel5.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        pnlSign.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 280, 50));
        pnlSign.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 230, 20));
        pnlSign.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 230, 10));

        lblSignIn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSignIn.setForeground(new java.awt.Color(255, 255, 255));
        lblSignIn.setText("Sign in");
        pnlSign.add(lblSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 50));

        lblUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/icons8_User_35px_1.png"))); // NOI18N
        lblUserName.setText("jLabel3");
        pnlSign.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 40, 50));

        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/icons8_Invisible_23px.png"))); // NOI18N
        btnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnShowPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnShowPassMouseReleased(evt);
            }
        });
        pnlSign.add(btnShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        lblQR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQR.setForeground(new java.awt.Color(255, 255, 255));
        lblQR.setText("Login with QR");
        lblQR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblQRMousePressed(evt);
            }
        });
        pnlSign.add(lblQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 100, 20));

        lblQuenMatKhau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuenMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblQuenMatKhau.setText("Quên Mật Khẩu?");
        lblQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMousePressed(evt);
            }
        });
        pnlSign.add(lblQuenMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jPanel1.add(pnlSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 320, 390));

        jPanel2.setBackground(new java.awt.Color(255, 139, 197));

        btnSignIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(51, 51, 51));
        btnSignIn.setText("     Sign in");
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSignInMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSignIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSignIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 110, 40));

        jPanel3.setBackground(new java.awt.Color(255, 139, 197));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSIGNUP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSIGNUP.setForeground(new java.awt.Color(51, 51, 51));
        btnSIGNUP.setText("    Sign up");
        btnSIGNUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSIGNUPMousePressed(evt);
            }
        });
        jPanel3.add(btnSIGNUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/hinh-nen-thien-nhien-Nhat.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSIGNUPMousePressed(MouseEvent evt) {//GEN-FIRST:event_btnSIGNUPMousePressed
        int p = this.pnlSign.getX();
        if (p > -1) {
            Animacion.Animacion.mover_derecha(117, 510, 2, 3, pnlSign);
        }
        login.setVisible(false);
        lblUserName.setVisible(false);
        lblSignIn.setVisible(false);
        lblSignUp.setVisible(true);
        lblRoleIcon.setVisible(true);
        lblEmail.setVisible(true);
        cboRole.setVisible(true);
        lblRole.setVisible(true);
        btnsignup.setVisible(true);
        btnShowPass.setVisible(false);
        btnShowPass1.setVisible(true);
        lblQR.setVisible(false);
        lblQuenMatKhau.setVisible(false);
    }//GEN-LAST:event_btnSIGNUPMousePressed

    private void btnSignInMousePressed(MouseEvent evt) {//GEN-FIRST:event_btnSignInMousePressed
        int p = this.pnlSign.getX();
        if (p > -1) {
            Animacion.Animacion.mover_izquierda(510, 117, 2, 3, pnlSign);
        }
        lblSignUp.setVisible(false);
        lblRoleIcon.setVisible(false);
        btnsignup.setVisible(false);
        login.setVisible(true);
        lblUserName.setVisible(true);
        lblSignIn.setVisible(true);
        cboRole.setVisible(false);
        lblEmail.setVisible(false);
        lblRole.setVisible(false);
        btnShowPass.setVisible(true);
        btnShowPass1.setVisible(false);
        lblQR.setVisible(true);
        lblQuenMatKhau.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnSignInMousePressed

    private void btnExitMousePressed(MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (ret == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_btnExitMousePressed

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        txtUser.setText("");
    }//GEN-LAST:event_txtUserMousePressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        txtPass.setText("");
        txtPass.setEchoChar('\u25cf');
    }//GEN-LAST:event_txtPassMousePressed

    private void btnShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMousePressed
        txtPass.setEchoChar((char) 0);

    }//GEN-LAST:event_btnShowPassMousePressed

    private void btnShowPass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPass1MousePressed
        txtPass.setEchoChar((char) 0);
    }//GEN-LAST:event_btnShowPass1MousePressed

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        dangNhap();
    }//GEN-LAST:event_loginMousePressed

    private void btnsignupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupMousePressed
        JOptionPane.showMessageDialog(this, "Nạp lần đầu để đăng kí");
    }//GEN-LAST:event_btnsignupMousePressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dangNhap();
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void btnShowPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMouseReleased
        txtPass.setEchoChar('\u25cf');
    }//GEN-LAST:event_btnShowPassMouseReleased

    private void btnShowPass1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPass1MouseReleased
        txtPass.setEchoChar('\u25cf');
    }//GEN-LAST:event_btnShowPass1MouseReleased

    private void lblQRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQRMousePressed
        new CamQR().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblQRMousePressed

    private void lblQuenMatKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMousePressed
        QuenMatKhau qmk = new QuenMatKhau();
        this.setVisible(false);
        qmk.setVisible(true);
    }//GEN-LAST:event_lblQuenMatKhauMousePressed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnSIGNUP;
    private javax.swing.JLabel btnShowPass;
    private javax.swing.JLabel btnShowPass1;
    private javax.swing.JLabel btnSignIn;
    private javax.swing.JLabel btnsignup;
    private javax.swing.JComboBox<String> cboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblQR;
    private javax.swing.JLabel lblQuenMatKhau;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblRoleIcon;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel login;
    private javax.swing.JPanel pnlSign;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO nhanVienDAO = new NhanVienDAO();

    private void dangNhap() {
        String maNhanVien = txtUser.getText();
        String matKhau = txtPass.getText();
        NhanVien nhanVien = nhanVienDAO.selectById(maNhanVien);
        if (maNhanVien.length() == 0 || matKhau.length() == 0) {
            MsgBox.alert(this, "Vui lòng nhập tài khoản!");
        } else if (nhanVien == null || !matKhau.equals(nhanVien.getMatKhau())) {
            MsgBox.alert(this, "Tài khoản hoặc mật khẩu không chính xác!");
        } else {
            MsgBox.alert(this, "Đăng nhập thành công!");
            Authorize.user = nhanVien;
            new FormGiaoDienTong().setVisible(true);
            this.dispose();
        }
    }

}
