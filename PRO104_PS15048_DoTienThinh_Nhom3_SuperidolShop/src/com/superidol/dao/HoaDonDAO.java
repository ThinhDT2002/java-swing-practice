/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.dao;

import com.superidol.model.HoaDon;
import com.superidol.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonDAO {
    private final String INSERT_SQL = "INSERT INTO HoaDon (NgayMuaHang, TrangThai, MaNhanVien, MaKhachHang, GhiChu) VALUES (?, ?, ?, ?, ?)";
    private final String UPDATE_SQL = "UPDATE HoaDon SET NgayMuaHang=?, TrangThai=?,MaNhanVien=?,MaKhachHang=?,GhiChu=? WHERE MaHoaDon=?";
    private final String DELETE_SQL = "DELETE FROM HoaDon WHERE MaHoaDon=?";
    private final String SELECT_ALL_SQL = "SELECT * FROM HoaDon";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM HoaDon WHERE MaHoaDon=?";
    private final String SELECT_BY_MAKH_OR_MANV = "SELECT * From HoaDON WHERE MaKhachHang LIKE ? OR MaNhanVien LIKE ?";
    private final String SELECT_TOP_1_SQL = "SELECT TOP 1 * FROM HoaDon ORDER BY MaHoaDon DESC";
    
    public void insert(HoaDon hoaDon){
        JdbcHelper.executeUpdate(INSERT_SQL, 
                hoaDon.getNgayMuaHang(),hoaDon.getTrangThai(),hoaDon.getMaNhanVien(),hoaDon.getMaKhachHang(),hoaDon.getGhiChu());
    }
    
    public void update(HoaDon hoaDon){
        JdbcHelper.executeUpdate(UPDATE_SQL, 
                hoaDon.getNgayMuaHang(),hoaDon.getTrangThai(),hoaDon.getMaNhanVien(),hoaDon.getMaKhachHang(),hoaDon.getGhiChu(),hoaDon.getMaHoaDon());
    }
    
    public void delete(int key){
        JdbcHelper.executeUpdate(DELETE_SQL, key);
    }
    
    private List<HoaDon> selectBySQL(String sql,Object ...args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while(rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHoaDon(rs.getInt("MaHoaDon"));
                hoaDon.setNgayMuaHang(rs.getDate("NgayMuaHang"));
                hoaDon.setMaNhanVien(rs.getString("MaNhanVien"));
                hoaDon.setMaKhachHang(rs.getInt("MaKhachHang"));
                hoaDon.setTrangThai(rs.getString("TrangThai"));
                hoaDon.setGhiChu(rs.getString("GhiChu"));
                list.add(hoaDon);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
    
    public HoaDon selectById(int key) {
        List<HoaDon> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<HoaDon> selectAll(){
        return this.selectBySQL(SELECT_ALL_SQL);
    }
    
    public List<HoaDon> selectByKHorNV(String keyword){
        List<HoaDon> list = this.selectBySQL(SELECT_BY_MAKH_OR_MANV,keyword,"%" + keyword + "%");
        return list;
    }
    
    public HoaDon selectTop1(){
        List<HoaDon> list = this.selectBySQL(SELECT_TOP_1_SQL);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
