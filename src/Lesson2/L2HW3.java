package Lesson2;

import java.util.Arrays;

public class L2HW3 {

    public static void main(String[] args) {

        int[] got = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < got.length; i++) {
           int x = got[i];
            if (x < 6) {
                got[i] = 2*x;
                            }

        }
//        for (int j = 0; j < got.length; j++) {
//            System.out.print(got[j] + "  ");

    //    }


        System.out.println(Arrays.toString(got));

    }
}
