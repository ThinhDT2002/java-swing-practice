package com.superidol.form;

import com.superidol.dao.HoaDonChiTietDAO;
import com.superidol.dao.HoaDonDAO;
import com.superidol.dao.KhachHangDAO;
import com.superidol.dao.SanPhamDAO;
import com.superidol.model.GioHang;
import com.superidol.model.HoaDon;
import com.superidol.model.HoaDonChiTiet;
import com.superidol.model.KhachHang;
import com.superidol.model.SanPham;
import com.superidol.utils.Authorize;
import com.superidol.utils.DateHelper;
import com.superidol.utils.MsgBox;
import com.superidol.utils.XImage;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class FormBanHang extends javax.swing.JPanel {

    public static int maKhachHang;
    public static String tenKhachHang;

    public static FormBanHang formBanHang;

    public FormBanHang() {
        initComponents();
        setOpaque(false);
        formBanHang = this;
        fillToTableDSSP();
        btnDatLai.setEnabled(false);
        btnThem.setEnabled(false);
        tblGioHang.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

//    public static void main(String[] args) {
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                System.out.println("Exit");
//            }
//        });
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        lblLoaiSP = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        lblTenSP = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        lblDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        lblSoLuong = new javax.swing.JLabel();
        pnlImage = new javax.swing.JPanel();
        lblHinhSanPham = new javax.swing.JLabel();
        btnXuatHoaDon = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblMaKhachHang = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNguoiMuaHang = new javax.swing.JLabel();
        lblTenKhachHang = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();
        btnDatLai = new javax.swing.JButton();
        txtLoaiSanPham = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblDanhSach = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGioHang = new com.superidol.swing.TableColumn();
        lblGioHang = new javax.swing.JLabel();
        scrollBar1 = new com.superidol.swing.ScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSach = new com.superidol.swing.TableColumn();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        scrollBar2 = new com.superidol.swing.ScrollBar();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(79, 79, 79));
        jLabel3.setText("Chi tiết sản phẩm");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        lblMaSP.setText("Mã sản phẩm:");

        lblLoaiSP.setText("Loại sản phẩm:");

        txtTenSP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTenSP.setEnabled(false);

        lblTenSP.setText("Tên sản phẩm:");

        txtMaSP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaSP.setEnabled(false);

        lblDonGia.setText("Đơn giá:");

        txtDonGia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDonGia.setEnabled(false);

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm vào giỏ");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemMouseExited(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        lblSoLuong.setText("Số lượng:");

        pnlImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinhSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinhSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnXuatHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        btnXuatHoaDon.setText("Mua");
        btnXuatHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXuatHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXuatHoaDonMouseExited(evt);
            }
        });
        btnXuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHoaDonActionPerformed(evt);
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

        lblMaKhachHang.setText("Mã khách hàng:");

        lblNguoiMuaHang.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblNguoiMuaHang.setForeground(new java.awt.Color(79, 79, 79));
        lblNguoiMuaHang.setText("Người mua hàng");

        lblTenKhachHang.setText("Tên khách hàng:");

        txtTenKhachHang.setEditable(false);
        txtTenKhachHang.setEnabled(false);

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

        btnDatLai.setBackground(new java.awt.Color(255, 255, 255));
        btnDatLai.setText("Đặt lại");
        btnDatLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDatLaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDatLaiMouseExited(evt);
            }
        });
        btnDatLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatLaiActionPerformed(evt);
            }
        });

        txtLoaiSanPham.setEditable(false);
        txtLoaiSanPham.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoaiSanPham.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNguoiMuaHang)
                .addGap(123, 123, 123))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblMaSP)
                        .addGap(24, 24, 24)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTenSP)
                        .addGap(20, 20, 20)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblDonGia)
                        .addGap(58, 58, 58)
                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblSoLuong)
                        .addGap(51, 51, 51)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnThem))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblLoaiSP)
                                .addGap(19, 19, 19)
                                .addComponent(txtLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblMaKhachHang)
                                .addGap(12, 12, 12)
                                .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTenKhachHang)
                                .addGap(7, 7, 7)
                                .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnDatLai, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 9, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNguoiMuaHang)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblMaKhachHang))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXacNhan))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblTenKhachHang))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDatLai))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblLoaiSP))
                    .addComponent(txtLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblMaSP))
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblTenSP))
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblDonGia))
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblSoLuong))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 420, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblDanhSach.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblDanhSach.setForeground(new java.awt.Color(79, 79, 79));
        lblDanhSach.setText("Danh sách sản phẩm");
        lblDanhSach.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        jScrollPane1.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGioHang);

        lblGioHang.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblGioHang.setForeground(new java.awt.Color(79, 79, 79));
        lblGioHang.setText("Giỏ Hàng");
        lblGioHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        scrollBar1.setBackground(new java.awt.Color(245, 245, 245));

        jScrollPane2.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBar(scrollBar2);

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Còn lại", "Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSach.setAlignmentX(5.0F);
        tblDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSach);

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        lblTimKiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTimKiem.setForeground(new java.awt.Color(102, 102, 102));
        lblTimKiem.setText("Tìm kiếm:");

        scrollBar2.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblTimKiem)
                        .addGap(12, 12, 12)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblDanhSach))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblGioHang)))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblTimKiem))
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lblDanhSach)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(scrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(lblGioHang)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatHoaDonMouseEntered
        btnXuatHoaDon.setBackground(Color.decode("#FDA7DF"));
        btnXuatHoaDon.setForeground(Color.white);
    }//GEN-LAST:event_btnXuatHoaDonMouseEntered

    private void btnXuatHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatHoaDonMouseExited
        btnXuatHoaDon.setBackground(Color.white);
        btnXuatHoaDon.setForeground(Color.black);
    }//GEN-LAST:event_btnXuatHoaDonMouseExited

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        btnThem.setBackground(Color.decode("#FDA7DF"));
        btnThem.setForeground(Color.white);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        btnThem.setBackground(Color.white);
        btnThem.setForeground(Color.black);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        btnXoa.setBackground(Color.white);
        btnXoa.setForeground(Color.black);
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        btnXoa.setBackground(Color.decode("#FDA7DF"));
        btnXoa.setForeground(Color.white);
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        xacNhanKhachHang();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnDatLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatLaiActionPerformed
        // TODO add your handling code here:
        clearKhachHang();
    }//GEN-LAST:event_btnDatLaiActionPerformed

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() >= 2) {
            row = tblDanhSach.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblDanhSachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:       
        if (checkSoLuong()) {
            themVaoGioHang();
            fillToTableGioHang();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        xoaKhoiGioHang();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHoaDonActionPerformed
        // TODO add your handling code here:
        if (MsgBox.confirm(this, "Thanh toán ?")) {
            if (listGioHang.isEmpty()) {
                MsgBox.alert(this, "Không có mặt hàng thanh toán");
            } else {
                insertHoaDon();
                insertHDCT();
                fillToTableDSSP();
                fillToTableGioHang();
            }
        }
    }//GEN-LAST:event_btnXuatHoaDonActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        timKiem();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnXacNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacNhanMouseEntered
        btnXacNhan.setBackground(Color.decode("#FDA7DF"));
        btnXacNhan.setForeground(Color.white);
    }//GEN-LAST:event_btnXacNhanMouseEntered

    private void btnXacNhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacNhanMouseExited
        btnXacNhan.setBackground(Color.white);
        btnXacNhan.setForeground(Color.black);
    }//GEN-LAST:event_btnXacNhanMouseExited

    private void btnDatLaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatLaiMouseEntered
        btnDatLai.setBackground(Color.decode("#FDA7DF"));
        btnDatLai.setForeground(Color.white);
    }//GEN-LAST:event_btnDatLaiMouseEntered

    private void btnDatLaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatLaiMouseExited
        btnDatLai.setBackground(Color.white);
        btnDatLai.setForeground(Color.black);
    }//GEN-LAST:event_btnDatLaiMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatHoaDon;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDanhSach;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblGioHang;
    private javax.swing.JLabel lblHinhSanPham;
    private javax.swing.JLabel lblLoaiSP;
    private javax.swing.JLabel lblMaKhachHang;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblNguoiMuaHang;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenKhachHang;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnlImage;
    private com.superidol.swing.ScrollBar scrollBar1;
    private com.superidol.swing.ScrollBar scrollBar2;
    private com.superidol.swing.TableColumn tblDanhSach;
    private com.superidol.swing.TableColumn tblGioHang;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtLoaiSanPham;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    SanPhamDAO sanPhamDAO = new SanPhamDAO();
    KhachHangDAO khachHangDAO = new KhachHangDAO();
    HoaDonDAO hoaDonDAO = new HoaDonDAO();
    HoaDonChiTietDAO hoaDonChiTietDAO = new HoaDonChiTietDAO();
    int row = -1;

    private void fillToTableDSSP() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSach.getModel();
        model.setRowCount(0);
        try {
            List<SanPham> list = sanPhamDAO.select();
            for (SanPham sanPham : list) {
                Object[] row = {sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getGiaBanRa(), sanPham.getSoLuongConLai(), sanPham.getHinh()};
                model.addRow(row);
            }
        } catch (Exception ex) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void clearKhachHang() {
        btnXacNhan.setEnabled(true);
        btnDatLai.setEnabled(false);
        txtTenKhachHang.setText("");
        txtMaKhachHang.setText("");
        btnThem.setEnabled(false);
    }

    public void enableButtonThemHang() {
        btnThem.setEnabled(true);
    }

    private void xacNhanKhachHang() {
        try {
            int maKH = Integer.parseInt(txtMaKhachHang.getText());
            KhachHang khachHang = khachHangDAO.selectById(maKH);
            if (khachHang != null) {
                txtTenKhachHang.setText(khachHang.getTenKhachHang());
                btnXacNhan.setEnabled(false);
                btnDatLai.setEnabled(true);
                btnThem.setEnabled(true);
            } else {
                MsgBox.alert(this, "Khách hàng không tồn tại!");
            }
        } catch (Exception ex) {
            MsgBox.alert(this, "Mã khách hàng không hợp lệ!");
        }
    }

    private void setForm(SanPham sanPham) {
        txtLoaiSanPham.setText(sanPham.getLoaiSanPham());
        txtMaSP.setText(sanPham.getMaSanPham() + "");
        txtTenSP.setText(sanPham.getTenSanPham());
        txtDonGia.setText(sanPham.getGiaBanRa() + "");
        if (sanPham.getHinh() != null) {
            lblHinhSanPham.setIcon(XImage.readLogo(sanPham.getHinh()));
        } else {
            lblHinhSanPham.setIcon(XImage.readLogo("noImage.png"));
        }
    }

    private HoaDon getHoaDon() {
        HoaDon hoaDon = new HoaDon();
        hoaDon.setMaKhachHang(Integer.parseInt(txtMaKhachHang.getText()));
        hoaDon.setTrangThai("Đã thanh toán");
        hoaDon.setMaNhanVien(Authorize.user.getMaNhanVien());
        hoaDon.setNgayMuaHang(DateHelper.now());
        return hoaDon;
    }

    private void edit() {
        int maSP = (int) tblDanhSach.getValueAt(row, 0);
        SanPham sanPham = sanPhamDAO.findById(maSP);
        setForm(sanPham);
    }
    List<GioHang> listGioHang = new ArrayList<>();

    private void themVaoGioHang() {
        int maSP = Integer.parseInt(txtMaSP.getText());
        SanPham sanPham = sanPhamDAO.findById(maSP);
        GioHang gioHang = new GioHang();
        gioHang.setMaSanPham(sanPham.getMaSanPham());
        gioHang.setTenSanPham(sanPham.getTenSanPham());
        gioHang.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        gioHang.setDonGia(sanPham.getGiaBanRa());
        listGioHang.add(gioHang);

        int soLuongConLai = sanPham.getSoLuongConLai() - Integer.parseInt(txtSoLuong.getText());
        sanPham.setSoLuongConLai(soLuongConLai);
        sanPhamDAO.update(sanPham);
        fillToTableDSSP();
        clearForm();
    }

    private void fillToTableGioHang() {
        DefaultTableModel model = (DefaultTableModel) tblGioHang.getModel();
        model.setRowCount(0);
        for (GioHang gioHang : listGioHang) {
            Object[] row = {gioHang.getMaSanPham(), gioHang.getTenSanPham(), gioHang.getSoLuong(), gioHang.getDonGia(), gioHang.getDonGia() * gioHang.getSoLuong()};
            model.addRow(row);
        }
    }

    private boolean checkSoLuong() {
        String error = "";
        try {
            int maSP = Integer.parseInt(txtMaSP.getText());
            SanPham sanPham = sanPhamDAO.findById(maSP);
            int soLuong = Integer.parseInt(txtSoLuong.getText());
            if (soLuong > sanPham.getSoLuongConLai()) {
                error += "Sản phẩm không đủ!";
            }
        } catch (NumberFormatException ex) {
            error += "Số lượng không hợp lệ!";
        }
        if (!error.equals("")) {
            MsgBox.alert(this, error);
        }
        return error.equals("");
    }

    private void xoaKhoiGioHang() {
        if (MsgBox.confirm(this, "Bạn có muốn xoá mặt hàng này?")) {
            int rowGioHang = tblGioHang.getSelectedRow();
            if (rowGioHang != -1) {
                int maSP = (int) tblGioHang.getValueAt(rowGioHang, 0);
                SanPham sanPham = sanPhamDAO.findById(maSP);
                int soLuong = (int) tblGioHang.getValueAt(rowGioHang, 2);
                int soLuongConLai = sanPham.getSoLuongConLai() + soLuong;
                sanPham.setSoLuongConLai(soLuongConLai);
                sanPhamDAO.update(sanPham);
                listGioHang.remove(rowGioHang);
            }
        }
        fillToTableDSSP();
        fillToTableGioHang();
    }

    private void clearForm() {
        txtLoaiSanPham.setText("");
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtDonGia.setText("");
        txtSoLuong.setText("");
    }

    private void insertHoaDon() {
        HoaDon hoaDon = getHoaDon();
        try {
            hoaDonDAO.insert(hoaDon);
        } catch (Exception ex) {

        }
    }

    int maHoaDon = 0;

    private void insertHDCT() {
        HoaDon hoaDon = hoaDonDAO.selectTop1();
        maHoaDon = hoaDon.getMaHoaDon();
        for (int rowGioHang = 0; rowGioHang < tblGioHang.getRowCount(); rowGioHang++) {
            HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
            hoaDonChiTiet.setMaHoaDon(hoaDon.getMaHoaDon());
            int maSP = (int) tblGioHang.getValueAt(rowGioHang, 0);
            hoaDonChiTiet.setMaSanPham(maSP);
            int soLuong = (int) tblGioHang.getValueAt(rowGioHang, 2);
            hoaDonChiTiet.setSoLuong(soLuong);
            double donGia = (double) tblGioHang.getValueAt(rowGioHang, 3);
            hoaDonChiTiet.setDonGia(donGia);
            String tenSanPham = (String) tblGioHang.getValueAt(rowGioHang, 1);
            hoaDonChiTiet.setTenSanPham(tenSanPham);
            hoaDonChiTietDAO.insert(hoaDonChiTiet);
        }
        inHoaDoaThanhToan();
        listGioHang = new ArrayList<>();
    }

    private void timKiem() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSach.getModel();
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

    public void setKhachHang() {
        txtMaKhachHang.setText(maKhachHang + "");
        txtTenKhachHang.setText(tenKhachHang);
    }

    private void inHoaDoaThanhToan() {
        HoaDonThanhToan.maHoaDon = maHoaDon;
        HoaDonThanhToan.tenKhachHang = txtTenKhachHang.getText();
        HoaDonThanhToan.ngayMuaHang = DateHelper.now();
        List<SanPham> listThanhToan = new ArrayList<>();
        for (int rowGioHang = 0; rowGioHang < tblGioHang.getRowCount(); rowGioHang++) {
            SanPham sanPham = new SanPham();
            sanPham.setTenSanPham((String) tblGioHang.getValueAt(rowGioHang, 1));
            sanPham.setGiaBanRa(Double.parseDouble(tblGioHang.getValueAt(rowGioHang, 3).toString()));
            sanPham.setSoLuongConLai(Integer.parseInt(tblGioHang.getValueAt(rowGioHang, 2).toString()));
            listThanhToan.add(sanPham);
        }
        HoaDonThanhToan.sanPham = listThanhToan;
        HoaDonThanhToan hoaDonThanhToan = new HoaDonThanhToan();
        hoaDonThanhToan.setVisible(true);
    }

}
