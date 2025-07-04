package BTbuoi1;

import java.util.Scanner;

public class bai3 {
    protected int n;

    public bai3() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên bất kì: ");
        n = sc.nextInt();
    }

    public void kiemtra(){
        if(n<0){
            System.out.println(n + " < 0");
        } else if (n == 0) {
            System.out.println(n + " = 0");
        } else {
            System.out.println(n + " > 0");
        }
    }

    public static void main(String[] args) {
        bai3 b3 = new bai3();
        b3.nhap();
        b3.kiemtra();
    }
}
