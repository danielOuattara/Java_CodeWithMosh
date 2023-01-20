package _16_PROJECT_Mortgage_Calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte ONE_HUNDRED = 100;

        System.out.println("Mortgage Calculator");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal loan ? : ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate ? : ");
        float annualInterestRate= scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / ONE_HUNDRED;

        System.out.print("Period in year ? : ");
        byte periodInYears = scanner.nextByte();
        int periodInMonths = periodInYears * MONTHS_IN_YEAR;

        double upper = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodInMonths);
        double lower = Math.pow(1 + monthlyInterestRate, periodInMonths) - 1;
        double mortgage = upper / lower;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        System.out.print("Mortgage : " + mortgageFormatted);
    }
}
