package BaiTapLon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class dsHoaDon{
    ArrayList<HoaDon> listHD;
    public static final String fname = "HoaDon.DAT";
    
    public dsHoaDon(){
        listHD = new ArrayList<>();
    }
    
    public void nhapds() throws IOException, FileNotFoundException, ClassNotFoundException{
        System.out.println("Nhap so luong hoa don: ");
        int q = new Scanner(System.in).nextInt();
        System.out.println("\tThong tin Hoa Don: ");
        for (int i = 0; i < q; i++) {
            HoaDon hd = new HoaDon();
            System.out.println("Nhap hoa don thu: " + (i+1));
            hd.nhaphoadon();
            listHD.add(hd);
        }
    }
    
    public void ghiHoaDon() throws IOException{
        File dg = new File();
        dg.ghiFile(listHD, fname);
        System.out.println("\tGhi Thanh Cong File !!!");
    }
    
    public ArrayList<HoaDon> docHoaDon() throws IOException, FileNotFoundException, ClassNotFoundException{
        File dg = new File();
        return dg.docFile(fname);
    }
    
    public void hiends() throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<HoaDon> ds = docHoaDon();
        if(ds.size() > 0){
            for (HoaDon d : ds) {
                d.hienhoadon();
            }
        }
    }
}