/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.dao;

import com.superidol.model.NhanVien;
import com.superidol.model.SanPham;
import com.superidol.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDAO {

    private final String INSERT_SQL = "INSERT INTO NhanVien VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String UPDATE_SQL = "UPDATE NhanVien set TenNhanVien=?, NgaySinh=?, GioiTinh=?, SDT=?, DiaChi=?, VaiTro=?, MatKhau=?, Email=?, Hinh=?, GhiChu=? Where MaNhanVien=?";
    private final String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNhanVien=?";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNhanVien=?";
    private final String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    private final String SELECT_BY_ID_OR_TENSP = "select * from NhanVIen where MaNhanVien like ? or TenNhanVien like ?";
    public void insert(NhanVien nhanVien) {
        JdbcHelper.executeUpdate(INSERT_SQL, 
                nhanVien.getMaNhanVien(), nhanVien.getTenNhanVien(), nhanVien.getNgaySinh(), 
                nhanVien.getGioiTinh(), nhanVien.getSdt(), nhanVien.getDiaChi(), nhanVien.getVaiTro(), 
                nhanVien.getMatKhau(), nhanVien.getEmail(), nhanVien.getHinh(), nhanVien.getGhiChu());
    }
    
    public void update(NhanVien nhanVien) {
        JdbcHelper.executeUpdate(UPDATE_SQL, nhanVien.getTenNhanVien(),nhanVien.getNgaySinh(),nhanVien.getGioiTinh(), nhanVien.getSdt(), nhanVien.getDiaChi(), nhanVien.getVaiTro(), 
                nhanVien.getMatKhau(), nhanVien.getEmail(), nhanVien.getHinh(), nhanVien.getGhiChu(),nhanVien.getMaNhanVien());
        
    }
    
    public void delete(String key) {
        JdbcHelper.executeUpdate(DELETE_SQL, key);
    }
    
    private List<NhanVien> selectBySQL(String sql,Object ...args) {
        List<NhanVien> list = new ArrayList<>();
        try{
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while(rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNhanVien(rs.getString("MaNhanVien"));
                nhanVien.setTenNhanVien(rs.getString("TenNhanVien"));
                nhanVien.setNgaySinh(rs.getDate("NgaySinh"));
                nhanVien.setGioiTinh(rs.getBoolean("GioiTinh"));
                nhanVien.setSdt(rs.getString("SDT"));
                nhanVien.setDiaChi(rs.getString("DiaChi"));
                nhanVien.setVaiTro(rs.getBoolean("VaiTro"));
                nhanVien.setMatKhau(rs.getString("MatKhau"));
                nhanVien.setEmail(rs.getString("Email"));
                nhanVien.setHinh(rs.getString("Hinh"));
                nhanVien.setGhiChu(rs.getString("GhiChu"));
                list.add(nhanVien);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
    
    public NhanVien selectById(String key) {
        List<NhanVien> list = this.selectBySQL(SELECT_BY_ID_SQL,key);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
      
     public List<NhanVien> selectById_TenNv(String keyword){
        List<NhanVien> list = this.selectBySQL(SELECT_BY_ID_OR_TENSP, keyword, "%" + keyword + "%");
        return list;
    }
    public List<NhanVien> selectAll(){
        return this.selectBySQL(SELECT_ALL_SQL);
    }
}
