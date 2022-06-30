/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.dao;

import com.superidol.model.SanPham;
import com.superidol.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO {

    private final String INSERT_SQL = "insert into SanPham(TenSanPham,GiaBanRA,SoLuongConLai,NhaSanXuat,MaNhaCungCap,LoaiSanPham,HinhAnh,GhiChu) Values(?,?,?,?,?,?,?,?)";
    private final String UPDATE_SQL = "update SanPham set TenSanPham=?, GiaBanRA=?, SoLuongConLai=?, NhaSanXuat=?, MaNhaCungCap=?,"
            + " LoaiSanPham=?, HinhAnh=?, GhiChu=? where MaSanPham=?";
    private final String DELETE_SQL = "delete from SanPham where MaSanPham=?";
    private final String SELECT_ALL_SQL = "select * from SanPham";
    private final String SELECT_BY_KEY = "select * from SanPham where TenSanPham like ?";
    private final String SELECT_BY_KEYID = "select * from SanPham where MaSanPham like ?";
    private final String FIND_BY_ID = "select * from SanPham where MaSanPham=?";
    private final String SELECT_BY_ID_OR_TENSP = "select * from SanPham where MaSanPham like ? or TenSanPham like ?";

    public void insert(SanPham model) {
        JdbcHelper.executeUpdate(INSERT_SQL,
                model.getTenSanPham(), model.getGiaBanRa(), model.getSoLuongConLai(),
                model.getNhaSanXuat(), model.getMaNhaCungCap(), model.getLoaiSanPham(),
                model.getHinh(), model.getGhiChu());
    }

    public void update(SanPham model) {
        JdbcHelper.executeUpdate(UPDATE_SQL,
                model.getTenSanPham(), model.getGiaBanRa(), model.getSoLuongConLai(), model.getNhaSanXuat(), model.getMaNhaCungCap(),
                model.getLoaiSanPham(), model.getHinh(), model.getGhiChu(),
                model.getMaSanPham());
    }

    public void delete(Integer MaSP) {
        JdbcHelper.executeUpdate(DELETE_SQL, MaSP);
    }

    public List<SanPham> select() {
        return select(SELECT_ALL_SQL);
    }

    public List<SanPham> selectByKeyword(String keyword) {
        return select(SELECT_BY_KEY, "%" + keyword + "%");
    }

    public List<SanPham> selectById(String keyword) {
        return select(SELECT_BY_KEYID, "%" + keyword + "%");
    }

    public SanPham findById(Integer masp) {
        List<SanPham> list = select(FIND_BY_ID, masp);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<SanPham> select(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    SanPham model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return list;
    }

    private SanPham readFromResultSet(ResultSet rs) throws SQLException {
        SanPham model = new SanPham();
        model.setMaSanPham(rs.getInt("MaSanPham"));
        model.setTenSanPham(rs.getString("TenSanPham"));
        model.setGiaBanRa(Math.round(rs.getDouble("GiaBanRA") * 10.0) / 10.0);
        model.setSoLuongConLai(rs.getInt("SoLuongConLai"));
        model.setNhaSanXuat(rs.getString("NhaSanXuat"));
        model.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
        model.setLoaiSanPham(rs.getString("LoaiSanPham"));
        model.setHinh(rs.getString("HinhAnh"));
        model.setGhiChu(rs.getString("GhiChu"));
        return model;
    }
    
    public List<SanPham> selectById_TenSp(String keyword){
        List<SanPham> list = this.select(SELECT_BY_ID_OR_TENSP, keyword, "%" + keyword + "%");
        return list;
    }

}
