package BTbuoi1;

import java.util.Scanner;

public class bai7 {
    protected float minutes;
    protected  float price;

    public bai7(){
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phút gọi: ");
        minutes = sc.nextFloat();
    }

    public void tinh(){
        if (minutes <= 50) {
            price = minutes * 600;
        } else if (minutes <= 200) {
            price = 50 * 600 + (minutes - 50) * 400;
        } else {
            price = 50 * 600 + 150 * 400 + (minutes - 200) * 200;
        }
    }

    public void xuat() {
        System.out.printf("Số phút gọi: %.0f phút\n", minutes);
        System.out.printf("Tổng cước phải trả: %.0f VNĐ\n", price);
    }

    public static void main(String[] args) {
        bai7 b7 = new bai7();
        b7.nhap();
        b7.tinh();
        b7.xuat();
    }
}
