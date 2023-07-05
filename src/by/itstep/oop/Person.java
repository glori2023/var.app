package by.itstep.oop;

import java.util.Scanner;

// Class <=> Model <=> Type <=> Template.
// класс определяет будущие характеристики и функционал объекта.
public class Person {
    //field -поле
    //характеристики будущего объекта
    int age;
    String name;
    String lastName; // каждое последующее с большой
    char gender; //can be 'f', 'm'
    boolean isSingle;

    void sayMyName (){
        System.out.println("hello? my name is " + " " +name);
    }

    void dance(){
        System.out.println(name+ " " + "is dancing");
    }
    void drink () {
        if (age >= 18) {
            System.out.println("Vine and beer");

    }else    {
        System.out.println("only water");}
}
void  singing() {
    if (gender == 'f') {
        System.out.println("singing a song");
    }else {
        System.out.println("keep silent");

}
}
    }


    class Tester {
    public static void main (String[]args){
        int num;
        // создание переменной типа Person
        Person person;
        // instance creation <=> object creation  создаем объект в памяти с помощью оператора 'new'
        Scanner sc;
        person = new Person();
      //instance fields initialisation <=> object population
        person.name= "John";
        person.age = 32;
        person.gender = 'm';
        person.isSingle= true;
        person.lastName= "Jonson";


        //object behavior <=> met
        person.sayMyName();
        person.drink();
        person.dance();


        System.out.println("*******************************************");

        Person person2 = new Person();
        person2.name="Ann";
        person2.age = 15;
        person2.gender = 'f';
        person2.isSingle= true;
        person2.lastName= "Simple";

        person2.sayMyName();
        person2.drink();
        person2.dance();


        Person person3 = new Person();
        person3.name="Mark";
        person3.age = 45;
        person3.gender = 'm';
        person3.isSingle= true;
        person3.lastName= "Markov";

        person3.sayMyName();
        person3.drink();
        person3.drink();
        person3.dance();
person3.singing();

    }
    }

