package Lesson3;

public class VarArgs {

    public static void main(String[] args) {

        System.out.println(sum(1,5));
    }

    private static int sum(int firstValue, int... other){
        int sum = firstValue;
        for (int value: other  ) {
            sum += value;
            
        }
        return sum;
    }
}
