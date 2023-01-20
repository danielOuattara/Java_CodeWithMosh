package _24_While_Loops_Do_While;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------------------");
        byte j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

        System.out.println("--------------------------------");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        byte k = 0;
        while ( k < cars.length) {
            System.out.println(cars[k]);
            k++;
        }

        System.out.println("--------------------------------");
        byte m = 0;
        do{
            System.out.println(cars[m]);
            m++;
        } while ( k < cars.length);


        System.out.println("--------------------------------");

        Scanner scanner = new Scanner(System.in);
        String input = "";
        byte round = 0;
        while(!input.equals( "quit") && !input.equals("q") ){
            round++;
            System.out.println("Enter a command");
            input = scanner.next().trim().toLowerCase();
            System.out.println("input = " + input);
            System.out.println("Round : " +  round);
        }
    }
}
