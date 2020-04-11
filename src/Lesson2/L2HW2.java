package Lesson2;

import java.util.Arrays;

public class L2HW2 {
    public static void main(String[] args) {
        int[] cool = new int[8];

        for (int i = 0; i < 8; i++) {

            cool[i] = 3*i;
         //   System.out.println("cool[" + i + "] = " + cool[i]);

        }

        System.out.println(Arrays.toString(cool));
    }
}
