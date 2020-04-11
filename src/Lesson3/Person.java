package Lesson3;

public class Person {

    public static void main(String[] args) {
        Person person = new Person("Masha");
        Person person2 = new Person("Masha");
        System.out.println(person);
        System.out.println(person2.equals(person));

    }
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Person() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
