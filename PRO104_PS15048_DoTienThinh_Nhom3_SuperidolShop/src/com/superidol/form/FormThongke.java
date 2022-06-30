package com.superidol.form;

import com.superidol.chart.ModelChart;
import static com.superidol.form.FormGiaoDienTong.showForm;
import com.superidol.model.Model_Card;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormThongke extends javax.swing.JPanel {

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public FormThongke() {
        initComponents();
        setOpaque(false);
        connection();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/superidol/icon/money.png")), "Doanh thu", "Null $"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/superidol/icon/sale.png")), "Bán ra", "Null SP"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/superidol/icon/conlai.png")), "Tồn kho", Tonkho()));
    }

    private void init(Object year) {

        chartThongKe.addLegend("Phone", new Color(245, 189, 135));
        chartThongKe.addLegend("Headphone", new Color(135, 189, 245));
        chartThongKe.addLegend("Cáp", new Color(189, 135, 245));
        chartThongKe.addLegend("Pin", new Color(139, 229, 222));
        chartThongKe.addLegend("Khác", new Color(255, 89, 94));
        chartThongKe.addData(new ModelChart("Tháng 1", new double[]{PhoneThang1(year), Headphone1(year), Cap1(year), Pin1(year), Khac1(year)}));
        chartThongKe.addData(new ModelChart("Tháng 2", new double[]{PhoneThang2(year), Headphone2(year), Cap2(year), Pin2(year), Khac2(year)}));
        chartThongKe.addData(new ModelChart("Tháng 3", new double[]{PhoneThang3(year), Headphone3(year), Cap3(year), Pin3(year), Khac3(year)}));
        chartThongKe.addData(new ModelChart("Tháng 4", new double[]{PhoneThang4(year), Headphone4(year), Cap4(year), Pin4(year), Khac4(year)}));
        chartThongKe.addData(new ModelChart("Tháng 5", new double[]{PhoneThang5(year), Headphone5(year), Cap5(year), Pin5(year), Khac5(year)}));
        chartThongKe.addData(new ModelChart("Tháng 6", new double[]{PhoneThang6(year), Headphone6(year), Cap6(year), Pin6(year), Khac6(year)}));
        chartThongKe.addData(new ModelChart("Tháng 7", new double[]{PhoneThang7(year), Headphone7(year), Cap7(year), Pin7(year), Khac7(year)}));
        chartThongKe.addData(new ModelChart("Tháng 8", new double[]{PhoneThang8(year), Headphone8(year), Cap8(year), Pin8(year), Khac8(year)}));
        chartThongKe.addData(new ModelChart("Tháng 9", new double[]{PhoneThang9(year), Headphone9(year), Cap9(year), Pin9(year), Khac9(year)}));
        chartThongKe.addData(new ModelChart("Tháng 10", new double[]{PhoneThang10(year), Headphone10(year), Cap10(year), Pin10(year), Khac10(year)}));
        chartThongKe.addData(new ModelChart("Tháng 11", new double[]{PhoneThang11(year), Headphone11(year), Cap11(year), Pin11(year), Khac11(year)}));
        chartThongKe.addData(new ModelChart("Tháng 12", new double[]{PhoneThang12(year), Headphone12(year), Cap12(year), Pin12(year), Khac12(year)}));
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/superidol/icon/money.png")), "Doanh thu", Doanhthu(year)));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/superidol/icon/sale.png")), "Bán ra", Banra(year)));        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBieuDo = new javax.swing.JLabel();
        panelRound1 = new com.superidol.swing.PanelRound();
        chartThongKe = new com.superidol.chart.Chart();
        card1 = new com.superidol.component.Card();
        card2 = new com.superidol.component.Card();
        card3 = new com.superidol.component.Card();
        btnChon = new javax.swing.JButton();
        btnChonNamKhac = new javax.swing.JButton();
        cboNam = new com.superidol.swing.Combobox();

        setBackground(new java.awt.Color(255, 255, 255));

        lblBieuDo.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblBieuDo.setForeground(new java.awt.Color(79, 79, 79));
        lblBieuDo.setText("Biểu đồ");
        lblBieuDo.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        card1.setMaximumSize(new java.awt.Dimension(313, 186));
        card1.setMinimumSize(new java.awt.Dimension(313, 186));

        card2.setMaximumSize(new java.awt.Dimension(313, 186));
        card2.setMinimumSize(new java.awt.Dimension(313, 186));

        card3.setMaximumSize(new java.awt.Dimension(313, 186));
        card3.setMinimumSize(new java.awt.Dimension(313, 186));

        btnChon.setBackground(new java.awt.Color(255, 255, 255));
        btnChon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChon.setText("Chọn");
        btnChon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChonMouseExited(evt);
            }
        });
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        btnChonNamKhac.setBackground(new java.awt.Color(255, 255, 255));
        btnChonNamKhac.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChonNamKhac.setText("Chọn năm khác");
        btnChonNamKhac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChonNamKhacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChonNamKhacMouseExited(evt);
            }
        });
        btnChonNamKhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonNamKhacActionPerformed(evt);
            }
        });

        cboNam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "none", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100" }));
        cboNam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cboNam.setLineColor(new java.awt.Color(236, 145, 245));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBieuDo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChon)
                        .addGap(18, 18, 18)
                        .addComponent(btnChonNamKhac)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBieuDo)
                            .addComponent(btnChon)
                            .addComponent(btnChonNamKhac)
                            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        if (cboNam.getSelectedItem().equals("none")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn năm");
        } else {
            try {
                init(cboNam.getSelectedItem());
                btnChon.setVisible(false);
                cboNam.enable(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btnChonActionPerformed

    private void btnChonNamKhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonNamKhacActionPerformed
        showForm(new FormThongke());
    }//GEN-LAST:event_btnChonNamKhacActionPerformed

    private void btnChonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonMouseEntered
        btnChon.setBackground(Color.decode("#FDA7DF"));
        btnChon.setForeground(Color.white);
    }//GEN-LAST:event_btnChonMouseEntered

    private void btnChonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonMouseExited
        btnChon.setBackground(Color.white);
        btnChon.setForeground(Color.black);
    }//GEN-LAST:event_btnChonMouseExited

    private void btnChonNamKhacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonNamKhacMouseEntered
        btnChonNamKhac.setBackground(Color.decode("#FDA7DF"));
        btnChonNamKhac.setForeground(Color.white);
    }//GEN-LAST:event_btnChonNamKhacMouseEntered

    private void btnChonNamKhacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonNamKhacMouseExited
        btnChonNamKhac.setBackground(Color.white);
        btnChonNamKhac.setForeground(Color.black);
    }//GEN-LAST:event_btnChonNamKhacMouseExited
    private void connection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Smartphone_Shop;user=sa;password=songlong");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
