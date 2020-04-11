package Lesson1;

import java.util.Arrays;

public class HW4 {

    public static void main(String[] args) {
        System.out.println("Сумма двух чисел лежит в пределах от 10 до 20 (включительно) ?");
        Detsl(5, 28);
        Detsl(5, 8);
        Detsl(5, 1);
        Detsl(5, 5);
        Detsl(1, 19);


    }

    private static boolean Detsl(int a, int b){

        boolean metka = true;
        int s = a + b;
        if (s >= 10 && s <= 20) {
         System.out.println("Результат -  " + metka);

            return metka;
        }  else {
            metka = false;
            System.out.println("Результат -  " + metka);
        return metka;
            }


    }
}
