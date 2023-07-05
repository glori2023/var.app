package by.itstep.oop.init;

public class Parent {
    private int p;
    private static int pStatic;
    static {
        System.out.println("Parent Static block begin");
        System.out.println(pStatic);
        pStatic = 123;
        System.out.println(pStatic);
        System.out.println(" ParentStatic block finish");
    }
    {System.out.println(" Parent noStatic block begin");
        System.out.println(p);
    p = 123;
        System.out.println(p);
        System.out.println("Parent noStatic block finish");}

    public  Parent(){
        System.out.println("Parent const begin");
        p=123;
        System.out.println(p);
        System.out.println("Parent const fin");
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public static int getpStatic() {
        return pStatic;
    }

    public static void setpStatic(int pStatic) {
        Parent.pStatic = pStatic;
    }
}
