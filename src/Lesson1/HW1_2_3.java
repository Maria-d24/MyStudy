package Lesson1;

import java.util.Arrays;

public class HW1_2_3 {

    public static void main(String[] args) {

        byte a = 10;
        short b = Short.MAX_VALUE;
        int c = Integer.MIN_VALUE;
        long d = 1_000_000L;
        float e = 2.27f;
        double f = -21;
        long g = Long.MAX_VALUE;
        char sym = '^';
        boolean znak = true;
        String stroka = "Say Yes to youself:)";

        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f =" + f + ", sym is " + sym + ", znak means " + znak);

        System.out.println(stroka);
        primer1(2, 5, 74, 15);

    }

    private static float primer1 (float a, float b, float c, float d) {

        if (d == 0) {
            System.out.println("Zero can't be divided");
            return d = 0;
        } else {
            float result = (float) (a * (b + 1.0*(c / d)));
            System.out.println("result = " + result);
            return result;

        }

    }
}
