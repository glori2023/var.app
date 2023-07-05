package by.itstep.oop.inh;
import by.itstep.oop.Cat;
// класс Child расширяет наследует класс Parent

//is a relationship  наследник есть родитель
public class Child extends Parent{
    private Cat cat;
    private int iq;
    public int getIq(){
        return iq;
    }
    public void setIq(int iq){
        this.iq=iq;
    }
    public void jump(){
        System.out.println(" ");

    }
    public void setCat(){
        this.cat=cat;
    }

    //переопределение - способность изменить функционал, кот был в базовом классе

 //   @Override
    public void sayMyName(){
        // ссылка на супер класс
       super.sayMyName();
        System.out.println("My name is" + getName());
    }
}
