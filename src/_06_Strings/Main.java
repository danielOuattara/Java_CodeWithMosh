package _06_Strings;

public class Main {
    public static void main(String[] args) {
        String message = new String("Hello world");
        System.out.println(message);

        String newMessage = "Hello wold " + "again !";
        System.out.println(newMessage);

        System.out.println(message.replace('w', 'M'));
        System.out.println(message.toUpperCase());

        System.out.println(message);
    }
}
