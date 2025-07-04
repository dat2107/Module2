package BTbuoi1;

import java.util.Scanner;

public class bai14 {
    int a,b,c;
    float x,x1,x2;
    float delta;

    public bai14() {
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

    public void giai(){
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phuơng trình có nghệm x = "+-b/c);
            }
        } else {
            delta = b*b - 4*a*c;
            if(delta<0){
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                x = (float) -b/(2*a);
                System.out.println("Phương trình có nghiệm duy nhất x = "+x);
            } else {
                x1 = (float) (-b+Math.sqrt(delta))/(2*a);
                x2 = (float) (-b-Math.sqrt(delta))/(2*a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
        }
    }

    public static void main(String[] args) {
        bai14 b14 = new bai14();
        b14.nhap();
        b14.giai();
    }
}
