package Lesson2;

import java.util.Arrays;

public class ForExample {

    public static void main(String[] args) {
        for (int i = 0, j = 2; i < 5 || j < 10; i++, j+=2) {
            System.out.println("i = " + i + ", j = " + j);
            
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
                
            }
            
        }
        
        String str = "12345";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);

            
        }

        for (char c : str.toCharArray()) {
            System.out.println(c);
            
        }

        int stopdigit = 7;
        for (int i = 0; i < 20; i++) {
            if (i == stopdigit) { break; }
            if (i%2 != 0) {continue;}
              System.out.println(i);

            
        }
    }
}
