package ss2.baitap;


public class PrimNumber {
    public static void main(String[] args) {
        System.out.println("---First 20 Prime Number---");
        int number = 2;
        int count = 0;
        while (count < 20) {
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
