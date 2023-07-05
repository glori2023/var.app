package by.itstep.oop.inh.animals;

public class Tiger extends Cat {
    @Override
    void eat(){
        System.out.println(getName()+" " + "eat pig");
    }
    void attack(){
        System.out.println(getName()+" "+ "attack");
    }


}
