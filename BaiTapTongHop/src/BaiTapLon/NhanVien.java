package BaiTapLon;

import java.io.Serializable;
import java.util.Scanner;

public class NhanVien extends Nguoi implements Serializable{
    private float hsl;
    public static final float lcb = 500000;

    public NhanVien() {
        super();
    }

    public NhanVien(float hsl, String ma, String hoten, String gioitinh, String diachi) {
        super(ma, hoten, gioitinh, diachi);
        this.hsl = hsl;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }
    
    public float TinhLuong(){
        return hsl * lcb;
    }
     
    public void nhapnv(){
        super.nhapnguoi();
        System.out.println("Nhap he so luong: ");
        hsl = new Scanner(System.in).nextFloat();
    }
    
    public void hiennv(){
        super.hiennguoi();
        System.out.println("He so luong: " + hsl);
        System.out.println("Tien Luong: " + TinhLuong());
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString()+ "hsl=" + hsl + '}';
    }
    
    
}