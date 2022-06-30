/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.form;

import com.superidol.dao.NhaCungCapDAO;
import com.superidol.model.NhaCungCap;
import com.superidol.utils.Authorize;
import com.superidol.utils.MsgBox;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author duyan
 */
public class FormNhaCungCap extends javax.swing.JPanel {
 NhaCungCapDAO dao = new NhaCungCapDAO();
    int row = -1;
    /**
     * Creates new form FormNCC
     */
    public FormNhaCungCap() {
        initComponents(); 
        tblNhaCC.setDefaultEditor(Object.class, null);        
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }
    void insert(){
        NhaCungCap ncc = getForm();
            try {
                dao.insert(ncc);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công !");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại !");
        }
    }
    
    void update(){
        NhaCungCap ncc = getForm();
            try {
                dao.update(ncc);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công !");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại !");
        }
    }
    
    
    void delete(){
        String mancc = txtMaNCC.getText();
        if(!Authorize.isManager()){
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên !");
        }else 
            if(MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này ?")){
                try {
                    dao.delete(mancc);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công !");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại !");
                }
            }
    }
    
    void edit(){
        String mancc = (String) tblNhaCC.getValueAt(this.row, 0);
        NhaCungCap ncc = dao.selectById(mancc);
        this.setForm(ncc);
        this.updateStatus();
    }
        
    void clearForm(){
        NhaCungCap ncc = new NhaCungCap();
        this.setForm(ncc);
        this.row = -1;
        tblNhaCC.clearSelection();
        this.updateStatus();
    }
    
    
    void fillTable(){
        DefaultTableModel model = (DefaultTableModel) tblNhaCC.getModel();
        model.setRowCount(0); // xóa tất cả các hàng trên JTable
        try {
            String keyword = txtTimKiem.getText();
            List<NhaCungCap> list = dao.selectByKeyword(keyword); 
            for (NhaCungCap ncc : list) {
                Object[] row = {ncc.getMaNhaCungCap(), ncc.getTenNhaCungCap(), ncc.getSdt(),  ncc.getEmail(),ncc.getDiaChi(), ncc.getGhiChu()};
                model.addRow(row); // thêm một hàng vào JTable
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }
    
    private void timKiem(){
        this.fillTable();
        this.clearForm();
        this.row = -1;
    }
    
     void setForm(NhaCungCap ncc){
        txtMaNCC.setText(ncc.getMaNhaCungCap());
        txtxTenNCC.setText(ncc.getTenNhaCungCap());
        txtSoDT.setText(ncc.getSdt());
        txtEmail.setText(ncc.getEmail());
        txtDiaChi.setText(ncc.getDiaChi());
        txtGhiChu.setText(ncc.getGhiChu());
    }
    
    NhaCungCap getForm(){
        NhaCungCap ncc = new NhaCungCap();
        ncc.setMaNhaCungCap(txtMaNCC.getText());
        ncc.setTenNhaCungCap(txtxTenNCC.getText());
        ncc.setSdt(txtSoDT.getText());
        ncc.setEmail(txtEmail.getText());
        ncc.setDiaChi(txtDiaChi.getText());
        ncc.setGhiChu(txtGhiChu.getText());
        return ncc;
    }
    
    void updateStatus(){
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhaCC.getRowCount() - 1);
        
        txtMaNCC.setEnabled(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnClear.setEnabled(edit);
        btnXoa.setEnabled(edit);
        
    }
    
    public boolean validateForm(){
        if(txtMaNCC.getText().length() == 0){
            MsgBox.alert(this, "Không được phép để trống mã nhà cung cấp !");
            txtMaNCC.requestFocus();
            return false;
        }else if(txtxTenNCC.getText().length() == 0){
            MsgBox.alert(this, "Không được phép để trống tên nhà cung cấp !");
            txtxTenNCC.requestFocus();

            return false;        
        }else if(txtSoDT.getText().length() == 0){
            MsgBox.alert(this, "Không được phép để trống số điện thoại !");
            txtSoDT.requestFocus();

            return false;
        }else if(txtDiaChi.getText().length() == 0){
            MsgBox.alert(this, "Không được phép để trống địa chỉ !");
            txtDiaChi.requestFocus();

            return false;
        }else if(!txtSoDT.getText().matches("[0][0-9]{9}")){
            MsgBox.alert(this, "Vui lòng nhập đúng định dạng số !");
            txtSoDT.requestFocus();

            return false;
        }else if(txtEmail.getText().length() == 0){
            MsgBox.alert(this, "Không được phép để trống email !");
            txtEmail.requestFocus();

            return false;
        }else if(!txtEmail.getText().matches("^[a-zA-Z][a-zA-Z0-9_\\.]{2,32}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,4}){1,2}$")){
            MsgBox.alert(this, "Vui lòng nhập đúng định dạng email !");
            txtEmail.requestFocus();

            return false;
        }

        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        panelRound1 = new com.superidol.swing.PanelRound();
        lblMaNCC = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        lblTenNCC = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtxTenNCC = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextPane();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextPane();
        lblGhiChu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhaCC = new com.superidol.swing.TableColumn();
        scrollBar1 = new com.superidol.swing.ScrollBar();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(79, 79, 79));
        lblTitle.setText("NHÀ CUNG CẤP");
        lblTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

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
        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 62, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaNCC.setText("Mã nhà cung cấp:");
        panelRound1.add(lblMaNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 29, 176, -1));

        lblSoDT.setText("Số ĐT:");
        panelRound1.add(lblSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 69, -1, -1));

        lblDiaChi.setText("Địa chỉ:");
        panelRound1.add(lblDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 106, 64, -1));
        panelRound1.add(txtMaNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 213, -1));
        panelRound1.add(txtSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 213, -1));

        lblTenNCC.setText("Tên nhà cung cấp:");
        panelRound1.add(lblTenNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 29, -1, -1));

        lblEmail.setText("Email:");
        panelRound1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 69, -1, -1));
        panelRound1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 66, 218, -1));
        panelRound1.add(txtxTenNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 26, 218, -1));

        jScrollPane2.setViewportView(txtDiaChi);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 245, 94));
        panelRound1.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 220, 242, -1));

        lblTimKiem.setText("Tìm kiếm:");
        panelRound1.add(lblTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 220, -1, -1));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
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
        panelRound1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/search.png"))); // NOI18N
        btnTimKiem.setText("Tìm");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseExited(evt);
            }
        });
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        panelRound1.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 255, 89, -1));

        btnXuatExcel.setBackground(new java.awt.Color(255, 255, 255));
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
        panelRound1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
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
        panelRound1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jScrollPane3.setViewportView(txtGhiChu);

        panelRound1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 106, 218, 84));

        lblGhiChu.setText("Ghi chú:");
        panelRound1.add(lblGhiChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 106, 64, -1));

        add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 1040, 365));

        jScrollPane1.setBackground(new java.awt.Color(245, 245, 245));

        tblNhaCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Email", "Địa chỉ", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhaCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhaCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhaCC);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 431, 1040, 210));

        scrollBar1.setBackground(new java.awt.Color(245, 245, 245));
        add(scrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 6, 0, 0));
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(Color.decode("#FDA7DF"));
        btnClear.setForeground(Color.white);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(Color.white);
        btnClear.setForeground(Color.black);
    }//GEN-LAST:event_btnClearMouseExited

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        btnThem.setBackground(Color.decode("#FDA7DF"));
        btnThem.setForeground(Color.white);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        btnThem.setBackground(Color.white);
        btnThem.setForeground(Color.black);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        List<NhaCungCap> list = dao.selectAll();
        for (NhaCungCap nhaCungCap : list) {
            if (txtMaNCC.getText().equals(nhaCungCap.getMaNhaCungCap())) {
                MsgBox.alert(this, "Mã nhà cung cấp đã tồn tại ! Vui lòng nhập mã khác !");
                txtMaNCC.requestFocus();
                return;
            }
        }
        if(validateForm())
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseEntered
        btnTimKiem.setBackground(Color.decode("#FDA7DF"));
        btnTimKiem.setForeground(Color.white);
    }//GEN-LAST:event_btnTimKiemMouseEntered

    private void btnTimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseExited
        btnTimKiem.setBackground(Color.white);
        btnTimKiem.setForeground(Color.black);
    }//GEN-LAST:event_btnTimKiemMouseExited

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        this.timKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatExcelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseEntered
        btnXuatExcel.setBackground(Color.decode("#FDA7DF"));
        btnXuatExcel.setForeground(Color.white);
    }//GEN-LAST:event_btnXuatExcelMouseEntered

    private void btnXuatExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseExited
        btnXuatExcel.setBackground(Color.white);
        btnXuatExcel.setForeground(Color.black);
    }//GEN-LAST:event_btnXuatExcelMouseExited

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Bảng Nhà Cung Cấp");
            XSSFRow row = null;
            XSSFCell cell = null;
            
            sheet.setColumnWidth(0, 5000);
            sheet.setColumnWidth(1, 6000);
            sheet.setColumnWidth(2, 7000);
            sheet.setColumnWidth(3, 4000);
            sheet.setColumnWidth(4, 9000);
            sheet.setColumnWidth(5, 5000);

            row = sheet.createRow(2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Bảng Nhà Cung Cấp");
            row = sheet.createRow(3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã nhà cung cấp");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Tên nhà cung cấp");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Địa chỉ");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Số ĐT");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Email");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Ghi chú");

            String key = txtTimKiem.getText();
            List<NhaCungCap> list = dao.selectByKeyword(key);
            ArrayList<NhaCungCap> exportToExcel = new ArrayList<>();
            exportToExcel = (ArrayList<NhaCungCap>) list;
            for (int i = 0; i < exportToExcel.size(); i++) {
                NhaCungCap nhaCungCap = exportToExcel.get(i);
                row = sheet.createRow((short) 4+i);
                row.setHeight((short) 500);
                row.createCell(0).setCellValue(nhaCungCap.getMaNhaCungCap());
                row.createCell(1).setCellValue(nhaCungCap.getTenNhaCungCap());
                row.createCell(2).setCellValue(nhaCungCap.getDiaChi());
                row.createCell(3).setCellValue(nhaCungCap.getSdt());
                row.createCell(4).setCellValue(nhaCungCap.getEmail());
                row.createCell(5).setCellValue(nhaCungCap.getGhiChu());

            }
            FileOutputStream fos = new FileOutputStream(new File("Excel\\nhacungcap.xlsx"));
            workbook.write(fos);
            fos.close();
            JOptionPane.showMessageDialog(null, "File export success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        btnXoa.setBackground(Color.decode("#FDA7DF"));
        btnXoa.setForeground(Color.white);
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        btnXoa.setBackground(Color.white);
        btnXoa.setForeground(Color.black);
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        btnSua.setBackground(Color.decode("#FDA7DF"));
        btnSua.setForeground(Color.white);
    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseExited
        btnSua.setBackground(Color.white);
        btnSua.setForeground(Color.black);
    }//GEN-LAST:event_btnSuaMouseExited

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(validateForm())
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblNhaCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhaCCMouseClicked
        if(evt.getClickCount() == 2){
            this.row = tblNhaCC.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNhaCCMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblMaNCC;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblTenNCC;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTitle;
    private com.superidol.swing.PanelRound panelRound1;
    private com.superidol.swing.ScrollBar scrollBar1;
    private com.superidol.swing.TableColumn tblNhaCC;
    private javax.swing.JTextPane txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextPane txtGhiChu;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtxTenNCC;
    // End of variables declaration//GEN-END:variables
}
