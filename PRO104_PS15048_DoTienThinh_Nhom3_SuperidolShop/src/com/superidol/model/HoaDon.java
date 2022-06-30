/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private int maHoaDon;
    private Date ngayMuaHang;
    private String trangThai;
    private String maNhanVien;
    private int maKhachHang;
    private String ghiChu;

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, Date ngayMuaHang, String trangThai, String maNhanVien, int maKhachHang, String ghiChu) {
        this.maHoaDon = maHoaDon;
        this.ngayMuaHang = ngayMuaHang;
        this.trangThai = trangThai;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.ghiChu = ghiChu;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(Date ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
