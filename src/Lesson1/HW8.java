package Lesson1;

import java.util.Arrays;

public class HW8 {

    public static void main(String[] args) {

        System.out.println("Является ли год високосным?");
        Visokos(2100);
        Visokos(2000);
        Visokos(1967);
        Visokos(1980);
        Visokos(1970);
    }

    public static void Visokos(int g) {

        if ((g%4 ==0 && g%100 !=0) || (g%400==0))
        {               System.out.println("Год " + g + "-й - високосный");
        }  else {
            System.out.println("Год " + g + "-й - " + "невисокосный");
        }
    }
}
