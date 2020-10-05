package BaiTapLon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;




public class Test {
    
    public static void Menu(){
        System.out.println("============QUAN LY BAN SACH TAI CUA HANG SACH=============");
        System.out.println("||                                                       ||");
        System.out.println("||            1. Nhap thong tin sach:                    ||");
        System.out.println("||            2. Ghi danh sach sach:                     ||");
        System.out.println("||            3. Hien danh sach sach:                    ||");
        System.out.println("||            4. Nhap thong tin khach hang:              ||");
        System.out.println("||            5. Ghi danh sach khach hang:               ||");
        System.out.println("||            6. Doc va Hien danh sach khach hang:       ||");
        System.out.println("||            7. Nhap thong tin nhan vien:               ||");
        System.out.println("||            8. Ghi danh sach nhan vien:                ||");
        System.out.println("||            9. Doc va Hien danh sach nhan vien:        ||");
        System.out.println("||            10. Nhap thong tin hoa don:                ||");
        System.out.println("||            11. Ghi danh sach hoa don:                 ||");
        System.out.println("||            12. Doc va Hien danh sach hoa don:         ||");
        System.out.println("||=======================================================||");
        System.out.println("||            13. Tim kiem theo Ten Sach:                ||");
        System.out.println("||            14. Sap xep theo Ten Sach:                 ||");
        System.out.println("||            15. Tim kiem theo Ten Khach Hang:          ||");
        System.out.println("||            16. Sap xep theo Ten Khach Hang:           ||");
        System.out.println("||            17. Tinh tong Luong nhan vien:             ||");
        System.out.println("||            18. Tim kiem theo Ten Nhan Vien:           ||");
        System.out.println("||            19. Sap xep theo Ten Nhan Vien:            ||");
        System.out.println("===========================================================");
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        dsSach dssach = new dsSach();
        dsKH dskh = new dsKH();
        dsNV dsnv = new dsNV();
        dsHoaDon dshd = new dsHoaDon();
        
        int chon;
        do{
            Menu();
            System.out.println("***** Nhap lua chon cua ban: *****");
            Scanner input = new Scanner(System.in);
            chon = input.nextInt();
            
            
            switch(chon){
                case 1: dssach.nhapds();
                    break;
                case 2: dssach.ghiSach();
                    break;
                case 3: dssach.hiends();
                    break;
                case 4: dskh.nhapds();
                    break;
                case 5: dskh.ghiKH();
                    break;
                case 6: dskh.hiends();
                    break;
                case 7: dsnv.nhapds();
                    break;
                case 8: dsnv.ghiNV();
                    break;
                case 9: dsnv.hiends();
                    break;
                case 10: dshd.nhapds();
                    break;
                case 11: dshd.ghiHoaDon();
                    break;
                case 12: dshd.hiends();
                    break;
                case 13: dssach.timkiemtheotensach();
                    break;
                case 14: dssach.sapxeptheotensach();
                    break;
                case 15: dskh.searchbyname();
                    break;
                case 16: dskh.sapxeptheotenkh();
                    break;
                case 17: dsnv.TongLuong();
                    break;
                case 18: dsnv.searchbyname();
                    break;
                case 19: dsnv.sapxeptheotennv();
                    break;
                case 20: System.exit(0);
                    break;
                default: 
                    break;
            }
            System.out.println("Ban co muon tiep tuc ko ??? - 0 de ket thuc!!!");
            chon = input.nextInt();
        }while(chon != 0);
    }
}
