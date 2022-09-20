public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Baris";
        String ogrenci2 = "Oznur";
        String ogrenci3 = "Meryem";
        String ogrenci4 = "Ilknur";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Baris";
        ogrenciler[1] = "Oznur";
        ogrenciler[2] = "Meryem";
        ogrenciler[3] = "Ilknur";

        for(int i = 0; i< ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------");

        for (String ogrenci: ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}