package BaiTapLon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class dsKH{
    
    ArrayList<KhachHang> listKH;
    public static final String fname = "KhachHang.DAT";

    public dsKH() {
        listKH = new ArrayList<>();
    }

    public void nhapds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong khach hang: ");
        int n = input.nextInt();
        System.out.println("\t Thong tin khach hang: ");
        for (int i = 0; i < n; i++) {
            KhachHang kh = new KhachHang();
            System.out.println("Nhap Khach Hang thu: " + (i+1));
            kh.nhapkh();
            listKH.add(kh);
        }
    }
    
    public void ghiKH() throws IOException{
        File dg = new File();
        dg.ghiFile(listKH, fname);
        System.out.println("\tGhi Thanh Cong File !!!");
    }
    
    public ArrayList<KhachHang> docKH() throws IOException, FileNotFoundException, ClassNotFoundException{
        File dg = new File();
        return dg.docFile(fname);
    }
    
    public void hiends() throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<KhachHang> ds = docKH();
        for (KhachHang d : ds) {
            if(ds.size() > 0){
                d.hienkh();
            }
        }
    }
    
    public KhachHang searchbyMa(String makh) throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<KhachHang> ds = docKH();
        for (KhachHang d : ds) {
            if(d.getMa().equalsIgnoreCase(makh)){
                return d;
            }
        }
        return null;
    }
    
    public void searchbyname() throws IOException, FileNotFoundException, ClassNotFoundException{
        String khX;
        System.out.println("Nhap ten khach hang bat ki: ");
        khX = new Scanner(System.in).nextLine();
        System.out.println("\t Danh sach khach hang: ");
        ArrayList<KhachHang> ds = docKH();
        for (KhachHang d : ds) {
            if(d.getHoten().equalsIgnoreCase(khX)){
                d.hienkh();
            }
        }
    }
    
   public void sapxeptheotenkh() throws IOException, FileNotFoundException, ClassNotFoundException{
       Collections.sort(listKH, new Comparator<KhachHang>(){
           @Override
           public int compare (KhachHang kh1, KhachHang kh2){
               return kh1.getHoten().compareToIgnoreCase(kh2.getHoten());
           }
       });
       System.out.println("\tDanh sach sau khi sap xep: ");
       ArrayList<KhachHang> ds = docKH();
       for (KhachHang d : ds) {
           System.out.println("" + d.toString());
       }
   }
}