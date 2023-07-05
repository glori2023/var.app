package by.itstep;

public class ForTester {

    // 0 2 4 6 8 10 ....(1000)
    public  static  void task1 (){
        for (int i = 0; i < 2000; i= i + 2) {
            System.out.print(i + " ");}
        System.out.println();
    }

    public  static  void task2 (){
        for (int i = 1; i < 1000; i= i + 2) {
            System.out.print(i + " ");}

        System.out.println();

    }
    public  static  void task3 (){
        for (int i = 0, number = 10; i < 50; i++) {
            System.out.print(number + " ");
            number = number + 10;
        }

        System.out.println();

    }

    public  static  void task4 (){
        for (int i = 0, number = -1; i < 100; i++) {
            System.out.print(number + " ");
            number = number  -1; //--number
        }

        System.out.println();

    }
    public  static  void task5 (){
        for (int i = 0, num1 = -1, num2 = 2 ; i < 100; i++) {
            System.out.print(num1 + " " + num2 + " ");
            num1 = num1  -2; num2 = num2  + 2;
        }

        System.out.println();

    }

    public  static  void task5z (){
        for (int i = 0, number = - 1; i < 100; i++) {
            if (number % 2 == 0) { // для всех четных
                System.out.print(((-1) *  number) + " ");
            } else {
            System.out.print(number + " ");
             }
            number--;

        }

        System.out.println();

    }

    public  static  void task6 (){
        for (int i = 0, number ;  i < 25; i++) {
            number = (int) (Math.random()*11 );
            System.out.print(number + " ");}

        }
//таблица умножения
    public  static  void task7 () {
        for (int a = 2 ;  a <= 9; a++){
        for (int  b = 2 ;  b <= 10; b++) {
            int result =  a*b;

            System.out.println(a + " Х " + b + " = " +  result);}

        System.out.println("********");

       }

                    }
    public  static  void task8 () {
        for (int num = 0 ;  num < 9; num++){
            int studentNumber = ((int) (Math.random()*12))+1;

                System.out.println(studentNumber);}

    }



    public static void main(String[] args) {

        //       0        1            3           2
        // for(<var>; <condition>; <iteration>) {<body>}
        // <var> - выполняется единожды
        // <condition> - true/false если правда, выполняется body? иначе конец цикла
        //<iteration> - выполняется перед условием или после body ++ = i+1
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        for (; true; ) {
//            System.out.println("inside for");
//            int x = (int) (Math.random() * 10);
//            if (x == 5) {
//                break;// безоговорочный выход из цикла
//            }
//
//        }
        //%
        int num1 = 3;
        int num2 = 2;

        int result = num1 % num2;
        System.out.println(result);




        task1();
        task2();
        task3();
        task4();
        task5();
        task5z ();
        task6 ();
        task7();
        task8();

    }
}
