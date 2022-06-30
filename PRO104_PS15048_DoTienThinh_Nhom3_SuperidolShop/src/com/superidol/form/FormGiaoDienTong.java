package com.superidol.form;

import com.superidol.component.Menu;
import com.superidol.event.EventMenuSelected;
import com.superidol.model.ModelMenu;
import com.superidol.utils.Authorize;
import com.superidol.utils.XImage;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class FormGiaoDienTong extends javax.swing.JFrame {

    private Menu menu = new Menu();
    private static JPanel main = new JPanel();
    private MigLayout layout;
    private Animator animator;
    private boolean menuShow;

    public FormGiaoDienTong() {
        initComponents();
        init();
        this.setIconImage(XImage.getIconApp());
    }
    

    private void init() {
        layout = new MigLayout("fill", "0[]10[]5", "0[fill]0");
        body.setLayout(layout);
        main.setOpaque(false);
        main.setLayout(new BorderLayout());
        menu.addEventLogout(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                new Login().setVisible(true);
                
            }
        });
        menu.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
            }
        });
        menu.setEvent(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    if (Authorize.isManager()) {
                        showForm(new FormNhanVien());
                    } else {
                        JOptionPane.showMessageDialog(null, "Chức năng này dành cho quản lý");
                    }
                } else if (index == 1) {
                    showForm(new FormSanPham());
                } else if (index == 2) {
                    showForm(new FormNhapHang());
                } else if (index == 3) {
                    showForm(new FormThongke());
                } else if (index == 4) {
                    showForm(new FormBanHang());
                } else if (index == 5) {
                    showForm(new FormKhachHang());
                } else if (index == 6) {
                    showForm(new FormNhaCungCap());
                }else if (index == 7) {
                    showForm(new FormHoaDon());
                } else if (index == 8) {
                    showForm(new FormThongTinLienHe());
                    new FormLienHe().setVisible(true);
                } else if (index == 9) {
                    showForm(new FormTaiKhoan());
                }
            }
        });
        menu.addMenu(new ModelMenu("Nhân viên", new ImageIcon(getClass().getResource("/com/superidol/icon/nhanvien.png"))));
        menu.addMenu(new ModelMenu("Sản Phẩm", new ImageIcon(getClass().getResource("/com/superidol/icon/sanpham.png"))));
        menu.addMenu(new ModelMenu("Nhập hàng", new ImageIcon(getClass().getResource("/com/superidol/icon/nhaphang.png"))));
        menu.addMenu(new ModelMenu("Thống kê", new ImageIcon(getClass().getResource("/com/superidol/icon/thongke.png"))));
        menu.addMenu(new ModelMenu("Bán hàng", new ImageIcon(getClass().getResource("/com/superidol/icon/banhang.png"))));
        menu.addMenu(new ModelMenu("khách hàng", new ImageIcon(getClass().getResource("/com/superidol/icon/khachhang.png"))));
        menu.addMenu(new ModelMenu("Nhà cung cấp", new ImageIcon(getClass().getResource("/com/superidol/icon/nhacungcap.png"))));
        menu.addMenu(new ModelMenu("Hóa đơn", new ImageIcon(getClass().getResource("/com/superidol/icon/hoadon.png"))));
        menu.addMenu(new ModelMenu("Thông tin liên hệ", new ImageIcon(getClass().getResource("/com/superidol/icon/info.png"))));
        menu.addMenu(new ModelMenu("Tài khoản", new ImageIcon(getClass().getResource("/com/superidol/icon/key.png"))));
        body.add(menu, "w 50!");
        body.add(main, "w 100%");
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menuShow) {
                    width = 50 + (150 * (1f - fraction));
                    menu.setAlpha(1f - fraction);
                } else {
                    width = 50 + (150 * fraction);
                    menu.setAlpha(fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!");
                body.revalidate();
            }

            @Override
            public void end() {
                menuShow = !menuShow;
            }
        };
        animator = new Animator(400, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        showForm(new FormGioiThieu());
    }

    public static void showForm(Component com) {
        main.removeAll();
        main.add(com);
        main.repaint();
        main.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        body.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1131, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormGiaoDienTong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGiaoDienTong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGiaoDienTong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGiaoDienTong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGiaoDienTong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    // End of variables declaration//GEN-END:variables
}
