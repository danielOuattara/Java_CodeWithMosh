package _07_Escape_Sequences;

public class Main {
    public static void main(String[] args) {
        String message = "Hello \"Daniel\" !";
        System.out.println(message);

        String location = "C:Windows\\Users\\Computing\\java";
        System.out.println(location);

        String location_2 = "C:Windows\tUsers\nComputing\\java";
        System.out.println(location_2);
    }
}
