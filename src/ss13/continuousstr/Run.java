package ss13.continuousstr;

import java.util.LinkedList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > temp.getLast()) {
                    temp.add(str.charAt(j));
                }
            }
            if (temp.size() > max.size()) {
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }
        for (Character c : max) {
            System.out.print(c);
        }
    }
}
