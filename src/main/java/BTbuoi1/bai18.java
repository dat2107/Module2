package BTbuoi1;

import java.util.Scanner;

public class bai18 {
    int thuNhap;
    double thue;

    public bai18() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thu nhập");
        thuNhap = sc.nextInt();
    }

    public void tinhthue(){
        if (thuNhap <= 5) {
            thue = thuNhap * 0.05;
        } else if (thuNhap <= 10) {
            thue =  5 * 0.05 + (thuNhap - 5) * 0.10;
        } else if (thuNhap <= 18) {
            thue =  5 * 0.05 + 5 * 0.10 + (thuNhap - 10) * 0.15;
        } else if (thuNhap <= 32) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (thuNhap - 18) * 0.20;
        } else if (thuNhap <= 52) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (thuNhap - 32) * 0.25;
        } else if (thuNhap <= 80) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + (thuNhap - 52) * 0.30;
        } else {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30 + (thuNhap - 80) * 0.35;
        }
    }

    public void xuat(){
        System.out.println("Thu nhập chịu thuế: " + thuNhap + " VNĐ");
        System.out.println("Thuế TNCN phải nộp: " + thue + " VNĐ");
    }

    public static void main(String[] args) {
        bai18 b18 = new bai18();
        b18.nhap();
        b18.tinhthue();
        b18.xuat();
    }
}
