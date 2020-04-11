package Lesson3;

import java.util.Arrays;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Masha";
        int age = 38;
       String test = String.format("Hello! My name is %s! I'm %s", name, age);
//        System.out.println("My name is " + name + "! I'm " + age);
//        System.out.println(test);
        System.out.printf("Hello! My name is %s! I'm %s", name, age);

}
}
