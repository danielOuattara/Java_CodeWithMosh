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


        System.out.println("------------------ while");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        byte round = 0;
        while(!input.equals( "quit") && !input.equals("q") ){
            round++;
            System.out.print("Enter a command : ");
            input = scanner.next().trim().toLowerCase();
            if(!input.equals( "quit") && !input.equals("q") ){
                System.out.println("input = " + input);
                System.out.println("Round : " +  round);
            }
        }

        System.out.println("------------------ do while");
        Scanner scanner2 = new Scanner(System.in);
        String input2 = "";
        byte round2 = 0;
        do{
            round2++;
            System.out.print("Enter a command : ");
            input2 = scanner2.next().trim().toLowerCase();
            if(!input2.equals( "quit") && !input2.equals("q") ){
                System.out.println("input2 = " + input2);
                System.out.println("Round2 : " +  round2);
            }
        }   while(!input2.equals( "quit") && !input2.equals("q"));
    }
}
