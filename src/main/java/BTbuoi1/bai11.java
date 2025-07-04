package BTbuoi1;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh a: ");
        a = sc.nextInt();
        System.out.print("Nhập độ dài cạnh b: ");
        b = sc.nextInt();
        int S = a*b;
        System.out.println("S = "+S);
    }
}
