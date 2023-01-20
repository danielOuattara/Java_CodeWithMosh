package _23_For_Loops;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------------");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String item : cars) {
            System.out.println(item);
        }

        System.out.println("-------------------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
