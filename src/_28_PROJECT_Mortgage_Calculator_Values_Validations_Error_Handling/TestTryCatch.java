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
        final byte MONTHS_IN_YEAR = 12;
        final byte ONE_HUNDRED = 100;

        final int MINIMAL_PRINCIPAL = 1000;
        final int MAXIMAL_PRINCIPAL = 1_000_000;
        final String PRINCIPAL_ERROR_MSG = "Enter a number between 1,000 and 1,000,000 ";

        final int MINIMAL_INTEREST = 0;
        final int MAXIMAL_INTEREST = 30;

        final int MINIMAL_PERIOD_IN_YEARS = 1;
        final int MAXIMAL_PERIOD_IN_YEARS = 30;

        int principal = 0;
        float annualInterestRate;
        byte periodInYears;
        float monthlyInterestRate;
        int periodInMonths;

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
                System.out.println("Error");
                continue;
            }
        }
    }
}
