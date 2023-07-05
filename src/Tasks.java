import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("begin main");
        System.out.println("main method logic ");
        runSameTask ();
        rectangleinfo();
        summa();
        task2();
        triangle();
        System.out.println("end main");

    }
    public static void triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input q");
        int q = sc.nextInt();
        System.out.println("input q1");
        int q1 = sc.nextInt();
        System.out.println("input q2");
        int q2 = sc.nextInt();


    }
    public static void rectangleinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input n1");
        int n1 = sc.nextInt();
        System.out.println("input n2");
        int n2 = sc.nextInt();


        long s = n1 * n2;
        long p = (n1 + n2) * 2;

        System.out.println("s = " + s);
        System.out.println("p = " + p);
        if (n1 == n2) {
            System.out.println("квадрат ");
        } else {
            System.out.println("прямоугольник");
        }


    }

    public static void summa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input n1");
        int n1 = sc.nextInt();
        System.out.println("input n2");
        int n2 = sc.nextInt();
        System.out.println("input n3");
        int n3 = sc.nextInt();
        System.out.println(n1 + n1 + n3);

    }


    public static void task2() {
        System.out.println("task2 begin");
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int a = sc.nextInt();
        System.out.println("input b");
        int b = sc.nextInt();
        System.out.println("input c");
        int c = sc.nextInt();

        System.out.println(" result " + (a + "*x*x+" + b + "*x+" + c + "=0"));
        Math.sqrt(9);

        double D;
        D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D is " + D);
        if (D > 0) {
            System.out.println("2 results");
            int x1, x2;
        } else if (D == 0) {
            System.out.println("1 result");
            int x1;
        } else {
            System.out.println("no result");
        }
    }

    public static void runSameTask (){
        System.out.println("1. Summa");
        System.out.println("2. Task2");
        System.out.println("3. rectangleinfo");


        Scanner sc = new Scanner(System.in);
        System.out.println("input num ");
        int num = sc.nextInt();


        if (num==1){
            rectangleinfo();}
        else if (num==2){
            task2();}
        else {
            System.out.println("not such");
        }


    }


}
