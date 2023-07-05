package by.itstep;
public class ArraysUtil {
    public static int[] getRandomArray(int maxSize) {
        int size = MathUtil.genRandom(maxSize);
        int[] arr = new int[size];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = MathUtil.genRandom();
        }
        return arr;
    }
    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println("array [" + index + "] = " + array[index]);
        }

    }

//arr{1,2,3}
//    public static void printInLineArray(int[] array){
//  System.out.print("arr  = {");
//         for (int index = 0;index< array.length; index++){
//               if (index == array.length-1){
 //   //last element
//                    System.out.print(array[index]);
//                } else {
//                    System.out.print(array[index] + " , ");
//                }
//            }
//            System.out.print( "}\n ");
 //       }


        public static void printArray(int[] array, boolean inLine){
        if(inLine){
            System.out.print("arr  = {");
            for (int index = 0;index< array.length; index++){
                if (index == array.length-1){
                    //last element
                    System.out.print(array[index]);
                } else {
                    System.out.print(array[index] + " , ");
                }
            }
            System.out.print( "}\n ");
        } else {
            printArray(array);
        }
    }
    public static int findMaxInArray(int array[]) {
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
        }
        return max;
    }
    public static int findMinInArray(int array[]) {
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }



    public static void main(String[] args) {

        //Arrays declaration

        //single demention
        int arr[];
        int[] arr2;
        double[] dArr;
        boolean[] flags;


        //double demention
        int[] arr3[];
        int[] arr4[];
        int arr5[][];

        //multiple dimention

        int[][] arr6[][];

        // Arrays initiolisation

                     // 0 1  2
        int[] arr10 = {1, 2, 3};

                       //0   1  2   3
        int[] arr13 = {20, 25, 30, 67};
                       //0 1 2 3 4
                      //{0,0,0,0,0}
        int[] arr11 = new int[5];
        int[] arr123 = new int[500]; //

                       //0 1
        arr = new int[]{12, 2};

        //size <=> length
        int arr13Size = arr13.length;
        System.out.println("Number of elements is " + arr13Size);
        System.out.println("Number of elements is " + arr13.length); //тоже самое, что и через переменную

        // get element from array
        int val = arr13[2]; // обращение к индексу, индексация начинается с нуля
        System.out.println("value is " + val);

        int val2 = arr123[499];
        System.out.println("value is " + val2);

        //index        0    1  2   3       4
        int array[] = {34, 33, 0, -800, Integer.MAX_VALUE};
        int index = 0;
        System.out.println(" first elem " + array[index]);
        int lastIndex = array.length - 1;
        System.out.println(" Last elem " + array[lastIndex]);

        int i = 1; //array.length;
        System.out.println(" elem " + array[i]);
                        //0   1   2    3    4
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(chars[chars.length - 1]);
        //set element to array

        int arr1000[] = new int[100];
        //<var_name>[index] = value
        arr1000[0] = -100;
        arr1000[1] = Integer.MIN_VALUE;
        arr1000[99] = (int) (Math.random() * 101);
        System.out.println("Last elem is " + arr1000[arr1000.length - 1]);

        int a[] = new int[5];
        a[0] = 22;
        a[1] = 123;
        a[2] = 10;
        a[3] = -310;
        a[4] = 0;

        int[] aCopy = new int[a.length + 3];
        aCopy[0] = a[0];
        aCopy[1] = a[1];
        aCopy[2] = a[2];
        aCopy[3] = a[3];
        aCopy[4] = a[4];
        aCopy[5] = a[0] + a[1] + a[2] + a[3] + a[4];
        aCopy[6] = a[0] * 100;
        aCopy[7] = aCopy.length;


        System.out.println(aCopy[0]);
        System.out.println(aCopy[1]);
        System.out.println(aCopy[2]);
        System.out.println(aCopy[3]);
        System.out.println(aCopy[4]);
        System.out.println(aCopy[5]);
        System.out.println(aCopy[6]);
        System.out.println(aCopy[7]);

        int arr200[] = {12, 123, 333, 15};
  //      printArray(arr200);
  //      printArrayInLine(arr200);
  //      printArray(arr200, true);
      int m = findMaxInArray(arr200);
        System.out.println(m);
    }
}
