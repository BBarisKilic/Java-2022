public class Main {
    public static void main(String[] args) {
        // Value Type - Sample 1
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        num1 = 30;
        System.out.println(num2);

        // Reference Type - Sample 1
        int[] numbers1 = new int[]{1,2};
        int[] numbers2 = new int[]{3,4};
        numbers2 = numbers1;
        numbers1[0] = 99;
        System.out.println(numbers2[0]);

        // Reference Type - Sample 2
        CustomerManager customerManager1 = new CustomerManager("0");
        CustomerManager customerManager2 = new CustomerManager("1");
        customerManager2 = customerManager1;
        customerManager1.id = "2";
        System.out.println(customerManager2.id);
    }
}