package Lesson2;

import java.util.Arrays;

public class L2HW4 {

    public static void main(String[] args) {
        int[][] square = new int[7][7];

        for (int i = 0; i < square.length; i++) {
            int lastIndex = square.length - 1;
            square[i][i] = square[i][lastIndex - i] = 1;
        }
//        for (int i = square.length - 1; i >= 0 ; i--) {
//            square[square.length - 1 -i][i] = 1;
//        }

        for (int i = 0; i < square.length; i++) {
         //   for (int j = 0; j < square.length; j++) {
             //   System.out.print(square[i][j] + "  ");
           // }
            System.out.println(Arrays.toString(square[i]));
        }

    }

}
