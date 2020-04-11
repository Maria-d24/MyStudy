//package Lesson2;
//
//public class L2HW7 {
//    public static void main(String[] args) {
//
//        shiftArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, -1);
//        shiftArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, -4);
//        shiftArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 8);
//        shiftArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 5);
//        shiftArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 11);
//        shiftArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 20);
//        shiftArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, -5);
//    }
//
//    private static void shiftArray(int[] ms, int n) {
//        int numero = n % ms.length;
//        if (numero < 0) {
//            shiftLeft(ms, numero);
//                    }  else { shiftRight(ms, numero); }    }
//
//    private static void shiftRight(int[] ms, int n) {
//        for (int i = 0; i < Math.abs(n); i++) {
//            int lastK = ms[ms.length - 1];
//            for (int j = ms.length - 1; j > 0; j--) {
//                ms[j] = ms[j - 1];   }
//            ms[0] = lastK;        }
//    }
//
//    private static void shiftLeft(int[] ms, int n) {
//        for (int i = 0; i < Math.abs(n); i++) {
//            int firstK = ms[0];
//            for (int j = 0; j < ms.length; j++) {
//                ms[j] = ms[j+1];    }
//            ms[ms.length -1] = firstK;
//        }
//    }
//}
