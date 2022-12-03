import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choose=0;
        do{
            Menu();
            System.out.println("|Chọn : ");
            choose= input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhập số nhan vien cần thêm:");
                    int n = input.nextInt();
                    for(int i=0;i<n;i++) {
                        nhanVien.nhapthongtin();
                        listNhanVien.add(nhanVien);
                       // listNhanVien.add(new NhanVien("Tran Thi Cam Hoa",2004));
                    }
                    break;
                case 2:
//                    nhanVien.inThongTin();
                    for(int i=0;i<listNhanVien.size();i++) {
                        listNhanVien.get(i).inThongTin();
                    }
                    break;
                case 3:
                    for (int i = 0; i < listNhanVien.size(); i++){
                        if (listNhanVien.get(i).getThamnien() >= 20 || listNhanVien.get(i).getHeso() > 8)
                        {
                            listNhanVien.get(i).inThongTin();
                        }
                    }
                    break;
                case 4:
                    double max =0;
                    for (int i=0; i<listNhanVien.size(); i++) {
                        if (listNhanVien.get(i).luong()>max)
                            max = listNhanVien.get(i).luong();
                    }

                    for (int i=0; i<listNhanVien.size(); i++) {
                        if (max == listNhanVien.get(i).luong())
                            listNhanVien.get(i).inThongTin();
                    }
                    break;
                case 5:
                    System.out.println("GOODBYE");
                    break;
                default:
                    System.err.println("Nhập sai");
                    break;
            }
        }while(choose !=5);
    }

    static void Menu() {
        System.out.println("==============================================");
        System.out.println("|1.Gán thông tin cho 3 người                 |");
        System.out.println("|2.In ra thông tin 3 nhân viên               |");
        System.out.println("|3.Kiểm tra và xuất ra thông tin về việc 3   |"  +"\n"+
                           "|nhân viên này có vượt khung lương hay không |");
        System.out.println("|4.In ra thông tin của nhân viên có lương cao|"+"\n"+
                           "|trong 3 nhân viên trên                      |");
        System.out.println("|5.Thoát chương trình                        |");
        System.out.println("==============================================");
    }
}