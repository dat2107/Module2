package BTbuoi1;

import java.util.Scanner;

public class bai2 {
    protected int tuoi;

    public bai2() {
    }

    public bai2(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 tuổi: ");
        tuoi = sc.nextInt();
    }

    public void kiemtra(){
        if(tuoi >= 15){
            System.out.println("Đủ điều kiện");
        } else {
            System.out.println("Không đủ");
        }
    }

    public static void main(String[] args) {
        bai2 b2 = new bai2();
        b2.nhap();
        b2.kiemtra();
    }
}
