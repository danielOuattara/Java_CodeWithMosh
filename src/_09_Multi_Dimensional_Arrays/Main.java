package _09_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 1;
        numbers[1][1] = 1;
        numbers[1][2] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int [][] numbers_2 = {{1,1,0}, {0,1,1}};
        System.out.println(Arrays.deepToString(numbers_2));
    }
}
