package ss3.baitap;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of numbers:");
        int amount = sc.nextInt();
        int[] arr = new int[amount];
        System.out.println("------Enter elements------");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("------Remove an element------");
        int removedInt = sc.nextInt();
        boolean found = false;
        int[] newArr = new int[arr.length - 1];
        int index = 0; // Index for new array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != removedInt) {
                newArr[index++] = arr[i];
            } else {
                found = true;
            }
        }

        if (found) {
            System.out.println("------Removed elements:------");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
