/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.form;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author duyan
 */
public class FormDoiMatKhau extends javax.swing.JFrame {

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    public FormDoiMatKhau() {
       initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        connection();
        loadComboBox();
        Disbled();
        lblStatus.setForeground(new Color(237,102,181));
        AutoCompleteDecorator.decorate(cboTaiKhoan);
    }

     private void Refresh() {
        txtMKhientai.setText("");
        txtMKmoi.setText("");
        txtXacNhanMK.setText("");
        lblStatus.setText("Trạng Thái!");
    }

    private void Disbled() {
        txtMKhientai.setEnabled(false);
        txtMKmoi.setEnabled(false);
        txtXacNhanMK.setEnabled(false);
    }

    private void Enabled() {
        txtMKhientai.setEnabled(true);
        txtMKmoi.setEnabled(true);
        txtXacNhanMK.setEnabled(true);
    }

    private void connection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Smartphone_Shop;user=sa;password=songlong");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void loadComboBox() {
        String sql = "SELECT * FROM NhanVien";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.cboTaiKhoan.addItem(rs.getString("MaNhanVien").trim());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean check() {
        boolean kq = false;
        String sql = "SELECT * FROM NhanVien WHERE MaNhanVien=? AND MatKhau=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, (String) cboTaiKhoan.getSelectedItem());
            pst.setString(2, String.valueOf(this.txtMKhientai.getPassword()));
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return kq;
    }

    private boolean checkNull() {
        boolean kq = true;
        if (String.valueOf(this.txtMKhientai.getPassword()).length() == 0) {
            lblStatus.setText("Bạn chưa nhập mật khẩu hiện tại!");
            return false;
        }
        if (String.valueOf(this.txtMKmoi.getPassword()).length() == 0) {
            lblStatus.setText("Bạn chưa nhập mật khẩu mới!");
            return false;
        }
        if (String.valueOf(this.txtXacNhanMK.getPassword()).length() == 0) {
            lblStatus.setText("Bạn chưa nhập lại mật khẩu mới!");
            return false;
        }
        return kq;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.superidol.swing.PanelRound();
        lblTitle = new javax.swing.JLabel();
        btnDongY = new com.superidol.swing.ButtonCustom();
        btnThoat = new com.superidol.swing.ButtonCustom();
        lblStatus = new javax.swing.JLabel();
        cboTaiKhoan = new com.superidol.swing.Combobox();
        jLabel1 = new javax.swing.JLabel();
        txtMKhientai = new textfield.PasswordField();
        txtXacNhanMK = new textfield.PasswordField();
        txtMKmoi = new textfield.PasswordField();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 255), 2));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 139, 197));
        lblTitle.setText("ĐỔI MẬT KHẨU");

        btnDongY.setBackground(new java.awt.Color(255, 139, 197));
        btnDongY.setText("Đồng Ý");
        btnDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongYActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 139, 197));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblStatus.setForeground(new java.awt.Color(237, 102, 181));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Trạng thái");

        cboTaiKhoan.setEditable(true);
        cboTaiKhoan.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboTaiKhoanPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Tài Khoản");

        txtMKhientai.setText("passwordField1");
        txtMKhientai.setLabelText("Mật khẩu hiện tại");

        txtXacNhanMK.setText("passwordField1");
        txtXacNhanMK.setLabelText("Xác nhận mật khẩu ");

        txtMKmoi.setText("passwordField1");
        txtMKmoi.setLabelText("Mật khẩu mới");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(btnDongY, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(cboTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMKhientai, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(txtXacNhanMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMKmoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(103, 103, 103))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitle)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(txtMKhientai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDongY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatus)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongYActionPerformed
        if (checkNull()) {
            if (check()) {
                if (String.valueOf(this.txtMKmoi.getPassword()).equals(String.valueOf(this.txtXacNhanMK.getPassword()))) {
                    String sqlChange = "UPDATE NhanVien SET MatKhau=? WHERE MaNhanVien=N'" + (String) cboTaiKhoan.getSelectedItem() + "'";
                    try {
                        pst = conn.prepareStatement(sqlChange);
                        pst.setString(1, String.valueOf(this.txtMKmoi.getPassword()));
                        pst.executeUpdate();
                        Disbled();
                        lblStatus.setText("Đổi mật khẩu thành công!");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    lblStatus.setText("Nhập lại mật khẩu mới không chính xác!");
                }
            } else {
                lblStatus.setText("Mật khẩu hiện tại bạn nhập không chính xác!");
            }
        }
    }//GEN-LAST:event_btnDongYActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cboTaiKhoanPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboTaiKhoanPopupMenuWillBecomeInvisible
        Enabled();
        Refresh();
    }//GEN-LAST:event_cboTaiKhoanPopupMenuWillBecomeInvisible

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int lick = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Ngừng Đổi Mật Khẩu Hay Không?", "Thông Báo", 2);
        if (lick == JOptionPane.OK_OPTION) {
            this.dispose();
        } else {
            if (lick == JOptionPane.CANCEL_OPTION) {
                this.setVisible(true);
            }
        }
    }//GEN-LAST:event_formWindowClosing
//
//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(FormDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormDoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormDoiMatKhau().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.superidol.swing.ButtonCustom btnDongY;
    private com.superidol.swing.ButtonCustom btnThoat;
    private com.superidol.swing.Combobox cboTaiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private com.superidol.swing.PanelRound panelRound1;
    private textfield.PasswordField txtMKhientai;
    private textfield.PasswordField txtMKmoi;
    private textfield.PasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables
}
