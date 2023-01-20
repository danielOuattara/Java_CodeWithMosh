package _15_Reading_Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = scanner.nextLine().trim();
        System.out.println("Your name is " + userName);

        System.out.print("Enter your age : ");
        byte userAge = scanner.nextByte();
        System.out.println("Your age is " + userAge);
    }
}
