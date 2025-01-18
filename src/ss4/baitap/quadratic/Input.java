package ss4.baitap.quadratic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Quadratic Function----");
        System.out.println("---Enter a---");
        int a = sc.nextInt();
        System.out.println("---Enter b---");
        int b = sc.nextInt();
        System.out.println("---Enter c---");
        int c = sc.nextInt();
        System.out.println("-------------");
        System.out.println(a + "x*2" +" + " +  b + "x"+ " + " + c);
        System.out.println();

        QuadraticFunction qf = new QuadraticFunction(a, b, c);
        System.out.println("1. Get discriminant");
        System.out.println("2. Get Root1");
        System.out.println("3.Get Root2");

        switch (sc.nextInt()) {
            case 1:
                System.out.println(qf.getDiscriminant());
                break;
            case 2:
                System.out.println(qf.getRoot1());
                break;
            case 3:
                System.out.println(qf.getRoot2());
                break;
        }
    }
}
