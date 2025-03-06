public class Main {
    public static void main(String[] args) {
//        String message = new String("Hello, World!");
//        String message = "Hello, World!";
        String message = "Hello, World" + "!";

        System.out.println(message.endsWith("d!"));
        System.out.println(message.startsWith("d!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        message = "   Hello, World!   ";
        System.out.println(message.trim());
        System.out.println(message);
    }
}