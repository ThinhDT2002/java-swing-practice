/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.dao;

import com.superidol.utils.JdbcHelper;
import com.superidol.model.KhachHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class KhachHangDAO {
    
    private final String INSERT_SQL = "insert into KhachHang(TenKhachHang,NgaySinh,GioiTinh,SDT,Email,DiaChi,GhiChu) values (?,?,?,?,?,?,?)";
    private final String UPDATE_SQL = "update KhachHang set TenKhachHang=?, NgaySinh=?, GioiTinh=?, SDT=?, Email=?, DiaChi=?, GhiChu=? where MaKhachHang = ?";
    private final String DELETE_SQL = "delete from KhachHang where MaKhachHang=?";
    private final String SELECT_BY_ID_SQL = "select * from KhachHang where MaKhachHang=?";
    private final String SELECT_ALL_SQl = "select * from KhachHang";
    
    public void insert(KhachHang kh){
        JdbcHelper.executeUpdate(INSERT_SQL, 
                //kh.getMaKhachHang(),
                kh.getTenKhachHang(),
                kh.getNgaySinh(),
                kh.getGioiTinh(),
                kh.getSdt(),
                kh.getEmail(),
                kh.getDiaChi(),
                kh.getGhiChu());
    }
    
    public void update(KhachHang kh){
        JdbcHelper.executeUpdate(UPDATE_SQL,           
                kh.getTenKhachHang(),
                kh.getNgaySinh(),
                kh.getGioiTinh(),
                kh.getSdt(),
                kh.getEmail(),
                kh.getDiaChi(),
                kh.getGhiChu(),
                kh.getMaKhachHang());
    }
    
    public void delete(int key) { // xoá theo mã Khách Hàng
        JdbcHelper.executeUpdate(DELETE_SQL, key);
    }
    
    private List<KhachHang> selectBySQL (String sql,Object ...args){
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql,args);
            while(rs.next()){
                KhachHang entity = new KhachHang();
                    entity.setMaKhachHang(rs.getInt("MaKhachHang"));
                    entity.setTenKhachHang(rs.getString("TenKhachHang"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setGioiTinh(rs.getInt("GioiTinh"));
                    entity.setSdt(rs.getString("SDT"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }
    
    public KhachHang selectById(Integer key){
        List<KhachHang> list = this.selectBySQL(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    public List<KhachHang> selectByKeyWord(String Ten){
        String sql = "select * from KhachHang where TenKhachHang like ?";
        return selectBySQL(sql, "%"+Ten+"%");
    }
    
    public List<KhachHang> selectAll(){
        return this.selectBySQL(SELECT_ALL_SQl);
    }
}
