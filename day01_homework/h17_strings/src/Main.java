public class Main {
    public static void main(String[] args) {
        String msg = "Bugün hava cok güzel.";

        System.out.println("Karakter sayisi: " + msg.length());
        System.out.println("5. karakter" + msg.charAt(4));
        System.out.println(msg.concat(" Yasasin!"));
        System.out.println(msg.startsWith("b"));
        System.out.println(msg.endsWith("."));

        char[] chars = new char[5];
        msg.getChars(0,5, chars,0);
        System.out.println(chars);
        System.out.println(msg.indexOf("av"));
        System.out.println(msg.lastIndexOf("a"));
    }
}