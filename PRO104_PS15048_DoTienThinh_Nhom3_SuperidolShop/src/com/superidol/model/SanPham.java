/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.model;

/**
 *
 * @author Admin
 */
public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private double giaBanRa;
    private int soLuongConLai;
    private String nhaSanXuat;
    private String maNhaCungCap;
    private String loaiSanPham;
    private String hinh;
    private String ghiChu;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, double giaBanRa, int soLuongConLai, String nhaSanXuat, String maNhaCungCap, String loaiSanPham, String hinh, String ghiChu) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBanRa = giaBanRa;
        this.soLuongConLai = soLuongConLai;
        this.nhaSanXuat = nhaSanXuat;
        this.maNhaCungCap = maNhaCungCap;
        this.loaiSanPham = loaiSanPham;
        this.hinh = hinh;
        this.ghiChu = ghiChu;
    }

    
    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBanRa() {
        return giaBanRa;
    }

    public void setGiaBanRa(double giaBanRa) {
        this.giaBanRa = giaBanRa;
    }

    public int getSoLuongConLai() {
        return soLuongConLai;
    }

    public void setSoLuongConLai(int soLuongConLai) {
        this.soLuongConLai = soLuongConLai;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
