public class Main {
    public static void main(String[] args) {
        String message = "Hello \"Mosh\"";
        System.out.println(message);

        message = "c:\\Windows\\..";
        System.out.println(message);

        message = "c:\nWindows\\..";
        System.out.println(message);

        message = "c:\tWindows\\..";
        System.out.println(message);
    }
}