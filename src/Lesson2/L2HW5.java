package Lesson2;

import java.util.Arrays;

public class L2HW5 {

    public static void main(String[] args) {

        int[] mm = {0,-8,4,12,5,6,3,2};
        int min = mm[0];
        int max = mm[0];

//       int j = 0;
//      int k = -1;

            for (int i = 0; i < mm.length; i++) {

                min = Math.min(min, mm[i]);
                max = Math.max(max, mm[i]);
////                  if (mm[i] < min) {
////                min = mm[i];
//            j += i;
//            }    if (mm[i] > max) {
////                    max = mm[i];
////               k = i + 1;
////                }
        }
//            Arrays.sort(mm);
//            int min = mm[0];
//            int max = mm[j];



        System.out.println("min = " + min);

//        for (int i = 1; i < mm.length; i++) {
//            if (mm[i] > max) {
//                max = mm[i];
////                k = i + 1;
//            }
//
//        }

        System.out.println("max = " + max );
    }
}
