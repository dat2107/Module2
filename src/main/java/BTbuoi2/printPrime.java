package BTbuoi2;

import java.util.Scanner;

public class printPrime {
    int count = 0;
    int num = 2;

    public printPrime() {
    }

    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void show(){
        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        printPrime prime = new printPrime();
        System.out.print("20 SNT đầu tiên là: ");
        prime.show();
    }
}
