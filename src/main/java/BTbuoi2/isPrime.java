package BTbuoi2;

import java.util.Scanner;

public class isPrime {
    int n;

    public isPrime() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số: ");
        n = sc.nextInt();
    }

    public void check(){
        if (n < 2) {
            System.out.println(n+" Không phải số nguyên tố");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n+" Không phải số nguyên tố");
                return;
            }
        }
        System.out.println(n+" Là số nguyên tố");
    }
    public static void main(String[] args) {
        isPrime ip = new isPrime();
        ip.nhap();
        ip.check();
    }
}
