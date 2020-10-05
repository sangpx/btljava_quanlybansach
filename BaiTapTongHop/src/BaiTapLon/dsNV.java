package BaiTapLon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class dsNV{
    
    ArrayList<NhanVien> listNV;
    public static final String fname = "NhanVien.DAT";
    
    public dsNV(){
        listNV = new ArrayList<>();
    }
    
    public void nhapds(){
        System.out.println("Nhap so luong nhan vien: ");
        int k = new Scanner(System.in).nextInt();
        System.out.println("\t Thong tin nhan vien: ");
        for (int i = 0; i < k; i++) {
            NhanVien nv = new NhanVien();
            System.out.println("Nhap Nhan Vien thu: " + (i+1));
            nv.nhapnv();
            listNV.add(nv);
        }
    }
    
    public void ghiNV() throws IOException{
        File dg = new File();
        dg.ghiFile(listNV, fname);
        System.out.println("\tGhi Thanh Cong File !!!");
    }
    
    public ArrayList<NhanVien> docNV() throws IOException, FileNotFoundException, ClassNotFoundException{
        File dg = new File();
        return dg.docFile(fname);
    }
    
    public void hiends() throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<NhanVien> ds = docNV();
        for (NhanVien d : ds) {
            if(ds.size() > 0){
                d.hiennv();
            }
        }
    }
    
    
    
    public void TongLuong() throws IOException, FileNotFoundException, ClassNotFoundException{
        double sum = 0;
        ArrayList<NhanVien> ds = docNV();
        for (NhanVien d : ds) {
            sum = sum + d.TinhLuong();
        }
        System.out.println("Tong tien luong cua Nhan Vien la: " + sum);
    }
    
    public NhanVien searchbyID(String manv) throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<NhanVien> ds = docNV();
        for (NhanVien d : ds) {
            if(d.getMa().equalsIgnoreCase(manv)){
                return d;
            }
        }
        return null;
    }
    
    public void searchbyname() throws IOException, FileNotFoundException, ClassNotFoundException{
        String nvX;
        System.out.println("Nhap ten nhan vien bat ki: ");
        nvX = new Scanner(System.in).nextLine();
        System.out.println("\t Danh sach nhan vien: ");
        ArrayList<NhanVien> ds = docNV();
        for (NhanVien d : ds) {
            if(d.getHoten().equalsIgnoreCase(nvX)){
                d.hiennv();
            }
        }
    }
    
    public void luongtren700000() throws IOException, FileNotFoundException, ClassNotFoundException{
        System.out.println("Danh sach nhan vien luong tren 700000: ");
        ArrayList<NhanVien> ds = docNV();
        for (NhanVien d : ds) {
            if(d.TinhLuong() > 700000){
                d.hiennguoi();
            }
        }
    }
    
    public void sapxeptheotennv() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        Collections.sort(listNV, new Comparator<NhanVien> () {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getHoten().compareToIgnoreCase(nv2.getHoten());
            }
        });
        ArrayList<NhanVien> ds = docNV();
        for (NhanVien d : ds) {
            d.hiennv();
        }
    }
 }
    
