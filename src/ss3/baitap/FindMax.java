package ss3.baitap;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter amount of elements in 2 way array:---");
        int amountBig = sc.nextInt();
        System.out.println("---Enter amount of elements in each way array:---");
        int amountSmall = sc.nextInt();
        int[][] arr = new int[amountBig][amountSmall];
        for (int i = 0; i < amountBig; i++) {
            System.out.println("---Array" + i + "---");
            for (int j = 0; j < amountSmall; j++) {
                int n = sc.nextInt();
                arr[i][j] = n;
            }
        }
        //find max lmao
        int max = arr[0][0];
        for (int i = 0; i < amountBig; i++) {
            for (int j = 0; j < amountSmall; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("---The array is---");
        for (int i = 0; i < amountBig; i++) {
            for (int j = 0; j < amountSmall; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            System.out.println("--------");
        }
        System.out.println();
        System.out.println("-----Max is-----");
        System.out.println(max);
    }
}
