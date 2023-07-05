package by.itstep.oop;

public class Building {
    private int dC;
    private String type;
    private String color;
    private char belong;
    private char location;



    public void setdC(int newdC) {
        dC = newdC;
    }

    public int getdC() {
        return dC;
    }

    public void setType( String newType) {
        type = newType ;
    }
    public  String getType() {
        return type;
    }




}
class BuildingTester {
    public static void main(String[] args) {
        Building b1 = new Building();
        b1.setType("Skyscraper");


        System.out.println("Building is"+"  " + b1.getType());


    }
}