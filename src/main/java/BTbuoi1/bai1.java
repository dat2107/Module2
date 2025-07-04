package BTbuoi1;

import java.util.Scanner;

public class bai1 {
    protected int a;
    protected int b;

    public bai1() {
    }

    public bai1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a:");
        a = sc.nextInt();
        System.out.print("Nhập b:");
        b = sc.nextInt();
    }

    public void kiemtra(){
        if(a%b==0){
            System.out.println("a chia hết cho b");
        } else {
            System.out.println("a ko chia hết cho b");
        }
    }

    public static void main(String[] args) {
        bai1 b1 = new bai1();
        b1.nhap();
        b1.kiemtra();
    }
}
