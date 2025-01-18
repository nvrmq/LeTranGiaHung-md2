package ss11.reversearr;

import java.util.Stack;

public class ReverseArr {
    public void ReverseArr(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("----Initial Arr----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("----Final Arr----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        ReverseArr reverser = new ReverseArr();
        reverser.ReverseArr(arr);
    }
}
