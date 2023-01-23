package _25_Break_And_Continue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------ while");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        byte round = 0;
        while(true){
            round++;
            System.out.print("Enter a command : ");
            input = scanner.next().trim().toLowerCase();

            if(input.equals("pass") ){
                continue;
            }
            if(input.equals("quit") || input.equals("q") ){
                break;
            }
            System.out.println("input = " + input);
            System.out.println("Round : " +  round);
        }

        //------------------------------------------------------------------------

        System.out.println("------------------ do while");
        Scanner scanner2 = new Scanner(System.in);
        String input2 = "";
        byte round2 = 0;

        do{
            round2++;
            System.out.print("Enter a command : ");
            input2 = scanner2.next().trim().toLowerCase();
            if(input2.equals("pass") ){
                continue;
            }
            if(input2.equals("quit") || input2.equals("q") ){
                break;
            }
            System.out.println("input2 = " + input2);
            System.out.println("Round2 : " +  round2);
        }   while(true);

    }
}
