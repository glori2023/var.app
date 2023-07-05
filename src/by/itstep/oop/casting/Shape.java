package by.itstep.oop.casting;
//описать базовые поля и функции. Создать экземпляр типа Shape не возможно/запрещено.
public abstract class Shape {

   private  double s;
    private  double p;
    private String color;

   //абстрактные методы декларируются для реализации наследников . нет тела. д.б помечен как abstract
    public abstract void print();
    public abstract void calculateP();
    public abstract void calculateS();

    public void showInfo(){
        System.out.println("Shape :" + " S = " + s + " P = "+  p + " color is  "+ color);
    }


    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
