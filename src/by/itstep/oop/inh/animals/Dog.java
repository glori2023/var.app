package by.itstep.oop.inh.animals;

public class Dog extends DA {

@Override
    void eat(){
        System.out.println(getName()+"eat meat");
    }
    @Override
    void voice(){
        System.out.println(getName()+"bark-bark");
    }
    void serve(){
        System.out.println(getName()+"serve");
    }

}
