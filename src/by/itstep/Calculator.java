package by.itstep;

import java.util.Scanner;

public class Calculator {
    public static void printSumma(int a, int b) {

        System.out.println("S = " + (a + b));

    }

    public static void printХ2(int n) {
        System.out.println("R = " + (n * 2));
    }


    public static int summa(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("div by zero");
        }
        double result = a / b;
        return result;
    }

    public static int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int sqr(int base) {

        int result = (int) Math.sqrt(base);
        return result;
    }

    public static int L(int S, int t) {

        int result = S * t;
        return result;
    }

    public static int pif(int A, int B) {
        int C = (int) Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        return C;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.s ");
        System.out.println("2.s1 ");
        System.out.println("3.d ");
        System.out.println("4.sqr ");

        int methodNum = sc.nextInt();
        switch (methodNum) {
            case 1: {
                System.out.println("input A:");
                int a = sc.nextInt();
                System.out.println("input B:");
                int b = sc.nextInt();
                int r = summa(a, b);
                System.out.println("Result is " + r);
                break;
            }

            case 2: {
                System.out.println("input A:");
                int a = sc.nextInt();
                System.out.println("input B:");
                int b = sc.nextInt();
                int r = sub(a, b);
                System.out.println("Result is " + r);
                break;
            }
            case 3: {
                System.out.println("input A:");
                int a = sc.nextInt();
                System.out.println("input B:");
                int b = sc.nextInt();
                double r = div(a, b);
                System.out.println("Result is " + r);
                break;
            }
            case 4: {
                System.out.println("input Num:");
                int a = sc.nextInt();
                System.out.println("input B:");
                int r = sqr(a);
                System.out.println("Result is " + r);
                break;
            }
            default:
                System.out.println("no such num");
                menu();
                        }

    }


    public static void randomMethod(int times){
        if (times<1){
            System.out.println("wrong time");
        } else {
            Scanner sc =new Scanner(System.in);
        for (int i=0; i<times; i++){
           int mNum = (int) Math.random() * 5+1;
            switch (mNum) {
                case 1: {
                    System.out.println("input A:");
                    int a = sc.nextInt();
                    System.out.println("input B:");
                    int b = sc.nextInt();
                    int r = summa(a, b);
                    System.out.println("Result is " + r);
                    break;
                }

                case 2: {
                    System.out.println("input A:");
                    int a = sc.nextInt();
                    System.out.println("input B:");
                    int b = sc.nextInt();
                    int r = sub(a, b);
                    System.out.println("Result is " + r);
                    break;
                }
                case 3: {
                    System.out.println("input A:");
                    int a = sc.nextInt();
                    System.out.println("input B:");
                    int b = sc.nextInt();
                    double r = div(a, b);
                    System.out.println("Result is " + r);
                    break;
                }
                case 4: {
                    System.out.println("input Num:");
                    int a = sc.nextInt();
                    System.out.println("input B:");
                    int r = sqr(a);
                    System.out.println("Result is " + r);
                    break;
                }
                default:
                    System.out.println("no such num");
                    menu();
            }

        }

        }
        }




    //Client
    public static void main(String[] args) {
        printSumma(10, -60);
        printХ2(200);
        int s = summa(10, 20);
        System.out.println(s);
        int s1 = sub(20, -200);
        System.out.println(s1);
        double d = div(5, 1);
        System.out.println(d);
        int m = mul(2, 2);
        System.out.println(m);
        System.out.println(sub(sub(2, 2), summa(4, 4)));
        System.out.println(sqr(9));
        System.out.println(L(100, 3));
        int C = pif(2, 2);
        System.out.println(C);
        menu();
        randomMethod (2);

    }
}
