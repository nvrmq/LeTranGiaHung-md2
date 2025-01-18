package ss11.reversearr.palindrome;

public class Main {
    public static void main(String[] args) {
        PalindromChecker checker = new PalindromChecker();

        String str1 = "Able was I ere I saw Elba";
        String str2 = "Hello World";
        System.out.println("String 1: " + str1);
        System.out.println(checker.isPalindrome(str1));
        System.out.println("String 2: " + str2);
        System.out.println(checker.isPalindrome(str2));
    }
}
