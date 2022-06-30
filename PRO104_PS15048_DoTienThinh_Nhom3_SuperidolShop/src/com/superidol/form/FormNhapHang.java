package com.superidol.form;

import com.superidol.dao.HangChoNhapDAO;
import com.superidol.dao.SanPhamDAO;
import com.superidol.model.HangChoNhap;
import com.superidol.model.SanPham;
import com.superidol.utils.MsgBox;
import java.awt.Color;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class FormNhapHang extends javax.swing.JPanel {

    public FormNhapHang() {
        initComponents();
        setOpaque(false);
        fillToTableKhoHang();
        fillToTableHangChoNhap();
        tblHangChoNhap.setDefaultEditor(Object.class, null);
        tblHangChoNhap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblKhoHangThanKy = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangChoNhap = new com.superidol.swing.TableColumn();
        lblHangChoNhap = new javax.swing.JLabel();
        scrollBar1 = new com.superidol.swing.ScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhoHang = new com.superidol.swing.TableColumn();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        scrollBar2 = new com.superidol.swing.ScrollBar();
        jPanel2 = new javax.swing.JPanel();
        lblThongTinSP = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        btnNhapHang = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnXacNhan = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblKhoHangThanKy.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblKhoHangThanKy.setForeground(new java.awt.Color(79, 79, 79));
        lblKhoHangThanKy.setText("Kho hàng thần kì");
        lblKhoHangThanKy.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));
        jPanel1.add(lblKhoHangThanKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        tblHangChoNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lượt nhập", "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHangChoNhap);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 395, 680, 250));

        lblHangChoNhap.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblHangChoNhap.setForeground(new java.awt.Color(79, 79, 79));
        lblHangChoNhap.setText("Hàng chờ nhập");
        lblHangChoNhap.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));
        jPanel1.add(lblHangChoNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        scrollBar1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.add(scrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 402, -1, 233));

        jScrollPane2.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBar(scrollBar2);

        tblKhoHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Tồn kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoHang.setAlignmentX(5.0F);
        tblKhoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKhoHang);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, 680, 237));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        jPanel1.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 28, 188, -1));

        lblTimKiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTimKiem.setForeground(new java.awt.Color(102, 102, 102));
        lblTimKiem.setText("Tìm kiếm:");
        jPanel1.add(lblTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 30, -1, -1));

        scrollBar2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.add(scrollBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 96, -1, 240));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblThongTinSP.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblThongTinSP.setForeground(new java.awt.Color(79, 79, 79));
        lblThongTinSP.setText("Thông tin sản phẩm");
        lblThongTinSP.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        lblTenSP.setText("Tên sản phẩm:");

        lblMaSP.setText("Mã sản phẩm:");

        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMaSP.setEnabled(false);

        lblSoLuong.setText("Số lượng nhập");

        txtTenSP.setEnabled(false);

        btnNhapHang.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapHang.setText("Nhập hàng");
        btnNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhapHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhapHangMouseExited(evt);
            }
        });
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        btnXacNhan.setBackground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXacNhanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXacNhanMouseExited(evt);
            }
        });
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoaMouseExited(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaSP)
                            .addComponent(lblTenSP))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSoLuong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNhapHang)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblThongTinSP)
                .addGap(86, 86, 86))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnXacNhan, btnXoa});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongTinSP)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaSP))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenSP))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnXacNhan, btnXoa});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapHangMouseExited
        btnNhapHang.setBackground(Color.white);
        btnNhapHang.setForeground(Color.black);
    }//GEN-LAST:event_btnNhapHangMouseExited

    private void btnNhapHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapHangMouseEntered
        btnNhapHang.setBackground(Color.decode("#FDA7DF"));
        btnNhapHang.setForeground(Color.white);
    }//GEN-LAST:event_btnNhapHangMouseEntered

    private void btnXacNhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacNhanMouseExited
        btnXacNhan.setBackground(Color.white);
        btnXacNhan.setForeground(Color.black);
    }//GEN-LAST:event_btnXacNhanMouseExited

    private void btnXacNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacNhanMouseEntered
        btnXacNhan.setBackground(Color.decode("#FDA7DF"));
        btnXacNhan.setForeground(Color.white);
    }//GEN-LAST:event_btnXacNhanMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        btnXoa.setBackground(Color.white);
        btnXoa.setForeground(Color.black);
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        btnXoa.setBackground(Color.decode("#FDA7DF"));
        btnXoa.setForeground(Color.white);
    }//GEN-LAST:event_btnXoaMouseEntered

    private void tblKhoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoHangMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() >= 2) {
            rowKhoHang = tblKhoHang.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblKhoHangMouseClicked

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
        // TODO add your handling code here:
        if (isValidated()) {
            themVaoHangChoNhap();
            fillToTableHangChoNhap();
            txtSoLuong.setText("");
        }
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        xoaKhoiHangChoNhap();

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        ThemHangHoa();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        timKiem();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHangChoNhap;
    private javax.swing.JLabel lblKhoHangThanKy;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblThongTinSP;
    private javax.swing.JLabel lblTimKiem;
    private com.superidol.swing.ScrollBar scrollBar1;
    private com.superidol.swing.ScrollBar scrollBar2;
    private com.superidol.swing.TableColumn tblHangChoNhap;
    private com.superidol.swing.TableColumn tblKhoHang;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    int rowKhoHang = -1;
    int rowHangChoNhap = -1;
    SanPhamDAO sanPhamDAO = new SanPhamDAO();
    HangChoNhapDAO hangChoNhapDAO = new HangChoNhapDAO();

    private void fillToTableKhoHang() {
        DefaultTableModel model = (DefaultTableModel) tblKhoHang.getModel();
        model.setRowCount(0);
        try {
            List<SanPham> list = sanPhamDAO.select();
            for (SanPham sanPham : list) {
                Object[] row = {sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getSoLuongConLai()};
                model.addRow(row);
            }
        } catch (Exception ex) {

            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void setForm(SanPham sanPham) {
        txtMaSP.setText(sanPham.getMaSanPham() + "");
        txtTenSP.setText(sanPham.getTenSanPham());
    }

    private void edit() {
        int maSP = (int) tblKhoHang.getValueAt(rowKhoHang, 0);
        SanPham sanPham = sanPhamDAO.findById(maSP);
        setForm(sanPham);
    }

    private void themVaoHangChoNhap() {
        int maSP = Integer.parseInt(txtMaSP.getText());
        SanPham sanPham = sanPhamDAO.findById(maSP);
        sanPham.setSoLuongConLai(Integer.parseInt(txtSoLuong.getText()));
        hangChoNhapDAO.insert(sanPham);
        tblKhoHang.clearSelection();
    }

    private void xoaKhoiHangChoNhap() {
        if (MsgBox.confirm(this, "Bạn có muốn xoá những đơn hàng này?")) {
            int rows[] = tblHangChoNhap.getSelectedRows();
            if (rows.length != 0) {
                for (int row : rows) {
                    int maLuotNhap = (int) tblHangChoNhap.getValueAt(row, 0);
                    hangChoNhapDAO.delete(maLuotNhap);
                }
                fillToTableHangChoNhap();
                MsgBox.alert(this, "Xoá thành công");
            }
        }
    }

    private void xoaKhoiHangChoNhapSauKhiThem() {
        int rows[] = tblHangChoNhap.getSelectedRows();
        for (int row : rows) {
            int maLuotNhap = (int) tblHangChoNhap.getValueAt(row, 0);
            hangChoNhapDAO.delete(maLuotNhap);
        }
        fillToTableHangChoNhap();
    }

    private void fillToTableHangChoNhap() {
        DefaultTableModel model = (DefaultTableModel) tblHangChoNhap.getModel();
        model.setRowCount(0);
        try {
            List<HangChoNhap> list = hangChoNhapDAO.selectAll();
            for (HangChoNhap hangChoNhap : list) {
                Object[] row = {hangChoNhap.getMaLuotNhap(), hangChoNhap.getMaSanPham(),
                    hangChoNhap.getMaSanPham(), hangChoNhap.getSoLuong(), hangChoNhap.getDonGia(), hangChoNhap.getSoLuong() * hangChoNhap.getDonGia()};
                model.addRow(row);
            }
        } catch (Exception ex) {
//            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void ThemHangHoa() {
        if (MsgBox.confirm(this, "Bạn muốn nhập những mặt hàng này?")) {
            int rows[] = tblHangChoNhap.getSelectedRows();
            if (rows.length != 0) {
                for (int row : rows) {
                    int maSP = (int) tblHangChoNhap.getValueAt(row, 1);
                    SanPham sanPham = sanPhamDAO.findById(maSP);
                    int soLuong = (int) tblHangChoNhap.getValueAt(row, 3);
                    int soLuongMoi = sanPham.getSoLuongConLai() + soLuong;
                    sanPham.setSoLuongConLai(soLuongMoi);
                    sanPhamDAO.update(sanPham);
                }
            }
        }
        MsgBox.alert(this, "Nhập hàng thành công!");
        xoaKhoiHangChoNhapSauKhiThem();
        fillToTableKhoHang();

    }

    private void timKiem() {
        DefaultTableModel model = (DefaultTableModel) tblKhoHang.getModel();
        model.setRowCount(0);
        try {
            List<SanPham> list = sanPhamDAO.selectById_TenSp(txtTimKiem.getText());
            for (SanPham sanPham : list) {
                Object[] row = {sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getGiaBanRa(), sanPham.getSoLuongConLai(), sanPham.getHinh()};
                model.addRow(row);
            }
        } catch (Exception ex) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private boolean isValidated() {
        String error = "";
        if (txtMaSP.getText().length() == 0) {
            error += "Mã sản phẩm trống!\n";
        }
        if (txtTenSP.getText().length() == 0) {
            error += "Tên sản phẩm trống!\n";
        }
        try {
            int soLuong = Integer.parseInt(txtSoLuong.getText());
            if (soLuong <= 0) {
                error += "Số lượng phải lớn hơn 0 !\n";
            }
        } catch (NumberFormatException ex) {
            error += "Số lượng không hợp lệ! \n";
        }
        if (!error.equals("")) {
            MsgBox.alert(this, error);
        }
        return error.equals("");
    }
}
