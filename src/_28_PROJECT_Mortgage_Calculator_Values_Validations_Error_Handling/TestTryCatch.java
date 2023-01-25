package _28_PROJECT_Mortgage_Calculator_Values_Validations_Error_Handling;

import java.text.NumberFormat;
import java.util.Scanner;

public class TestTryCatch {
    public static void main(String[] args) {

        /*
        TODO :add
         try {
          +logic
         } catch(Exception error){
            + logic
         }
         to test for valid user input
        */

        final int MINIMAL_PRINCIPAL = 1000;
        final int MAXIMAL_PRINCIPAL = 1_000_000;
        final String PRINCIPAL_ERROR_MSG = "Enter a number between 1,000 and 1,000,000 ";

        int principal;

        System.out.println("Mortgage Calculator");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                System.out.print("Principal loan ? : ");
                principal = scanner.nextInt();
                if (principal >= MINIMAL_PRINCIPAL && principal <= MAXIMAL_PRINCIPAL) {
                    break;
                } else {
                    System.out.println(PRINCIPAL_ERROR_MSG);
                }

            } catch (Exception e) {
                System.out.println(PRINCIPAL_ERROR_MSG);
                scanner.next();
            }
        }
    }

}
