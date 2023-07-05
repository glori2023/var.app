package by.itstep.oop.casting;


public class Rectangle extends Shape {
private double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
        this.b = a;
    }





    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println("___");
        System.out.println("|  |");
        System.out.println("|  |");
        System.out.println("___");

    }

    @Override
    public void calculateP() {
        setP((a+b)*2);

    }

    @Override
    public void calculateS() {
        double sr;
        setS(a*b);
}
}
