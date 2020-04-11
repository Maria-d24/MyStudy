package Lesson2.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {
        //int[] data = new int[5];
        int data[] = new int[5];
        data[2] = 5;

        for (int value : data ) {
            System.out.println(value);
            
        }

        //int[] data2 = new int[] {1,3,5,1,8};
        //int[] data2 = {1,3,5,1,8};
        String[] data2 = {"-1","-3","-5","-1","-8"};
        for (String value: data2 ) {
            System.out.println(value);
                    }
        String[][] data3 = new String[3][3];
     //   data3[0] = new String[][];
        data3[0][1] = "8";
        data3[1][2] = "+4";

        for (String[] row: data3 ){
            for (String value:   row) {
                
                        System.out.println(value);}
            
        }
            }

    //        ArrayList<Integer> list = new ArrayList<>();




}
