package by.itstep;

import java.util.Arrays;

public class MathUtil {
    public static void varTester ( double val){
      double d; //объявление
            d = val; //значение
            System.out.println(d);
           d = d + d; // переприсвоение
           System.out.println(d);
       }
       public static void forTester ( int num, double val, boolean flag){
           System.out.println("  for Tester starter");
            for (int i = 0; i < num; i++) {
                if (flag) {
                    val+=val;
                   System.out.println("Value is " + (val) + " ; ");
                } else {
                   System.out.println("Value is " + (val+=val));
              }
           System.out.println(" for Tester starter end ");}}

   /**
    *  returns an integer value with a positive sign,
   * greater then or equal to  and less or equal then Max Bound
    *
   * @param MaxBound
 * @return a pseudorandom integer from 0 to maxBound inclusive
  */

public static int genRandom(int maxBound) {//100=> random  from 0 to 100 [55, 77,
   int x = (int) (Math.random() * (maxBound + 1));
 return  genRandom (0,maxBound);

   }
 public static int genRandom(int minBound, int maxBound) {
//100=> random  from 0 to 100 [55, 77,
//todo : case when maxBound than minBound
       int v = maxBound - minBound + 1;
       int x = (int) (Math.random()*v+minBound);
   return x;
        }
    public static int genRandom (){
             return genRandom(10);}

public static void cristalSetter(){
    int apArr[] = new int[13];
    for (int num =1; num<9;num++){
        int studentNumber= (int) (Math.random()*12)+1;
        System.out.println(studentNumber);
    }
}

    public static void main (String[]args){
        System.out.println("main starter");
        //varTester(5.55);
//forTester(5,10, true);
 // int val= genRandom(500);
 //       int val2= genRandom(100,101);
 //       System.out.println(val2);
        //       int val3= genRandom();
        //       System.out.println(val3);

        int[] result = ArraysUtil.getRandomArray(20);
        ArraysUtil.printArray(result,true);
        System.out.println("Max element in array is:"+
                ArraysUtil.findMaxInArray(result));
        System.out.println("Min element in array is:"+
                ArraysUtil.findMinInArray(result));

        System.out.println("main end");



    }


}


