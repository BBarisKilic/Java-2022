public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Istanbul";
        cities[0][1] = "Bilecik";
        cities[0][2] = "Bursa";
        cities[1][0] = "Ankara";
        cities[1][1] = "Kayseri";
        cities[1][2] = "Konya";
        cities[2][0] = "Diyarbakir";
        cities[2][1] = "Sanliurfa";
        cities[2][2] = "Gaziantep";

        for(int i = 0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.println(cities[i][j]);
            }
            System.out.println("------------");
        }
    }
}