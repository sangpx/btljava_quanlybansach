package BaiTapLon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class HoaDon implements Serializable{
    
    ArrayList<Sach> hd;
    KhachHang khachhang;
    int sl;
    
    public HoaDon(){
        hd = new ArrayList<>();
        khachhang = new KhachHang();
    }
    
    public void nhaphoadon() throws IOException, FileNotFoundException, ClassNotFoundException{
        System.out.println("\t Thong tin Hoa Don: ");
        System.out.println("Nhap ma khachhang: ");
        String makh = new Scanner(System.in).nextLine();
        
        dsKH dskh = new dsKH();
        dsSach dss = new dsSach();
        
        khachhang = dskh.searchbyMa(makh);
        
        if(khachhang == null){
            System.out.println("Ko ton tai !!!");
        } else {
            String maSach;
            do{
                System.out.println("Nhap ma sach: ");
                maSach = new Scanner(System.in).nextLine();
                Sach sach = dss.searchbymasach(maSach);
                if(sach != null){
                    hd.add(sach);
                } else {
                    System.out.println("Doi tuong ko co trong CSDL !!!");
                }
            }while( ! maSach.equalsIgnoreCase("*"));
        }
        
    }
    
    public void Tong(){
        int tong = 0;
        for (Sach s : hd) {
            tong += s.getDongia();
        }
    }
    
    public void hienhoadon(){
        System.out.println(khachhang.toString());
        System.out.println("Danh sach Hoa Don: ");
        for (Sach sach : hd) {
            System.out.println("" + sach.toString());
        }
    }
    
}