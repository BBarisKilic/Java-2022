public class Main {
    public static void main(String[] args) {
        String msg = "Bugün hava cok güzel.";

        String newMsg = msg.replace(' ','-');
        System.out.println(newMsg);
        System.out.println(msg.substring(2,5));

        for(String word: msg.split(" ")){
            System.out.println(word);
        }

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());
    }
}