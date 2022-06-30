/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.utils;

import com.superidol.model.NhanVien;

/**
 *
 * @author Admin
 */
public class Authorize {

    public static NhanVien user = null;

    public static void clear() {
        Authorize.user = null;
    }

    public static boolean isLogin() {
        return Authorize.user != null;
    }

    public static boolean isManager() {
        return Authorize.isLogin() && Authorize.user.getVaiTro() == true;
    }
}
