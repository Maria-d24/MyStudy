package Lesson2;

import java.util.Arrays;

public class SwitchPrimero {

    public static void main(String[] args) {

//        System.out.println(printMonth(1));
//        System.out.println(printMonth(2));
//        System.out.println(printMonth(3));
//        System.out.println(printMonth(4));
//        System.out.println(printMonth(5));
//        System.out.println(printMonth(6));
//        System.out.println(printMonth(7));
//        System.out.println(printMonth(8));
//        System.out.println(printMonth(9));
//        System.out.println(printMonth(10));
//        System.out.println(printMonth(11));
//        System.out.println(printMonth(12));
//        System.out.println(printMonth(13));

        printSeasonBySwitch(1);
        printSeasonBySwitch(2);
        printSeasonBySwitch(3);
        printSeasonBySwitch(4);
        printSeasonBySwitch(5);
        printSeasonBySwitch(6);
        printSeasonBySwitch(7);
        printSeasonBySwitch(8);
        printSeasonBySwitch(9);
        printSeasonBySwitch(10);
        printSeasonBySwitch(11);
        printSeasonBySwitch(12);
        printSeasonBySwitch(13);
    }

    private static String printMonth(int monthNumber) {
        if (monthNumber == 1) {    return "January";          }
        if (monthNumber == 2) {    return "February";          }
        if (monthNumber == 3) {    return "March";          }
        if (monthNumber == 4) {    return "April";          }
        if (monthNumber == 5) {    return "May";          }
        if (monthNumber == 6) {    return "June";          }
        if (monthNumber == 7) {    return "July";          }
        if (monthNumber == 8) {    return "August";          }
        if (monthNumber == 9) {    return "September";          }
        if (monthNumber == 10) {    return "October";   }
        if (monthNumber == 11) {    return "November";   }
        if (monthNumber == 12) {    return "December";   }
        return "Unknown month";


    }

    private static void printSeasonBySwitch(int monthNumber) {
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");  break;
                       default:  System.out.println("Unknown season");

        }





    }
}
