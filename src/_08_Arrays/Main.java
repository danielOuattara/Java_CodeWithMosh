package _08_Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] prime_numbers = new int[5];
        prime_numbers[0] = 2;
        prime_numbers[1] = 3;
        prime_numbers[2] = 5;
        System.out.println(prime_numbers.length);
        System.out.println(prime_numbers);
        System.out.println(Arrays.toString(prime_numbers));

        int [] prime_numbers_2 = {2,7, 5, 3};
        System.out.println(prime_numbers_2);
        System.out.println(prime_numbers_2.length);
        System.out.println(Arrays.toString(prime_numbers_2));

        Arrays.sort(prime_numbers_2);
        System.out.println(Arrays.toString(prime_numbers_2));

    }
}
