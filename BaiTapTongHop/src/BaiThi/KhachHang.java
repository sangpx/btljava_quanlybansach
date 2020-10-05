package BaiThi;

import java.util.Scanner;


abstract class KhachHang implements Person{
    String hoten;
    int sdt;
    
    public KhachHang(){
    }

    public KhachHang(String hoten, int sdt) {
        this.hoten = hoten;
        this.sdt = sdt;
    }
    
    public void nhap(){
        System.out.println("Nhap ho ten: ");
        hoten = new Scanner(System.in).nextLine();
        System.out.println("Nhap so dien thoai: ");
        sdt = new Scanner(System.in).nextInt();
    }
    
    public void hien(){
        System.out.println("Ho ten: " + hoten);
        System.out.println("So dien thoai: " + sdt);
    }
    
    abstract double TienLuong();
}
