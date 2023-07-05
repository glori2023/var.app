package by.itstep.oop;

public class Dog {
    private long id;
    private String name;
    private String type;
    private char gender;
    private int age;
    private double w;
    private double wh;
    //Getters and Setters методы для получения и модификации полей

    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }

    public void setName (String newName){
            System.out.println(newName);
        }



public char getGen(){
        return gender;
}

public void setGen(char gen){
        gender = gen;
}
}

class DogTester{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.setName("Tuzik");

        System.out.println("Dogs name" + d1.getName());




    }
}
