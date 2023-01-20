package _11_Arithmetic_Expressions;

public class Main {
    public static void main(String[] args) {
        // + - * /
        int result = 10 + 3;
        System.out.println(result);

        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println("--------------");
        //-----------------------------------

        int x2 = 1;
        int y2= ++x2;

        System.out.println(x2);
        System.out.println(y2);
        System.out.println("--------------");
        //----------------------------------------
        int x3 = 1;
        x3 += 4;

        System.out.println(x3);



    }
}
