package BTbuoi1;

import java.util.Scanner;

public class bai8 {
    protected float doC,doF;

    public bai8() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ C: ");
        doC = sc.nextFloat();
    }

    public void convertCtoF(){
        doF = doC*9/5 + 32;
    }

    public void xuat(){
        System.out.println("Độ F: "+doF);
    }

    public static void main(String[] args) {
        bai8 b8 = new bai8();
        b8.nhap();
        b8.convertCtoF();
        b8.xuat();
    }
}
