package by.itstep.oop;

public class Cat {
    private String name;
    private int age;
    private String type;
    private String color;
    private char gender;
    private double w;
    private double wh;
    private boolean hasOwner;

    public void setName(String newName) {
        name = newName;
    }
    public int setAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setHasOwner(boolean newHasOwner) {
        hasOwner = newHasOwner;
    }
    public boolean isHasOwner() {
        return hasOwner;
    }


    public void setColor(String newCpolor){
        color = newCpolor;
    }
    public String getColor(){
        return color;
    }

    public void eat() {
        System.out.println(name + "is eating");
    }

}

class CatTester {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("Barsik");


        System.out.println("Cats name is"+"  " + c1.getName());


    }
}