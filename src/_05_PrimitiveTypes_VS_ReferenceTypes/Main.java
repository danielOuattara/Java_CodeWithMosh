package _05_PrimitiveTypes_VS_ReferenceTypes;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // difference in terms of memory management

/*
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(x);
        System.out.println(y);
 */
        //-------------------------------

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point2.x = 3;
        System.out.println(point1);
    }
}