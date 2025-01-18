package ss1.thuchanh;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of Dollars");
        double dollar = sc.nextDouble();
        if(dollar < 0){
            System.out.println("Invalid");
        } else {
            double vnd = dollar*23000;
            System.out.println("To VND is: " + vnd);
        }

    }
}
