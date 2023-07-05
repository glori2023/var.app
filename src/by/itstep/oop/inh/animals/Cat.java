package by.itstep.oop.inh.animals;

public class Cat extends DA {
    @Override
    void sleep(){
        super.sleep();
        super.sleep();
        super.sleep();
    }
@Override
    void eat(){
        System.out.println(getName()+ "  " + "is eating milk");
    }
    @Override
    void play(){
        System.out.println(getName()+"  " + "is playing");
    }

    @Override
    void voice() {
        System.out.println("meow -meow - meooooow");
           }
}
