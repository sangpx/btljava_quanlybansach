package BaiTapLon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class dsSach{
    
    ArrayList<Sach> listSach;
    public static final String fname = "Sach.DAT";
    
    public dsSach(){
        listSach = new ArrayList<>();
    }
    
    public void nhapds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong sach: ");
        int p = input.nextInt();
        System.out.println("\t Thong tin Sach: ");
        for (int i = 0; i < p; i++) {
            Sach sach = new Sach();
            System.out.println("Nhap sach thu: " + (i+1));
            sach.nhapsach();
            listSach.add(sach);
        }
    }
    
    public void ghiSach() throws IOException{
        File dg = new File();
        dg.ghiFile(listSach, fname);
        System.out.println("\tGhi Thanh Cong File !!!");
    }
    
    public ArrayList<Sach> docSach() throws IOException, FileNotFoundException, ClassNotFoundException{
        File dg = new File();
        return dg.docFile(fname);
    }
    
    public void hiends() throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<Sach> ds =docSach();
        if(ds.size() > 0){
            for (Sach d : ds) {
                d.hiensach();
            }
        }
    }
    
    public void timkiemdongiatren200() throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<Sach> ds = docSach();
        System.out.println("\t Danh sach sach co don gia tren 200: ");
        for (Sach d : ds) {
            if(d.getDongia() > 200){
                d.hiensach();
            }
        }
    }
    
    public void timkiemtheotensach() throws IOException, FileNotFoundException, ClassNotFoundException{
        String sachX;
        System.out.println("Nhap ten sach bat ki: ");
        sachX = new Scanner(System.in).nextLine();
        System.out.println("\t Danh sach Sach: ");
        ArrayList<Sach> ds = docSach();
        for (Sach d : ds) {
            if(d.getTensach().equalsIgnoreCase(sachX)){
                d.hiensach();
            }
        }
    }
    
    public void sapxeptheotensach() throws IOException, FileNotFoundException, ClassNotFoundException{
        Collections.sort(listSach, new Comparator<Sach> () {
            @Override
            public int compare(Sach s1, Sach s2) {
                return s1.getTensach().compareTo(s2.getTensach());
            }
        });
        System.out.println("\t Danh sach sau khi sap xep: ");
        ArrayList<Sach> ds = docSach();
        for (Sach d : ds) {
            d.hiensach();
        }
    }
    
    public Sach searchbymasach(String mS) throws IOException, FileNotFoundException, ClassNotFoundException{
        System.out.println("Nhap ma bat ki: ");
        mS = new Scanner(System.in).nextLine();
        ArrayList<Sach> ds = docSach();
        for (Sach d : ds) {
            if(d.getMasach().equalsIgnoreCase(mS)){
                d.hiensach();
                return d;
            }
        }
        return null;
    }
}