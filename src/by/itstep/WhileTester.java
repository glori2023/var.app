package by.itstep;

import java.util.Scanner;

public class WhileTester {
    public static void main(String[] args) throws InterruptedException {
        int t = 23;

       final  int max =100; // константа

        Scanner sc = new Scanner(System.in);
        System.out.println("input v ");
        int ml = sc.nextInt();
        if (ml >= 200 && ml <= 5000){
            while (t<= max){
                System.out.println("job");
                Thread.sleep( 500 * (ml/1000));
                int x = (int)(Math.random() * 6) + 5; //from 5 to 10
                t +=x; // t = t + x;
                System.out.println("current t is " + t );}}
            else {
                System.out.println("");
            }




        while (t<= max){
            System.out.println("job");
            Thread.sleep( 500);
            int x = (int)(Math.random() * 6) + 5; //from 5 to 10
            t +=x; // t = t + x;
            System.out.println("current t is " + t );

        }
    }

}
