package Lesson1;

public class Calculyator {

    private final String name;

    public Calculyator (String name) {
        this.name = name;
    }

    public int add (int a, int b) {
        return a + b;
    }

    public int mul (int a, int b) {
        return a*b;
    }

    @Override
    public String toString() {
        return "Calculyator{" +
                "name='" + name + '\'' +
                '}';
    }
}
