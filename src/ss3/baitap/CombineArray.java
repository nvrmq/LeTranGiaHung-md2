package ss3.baitap;

import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of numbers for array 1:");
        int amount = sc.nextInt();
        int[] arr = new int[amount];

        System.out.println("------Enter elements------");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter amount of numbers for array 2:");
        int amount2 = sc.nextInt();
        int[] arr2 = new int[amount2];

        System.out.println("------Enter elements------");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = arr.length, k = 0; i < arr3.length; i++, k++) {
            arr3[i] = arr2[k];
        }

        System.out.println("------Combined array------");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
