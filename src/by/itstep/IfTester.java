package by.itstep;

public class IfTester {
    public static void main(String[] args) {
        System.out.println("Begin");
        int t = - 18;
        // (condition) (body)? where condition can be true or false
        // if condition is true -> body
        if (t > 20) {
            System.out.println("майка");
        }

        if (t < - 15) {
            System.out.println("шуба");
        }


        int n1 =5, n2 = 9,n3 =9, n4 =9;
        double avg = (n1 + n2 + n3 + n4) /4.0;


        System.out.println(avg);
if (avg > 9){
    System.out.println(")");
} else  if (avg > 6) {

    System.out.println("())");
}else{
            System.out.println("@");}
int a = 1, b =5, c= 3;

if ((a + b) <= c){
    System.out.println("invalid triangle");
}else if ((a+c)<=b){
    System.out.println("invalid triangle");
}else if ((b+c)<=a) {
    System.out.println("invalid triangle");}
else {System.out.println("valid triangle");}


int num1 = 10, num2 =  10;
if (num1 > num2){
    System.out.println("num1 > num2");
} else if (num1 < num2){
    System.out.println("num1 < num2");
}
else {
    System.out.println("num1 = num2");}

        System.out.println("End."); }}


