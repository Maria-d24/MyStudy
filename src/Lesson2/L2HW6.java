package Lesson2;

import java.util.Arrays;

public class L2HW6 {

    public static void main(String[] args) {

        pl(new int[]{0, 2, 4, -8, 18, -1, 4, 6, 7});
        pl(new int[]{0, 2, 4, -8, 18, -1, 4, 6, 4});
        pl(new int[]{0, 2, 0, 1, -1, 0, 1, -3, 4});

    }

    private static boolean pl(int[] mas) {
        int s = 0;
        int k = 0;
        boolean flag = false;
              for (int i = 0; i < mas.length; i++) {
            s = s + mas[i];  // сумма всех элементов
            k = k + i;  // количество всех элементов
                    }

              int sj = 0;
        for (int i = 0; i < mas.length; i++) {
                        sj = sj + mas[i];
                        if(sj == s - sj) {
                            flag = true;
                            System.out.println(flag);
                            break;
                        }
        }
        return flag;
    }



}
