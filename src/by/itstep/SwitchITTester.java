package by.itstep;

import java.util.Scanner;

public class SwitchITTester {
    public static void main(String[] args) {
        int num = 1;
        // switch (var) {body with case}
        task2();



        switch (num) {
            case 1:
                System.out.println("one");

            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("not one and not two");

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("input week day number");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("t");
                break;
            case 3:
                System.out.println("w");
                break;
            case 4:
                System.out.println("th");
                break;
            case 5:
                System.out.println("f");
                break;
            case 6:
                System.out.println("st");
                break;
            case 7:
                System.out.println("s");
                break;
            default:
                System.out.println("[1 to 7} incorrect" + dayNumber);
        }


    }


    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input mounth number");
        int mounthNumber = sc.nextInt();
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            default:
                System.out.println("[1 to 7} incorrect" + mounthNumber);
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input letter");
        char ch = sc.next().charAt(0);
        int code = (int) ch; // получаем код символов
        System.out.println("code is " + code);
        if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
            System.out.println("letter");
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'U':
                case 'Y':
                    System.out.println("vowels");
                    break;
                default:
                    System.out.println("consonant");

            }

        } else {
            System.out.println("your input is not a letter");
        }

    }

}




