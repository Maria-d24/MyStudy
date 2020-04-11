package Lesson1;

import java.util.Arrays;

public class HelloWorldForever {

    public static void main(String[] args) {

        HelloWorldExample(args[0]);

        testPrimitivo();

//        boolean flag = true;
//        flag = false;
//        System.out.println(flag);

       // String str = String ("Zhizn prekrasna!");
        testString();

        System.out.println("----------------------");

        HelloWorldForever example1 = new  HelloWorldForever();
        System.out.println(example1);

        System.out.println("----------------------");

        int d = 5;
        int e = 7;
        System.out.println("d / e = " + d/e);
        System.out.println("d % e = " + d%e);
        System.out.println("++d =" + ++d);
        System.out.println("--e = " + ++e);

        d += e; // d = d + e;

        boolean flag = true;
        if (2==5 || flag == false) {
            System.out.println("True");
        }
        else  {
            System.out.println("False");
        }
       printMessage("nonexito");
        double result = add(8.0f,1.0f);
        System.out.println(result);
        printMessage("exit");

        Calculyator calculyator = new Calculyator("test");
        System.out.println(calculyator);
        System.out.println(calculyator.add(5, 3));
        System.out.println(calculyator.mul(5, 3));


    }

    private static void testString() {
        String str = "Zhizn prekrasna!";
        System.out.println(str.toUpperCase());
    }

    private static void testPrimitivo() {
        double a = 5;
        float b = 8.0f;
        double c = b-a;
        System.out.println(c);

        char symbol = '?';
        System.out.println(symbol);
    }

    private static void HelloWorldExample(String arg) {
        String name = arg;
        System.out.println("Hello, darling!");
        System.out.println("Hi, Masha!");
        System.out.println("Have a good time, " + name + "!");
    }

    private static void printMessage (String text) {
        if (text.equals("exit")){
            return;
        }
        System.out.println("text = " + text);
    }

    private static double add (float a, float b) {
        return a + b;
    }

   // @Override
    public String toString() {
        return "Hello, Space!";
    }
}
