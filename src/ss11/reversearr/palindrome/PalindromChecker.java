package ss11.reversearr.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromChecker {
    public String isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                char normal = Character.toLowerCase(c);
                stack.push(normal);
                queue.offer(normal);
            }
        }
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop().equals(queue.poll())) {
                return "PALINDROME";
            }
        }
        return "NOT PALINDROME";
    }
}
