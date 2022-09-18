public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Degisken isimleri Java'da camelCase yazilir
        String ortaMetin = "Ilginizi cekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);
        System.out.println(altMetin);

        // Integer degerler
        int vade = 12;

        // Double degeler
        double dolarDun = 18.15;
        double dolarBugun = 17.9;

        // Bool degerler
        boolean dolarDustuMu = false;

        // Conditions
        if (dolarBugun < dolarDun) {
            dolarDustuMu = true;
        } else if (dolarBugun > dolarBugun) {
            dolarDustuMu = false;
        } else {
            dolarDustuMu = false;
        }

        // Arrayler
        String[] krediler = {"Hizli Kredi", "Maasini Halkbanktan...", "Mutlu Emekli"};

        // Looplar
        for(int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}