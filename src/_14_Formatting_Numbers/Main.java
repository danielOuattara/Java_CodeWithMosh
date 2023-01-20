package _14_Formatting_Numbers;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res = currency.format(1234567.891);
        System.out.println(res);

        // methods chaining
        String result2 = NumberFormat.getPercentInstance().format(0.1233);
        System.out.println(result2);

    }
}
