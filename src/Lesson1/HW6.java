package Lesson1;

import java.util.Arrays;

public class HW6 {

    public static void main(String[] args) {

        System.out.println("Возвращаем true, если передаваемое в метод число отрицательное.");
        Flagotvet(-7);
        Flagotvet(0);
        Flagotvet(10);

    }

    private static boolean Flagotvet(int b) {
        boolean flag = true;

        if (b < 0) {
            System.out.println(flag);
            return flag;
        }
        else
            return false;

    }
}
