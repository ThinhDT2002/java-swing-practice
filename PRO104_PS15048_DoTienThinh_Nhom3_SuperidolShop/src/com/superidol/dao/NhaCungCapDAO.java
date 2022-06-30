/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.dao;

import com.superidol.model.NhaCungCap;
import com.superidol.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaCungCapDAO {

    private final String INSERT_SQL = "INSERT INTO NhaCungCap (MaNhaCungCap,TenNhaCungCap,DiaChi,SDT,Email,GhiChu) VALUES (?, ?, ?, ?, ?, ?)";
    private final String UPDATE_SQL = "UPDATE NhaCungCap set TenNhaCungCap = ?, DiaChi = ?, SDT = ?, Email = ?, GhiChu = ? where MaNhaCungCap = ?";
    private final String DELETE_SQL = "DELETE FROM NhaCungCap WHERE MaNhaCungCap=?";
    private final String SELECT_BY_ID_SQL = "SELECT * FROM NhaCungCap WHERE MaNhaCungCap=?";
    private final String SELECT_ALL_SQL = "SELECT * FROM NhaCungCap";

    public void insert(NhaCungCap nhaCungCap) {
        JdbcHelper.executeUpdate(INSERT_SQL, 
                nhaCungCap.getMaNhaCungCap(),
                nhaCungCap.getTenNhaCungCap(),
                nhaCungCap.getDiaChi(),
                nhaCungCap.getSdt(),
                nhaCungCap.getEmail(),
                nhaCungCap.getGhiChu());
    }
    
    public void update(NhaCungCap nhaCungCap) {
        JdbcHelper.executeUpdate(UPDATE_SQL,                                 
                nhaCungCap.getTenNhaCungCap(),
                nhaCungCap.getDiaChi(),
                nhaCungCap.getSdt(),
                nhaCungCap.getEmail(),
                nhaCungCap.getGhiChu(),
                nhaCungCap.getMaNhaCungCap());
    }
    

    
    public void delete(String key) {
        JdbcHelper.executeUpdate(DELETE_SQL, key);
    }
    
    private List<NhaCungCap> selectBySQL(String sql,Object ...args) {
        List<NhaCungCap> list = new ArrayList<>();
        try{
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while(rs.next()) {
                NhaCungCap entity = new NhaCungCap();
                    entity.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                    entity.setTenNhaCungCap(rs.getString("TenNhaCungCap"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setSdt(rs.getString("SDT"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }
    
    public NhaCungCap selectById(String key) {
        List<NhaCungCap> list = this.selectBySQL(SELECT_BY_ID_SQL,key);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<NhaCungCap> selectByKeyword(String Ten){
        String sql = "SELECT * FROM NhaCungCap WHERE TenNhaCungCap LIKE ? or MaNhaCungCap like ?";
        return selectBySQL(sql, "%"+Ten+"%","%"+Ten+"%");
    }
    
    public List<NhaCungCap> selectAll(){
        return this.selectBySQL(SELECT_ALL_SQL);
    }
}
