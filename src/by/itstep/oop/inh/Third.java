package by.itstep.oop.inh;

public class Third extends Child {
    private long id;

    public long getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public void run(){
        System.out.println(getName()+" is run");
    }



}
