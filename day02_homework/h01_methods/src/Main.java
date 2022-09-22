public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = {1, 3, 5, 6, 8};
        int myNumber = 5;
        boolean isExists = false;

        for (int number : numbers) {
            if(myNumber == number) {
                isExists = true;
                break;
            }
        }

        String message = "";

        if(isExists) {
            message = myNumber + " dizi icerisinde mevcuttur!";
            showMessage(message);
        } else {
            message = myNumber + " dizi icerisinde mevcut degildir!";
            showMessage(message);
        }
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }
}