package com.superidol.form;

import com.superidol.dao.KhachHangDAO;
import com.superidol.model.KhachHang;
import com.superidol.utils.Authorize;
import com.superidol.utils.DateHelper;
import com.superidol.utils.MsgBox;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormKhachHang extends javax.swing.JPanel {

    KhachHangDAO khachhangDAO = new KhachHangDAO();
    int row = -1;

    public FormKhachHang() {
        initComponents();
        setOpaque(false);
        init();
        disableButton();
        tblKhachHang.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    private void init() {
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        panelRound1 = new com.superidol.swing.PanelRound();
        lblEmail = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        lblTenKH = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        pnlAnh = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lblGhiChu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnBanHang = new javax.swing.JButton();
        btnSendEmail = new javax.swing.JButton();
        cboGioiTinh = new com.superidol.swing.Combobox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new com.superidol.swing.TableColumn();
        scrollBar1 = new com.superidol.swing.ScrollBar();
        btnClear = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(79, 79, 79));
        lblTitle.setText("QUẢN LÝ KHÁCH HÀNG");
        lblTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 13, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Email :");
        panelRound1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 55, -1, -1));

        lblSoDT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoDT.setText("Số ĐT :");
        panelRound1.add(lblSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 106, -1, 20));

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDiaChi.setText("Địa chỉ:");
        panelRound1.add(lblDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 50, -1));
        panelRound1.add(txtSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 106, 240, -1));

        lblTenKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTenKH.setText("Tên khách hàng:");
        panelRound1.add(lblTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        lblNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNgaySinh.setText("Ngày sinh:");
        panelRound1.add(lblNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));
        panelRound1.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 230, -1));

        pnlAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlAnhLayout = new javax.swing.GroupLayout(pnlAnh);
        pnlAnh.setLayout(pnlAnhLayout);
        pnlAnhLayout.setHorizontalGroup(
            pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlAnhLayout.setVerticalGroup(
            pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelRound1.add(pnlAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1043, 26, -1, -1));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        panelRound1.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 218, -1));

        lblTimKiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTimKiem.setText("Tìm kiếm:");
        panelRound1.add(lblTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        panelRound1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        btnXuatExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnXuatExcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        panelRound1.add(btnXuatExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        panelRound1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        panelRound1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));
        panelRound1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 53, 240, -1));

        lblGhiChu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGhiChu.setText("Ghi chú:");
        panelRound1.add(lblGhiChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Giới Tính:");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 149, -1, -1));
        panelRound1.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 230, -1));

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 198, 240, 70));

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane3.setViewportView(txtGhiChu);

        panelRound1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 230, 80));

        btnBanHang.setBackground(new java.awt.Color(255, 255, 255));
        btnBanHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/ban.png"))); // NOI18N
        btnBanHang.setText("Bán hàng");
        btnBanHang.setPreferredSize(new java.awt.Dimension(131, 31));
        btnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBanHangMouseExited(evt);
            }
        });
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });
        panelRound1.add(btnBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 131, 31));

        btnSendEmail.setBackground(new java.awt.Color(255, 255, 255));
        btnSendEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSendEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/send_mail.png"))); // NOI18N
        btnSendEmail.setText("Send Mail");
        btnSendEmail.setPreferredSize(new java.awt.Dimension(131, 31));
        btnSendEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSendEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSendEmailMouseExited(evt);
            }
        });
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });
        panelRound1.add(btnSendEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 131, 30));

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ", "Khác" }));
        cboGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelRound1.add(cboGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 80, -1));

        add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 75, -1, 358));

        jScrollPane1.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Ngày sinh", "Giới tính", "Số ĐT", "Email", "Địa chỉ", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);
        if (tblKhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 440, 1045, 210));

        scrollBar1.setBackground(new java.awt.Color(245, 245, 245));
        add(scrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1057, 440, -1, 210));

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
        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 13, 62, 49));
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (this.isValidated()) {
            this.insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (this.isValidated()) {
            this.update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        // TODO add your handling code here:
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Bảng Khách Hàng");
            sheet.setColumnWidth(0, 5000);
            sheet.setColumnWidth(1, 5000);
            sheet.setColumnWidth(2, 2000);
            sheet.setColumnWidth(3, 5000);
            sheet.setColumnWidth(4, 7000);
            sheet.setColumnWidth(5, 7000);
            sheet.setColumnWidth(6, 10000);
            XSSFRow row = null;
            XSSFCell cell = null;
            row = sheet.createRow(2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Bảng Khách Hàng");
            row = sheet.createRow(3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Tên Khách Hàng");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Ngày Sinh");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Giới Tính");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Số Điện Thoại");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Địa Chỉ");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Email");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Ghi Chú");

            List<KhachHang> list = khachhangDAO.selectAll();
            ArrayList<KhachHang> exportToExcel = new ArrayList<>();
            exportToExcel = (ArrayList<KhachHang>) list;
            for (int i = 0; i < exportToExcel.size(); i++) {
                
                KhachHang khachhang = exportToExcel.get(i);
                String gt = "";
                 if(khachhang.getGioiTinh()==0){
                     gt= "Nam";
                 }else if(khachhang.getGioiTinh()==1){
                     gt= "Nữ";
                 }else{
                     gt= "Khác";
                 }
                row = sheet.createRow((short) 4 + i);
                row.setHeight((short) 500);
                row.createCell(0).setCellValue(khachhang.getTenKhachHang());
                row.createCell(1).setCellValue(DateHelper.toString(khachhang.getNgaySinh(), "dd/mm/yyyy"));
                row.createCell(2).setCellValue(gt);
                row.createCell(3).setCellValue(khachhang.getSdt());
                row.createCell(4).setCellValue(khachhang.getDiaChi());
                row.createCell(5).setCellValue(khachhang.getEmail());
                row.createCell(6).setCellValue(khachhang.getGhiChu());
            }
            FileOutputStream fos = new FileOutputStream(new File("Excel\\khachhang.xlsx"));
            workbook.write(fos);
            fos.close();
            JOptionPane.showMessageDialog(null, "Xuất File Excel Thành Công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        // TODO add your handling code here:
        this.row = tblKhachHang.getSelectedRow();
        this.edit();
        updateStatusButton();
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        // TODO add your handling code here:
        chonKhachHang();

    }//GEN-LAST:event_btnBanHangActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        timKiem();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        // TODO add your handling code here:
        int rows[] = tblKhachHang.getSelectedRows();
        String email = "";
        if (rows.length == 1) {
            email += tblKhachHang.getValueAt(row, 5);
        } else {
            for (int row : rows) {
                email += tblKhachHang.getValueAt(row, 5) + ",";
            }
        }
        SendEmail s = null;
        if (s == null) {
            s = new SendEmail();
        }
        s.setVisible(true);
        SendEmail.sendEmail.sendEmailTo(email);
    }//GEN-LAST:event_btnSendEmailActionPerformed

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

    private void btnXuatExcelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseEntered
        btnXuatExcel.setBackground(Color.decode("#FDA7DF"));
        btnXuatExcel.setForeground(Color.white);
    }//GEN-LAST:event_btnXuatExcelMouseEntered

    private void btnXuatExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseExited
        btnXuatExcel.setBackground(Color.white);
        btnXuatExcel.setForeground(Color.black);
    }//GEN-LAST:event_btnXuatExcelMouseExited

    private void btnBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseEntered
        btnBanHang.setBackground(Color.decode("#FDA7DF"));
        btnBanHang.setForeground(Color.white);
    }//GEN-LAST:event_btnBanHangMouseEntered

    private void btnBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseExited
        btnBanHang.setBackground(Color.white);
        btnBanHang.setForeground(Color.black);
    }//GEN-LAST:event_btnBanHangMouseExited

    private void btnSendEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendEmailMouseEntered
        btnSendEmail.setBackground(Color.decode("#FDA7DF"));
        btnSendEmail.setForeground(Color.white);
    }//GEN-LAST:event_btnSendEmailMouseEntered

    private void btnSendEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendEmailMouseExited
        btnSendEmail.setBackground(Color.white);
        btnSendEmail.setForeground(Color.black);
    }//GEN-LAST:event_btnSendEmailMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(Color.decode("#FDA7DF"));
        btnClear.setForeground(Color.white);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(Color.white);
        btnClear.setForeground(Color.black);
    }//GEN-LAST:event_btnClearMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.superidol.swing.Combobox cboGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTitle;
    private com.superidol.swing.PanelRound panelRound1;
    private javax.swing.JPanel pnlAnh;
    private com.superidol.swing.ScrollBar scrollBar1;
    private com.superidol.swing.TableColumn tblKhachHang;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0); // xoá all các hàng trên table
        try {
            String keyword = txtTimKiem.getText();
            List<KhachHang> list = khachhangDAO.selectByKeyWord(keyword);
            String gt = "";
            for (KhachHang kh : list) {
                 
                 if(kh.getGioiTinh()==0){
                     gt= "Nam";
                 }else if(kh.getGioiTinh()==1){
                     gt= "Nữ";
                 }else{
                     gt= "Khác";
                 }
                Object[] row = {kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getNgaySinh(),
                    gt, kh.getSdt(), kh.getEmail(),
                    kh.getDiaChi(), kh.getGhiChu()};
                model.addRow(row); // thêm 1 hàng vào jtable
            }
        } catch (Exception ex) {
            MsgBox.alert(this, "Lỗi truy xuất dữ liệu!");
        }
    }

    private void setForm(KhachHang kh) {
        lblTenKH.setToolTipText(kh.getMaKhachHang() + "");
        txtTenKH.setText(kh.getTenKhachHang());
        txtNgaySinh.setDate(kh.getNgaySinh());
        if (kh.getGioiTinh() == 0) {
            cboGioiTinh.setSelectedIndex(0);
        } else if (kh.getGioiTinh() == 1) {
            cboGioiTinh.setSelectedIndex(1);
        } else if (kh.getGioiTinh() == 2) {
            cboGioiTinh.setSelectedIndex(2);
        }
        txtSoDT.setText(kh.getSdt());
        txtEmail.setText(kh.getEmail());
        txtDiaChi.setText(kh.getDiaChi());
        txtGhiChu.setText(kh.getGhiChu());
    }

    KhachHang getForm() {
        KhachHang kh = new KhachHang();
        kh.setTenKhachHang(txtTenKH.getText());
        kh.setNgaySinh(txtNgaySinh.getDate());
        kh.setGioiTinh(cboGioiTinh.getSelectedIndex());
        kh.setSdt(txtSoDT.getText());
        kh.setEmail(txtEmail.getText());
        kh.setDiaChi(txtDiaChi.getText());
        kh.setGhiChu(txtGhiChu.getText());
        kh.setMaKhachHang(Integer.parseInt(lblTenKH.getToolTipText()));
        return kh;
    }

    private void edit() {
        Integer kh = (Integer) tblKhachHang.getValueAt(row, 0);
        KhachHang makh = khachhangDAO.selectById(kh);
        setForm(makh);
    }

    private void clearForm() {
        KhachHang khachHang = new KhachHang();
        this.setForm(khachHang);
        tblKhachHang.clearSelection();
        this.row = -1;
        updateStatusButton();
    }

    private void insert() {
        KhachHang kh = getForm();
        try {
            khachhangDAO.insert(kh);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm Mới Khách Hàng Thành Công !!!");
            disableButton();
        } catch (Exception ex) {
            ex.printStackTrace();
            MsgBox.alert(this, "Thêm Mới Thất Bại !!!");
            disableButton();
        }
    }

    private void update() {
        KhachHang kh = getForm();
        try {
            khachhangDAO.update(kh);
            this.fillTable();
            MsgBox.alert(this, "Cập Nhật Thành Công !!!");
            disableButton();
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Cập Nhật Thất Bại !!!");
            disableButton();
        }
    }

    private void delete() {
        int maKH = (int) tblKhachHang.getValueAt(row, 0);
        if (!Authorize.isManager()) {
            MsgBox.alert(this, "Bạn Không Có Quyền Xoá Khách Hàng !!!");
        } else {
            if (MsgBox.confirm(this, "Bạn Có Thực Sự Muốn Xoá Khách Hàng Này Không ?")) {
                try {
                    khachhangDAO.delete(maKH);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xoá Thành Công !!!");
                    disableButton();
                } catch (Exception e) {
                    MsgBox.alert(this, "Xoá Thất Bại !!!");
                    disableButton();
                }
            }
        }

//        if (MsgBox.confirm(this, "Bạn Có Thực Sự Muốn Xoá Khách Hàng Này Không ?")) {
//            try {
//                khachhangDAO.delete(maKH);
//                this.fillTable();
//                this.clearForm();
//                MsgBox.alert(this, "Xoá Thành Công !!!");
//            } catch (Exception e) {
//                MsgBox.alert(this, "Xoá Thất Bại !!!");
//            }
//        }
    }

    private void timKiem() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        try {
            List<KhachHang> list = khachhangDAO.selectByKeyWord(txtTimKiem.getText());
            for (KhachHang khachhang : list) {
                Object[] row = {khachhang.getMaKhachHang() ,khachhang.getTenKhachHang(), khachhang.getNgaySinh(),
                    khachhang.getGioiTinh(), khachhang.getSdt(), khachhang.getDiaChi(),
                    khachhang.getEmail(), khachhang.getGhiChu()};
                model.addRow(row);
            }
        } catch (Exception ex) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private boolean isValidated() {
        String checkloi = "";
        if (txtTenKH.getText().length() == 0) {
            checkloi += "Vui Lòng Nhập Họ Và Tên Khách Hàng!\n";
        }

        if (!txtTenKH.getText().matches(".{3,50}")) { //phải từ 3-50 kí tự
            checkloi += "Tên Khách Hàng Chứa Từ 3 Đến 50 Kí Tự!\n";
        }

        if (!txtTenKH.getText().matches("^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{3,25}$")) { //phải là tên tiếng việt hoặc không dấu và từ 3-25 kí tự
            checkloi += "Tên Khách Hàng Chứa Từ 3 Đến 50 Kí Tự!\n";
        }

        if (txtEmail.getText().length() == 0) {
            checkloi += "Vui Lòng Nhập Email!\n";
        }

        //if (!txtEmail.getText().matches("\\w+@\\w+(\\.\\w+){1,2}")) {
        if (!txtEmail.getText().matches("^[a-zA-Z][a-zA-Z0-9_\\.]{2,32}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,4}){1,2}$")) {
            checkloi += "Email Không Hợp Lệ! Vui Lòng Thử Lại\n";
        }

        if (txtSoDT.getText().length() == 0) {
            checkloi += "Vui Lòng Nhập Số Điện Thoại!\n";
        }

        if (!txtSoDT.getText().matches("[0][0-9]{9}")) { //từ 0 - 9 (tối đa 10 số)
            //if (!txtSoDT.getText().matches("(086|096|097|098|032|033|034|035|036|037|038|039|089|090|093|070|079|077|078|076|088|091|094|083|084|085|081|082|092|056|058|099|059)[0-9]{7}")) { //từ 0 - 9 (tối đa 10 số) //phải gồm 10 số và đúng các đầu số của nhà mạng
            checkloi += "Số Điện Thoại Không Hợp Lệ!\n";
        }

        if (txtDiaChi.getText().length() == 0) {
            checkloi += "Vui Lòng Nhập Địa Chỉ!\n";
        }

        if (txtNgaySinh.getDate() == null) {
            checkloi += "Vui Lòng Chọn Ngày Sinh!\n";
        }

        if (txtGhiChu.getText().length() > 100) { //phải từ 1-100 kí tự
            checkloi += "Ghi Chú Chứa Từ 1 Đến 100 Kí Tự!\n";
        }

        if (!checkloi.equals("")) {
            MsgBox.alert(this, checkloi);
        }
        return checkloi.equals("");
    }

    private void chonKhachHang() {
        int maKh = (int) tblKhachHang.getValueAt(row, 0);
        String tenKh = (String) tblKhachHang.getValueAt(row, 1);
        FormBanHang.maKhachHang = maKh;
        FormBanHang.tenKhachHang = tenKh;
        FormGiaoDienTong.showForm(new FormBanHang());
        FormBanHang.formBanHang.setKhachHang();
        FormBanHang.formBanHang.enableButtonThemHang();
    }

    private void updateStatusButton() {
        boolean edit = (row >= 0);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    private void disableButton() {
        btnThem.setEnabled(false);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
    }

}
