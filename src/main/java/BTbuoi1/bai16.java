package BTbuoi1;

import java.util.Scanner;

public class bai16 {
    int a,b,c;

    public bai16() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a: ");
        a = sc.nextInt();
        System.out.print("nhập b: ");
        b = sc.nextInt();
        System.out.print("nhập c: ");
        c = sc.nextInt();
    }

    public void kiemtra(){
        if(a>0&&b>0&&c>0){
            if(a + b > c || b + c > a || a + c > b){
                System.out.println("Là tam giác");
            } else {
                System.out.println("KP tam giác");
            }
        } else {
            System.out.println("KP tam giác");
        }
    }

    public static void main(String[] args) {
        bai16 b16 = new bai16();
        b16.nhap();
        b16.kiemtra();
    }
}
