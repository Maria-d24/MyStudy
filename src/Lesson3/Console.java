package Lesson3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Console {

//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//String line = reader.readLine();
//
//    public Console() throws IOException {
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equals("exit")) {
            System.out.println("From scanner: " + str);
            str = scanner.nextLine();
        }



    }
}
