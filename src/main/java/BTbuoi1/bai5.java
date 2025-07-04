package BTbuoi1;

import java.util.Scanner;

public class bai5 {
    protected float diem;

    public bai5() {
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        diem = sc.nextFloat();
    }

    public void rank(){
        if(diem < 4){
            System.out.println(diem+" Xếp hạng kém");
        } else if (diem < 5.5) {
            System.out.println(diem+" Xếp hạng yếu");
        } else if (diem < 7 ) {
            System.out.println(diem+" Xếp hạng TB");
        } else if (diem < 8.5) {
            System.out.println(diem+" Xếp hạng khá");
        } else {
            System.out.println(diem+" Xếp hạng giỏi");
        }
    }

    public static void main(String[] args) {
        bai5 b5 = new bai5();
        b5.nhap();
        b5.rank();
    }
}
