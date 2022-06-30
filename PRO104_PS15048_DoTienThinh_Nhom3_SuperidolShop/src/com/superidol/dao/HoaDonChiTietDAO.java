/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.dao;

import com.superidol.model.HoaDonChiTiet;
import com.superidol.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietDAO {

    private final String INSERT_SQL = "INSERT INTO HoaDonChiTiet(MaSanPham, TenSanPham , MaHoaDon, SoLuong, DonGia) VALUES (?, ?, ?, ?, ?)";
    private final String UPDATE_SQL = "UPDATE HoaDonChiTiet SET MaSanPham=?, TenSanPham=?, MaHoaDon=?, SoLuong=?, DonGia=? WHERE MaHoaDonChiTiet=?";
    private final String DELETE_SQL = "DELETE FROM HoaDonChiTiet WHERE MaHoaDonChiTiet = ?";
    private final String SELECT_ALL_SQL = "SELECT * FROM HoaDonChiTiet";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM HoaDonChiTiet WHERE MaHoaDonChiTiet = ?";
    private final String SELECT_BY_MAHOADON = "SELECT * From HoaDonChiTiet WHERE MaHoaDon = ?";
    private final String SELECT_BY_TENSANPHAM_MAHOADON = "SELECT * FROM HoaDonChiTiet WHERE TenSanPham LIKE ? OR MaHoaDon LIKE ?";

    public void insert(HoaDonChiTiet hoaDonChiTiet) {
        JdbcHelper.executeUpdate(INSERT_SQL, hoaDonChiTiet.getMaSanPham(), hoaDonChiTiet.getTenSanPham(),hoaDonChiTiet.getMaHoaDon(), hoaDonChiTiet.getSoLuong(), hoaDonChiTiet.getDonGia());
    }

    public void update(HoaDonChiTiet hoaDonChiTiet) {
        JdbcHelper.executeUpdate(UPDATE_SQL, hoaDonChiTiet.getMaSanPham(), hoaDonChiTiet.getTenSanPham(),hoaDonChiTiet.getMaHoaDon(), hoaDonChiTiet.getSoLuong(), hoaDonChiTiet.getDonGia(), hoaDonChiTiet.getMaHoaDonChiTiet());
    }

    public void delete(int key) {
        JdbcHelper.executeUpdate(DELETE_SQL, key);
    }

    private List<HoaDonChiTiet> selectBySQL(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
                hoaDonChiTiet.setMaHoaDonChiTiet(rs.getInt("MaHoaDonChiTiet"));
                hoaDonChiTiet.setMaSanPham(rs.getInt("MaSanPham"));
                hoaDonChiTiet.setTenSanPham(rs.getString("TenSanPham"));
                hoaDonChiTiet.setMaHoaDon(rs.getInt("MaHoaDon"));
                hoaDonChiTiet.setSoLuong(rs.getInt("SoLuong"));
                hoaDonChiTiet.setDonGia(rs.getDouble("DonGia"));
                list.add(hoaDonChiTiet);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }

    public HoaDonChiTiet selectById(int key) {
        List<HoaDonChiTiet> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<HoaDonChiTiet> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }
    
    public List<HoaDonChiTiet> selectByMaHoaDon(int key){
        return this.selectBySQL(SELECT_BY_MAHOADON, key);
    }
    
    public List<HoaDonChiTiet> selectByTenSP_MaHoaDon(String keyword) {
        return this.selectBySQL(SELECT_BY_TENSANPHAM_MAHOADON, "%" + keyword + "%", keyword);
    }
}
