package _27_PROJECT_Mortgae_Calculator_Values_Validations;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte ONE_HUNDRED = 100;

        final  int MINIMAL_PRINCIPAL = 1000;
        final  int MAXIMAL_PRINCIPAL = 1_000_000;

        final  int MINIMAL_INTEREST = 0;
        final  int MAXIMAL_INTEREST = 30;

        final  int MINIMAL_PERIOD_IN_YEARS = 1;
        final  int MAXIMAL_PERIOD_IN_YEARS = 30;

        int principal;
        float annualInterestRate;
        byte periodInYears;
        float monthlyInterestRate;
        int periodInMonths;

        System.out.println("Mortgage Calculator");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Principal loan ? : ");
            principal = scanner.nextInt();
            if ( principal >= MINIMAL_PRINCIPAL && principal <= MAXIMAL_PRINCIPAL) {
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000 ");
        }

        while(true) {
            System.out.print("Annual Interest Rate ? : ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= MINIMAL_INTEREST && annualInterestRate < MAXIMAL_INTEREST) {
                monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / ONE_HUNDRED;
                break;
            }
            System.out.println("Enter a number greater than 0 and lass than 30");
        }


        while(true) {
            System.out.print("Period in year ? : ");
            periodInYears = scanner.nextByte();

            if (MINIMAL_PERIOD_IN_YEARS >= 1 && MAXIMAL_PERIOD_IN_YEARS <= 30) {
                periodInMonths = periodInYears * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a number between 1 and 30");
        }

        double upper = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodInMonths);
        double lower = Math.pow(1 + monthlyInterestRate, periodInMonths) - 1;
        double mortgage = upper / lower;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        System.out.print("Mortgage : " + mortgageFormatted);

    }
}
