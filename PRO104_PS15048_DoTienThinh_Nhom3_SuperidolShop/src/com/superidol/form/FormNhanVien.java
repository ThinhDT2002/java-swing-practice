package com.superidol.form;

import com.superidol.dao.NhanVienDAO;
import com.superidol.model.ModelMenu;
import com.superidol.model.NhanVien;
import com.superidol.utils.Authorize;
import static com.superidol.utils.Authorize.user;
import com.superidol.utils.DateHelper;
import com.superidol.utils.MsgBox;
import com.superidol.utils.XImage;
import com.superidol.utils.utilityHelper;
import java.awt.Color;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormNhanVien extends javax.swing.JPanel {

    public FormNhanVien() {
        initComponents();
        setOpaque(false);
        init();
        load();
    }

    private void init() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        panelRound1 = new com.superidol.swing.PanelRound();
        lblMaNV = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        lblGhichu = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTenNV = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        pnlAnh = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextPane();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        btnChonAnh = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        lblMatKhau = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnHienMK = new javax.swing.JButton();
        cboVaiTro = new com.superidol.swing.Combobox();
        cboGioiTinh = new com.superidol.swing.Combobox();
        lblDiachi = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextPane();
        txtSoDT = new javax.swing.JTextField();
        calendarNgaySinh = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new com.superidol.swing.TableColumn();
        scrollBar1 = new com.superidol.swing.ScrollBar();
        btnClear = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(79, 79, 79));
        lblTitle.setText("QU???N L?? NH??N VI??N");
        lblTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 11, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaNV.setText("M?? nh??n vi??n:");
        panelRound1.add(lblMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 29, 91, -1));

        lblGioiTinh.setText("Gi???i t??nh:");
        panelRound1.add(lblGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 73, 91, -1));

        lblSoDT.setText("S??? ??T:");
        panelRound1.add(lblSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 121, -1, -1));

        lblGhichu.setText("Ghi ch??:");
        panelRound1.add(lblGhichu, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 248, 50, -1));
        panelRound1.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 27, 245, -1));
        panelRound1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 245, -1));

        lblTenNV.setText("T??n nh??n vi??n:");
        panelRound1.add(lblTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 29, -1, -1));

        lblVaiTro.setText("Vai tr??:");
        panelRound1.add(lblVaiTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 61, -1, -1));

        lblNgaySinh.setText("Ng??y sinh:");
        panelRound1.add(lblNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 99, -1, -1));
        panelRound1.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 26, 218, -1));

        pnlAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlAnhLayout = new javax.swing.GroupLayout(pnlAnh);
        pnlAnh.setLayout(pnlAnhLayout);
        pnlAnhLayout.setHorizontalGroup(
            pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlAnhLayout.setVerticalGroup(
            pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelRound1.add(pnlAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 26, -1, -1));

        jScrollPane2.setViewportView(txtGhiChu);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 245, -1));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        panelRound1.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 199, 182, -1));

        lblTimKiem.setText("T??m ki???m:");
        panelRound1.add(lblTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 202, -1, -1));

        btnChonAnh.setBackground(new java.awt.Color(255, 255, 255));
        btnChonAnh.setText("Ch???n ???nh");
        btnChonAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChonAnhMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChonAnhMouseExited(evt);
            }
        });
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });
        panelRound1.add(btnChonAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 245, -1, -1));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/them.png"))); // NOI18N
        btnThem.setText("Th??m");
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
        panelRound1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 271, -1, -1));

        btnXuatExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/Excel.png"))); // NOI18N
        btnXuatExcel.setText("Xu???t Excel");
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
        panelRound1.add(btnXuatExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 271, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/xoa.png"))); // NOI18N
        btnXoa.setText("X??a");
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
        panelRound1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 271, -1, -1));

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/superidol/icon/sua.png"))); // NOI18N
        btnSua.setText("S???a");
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
        panelRound1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 271, -1, -1));

        lblMatKhau.setText("M???t kh???u:");
        panelRound1.add(lblMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 137, -1, -1));
        panelRound1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 134, 134, -1));

        btnHienMK.setBackground(new java.awt.Color(255, 255, 255));
        btnHienMK.setText("Hi???n MK");
        btnHienMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHienMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHienMKMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHienMKMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHienMKMouseReleased(evt);
            }
        });
        panelRound1.add(btnHienMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 133, -1, -1));

        cboVaiTro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Qu???n L??", "Nh??n Vi??n" }));
        panelRound1.add(cboVaiTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 55, 218, -1));

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "N???" }));
        panelRound1.add(cboGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 67, 87, -1));

        lblDiachi.setText("?????a ch???:");
        panelRound1.add(lblDiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 166, 64, -1));

        lblEmail.setText("Email:");
        panelRound1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 203, 40, -1));

        jScrollPane3.setViewportView(txtDiaChi);

        panelRound1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 158, 245, -1));
        panelRound1.add(txtSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 118, 245, -1));

        calendarNgaySinh.setDateFormatString("MM/dd/yyyy");
        panelRound1.add(calendarNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 220, -1));

        add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 56, 1050, 320));

        jScrollPane1.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? nh??n vi??n", "T??n nh??n vi??n", "Ng??y sinh", "Gi???i t??nh", "S??? ??T", "?????a ch???", "Vai tr??", "M???t kh???u", "Email", "???nh", "Ghi ch??"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 412, 1058, 230));

        scrollBar1.setBackground(new java.awt.Color(245, 245, 245));
        add(scrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 410, 10, 230));

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
        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 11, 62, -1));
    }// </editor-fold>//GEN-END:initComponents

    int index = 0;// v??? tr?? c???a nh??n vi??n ??ang ??c ch???n
    NhanVienDAO dao = new NhanVienDAO();
    JFileChooser fileChooser = new JFileChooser();

    //l???y list nhanVien t??? CSDL ??i???n v??o b???ng
    //L??U ??: CH??? QU???N L?? M???I XEM ???????C M???T KH???U C???A NG?????I KH??C
    void load() {

        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);   //????a s??? d??ng v??? 0 (x??a b???ng)
        try {
            List<NhanVien> list = dao.selectAll();   //l???y t???t c??? nh??n vi??n trong CSDL ????a v??o list

            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNhanVien(),
                    nv.getTenNhanVien(),
                    nv.getNgaySinh(),
                    nv.getGioiTinh() ? "Nam" : "N???",
                    nv.getSdt(),
                    nv.getDiaChi(),
                    nv.getVaiTro() ? "Qu???n L??" : "Nh??n Vi??n",
                    nv.getMatKhau(),
                    nv.getEmail(),
                    nv.getHinh(),
                    nv.getGhiChu()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u!");
        }
    }

    //ch??? tr?????ng ph??ng m???i ??c xem m???t kh???u ng?????i kh??c
    public String matKhauToSao(String pass) {
        String sao = "";
        for (int i = 0; i < pass.length(); i++) {
            sao += "*";
        }
        return sao;
    }

    //l???y th??ng tin tr??n form ?????
    //th??m (????ng k??) nh??n vi??n - tr?????ng ph??ng v??o CSDL
    void insert() throws ParseException {
        //getModel() vi???t ??? d?????i, l???y th??ng tin tr??n form ??i???n v??o ??t model
        NhanVien model = getModel();
        try {
            dao.insert(model);
            this.load();    //c???p nh???t l???i b???ng nv   
            MsgBox.alert(this, "Th??m m???i th??nh c??ng!");
            clear();
        } catch (Exception e) {
            MsgBox.alert(this, "Th??m m???i th???t b???i!");
        }

    }

    //l???y th??ng tin tr??n form ?????
    //c???p nh???t nhanVien theo maNV
     public boolean checkChinhMinh2(JTextField txt) {
        NhanVien nv = dao.selectById(txt.getText());
        if (nv.getMaNhanVien().equals(user.getMaNhanVien())) {
            Authorize.user = nv;
           if(user.getVaiTro()==false){
            JOptionPane.showMessageDialog(this, "Vai tr?? c???a b???n ???? h??? xu???ng nh??n vi??n, vui l??ng kh???i ?????ng v?? ????ng nh???p l???i ch????ng tr??nh!");
            System.exit(0);
           }
            return false;
        } else {
            return true;
        }
    }
    void update() throws ParseException {
        NhanVien model = getModel();
        
        try {
            dao.update(model);     //c???p nh???t nh??n vi??n theo maNV
            this.load(); //??i???n tt m???i v??o b???ng           
            checkChinhMinh2(txtMaNV);
            MsgBox.alert(this, "C???p nh???t th??nh c??ng!");
            clear();           
        } catch (Exception e) {
            MsgBox.alert(this, "C???p nh???t th???t b???i!");
        }

    }

    //l???y maNV tr??n form, x??a nv theo maNV
    //x??a tr???ng form chuy???n sang insertable
    void delete() {
        if (MsgBox.confirm(this, "B???n th???c s??? mu???n x??a nh??n vi??n n??y?")) {
            String manv = txtMaNV.getText();
            try {
                dao.delete(manv);   //x??a nh??n vi??n theo maNV
                this.load();        //??i???n tt m???i v??o b???ng
                this.clear();       //x??a tr???ng form v?? ch???nh l???i status
                MsgBox.alert(this, "X??a th??nh c??ng!");
            } catch (Exception e) {
                MsgBox.alert(this, "X??a th???t b???i!");
            }
        }
    }

    //??i???n th??ng tin ??t nhanVien l??n form (theo index)
    void edit() {
        try {
            String manv = (String) tblNhanVien.getValueAt(this.index, 0);  //l???y maNV t??? b???ng theo index
            NhanVien model = dao.selectById(manv); //d??ng maNV t??m ra ?????i t?????ng nhanVien
            if (model != null) {
                this.setModel(model);   //??i???n th??ng tin ??t nhanVien l??n form          
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u!");
        }
    }

    //param nhanVien
    //????a th??ng tin nhanVien l??n form theo model
    void setModel(NhanVien model) {
        txtMaNV.setText(model.getMaNhanVien());
        txtTenNV.setText(model.getTenNhanVien());
        txtPass.setText(model.getMatKhau());
        txtDiaChi.setText(model.getDiaChi());
        txtSoDT.setText(model.getSdt());
        calendarNgaySinh.setDate(model.getNgaySinh());
        txtEmail.setText(model.getEmail());
        txtGhiChu.setText(model.getGhiChu());
        lblAnh.setToolTipText(model.getHinh());
        if (model.getHinh() != null) {
            lblAnh.setIcon(XImage.readLogo(model.getHinh()));
            /*
            ImageIcon readLogo(String tenFile) ?????c file trong th?? m???c logos theo t??n file tr??? v??? ImageIcon
            void setIcon(ImageIcon icon) set Icon cho lbl
             */
        } else {
            lblAnh.setIcon(XImage.readLogo("noImage.png"));
        }
        if (model.getGioiTinh() == true) {
            cboGioiTinh.setSelectedIndex(0);
        } else if (model.getGioiTinh() == false) {
            cboGioiTinh.setSelectedIndex(1);
        }

        if (model.getVaiTro() == true) {
            cboVaiTro.setSelectedIndex(0);
        } else if (model.getVaiTro() == false) {
            cboVaiTro.setSelectedIndex(1);
        }
    }

    //return nhanVien
    //l???y th??ng tin tr??n form cho v??o ??t nhanVien
    NhanVien getModel() throws ParseException {
        NhanVien model = new NhanVien();
        model.setMaNhanVien(txtMaNV.getText());
        model.setTenNhanVien(txtTenNV.getText());
        model.setNgaySinh(calendarNgaySinh.getDate());
        String gt = (String) cboGioiTinh.getSelectedItem();
        if (gt.equals("Nam")) {
            model.setGioiTinh(true);
        } else if (gt.equals("N???")) {
            model.setGioiTinh(false);
        }
        model.setSdt(txtSoDT.getText());
        model.setDiaChi(txtDiaChi.getText());
        String vt = (String) cboVaiTro.getSelectedItem();
        if (vt.equals("Qu???n L??")) {
            model.setVaiTro(true);
        } else if (vt.equals("Nh??n Vi??n")) {
            model.setVaiTro(false);
        }
        model.setMatKhau(new String(txtPass.getPassword()));  //chuy???n char[] th??nh String
        model.setEmail(txtEmail.getText());
        model.setHinh(lblAnh.getToolTipText());
        model.setGhiChu(txtGhiChu.getText());
        return model;
    }

    void clear() {
        txtMaNV.enable(true);
        txtEmail.setText("");
        txtMaNV.setText("");
        calendarNgaySinh.setCalendar(null);
        txtTenNV.setText("");
        txtGhiChu.setText("");
        txtTimKiem.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        cboGioiTinh.setSelectedIndex(0);
        cboVaiTro.setSelectedIndex(0);
        lblAnh.setIcon(null);
        this.setModel(new NhanVien());
    }

    void selectImage() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { //n???u ng?????i d??ng ???? ch???n ??c file
            File file = fileChooser.getSelectedFile();    //l???y file ng?????i d??ng ch???n
            if (XImage.saveLogo(file)) {  //sao ch??p file ???? ch???n th?? m???c logos
                // Hi???n th??? h??nh l??n form
                lblAnh.setIcon(XImage.readLogo(file.getName())); //file.getName(); l???y t??n c???a file
                //ImageIcon readLogo(String tenFile) ?????c file trong th?? m???c logos theo t??n file tr??? v??? ImageIcon
                //void setIcon(ImageIcon icon) set Icon cho lbl
                lblAnh.setToolTipText(file.getName());
            }
        }
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnXuatExcelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseEntered
        btnXuatExcel.setBackground(Color.decode("#FDA7DF"));
        btnXuatExcel.setForeground(Color.white);
    }//GEN-LAST:event_btnXuatExcelMouseEntered

    private void btnXuatExcelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseExited
        btnXuatExcel.setBackground(Color.white);
        btnXuatExcel.setForeground(Color.black);
    }//GEN-LAST:event_btnXuatExcelMouseExited

    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        btnSua.setBackground(Color.decode("#FDA7DF"));
        btnSua.setForeground(Color.white);
    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseExited
        btnSua.setBackground(Color.white);
        btnSua.setForeground(Color.black);
    }//GEN-LAST:event_btnSuaMouseExited

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        btnXoa.setBackground(Color.decode("#FDA7DF"));
        btnXoa.setForeground(Color.white);
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        btnXoa.setBackground(Color.white);
        btnXoa.setForeground(Color.black);
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        btnThem.setBackground(Color.decode("#FDA7DF"));
        btnThem.setForeground(Color.white);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        btnThem.setBackground(Color.white);
        btnThem.setForeground(Color.black);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnHienMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienMKMouseEntered
        btnHienMK.setBackground(Color.decode("#FDA7DF"));
        btnHienMK.setForeground(Color.white);
    }//GEN-LAST:event_btnHienMKMouseEntered

    private void btnHienMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienMKMouseExited
        btnHienMK.setBackground(Color.white);
        btnHienMK.setForeground(Color.black);
    }//GEN-LAST:event_btnHienMKMouseExited

    private void btnChonAnhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonAnhMouseEntered
        btnChonAnh.setBackground(Color.decode("#FDA7DF"));
        btnChonAnh.setForeground(Color.white);
    }//GEN-LAST:event_btnChonAnhMouseEntered

    private void btnChonAnhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonAnhMouseExited
        btnChonAnh.setBackground(Color.white);
        btnChonAnh.setForeground(Color.black);
    }//GEN-LAST:event_btnChonAnhMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(Color.decode("#FDA7DF"));
        btnClear.setForeground(Color.white);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(Color.white);
        btnClear.setForeground(Color.black);
    }//GEN-LAST:event_btnClearMouseExited

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        txtMaNV.enable(false);
        if (evt.getClickCount() == 2) {
            this.index = tblNhanVien.rowAtPoint(evt.getPoint());//l???y v??? tr?? d??ng ???????c ch???n
            if (this.index >= 0) {
                this.edit();
            }
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked
    public boolean checkTrungMa(JTextField txt) {
        txt.setBackground(white);
        if (dao.selectById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(pink);
            MsgBox.alert(this, " ???? t???n t???i!");
            return false;
        }
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:

        if (utilityHelper.checkNullText(txtMaNV)
                && utilityHelper.checkNullPass(txtPass)
                && utilityHelper.checkNullText(txtTenNV)
                && utilityHelper.checkNullText(calendarNgaySinh)
                && utilityHelper.checkNullText(txtEmail)
                && utilityHelper.checkNullText(txtSoDT)
                && utilityHelper.checkNullText(txtDiaChi)) {
            if (utilityHelper.checkMaNV(txtMaNV)
                    && utilityHelper.checkPass(txtPass)
                    && utilityHelper.checkName(txtTenNV)
                    && utilityHelper.checkEmail(txtEmail)
                    && utilityHelper.checkMoTaCD(txtGhiChu)
                    && utilityHelper.checkSDT(txtSoDT)) {
                if (checkTrungMa(txtMaNV)) {
                    try {
                        insert();
                    } catch (ParseException ex) {
                        Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (utilityHelper.checkNullText(txtMaNV)
                && utilityHelper.checkNullPass(txtPass)
                && utilityHelper.checkNullText(txtTenNV)
                && utilityHelper.checkNullText(calendarNgaySinh)
                && utilityHelper.checkNullText(txtEmail)
                && utilityHelper.checkNullText(txtSoDT)
                && utilityHelper.checkNullText(txtDiaChi)) {
            if (utilityHelper.checkPass(txtPass)
                    && utilityHelper.checkName(txtTenNV)
                    && utilityHelper.checkEmail(txtEmail)
                    && utilityHelper.checkMoTaCD(txtGhiChu)
                    && utilityHelper.checkSDT(txtSoDT)) {

                try {
                    update();

                } catch (ParseException ex) {
                    Logger.getLogger(FormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    public boolean checkChinhMinh(JTextField txt) {
        NhanVien nv = dao.selectById(txt.getText());
        if (nv.getMaNhanVien().equals(user.getMaNhanVien())) {
            MsgBox.alert(this, "b???n kh??ng ???????c x??a ch??nh m??nh.");
            return false;
        } else {
            return true;
        }
    }
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            if (Authorize.isManager()) {
                if (checkChinhMinh(txtMaNV)) {
                    delete();
                }
            } else {
                MsgBox.alert(this, "Ch??? qu???n l?? m???i ???????c ph??p x??a");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "B???n ch??a ch???n nh??n vi??n ????? x??a");
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnHienMKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienMKMousePressed
        if (Authorize.isManager()) {
            txtPass.setEchoChar((char) 0);
        } else {
            JOptionPane.showMessageDialog(this, "Ch??? qu???n l?? m???i ???????c xem m???t kh???u");
        }

    }//GEN-LAST:event_btnHienMKMousePressed

    private void btnHienMKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienMKMouseReleased
        if (Authorize.isManager()) {
            txtPass.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_btnHienMKMouseReleased

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        this.selectImage();
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("B???ng Nh??n Vi??n");

            sheet.setColumnWidth(0, 4000);
            sheet.setColumnWidth(1, 5000);
            sheet.setColumnWidth(2, 5000);
            sheet.setColumnWidth(3, 2000);
            sheet.setColumnWidth(4, 5000);
            sheet.setColumnWidth(5, 5000);
            sheet.setColumnWidth(6, 3000);
            sheet.setColumnWidth(7, 5000);
            sheet.setColumnWidth(8, 6000);
            sheet.setColumnWidth(9, 5000);

            XSSFRow row = null;
            XSSFCell cell = null;

            row = sheet.createRow(2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("B???ng Nh??n Vi??n");
            row = sheet.createRow(3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("M?? nh??n vi??n");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("T??n Nh??n Vi??n");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Ng??y Sinh");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Gi???i T??nh");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("S??? ??T");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("?????a ch???");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Vai Tr??");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("M???t Kh???u");

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Email");

            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Ghi ch??");
            List<NhanVien> list = dao.selectAll();
            ArrayList<NhanVien> exportToExcel = new ArrayList<>();
            exportToExcel = (ArrayList<NhanVien>) list;
            for (int i = 0; i < exportToExcel.size(); i++) {
                NhanVien nhanvien = exportToExcel.get(i);
                row = sheet.createRow((short) 4 + i);
                row.setHeight((short) 500);
                row.createCell(0).setCellValue(nhanvien.getMaNhanVien());
                row.createCell(1).setCellValue(nhanvien.getTenNhanVien());
                row.createCell(2).setCellValue(DateHelper.toString(nhanvien.getNgaySinh(), "dd/MM/yyyy"));
                row.createCell(3).setCellValue(nhanvien.getGioiTinh() ? "Nam" : "N???");
                row.createCell(4).setCellValue(nhanvien.getSdt());
                row.createCell(5).setCellValue(nhanvien.getDiaChi());
                row.createCell(6).setCellValue(nhanvien.getVaiTro() ? "Qu???n L??" : "Nh??n Vi??n");
                row.createCell(7).setCellValue(nhanvien.getMatKhau());
                row.createCell(8).setCellValue(nhanvien.getEmail());
                row.createCell(9).setCellValue(nhanvien.getGhiChu());
            }
            FileOutputStream fos = new FileOutputStream(new File("Excel\\nhanvien.xlsx"));
            workbook.write(fos);
            fos.close();
            JOptionPane.showMessageDialog(null, "File export success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXuatExcelActionPerformed
    private void timKiem() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.selectById_TenNv(txtTimKiem.getText());
            for (NhanVien nhanvien : list) {
                Object[] row = {nhanvien.getMaNhanVien(), nhanvien.getTenNhanVien(), nhanvien.getNgaySinh(),
                    nhanvien.getGioiTinh() ? "Nam" : "N???", nhanvien.getSdt(), nhanvien.getDiaChi(), nhanvien.getVaiTro() ? "Qu???n L??" : "Nh??n Vi??n",
                    nhanvien.getMatKhau(), nhanvien.getEmail(), nhanvien.getHinh(), nhanvien.getGhiChu()};
                model.addRow(row);
            }
        } catch (Exception ex) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u!");
        }
    }
    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        timKiem();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHienMK;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private com.toedter.calendar.JDateChooser calendarNgaySinh;
    private com.superidol.swing.Combobox cboGioiTinh;
    private com.superidol.swing.Combobox cboVaiTro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblDiachi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGhichu;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaiTro;
    private com.superidol.swing.PanelRound panelRound1;
    private javax.swing.JPanel pnlAnh;
    private com.superidol.swing.ScrollBar scrollBar1;
    private com.superidol.swing.TableColumn tblNhanVien;
    private javax.swing.JTextPane txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextPane txtGhiChu;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
