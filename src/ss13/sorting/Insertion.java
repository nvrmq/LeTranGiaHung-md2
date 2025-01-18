package ss13.sorting;

import java.util.LinkedList;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Number of elements in the list: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int num = (int)(Math.random() * 1001);
            list.add(num);
        }
        System.out.println("The list is: ");
        for (int c : list) {
            System.out.print(c + ", ");
        }
        System.out.println();

        System.out.println("Sorted list: ");
        insertionSort(list);
        for (int c : list) {
            System.out.print(c + ", ");
        }
    }
    public static void insertionSort(LinkedList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j) > temp) {
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                } else {
                    break;
                }
            }
        }
    }
}
