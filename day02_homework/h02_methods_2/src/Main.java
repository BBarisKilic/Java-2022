public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava cok güzel.";
        String newMessage = getCity();
        System.out.println(newMessage);
        int number = getSum(5, 7);
        System.out.println(number);
    }

    public static void create() {
        System.out.println("Created");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static String getCity() {
        return "Ankara";
    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }
}