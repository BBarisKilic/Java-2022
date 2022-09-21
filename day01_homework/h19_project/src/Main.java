public class Main {
    public static void main(String[] args) {
        int number = 37;

        boolean isPrime = true;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);
    }
}