package _12_Casting;

public class Main {
    public static void main(String[] args) {
        // implicit casting : byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        // explicit casting
        double x2 = 1.1;
        int y2 = (int)x2 + 2;
        System.out.println(y2);

        // other case: parsing from one type to another
        String x3 = "1";
        int x3int = Integer.parseInt(x3);
        int y3 = x3int + 2;
        System.out.println(y3);


    }
}
