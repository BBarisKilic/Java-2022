public class Main {
    public static void main(String[] args) {
        int total = getSum(2, 3, 4);
        System.out.println("Total: " + total);
    }

    public static int getSum(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }
}