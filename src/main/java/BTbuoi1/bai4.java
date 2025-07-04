package BTbuoi1;

import java.util.Scanner;

public class bai4 {
    protected int a;
    protected int b;
    protected int c;

    public bai4() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a:");
        a = sc.nextInt();
        System.out.print("nhập b:");
        b = sc.nextInt();
        System.out.print("nhập c:");
        c = sc.nextInt();
    }

    public void max(){
        int max = Math.max(a, Math.max(b,c));
        System.out.println("Số lớn nhất là: "+max);
    }

    public static void main(String[] args) {
        bai4 b4 = new bai4();
        b4.nhap();
        b4.max();
    }
}
