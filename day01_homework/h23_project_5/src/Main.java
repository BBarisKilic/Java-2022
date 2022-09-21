public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 8};
        int myNumber = 5;
        boolean isExists = false;

        for (int number : numbers) {
            if(myNumber == number) {
                isExists = true;
                break;
            }
        }

        if(isExists) {
            System.out.println(myNumber + " dizi icerisinde mevcuttur!");
        } else {
            System.out.println(myNumber + " dizi icerisinde mevcut degildir!");
        }
    }
}