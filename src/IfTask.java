public class IfTask {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;

        int age =30, cash = 1000, iq = 100;


        boolean isRich = false;
        if (cash > 1000){
            isRich = true;}
        boolean isClever = false;
            if (iq > 80){
                isClever = true;}

        boolean isYoing = false;
        if (age > 25){
            isYoing  = true;}
        if (isClever || isRich || isYoing){
            System.out.println("yes");}
        else{
            System.out.println("no");           }



    }
}
