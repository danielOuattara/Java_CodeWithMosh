package _13_Maths;

public class Main {
    public static void main(String[] args) {
        int result1 = Math.round(1.12F);
        System.out.println(result1);

        int result2 = (int)Math.ceil(1.12F);
        System.out.println(result2);

        int result3 = (int)Math.floor(1.12F);
        System.out.println(result3);

        int result4 = Math.max(2, 4);
        System.out.println(result4);

        int result5 = Math.min(2, 4);
        System.out.println(result5);

        double result6 = Math.random();
        System.out.println(result6);

        double result7 = Math.random()* 100;
        System.out.println(result7);

        int result8 = (int)Math.round(Math.random()* 100);
        System.out.println(result8);

        int result9 = (int)(Math.random()* 100);
        System.out.println(result9);
    }
}
