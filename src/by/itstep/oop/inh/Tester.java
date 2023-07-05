package by.itstep.oop.inh;

import by.itstep.oop.Cat;

public class Tester {
    public static void main(String[]args){
        Third th = new Third();
        // use использует ссылку

        Cat cat = new Cat();
        System.out.println(cat.toString());
        th.setId();
        th.setName("Bill");
    //    th.setAge;
        th.setCat();
//th.sayMyName();
        System.out.println(th.toString());
    }
}
