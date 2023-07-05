public class Findmin {
    public static void main(String[] args) {
        // поиск минимального из 3х
        int x =0 , y =  0 , z = 0;
        int  min = x ;

        if (x>y){
            min = y;
        }
        if (min>z){
            min = z;

        }
        System.out.println(min);
    }
}
