package BTbuoi1;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        if(tuoi<0 || tuoi>120){
            System.out.println("Kp là tuổi con người");
        } else {
            System.out.println("Là tuổi con người");
        }
    }
}
