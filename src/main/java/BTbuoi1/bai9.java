package BTbuoi1;

import java.util.Scanner;

public class bai9 {
    //ft =m * 3.2808
    protected float met,ft;

    public bai9() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập m: ");
        met = sc.nextFloat();
    }

    public void mtoft(){
        ft = met * 3.2808f;
    }

    public void xuat(){
        System.out.println("ft = "+ft);
    }

    public static void main(String[] args) {
        bai9 b9 = new bai9();
        b9.nhap();
        b9.mtoft();
        b9.xuat();
    }
}
