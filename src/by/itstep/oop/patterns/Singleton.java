package by.itstep.oop.patterns;
import java.util.Date;

public class Singleton {
    private static Singleton singleton;
    private String value;
    private Singleton(){
        System.out.println("new Instance creator");

    }

    // lazy implementation создание экземпляра по первому требованию клиекта
    public static  Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
            singleton.value= new Date().toString();
        }
        return singleton;
    }
    public String getValue(){
        return value;
    }
}


class SingleTester{
    public static void main(String[] args) {



        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton.getValue());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton.getValue());

        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3);
        System.out.println(singleton.getValue());


    }



}