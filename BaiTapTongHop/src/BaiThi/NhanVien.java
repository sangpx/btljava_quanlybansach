/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThi;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NhanVien extends KhachHang implements Person{

    private float hsl;
    public static final float lcb = 500000;
    
    public NhanVien(){
        super();
    }

    public NhanVien(float hsl, String hoten, int sdt) {
        super(hoten, sdt);
        this.hsl = hsl;
    }
    @Override
    public void nhap() {
       Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = input.nextLine();
        System.out.println("Nhap so dien thoai: ");
        sdt = input.nextInt();
        System.out.println("Nhap he so luong: ");
        hsl = input.nextFloat();
    }

    @Override
    public void hien() {
        System.out.println("Ho ten: " + hoten);
        System.out.println("So dien thoai: " + sdt);
        System.out.println("He so luong: " + hsl);
        System.out.println("Tien luong: "+ TienLuong());
    }

    @Override
    double TienLuong() {
        double luong = hsl * lcb;
        return luong;
  }
}