//Doanh thu

    public String Doanhthu(Object nam) {
        String sql = "select SUM(DonGia) from HoaDonChiTiet hdct inner join HoaDon hd \n" +
"                on hdct.MaHoaDon = hd.MaHoaDon where YEAR(hd.NgayMuaHang) like " + nam
                + " and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String n = rs.getString(1);
                return n + " $";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

//Bán ra
    public String Banra(Object nam) {
        String sql = "select SUM(SoLuong) from HoaDonChiTiet hdct inner join HoaDon hd \n"
                + "on hdct.MaHoaDon = hd.MaHoaDon where YEAR(hd.NgayMuaHang) like " +nam;
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String n = rs.getString(1);
                return n + " SP";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

//Tồn kho
    public String Tonkho() {
        String sql = "select SUM(SoLuongConLai) from SanPham";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String n = rs.getString(1);
                return n + " SP";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

//Phone
    public int PhoneThang1(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 1 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";

        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang2(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 2 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang3(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 3 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang4(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 4 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang5(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 5 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang6(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 6 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang7(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 7 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang8(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 8 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang9(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 9 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang10(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 10 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang11(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 11 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int PhoneThang12(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Phone' and MONTH(hd.NgayMuaHang) = 12 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    //Headpohne
    public int Headphone1(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 1 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone2(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 2 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone3(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 3 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone4(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 4 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone5(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 5 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone6(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 6 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone7(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 7 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone8(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 8 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone9(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 9 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone10(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 10 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone11(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 11 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Headphone12(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Headphone' and MONTH(hd.NgayMuaHang) = 12 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    //Pin
    public int Pin1(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 1 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin2(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 2 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin3(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 3 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin4(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 4 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin5(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 5 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin6(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 6 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin7(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 7 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin8(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 8 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin9(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 9 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin10(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 10 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin11(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 11 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Pin12(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Pin' and MONTH(hd.NgayMuaHang) = 12 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    //Cáp
    public int Cap1(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 1 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap2(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 2 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap3(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 3 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap4(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 4 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap5(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 5 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap6(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 6 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap7(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 7 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap8(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 8 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap9(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 9 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap10(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 10 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap11(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 11 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Cap12(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Cáp' and MONTH(hd.NgayMuaHang) = 12 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    //Khác
    public int Khac1(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 1 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac2(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 2 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac3(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 3 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac4(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 4 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac5(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 5 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac6(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 6 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac7(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 7  and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac8(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 8 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac9(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 9 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac10(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 10 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac11(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 11 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int Khac12(Object nam) {
        String sql = "select sum(hdct.SoLuong) from HoaDonChiTiet hdct inner join SanPham sp \n"
                + "  on hdct.MaSanPham = sp.MaSanPham inner join HoaDon hd on hdct.MaHoaDon = hd.MaHoaDon\n"
                + "  where sp.LoaiSanPham = N'Khác' and MONTH(hd.NgayMuaHang) = 12 and  YEAR(hd.NgayMuaHang) like " + nam
                + "  and hd.TrangThai like N'Đã thanh toán'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int n = rs.getInt(1);
                return n;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnChonNamKhac;
    private com.superidol.component.Card card1;
    private com.superidol.component.Card card2;
    private com.superidol.component.Card card3;
    private com.superidol.swing.Combobox cboNam;
    private com.superidol.chart.Chart chartThongKe;
    private javax.swing.JLabel lblBieuDo;
    private com.superidol.swing.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
