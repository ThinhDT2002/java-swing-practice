package com.superidol.form;

import com.superidol.dao.SanPhamDAO;
import com.superidol.model.SanPham;
import com.superidol.utils.Authorize;
import com.superidol.utils.MsgBox;
import com.superidol.utils.XImage;
import com.superidol.utils.utilityHelper;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormSanPham extends javax.swing.JPanel {

    public FormSanPham() {
        initComponents();
        init();
        disableButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblThongTin = new javax.swing.JLabel();
        panelRound1 = new com.superidol.swing.PanelRound();
        lblHangSX = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        lblThongTinChiTiet = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        lblTenSP = new javax.swing.JLabel();
        lblLoai = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        pnlAnh = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnChonAnh = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JLabel();
        cboHangSX = new com.superidol.swing.Combobox();
        cboLoai = new com.superidol.swing.Combobox();
        lblMaCungCap = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtThongTinChiTiet = new javax.swing.JTextArea();
        cboMaCungCap = new com.superidol.swing.Combobox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new com.superidol.swing.TableColumn();
        lblSanPham = new javax.swing.JLabel();
        scrollBar1 = new com.superidol.swing.ScrollBar();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblThongTin.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblThongTin.setForeground(new java.awt.Color(79, 79, 79));
        lblThongTin.setText("Thông tin");
        lblThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));

        lblHangSX.setText("Hãng sản xuất:");

        lblDonGia.setText("Đơn giá:");

        lblThongTinChiTiet.setText("Thông tin chi tiết:");

        txtDonGia.setName("Đơn giá"); // NOI18N

        lblTenSP.setText("Tên sản phẩm:");

        lblLoai.setText("Loại:");

        lblSoLuong.setText("Số lượng:");

        txtSoLuong.setName("Số lượng"); // NOI18N

        txtTenSP.setName("Tên sản phẩm"); // NOI18N

        pnlAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlAnhLayout = new javax.swing.GroupLayout(pnlAnh);
        pnlAnh.setLayout(pnlAnhLayout);
        pnlAnhLayout.setHorizontalGroup(
            pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlAnhLayout.setVerticalGroup(
            pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        lblTimKiem.setText("Tìm kiếm:");

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/them.png"))); // NOI18N
        btnThem.setText("Thêm");
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

        btnXuatExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnXuatExcel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/Excel.png"))); // NOI18N
        btnXuatExcel.setText("Xuất Excel");
        btnXuatExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXuatExcelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXuatExcelMouseExited(evt);
            }
        });
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/xoa.png"))); // NOI18N
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

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/sua.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuaMouseExited(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnChonAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/chonanhwhite.png"))); // NOI18N
        btnChonAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChonAnhMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChonAnhMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChonAnhMouseExited(evt);
            }
        });

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/timkiemwhite.png"))); // NOI18N
        btnTimKiem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnTimKiemAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseExited(evt);
            }
        });

        cboHangSX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apple", "Realme", "SamSung", "Huawei", "Xiaomi", "Oppo", "Vivo", "LG", "ZTE", "Lenovo", "Khác" }));

        cboLoai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phone", "Headphone", "Cáp", "Pin", "Khác" }));
        cboLoai.setLineColor(new java.awt.Color(255, 102, 255));

        lblMaCungCap.setText("Mã Cung Cấp:");

        txtThongTinChiTiet.setColumns(20);
        txtThongTinChiTiet.setRows(5);
        txtThongTinChiTiet.setName("Ghi chú"); // NOI18N
        jScrollPane3.setViewportView(txtThongTinChiTiet);

        cboMaCungCap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ABC", "XYZ", "VT" }));
        cboMaCungCap.setLineColor(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnXuatExcel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(lblHangSX, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboHangSX, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(lblDonGia)
                                .addGap(59, 59, 59)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblThongTinChiTiet))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblTimKiem)
                        .addGap(22, 22, 22)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btnTimKiem))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaCungCap)
                            .addComponent(lblTenSP)
                            .addComponent(lblLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoLuong))
                        .addGap(30, 30, 30)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(pnlAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(btnChonAnh)
                        .addGap(67, 67, 67))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblHangSX))
                            .addComponent(cboHangSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblDonGia))
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(lblThongTinChiTiet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenSP)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLoai)
                            .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoLuong)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaCungCap)
                            .addComponent(cboMaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTimKiem)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnlAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChonAnh)
                        .addGap(5, 5, 5)))
                .addGap(7, 7, 7)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnXuatExcel)))
        );

        jScrollPane1.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Giá Bán Ra", "Số Lượng Còn Lại", "Nhà Sản Xuất", "Mã Nhà Cung Cấp", "Loại Sản Phẩm", "Hình", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        lblSanPham.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(79, 79, 79));
        lblSanPham.setText("Sản Phẩm");
        lblSanPham.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        scrollBar1.setBackground(new java.awt.Color(245, 245, 245));

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/load.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSanPham)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblThongTin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblThongTin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(scrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clear();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnXuatExcelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseEntered
        btnXuatExcel.setBackground(Color.decode("#FDA7DF"));
        btnXuatExcel.setForeground(Color.white);
    }//GEN-LAST:event_btnXuatExcelMouseEntered

    private void btnXuatExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseExited
        btnXuatExcel.setBackground(Color.white);
        btnXuatExcel.setForeground(Color.black);
    }//GEN-LAST:event_btnXuatExcelMouseExited

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        btnThem.setBackground(Color.decode("#FDA7DF"));
        btnThem.setForeground(Color.white);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        btnThem.setBackground(Color.white);
        btnThem.setForeground(Color.black);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        btnXoa.setBackground(Color.decode("#FDA7DF"));
        btnXoa.setForeground(Color.white);
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        btnXoa.setBackground(Color.white);
        btnXoa.setForeground(Color.black);
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        btnSua.setBackground(Color.decode("#FDA7DF"));
        btnSua.setForeground(Color.white);
    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseExited
        btnSua.setBackground(Color.white);
        btnSua.setForeground(Color.black);
    }//GEN-LAST:event_btnSuaMouseExited

    private void btnChonAnhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonAnhMouseExited
        btnChonAnh.setIcon(new ImageIcon(getClass().getResource("/com/superidol/icon/chonanhwhite.png")));
    }//GEN-LAST:event_btnChonAnhMouseExited

    private void btnChonAnhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonAnhMouseEntered
        btnChonAnh.setIcon(new ImageIcon(getClass().getResource("/com/superidol/icon/chonanhblack.png")));
    }//GEN-LAST:event_btnChonAnhMouseEntered

    private void btnTimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseExited
        btnTimKiem.setIcon(new ImageIcon(getClass().getResource("/com/superidol/icon/timkiemwhite.png")));
    }//GEN-LAST:event_btnTimKiemMouseExited

    private void btnTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseEntered
        btnTimKiem.setIcon(new ImageIcon(getClass().getResource("/com/superidol/icon/timkiempink.png")));
    }//GEN-LAST:event_btnTimKiemMouseEntered

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(Color.decode("#FDA7DF"));
        btnClear.setForeground(Color.white);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(Color.white);
        btnClear.setForeground(Color.black);
    }//GEN-LAST:event_btnClearMouseExited

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        this.index = tblSanPham.getSelectedRow();
        this.edit();
        updateStatusButton();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (utilityHelper.checkNullText(txtTenSP) && utilityHelper.checkNullText(txtDonGia)
                && utilityHelper.checkNullText(txtSoLuong) && checkImage()) {
            if (utilityHelper.checkTenSp(txtTenSP) && utilityHelper.checkDonGiaSp(txtDonGia)
                    && utilityHelper.checkSoLuongSp(txtSoLuong)) {
                insert();
            }

        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnChonAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonAnhMouseClicked
        this.selectImage();
    }//GEN-LAST:event_btnChonAnhMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (Authorize.isManager()) {
            delete();
        } else {
            MsgBox.alert(this, "Chỉ quản lý mới được xóa nhân viên");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (utilityHelper.checkNullText(txtTenSP) && utilityHelper.checkNullText(txtDonGia)
                && utilityHelper.checkNullText(txtSoLuong)
                && checkImage()) {
            if (utilityHelper.checkTenSp(txtTenSP) && utilityHelper.checkDonGiaSp(txtDonGia)
                    && utilityHelper.checkSoLuongSp(txtSoLuong)) {
                update();
            }

        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        this.load();
        this.clear();
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void btnTimKiemAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnTimKiemAncestorAdded

    }//GEN-LAST:event_btnTimKiemAncestorAdded

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        this.loadTableById();
        this.clear();

    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Bảng Sản Phẩm");
            XSSFRow row = null;
            XSSFCell cell = null;
            row = sheet.createRow(2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Bảng Sản Phẩm");
            row = sheet.createRow(3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã Sản Phẩm");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Tên Sản Phẩm");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Giá Bán Ra");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Số Lượng");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Nhà Sản Xuất");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Mã Nhà Cung Cấp");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Lọa Sản Phẩm");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Hình");

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Ghi Chú");

            List<SanPham> list = spdao.select();
            ArrayList<SanPham> exportToExel = new ArrayList<>();
            exportToExel = (ArrayList<SanPham>) list;
            for (int i = 0; i < exportToExel.size(); i++) {
                SanPham sp = exportToExel.get(i);
                row = sheet.createRow((short) 4 + i);
                row.setHeight((short) 500);
                row.createCell(0).setCellValue(sp.getMaSanPham());
                row.createCell(1).setCellValue(sp.getTenSanPham());
                row.createCell(2).setCellValue(sp.getGiaBanRa());
                row.createCell(3).setCellValue(sp.getSoLuongConLai());
                row.createCell(4).setCellValue(sp.getNhaSanXuat());
                row.createCell(5).setCellValue(sp.getMaNhaCungCap());
                row.createCell(6).setCellValue(sp.getLoaiSanPham());
                row.createCell(7).setCellValue(sp.getHinh());
                row.createCell(8).setCellValue(sp.getGhiChu());

            }
            FileOutputStream fos = new FileOutputStream(new File("Excel\\sanpham.xlsx"));
            workbook.write(fos);
            fos.close();
            MsgBox.alert(this, "Product file export successful");
        } catch (Exception e) {
            MsgBox.alert(this, "Product file export failed");
        }


    }//GEN-LAST:event_btnXuatExcelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnChonAnh;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private com.superidol.swing.Combobox cboHangSX;
    private com.superidol.swing.Combobox cboLoai;
    private com.superidol.swing.Combobox cboMaCungCap;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblHangSX;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblMaCungCap;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblThongTin;
    private javax.swing.JLabel lblThongTinChiTiet;
    private javax.swing.JLabel lblTimKiem;
    private com.superidol.swing.PanelRound panelRound1;
    private javax.swing.JPanel pnlAnh;
    private com.superidol.swing.ScrollBar scrollBar1;
    private com.superidol.swing.TableColumn tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextArea txtThongTinChiTiet;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    int index = 0;
    SanPhamDAO spdao = new SanPhamDAO();
    JFileChooser fileChooser = new JFileChooser("D:\\java3\\SOF203\\DuAn1_Superidol_Nhom3\\logos");

    void init() {
        load();
    }

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<SanPham> list = spdao.selectByKeyword(keyword);
            for (SanPham sp : list) {
                Object[] row = {sp.getMaSanPham(), sp.getTenSanPham(), sp.getGiaBanRa(), sp.getSoLuongConLai(),
                    sp.getNhaSanXuat(), sp.getMaNhaCungCap(), sp.getLoaiSanPham(), sp.getHinh(), sp.getGhiChu()};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi truy xuất dữ liệu vào bảng");
        }
    }

    void loadTableById() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<SanPham> list = spdao.selectById(keyword);
            for (SanPham sp : list) {
                Object[] row = {sp.getMaSanPham(), sp.getTenSanPham(), sp.getGiaBanRa(), sp.getSoLuongConLai(),
                    sp.getNhaSanXuat(), sp.getMaNhaCungCap(), sp.getLoaiSanPham(), sp.getHinh(), sp.getGhiChu()};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi truy xuất dữ liệu vào bảng");
        }
    }

    void edit() {
        try {
            Integer masp = (Integer) tblSanPham.getValueAt(this.index, 0);
            SanPham model = spdao.findById(masp);
            if (model != null) {
                this.setModel(model);
                
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn edit");
        }
    }

    void setModel(SanPham model) {
        lblTenSP.setToolTipText(model.getMaSanPham() + "");
        txtTenSP.setText(model.getTenSanPham());
        txtDonGia.setText(String.valueOf(model.getGiaBanRa()));
        txtSoLuong.setText(String.valueOf(model.getSoLuongConLai()));
        cboHangSX.setSelectedItem(model.getNhaSanXuat());
        cboMaCungCap.setSelectedItem(model.getMaNhaCungCap());
        cboLoai.setSelectedItem(model.getLoaiSanPham());
        lblHinh.setToolTipText(model.getHinh());
        if (model.getHinh() != null) {
            lblHinh.setIcon(XImage.readLogo(model.getHinh()));
        } else {
            lblHinh.setIcon(XImage.readLogo("noImage.png"));
        }
        txtThongTinChiTiet.setText(model.getGhiChu());

    }

    void insert() {
        SanPham model = getModel();
        try {
            spdao.insert(model);
            this.load();
            this.clear();
            MsgBox.alert(this, "Thêm mới sản phẩm thành công");
            disableButton();
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới sản phẩm thất bại");
            disableButton();
        }
    }

    void update() {
        SanPham model = getModel();
        try {
            spdao.update(model);
            this.load();
            MsgBox.alert(this, "Cập nhật sản phẩm thành công");
            disableButton();
        } catch (Exception e) {

            MsgBox.alert(this, "Cập nhật sản phẩm thất bại");
            disableButton();
        }
    }

    void delete() {
        if (MsgBox.confirm(this, "Bạn có muốn xóa sản phẩm này không?")) {
            int masp = (int) tblSanPham.getValueAt(index, 0);
            try {
                spdao.delete(masp);
                this.load();
                this.clear();
                MsgBox.alert(this, "Xóa sản phẩm thành công");
                disableButton();
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa sản phẩm thất bại");
                disableButton();
            }
        }

    }

    void clear() {
        SanPham model = new SanPham();
        this.setModel(model);
        cboHangSX.setSelectedIndex(0);
        cboLoai.setSelectedIndex(0);
        cboMaCungCap.setSelectedIndex(0);
        tblSanPham.clearSelection();
        index = -1;
        updateStatusButton();
       
    }

   

    private void updateStatusButton() {
        boolean edit = (index >= 0);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    private void disableButton() {
        btnThem.setEnabled(false);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
    }

    SanPham getModel() {
        SanPham model = new SanPham();

        model.setMaSanPham(Integer.parseInt(lblTenSP.getToolTipText()));
        model.setTenSanPham(txtTenSP.getText());
        model.setGiaBanRa(Double.valueOf(txtDonGia.getText()));
        model.setSoLuongConLai(Integer.valueOf(txtSoLuong.getText()));

        String hangSX = (String) cboHangSX.getSelectedItem();
        model.setNhaSanXuat(hangSX);

        String maNhaCungCap = (String) cboMaCungCap.getSelectedItem();
        model.setMaNhaCungCap(maNhaCungCap);

        String loaiSP = (String) cboLoai.getSelectedItem();
        model.setLoaiSanPham(loaiSP);

        model.setHinh(lblHinh.getToolTipText());
        model.setGhiChu(txtThongTinChiTiet.getText());

        return model;
    }

    void selectImage() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (XImage.saveLogo(file)) {
                lblHinh.setIcon(XImage.readLogo(file.getName()));
                lblHinh.setToolTipText(file.getName());
            }
        }
    }

    public boolean checkImage() {
        if (lblHinh.getToolTipText() != null) {
            return true;
        } else {
            MsgBox.alert(this, "Hình ảnh đang trống");
            return false;
        }
    }
}
