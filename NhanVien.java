import java.util.Scanner;

public class NhanVien {
    private String hoten;
    private int namsinh;
    private int heso;
    private int thamnien;

    public NhanVien() {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.heso = heso;
        this.thamnien = thamnien;
    }

    public NhanVien(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.heso = heso;
        this.thamnien = thamnien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Nhập vào họ và tên nhân viên ");
        this.hoten = sc.nextLine();
        System.out.println("Nhập vào năm sinh của nhân viên");
        this.namsinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào hệ số lượng của nhân viên");
        this.heso= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào thâm niên công tác của nhân viên ");
        this.thamnien = Integer.parseInt(sc.nextLine());
    }
    public int luong(){
        return heso*150000+ thamnien*30000;
    }
    public void inThongTin(){
        System.out.println("===============================================");
        System.out.println("|Họ Tên :   "+ this.hoten);
        System.out.println("|Năm sinh : "+this.namsinh);
        System.out.println("|Lương :    "+this.heso);
    }
}
