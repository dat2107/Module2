package BTbuoi1;

import java.util.Scanner;

public class bai17 {
    int soDien;
    int tien;

    public bai17() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện");
        soDien = sc.nextInt();
    }

    public void tinhTien(){
        if (soDien <= 50) {
            tien = soDien * 1678;
        } else if (soDien <= 100) {
            tien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else if (soDien <= 300) {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        } else if (soDien <= 400) {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
        } else {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soDien - 400) * 2927;
        }
    }

    public void xuat() {
        System.out.println("Số điện tiêu thụ: " + soDien + " kWh");
        System.out.println("Tiền điện phải trả: " + tien + " VNĐ");
    }

    public static void main(String[] args) {
        bai17 td = new bai17();
        td.nhap();
        td.tinhTien();
        td.xuat();
    }
}
