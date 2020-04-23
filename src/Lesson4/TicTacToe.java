package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static char[][] map;
    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();



    public static void main(String[] args) {
        initMap();  // инициализация массива
        printMap(); // печать поля
        playGame();


    }

    private static void printMap() {
        printMapHeader(); // печать заголовка
        printMapRows(); // печать рядов поля

    }

    private static void playGame() {
        while (true) {
            humanTurn(); // ход юзера
            printMap();
            if (checkEnd(DOT_X, "Пользователь победил!")) break;

            aiTurn(); // ход компа
            printMap();
            if (checkEnd(DOT_O, "Искусственный интеллект победил...")) break;
        }
        System.out.println("Игра окончена.");
    }

    private static boolean checkEnd(char symbol, String winMessage) {
        if (checkWin(symbol)) {
            System.out.println(winMessage);
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья.");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
//        if(map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
//        if(map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
//        if(map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

        int k = 0;
        for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                int v = map[i][0];
                  if(map[i][j] == v && map[i][j] == symbol) {
                    k++;
                   }
            }    }
        if(k == SIZE || k == SIZE - 1) return true;

            int m = 0;
            for (int g = 0; g < SIZE; g++) {
                    for (int h = 0; h < SIZE; h++) {
                    int w = map[0][g];
                    if(map[h][g] == w && map[h][g] == symbol) {
                        m++;
                    }
                }            }
        if(m == SIZE || m == SIZE - 1) return true;

        int p = 0;
        for (int i = 0; i < SIZE ; i++) {
            int x = map[0][0];
            if(map[i][i] == x && map[i][i] == symbol) {
                p++;
            }         }
        if(p == SIZE || p == SIZE - 1) return true;

        int q = 0;
        for (int i = 0; i < SIZE; i++) {
            int y = map[0][SIZE - 1];
            if(map[i][SIZE - 1 - i] == y && map[i][SIZE - 1 - i] == symbol) {
                q++;
            }       }
        if(q == SIZE || q == SIZE - 1) return true;

//        if(map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
//        if(map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
//        if(map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

//        if(map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
//        if(map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

        return false;
    }

    private static void humanTurn() {
        int rowNumber, colNumber;
        do{
            System.out.println("Ход пользователя. Введите номер строки и столбца: ");
            System.out.println("Номер строки: ");
            rowNumber = scanner.nextInt();
            System.out.println("Номер столбца: ");
            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static void aiTurn() {
        int rowNumber, colNumber;
        do{
            System.out.println("Ход компьютера.");
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_O;
    }

    private static boolean isCellValid(int rowNumber, int colNumber) {
        if(rowNumber < 1 || rowNumber > SIZE)
            return false;
        if(colNumber < 1 || colNumber > SIZE)
            return false;

        return map[rowNumber - 1][colNumber - 1] == DOT_EMPTY;
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printColumnNumber(int i) {
        int columnNumber = i + 1;
        System.out.print(columnNumber + " " );
    }

    private static void printMapHeader() {
        printEmptyHeaderForFirstColumn("  ");
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
                               }

        System.out.println();
    }

    private static void printEmptyHeaderForFirstColumn(String s) {
        System.out.print(s);
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
