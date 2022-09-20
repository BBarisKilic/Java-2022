public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Pekiyi");
                break;
            case 'B':
                System.out.println("Iyi");
                break;
            case 'C':
                System.out.println("Orta");
                break;
            case 'D':
                System.out.println("Fena Degil");
                break;
            case 'E':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("Gecerli not giriniZ!");
        }
    }
}