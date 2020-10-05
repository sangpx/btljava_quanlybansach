/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DanhSach {
    ArrayList<Person> listPer;
    
    public DanhSach(){
        listPer = new ArrayList<>();
    }
    
    public void nhapds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Doi tuong can them: ");
        System.out.println("1. Khach Hang");
        System.out.println("2. Nhan Vien: ");
        System.out.println("Nhap de lua chon: ");
        int chon = input.nextInt();
        switch(chon){
            
            case 2: 
                System.out.println("Nhap so luong nhan vien: ");
                int n = new Scanner(System.in).nextInt();
                for (int i = 0; i < n; i++) {
                    NhanVien nv = new NhanVien();
                    nv.nhap();
                    listPer.add(nv);
                }
               break;
            case 1: 
                System.out.println("Nhap so luong khach hang: ");
                int k = new Scanner(System.in).nextInt();
                for (int i = 0; i < k; i++) {
                    KhachHang kh = new KhachHang() {
                        @Override
                        double TienLuong() {
                            return 0;
                        }
                    };
                    kh.nhap();
                    listPer.add(kh);
                }
               break;
        }
    }
    
    public void hiends(){
        for (Person person : listPer) {
            person.hien();
        }
    }
}
