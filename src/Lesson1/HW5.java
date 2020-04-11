package Lesson1;

import java.util.Arrays;

public class HW5 {

    public static void main(String[] args) {
        System.out.println("Положительное ли число передали или отрицательное ?");
        Answer(1);
        Answer(0);
        Answer(-8);
        Answer(50);

    }

    private static void Answer(int a) {

        if (a>=0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");

        }

    }
}
