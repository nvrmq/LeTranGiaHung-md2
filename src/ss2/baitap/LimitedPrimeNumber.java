package ss2.baitap;

public class LimitedPrimeNumber {
    public static void main(String[] args) {
        System.out.println("---Prime Number smaller than 100---");
        int number = 2;
        int count = 0;
        while (number < 100) {
            Boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(count+1 + ". " + number);
                count++;
            }
            number++;
        }
    }
}
