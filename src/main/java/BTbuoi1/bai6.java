package BTbuoi1;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class bai6 {
    protected float ds;
    protected float rose;

    public bai6() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập doanh số(x.000.000): ");
        ds = sc.nextFloat();
    }

    public void tinh(){
        if(ds<10){
            rose = ds * 0.02f;
        } else if (ds < 20) {
            rose = ds * 0.05f;
        } else if (ds < 50) {
            rose = ds * 0.10f;
        } else {
            rose = ds * 0.15f;
        }
    }

    public void xuat(){
        System.out.println("Doanh số: " + ds + " triệu đồng");
        System.out.printf("Hoa hồng: %.2f triệu đồng\n", rose);
    }

    public static void main(String[] args) {
        bai6 b6 = new bai6();
        b6.nhap();
        b6.tinh();
        b6.xuat();
    }
}
