package com.example.project;
import android.content.SharedPreferences;
import android.content.Context;
public class ManagerPoint {
    public static int getDiemSo(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MyPoint", Context.MODE_PRIVATE);
        return sharedPreferences.getInt("diemSo", 0);
    }

    public static void capNhatDiemSo(Context context, int diemSoCuaLanChoi) {
        int diemSoHienTai = getDiemSo(context);
        diemSoHienTai += diemSoCuaLanChoi;
        SharedPreferences.Editor editor = context.getSharedPreferences("MyPoint", Context.MODE_PRIVATE).edit();
        editor.putInt("diemSo", diemSoHienTai);
        editor.apply();
    }
}
