public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.4, 1.9, 4.5, 3.3, 1.2};
        double max = numbers[0];
        double total = 0;

        for(double number : numbers) {
            if(max < number) max = number;

            total += number;
        }

        System.out.println("En büyük sayi: " + max);
        System.out.println("Toplam: " + total);
    }
}