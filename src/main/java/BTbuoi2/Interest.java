package BTbuoi2;

import java.util.Scanner;

public class Interest {
    double money = 1.0;
    int month = 1;
    double interestRate = 1.0;
    double totalInterest = 0;

    public Interest() {
    }

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = input.nextDouble();
        System.out.print("Enter number of months: ");
        month = input.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
    }
    public void tinh(){
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
    }
    public void xuat(){
        System.out.println("Total of interest: " + totalInterest);
    }
    public static void main(String[] args) {
        Interest inter = new Interest();
        inter.nhap();
        inter.tinh();
        inter.xuat();
    }
}
