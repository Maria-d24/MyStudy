package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class L3HW2 {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int j = 0;

        for (int i = 0; i < words.length; i++) {
            j += i;

        }
        System.out.println(j);


        }
    }

