package BaiTapLon;

import java.io.Serializable;
import java.util.Scanner;


public class KhachHang extends Nguoi implements Serializable{

    
    private String sdt;
            
            
    public KhachHang() {
        super();
    }

    public KhachHang(String sdt, String ma, String hoten, String gioitinh, String diachi) {
        super(ma, hoten, gioitinh, diachi);
        this.sdt = sdt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public void nhapkh(){
        super.nhapnguoi();
        System.out.println("Nhap so dien thoai: ");
        sdt = new Scanner(System.in).nextLine();
    }
    
    public void hienkh(){
        super.hiennguoi();
        System.out.println("So dien thoai: " + sdt);
    }

    @Override
    public String toString() {
        return "KhachHang{" + super.toString() + "sdt=" + sdt + '}';
    }
    
    
}