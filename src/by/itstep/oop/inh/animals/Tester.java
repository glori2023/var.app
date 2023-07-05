package by.itstep.oop.inh.animals;

import by.itstep.oop.Person;

public class Tester {
    public static void main(String[] args) {
        Tiger tiger= new Tiger();
        tiger.setName("Tigra");
        tiger.attack();
        tiger.eat();
        tiger.sleep();
        Dog dog = new Dog();
        dog.setName("Rex");
        Person o1 = new Person();
        tiger.setOwner(o1);
    }
}
