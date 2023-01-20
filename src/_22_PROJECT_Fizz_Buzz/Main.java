package _22_PROJECT_Fizz_Buzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fizz Buzz Game !");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0 ) {
            System.out.println("Fizz Buzz");
        } else if(number % 5 == 0 ) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println( number);
        }
    }
}
