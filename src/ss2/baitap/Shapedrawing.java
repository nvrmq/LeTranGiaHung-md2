package ss2.baitap;

import java.util.Scanner;

public class Shapedrawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Selection----");
        System.out.println("1. Rectanggle");
        System.out.println("2. Right triangles");
        System.out.println("3. Isoceles trigangle");
        System.out.println("Enter option:");
        String star = "*";
        String option = sc.nextLine();
        switch (option) {
            case "1":
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "2":
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j <= 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i < 5; i++) {
                    for (int k = 0; k < 5 - i; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "3":
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j < 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
