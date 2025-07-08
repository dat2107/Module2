package BTbuoi2;

import java.util.Scanner;

public class GreatestCommonFactor {
    int a;
    int b;

    public GreatestCommonFactor() {
    }

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
    }

    public void tinhUCLN() {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
            return;
        }

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("Greatest common factor: " + a);
    }

    public static void main(String[] args) {
        GreatestCommonFactor gcf = new GreatestCommonFactor();
        gcf.nhap();
        gcf.tinhUCLN();
    }
}
