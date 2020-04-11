package Lesson2;

import java.util.Arrays;

public class L2HW1 {

    public static void main(String[] args) {

        int[] md = {0,0,1,0,0,1,0,1,0,1,1,1};

        for (int i = 0; i < md.length; i++) {
            if (md[i] == 0) { md[i] = 1; } else { md[i] = 0;}
           // System.out.print(md[i] + "  ");
        }
        System.out.println(Arrays.toString(md));
    }
}
