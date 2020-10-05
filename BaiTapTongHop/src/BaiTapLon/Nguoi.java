package BaiTapLon;

import java.io.Serializable;
import java.util.Scanner;

public class Nguoi implements Serializable{
    
    private String ma;
    private String hoten;
    private String gioitinh;
    private String diachi;
    
    public Nguoi(){
    }

    public Nguoi(String ma, String hoten, String gioitinh, String diachi) {
        this.ma = ma;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public void nhapnguoi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        ma = input.nextLine();
        System.out.println("Nhap ho ten: ");
        hoten = input.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioitinh = input.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = input.nextLine();
    }

    public void hiennguoi(){
        System.out.println("Ma: " + ma);
        System.out.println("Ho ten: "+ hoten);
        System.out.println("Gioi Tinh: " + gioitinh);
        System.out.println("Dia chi: " + diachi);
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ma=" + ma 
                + ", hoten=" + hoten + ", gioitinh=" + gioitinh + ", diachi=" + diachi + '}';
    }
}