package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L3Task1 {

    private static final int ATTEMPT_NUMBER = 3;
    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        Random random = new Random();
        int targetValue = random.nextInt(MAX_VALUE +1);
        System.out.println("Угадайте загаданное число от нуля до девяти: ");

        Scanner scanner = new Scanner(System.in);
        for (int attempt = 0; attempt < ATTEMPT_NUMBER; attempt ++) {
            System.out.printf("Попытка номер %d.%n", attempt + 1);
            int userValue = getUserValue(scanner);
            if (userValue == targetValue) {
                System.out.println("Вы угадали!");
                break;
            }  else if (userValue < targetValue) {
                System.out.println("Загаданное число больше " + userValue);
            } else {
                System.out.println("Загаданное число меньше " + userValue);
            }

                    }
    }

    private static int getUserValue(Scanner scanner) {
        int result = -1;
        do {
            try {
                System.out.println("Введите число: ");
                String concoleLine = scanner.nextLine();
                int value = Integer.parseInt(concoleLine);
                if (value < 0 || value > MAX_VALUE) {
                    System.out.println("Число вне диапазона, давайте еще раз...");
                    continue;
                }
                result = value;
            } catch (NumberFormatException e) {
                System.out.println("Это не число, сосредоточьтесь!");
            }
        }
        while (result == -1);
        return result;

    }
}
