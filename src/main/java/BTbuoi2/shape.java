package BTbuoi2;

import java.util.Scanner;

public class shape {
    public shape() {
    }

    public void retangle(Scanner sc){
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void SquareTriagle(Scanner sc){
        System.out.println("1. Bottom-Left");
        System.out.println("2. Top-Left");
        System.out.println("3. Bottom-Right");
        System.out.println("4. Top-Right");
        System.out.print("Choose corner type: ");
        int type = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();

        switch (type) {
            case 1 -> { // Bottom-left
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            case 2 -> { // Top-left
                for (int i = h; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            case 3 -> { // Bottom-right
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= h - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            case 4 -> { // Top-right
                for (int i = h; i >= 1; i--) {
                    for (int j = 1; j <= h - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            default -> System.out.println("Invalid type!");
        }
    }

    public void IsoscelesTriangle(Scanner sc) {
        System.out.print("Enter height: ");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        shape sh = new shape();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (4 corners: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> sh.retangle(sc);
                case 2 -> sh.SquareTriagle(sc);
                case 3 -> sh.IsoscelesTriangle(sc);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
