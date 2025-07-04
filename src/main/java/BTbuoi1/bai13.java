package BTbuoi1;

import java.util.Scanner;

public class bai13 {
    int a,b;
    float x;

    public bai13() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a: ");
        a = sc.nextInt();
        System.out.print("nhập b: ");
        b = sc.nextInt();
    }

    public void giai(){
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            x = (float) -b/a;
            System.out.println("Pt có nghiệm x = "+x);
        }
    }


    public static void main(String[] args) {
        bai13 b13 = new bai13();
        b13.nhap();
        b13.giai();
    }
}
