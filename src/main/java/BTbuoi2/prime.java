package BTbuoi2;

public class prime {
    public prime() {
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
        for (int i = 2; i<=100; i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        prime p = new prime();
        p.show();
    }
}
