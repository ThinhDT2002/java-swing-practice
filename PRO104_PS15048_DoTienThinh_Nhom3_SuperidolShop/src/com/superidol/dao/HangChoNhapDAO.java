/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.dao;

import com.superidol.model.HangChoNhap;
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
public class HangChoNhapDAO {
    private final String INSERT_SQL = "INSERT INTO HangChoNhap(MaSanPham, TenSanPham, SoLuong, DonGia) VALUES (?, ?, ?, ?)";
    private final String DELETE_SQL = "DELETE FROM HangChoNhap WHERE MaLuotNhap=?";
    private final String SELECT_SQL = "SELECT * FROM HangChoNhap";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM HangChoNhap WHERE MaLuotNhap=?";
    public void insert(SanPham sanPham){
        JdbcHelper.executeUpdate(INSERT_SQL, sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getSoLuongConLai(), sanPham.getGiaBanRa());
    }
    public void delete(int key){
        JdbcHelper.executeUpdate(DELETE_SQL, key);
    }
    
    private List<HangChoNhap> selectBySQL(String sql,Object ...args) {
        List<HangChoNhap> list = new ArrayList<>();
        try{
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while(rs.next()) {
                HangChoNhap hangChoNhap = new HangChoNhap();
                hangChoNhap.setMaLuotNhap(rs.getInt("MaLuotNhap"));
                hangChoNhap.setMaSanPham(rs.getInt("MaSanPham"));
                hangChoNhap.setTenSanPham(rs.getString("TenSanPham"));
                hangChoNhap.setSoLuong(rs.getInt("SoLuong"));
                hangChoNhap.setDonGia(rs.getDouble("DonGia"));
                list.add(hangChoNhap);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch(SQLException ex) {
            throw new RuntimeException();
        }
    }
    
    public List<HangChoNhap> selectAll(){
        return this.selectBySQL(SELECT_SQL);
    }
    
    public HangChoNhap selectById(int key){
        List<HangChoNhap> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
