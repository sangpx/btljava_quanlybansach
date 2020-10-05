package BaiTapLon;

import java.io.Serializable;
import java.util.Scanner;

public class Sach implements Serializable{
    
    private String masach;
    private String tensach;
    private String loaisach;
    private float dongia;
    private int soluong;

    public Sach() {
    }

    public Sach(String masach, String tensach, String loaisach, float dongia, int soluong) {
        this.masach = masach;
        this.tensach = tensach;
        this.loaisach = loaisach;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    
    

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getLoaisach() {
        return loaisach;
    }

    public void setLoaisach(String loaisach) {
        this.loaisach = loaisach;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public void nhapsach(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        masach = input.nextLine();
        System.out.println("Nhap ten sach: ");
        tensach = input.nextLine();
        System.out.println("Nhap loai sach: ");
        loaisach = input.nextLine();
        System.out.println("Nhap don gia: ");
        dongia = input.nextFloat();
        System.out.println("Nhap so luong: ");
        soluong = input.nextInt();
    }
    
    public void hiensach(){
        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("Loai sach: "+ loaisach);
        System.out.println("Don gia: "+ dongia);
        System.out.println("So luong: " + soluong);
    }

    @Override
    public String toString() {
        return "Sach{" + "masach=" + masach + ", tensach=" 
             + tensach + ", loaisach=" + loaisach + ", dongia=" + dongia + ", soluong=" + soluong + '}';
    }
    
    
}