package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class L3HW1 {

    public static void main(String[] args) {

        System.out.println("Отгадайте загаданное компом число!");
        Scanner scanner = new Scanner(System.in);
        int chislo; // рандомное число
        int opr = -1;

        Random ran = new Random();
        int[] zag = new int[3];
        boolean pravda = false;
        boolean igra = true;
        do {
            chislo = ran.nextInt(9);
                for (int i = 0; i < 3; i++) {
         System.out.println("Введите число от 0 до 9: ");
         zag[i] = scanner.nextInt();
            if (zag[i] == chislo) {
                System.out.println("Вы угадали!");
                break;
            }
            if (zag[i] > chislo) {
                System.out.println("Загаданное число меньше...");
            } if(zag[i] < chislo) {
            System.out.println("Загаданное число больше.");
            }

        }
                do {
                    System.out.println("One more game? Enter 1 or 0 (1 - Yes, 0 - No)");
                    opr = scanner.nextInt();
                    if (opr==1) {
                        pravda = true; igra = false;
                        break;
                    }
                    if (opr==0) {
                        pravda = false; igra = false;
                        break;
                    }
                }   while (igra);

    } while (pravda);


    }
}
