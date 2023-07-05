package by.itstep.oop.model;

public class CoffeeMachine {
    private static int salesCounter=0;
    private String model;
    private int numberOfCups;
    private double waterTank;
    private double milkTank;
    private double coffeeTank;
    private double garbageTank;
    private int currentWaterTemp;

    private boolean isActive = false;
    private  boolean isOn= false;
    private boolean noOperational=false;
    private boolean serviceRequired=false;
    private final  double maxWaterTank =3000;//ml

    private final  double maxMilkTank =500;//ml
    private final  double maxCoffeeTank = 1000;//gr
    private final  double maxGarbageTank = 10000;//p

    private final  double minWaterTank =300;//ml

    private final  double minMilkTank =100;//ml
    private final  double minCoffeeTank = 50;//gr








       public void addWater(int extraWater){
        if ((extraWater+waterTank) >= maxWaterTank){
            System.out.println("can't add water");
        }else {
        waterTank=waterTank + extraWater;
            System.out.println("current water" + waterTank + " ml");}
    }

    public void addMilk(int extraMilk){
        if ((extraMilk+milkTank) >= maxMilkTank){
            System.out.println("can't add milk");
        }else {
            milkTank=milkTank + extraMilk;
            System.out.println("current milk" + milkTank + " ml");}
    }

    public void addCoffee(int extraCoffee){
        if ((extraCoffee+coffeeTank) >= maxCoffeeTank){
            System.out.println("can't add Coffee");
        }else {
            coffeeTank = coffeeTank + extraCoffee;
            System.out.println("current Coffee" + coffeeTank + " gr");}
    }


    public void removeGarbage (int extraGarbage){
        if (garbageTank == maxGarbageTank){
            System.out.println("remove Garbage ");
        }else {
            System.out.println("make coffee");}
    }





    public void checking(){
           if(!isActive&&isOn&&garbageTank<maxGarbageTank&&waterTank>minWaterTank
                   &&milkTank>maxMilkTank&&coffeeTank>maxCoffeeTank&&!serviceRequired ){

           }else noOperational=true;
           if(isActive){
               System.out.println("is already active");
           }
        if(!isOn){
            System.out.println("Machine is off ");
        }
        if(garbageTank>=maxGarbageTank){
            System.out.println("Remove garbage ");
        }
        if(waterTank<=minWaterTank){
            System.out.println("add water ");
        }
        if(milkTank<=maxMilkTank){
            System.out.println("add milk ");
        }

        if(coffeeTank<=minCoffeeTank){
            System.out.println("add coffee ");
        }

        if(serviceRequired){
            System.out.println("Service Required ");
        }
            }

public void  serviceMachine(){
           serviceRequired=false;
}

    public static int getSalesCounter() {
        return salesCounter;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public double getWaterTank() {
        return waterTank;
    }

    public double getMilkTank() {
        return milkTank;
    }

    public double getCoffeeTank() {
        return coffeeTank;
    }

    public double getGarbageTank() {
        return garbageTank;
    }

    public int getCurrentWaterTemp() {
        return currentWaterTemp;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isOn() {
        return isOn;
    }

    public CoffeeMachine(String model){
        salesCounter++;
        this.model=model;
        this.numberOfCups=0;
            }
    public void switchOn() throws InterruptedException {
       if (!isOn){
        System.out.println("Coffee Machine " + model +"  "+ "is starting");
        Thread.sleep(1000);
        isOn=true;
        System.out.println("Coffee Machine " + model + "  " + "is started");
       }else {
           System.out.println("Already started !");
       }

    }

    public void switchOff() throws InterruptedException {
       if (isOn){
        System.out.println("CoffeeMachine " + model + "is stopping");
        Thread.sleep(1000);
        isOn=false;
        System.out.println("CoffeeMachine " + model + "is stopped");}else {
           System.out.println("Already stopped !");
       }
    }



    public void makeCoffeeLatte() throws InterruptedException {
        checking();
        if(!noOperational){
            System.out.println("Make Latte...");
            isActive=true;
            waterTank=getWaterTank()-200;
            milkTank=getMilkTank()-80;
            coffeeTank=getCoffeeTank()-10;
            Thread.sleep(1000);

            for (int temp=20; temp==95;temp++){
                currentWaterTemp=temp;
            }
            garbageTank=getGarbageTank()+10;
            System.out.println("Americano is ready");
            numberOfCups++;
            if (serviceRequired==false&&numberOfCups%10000==0){
                serviceRequired=true;}
            isActive=false;
            checking();
        }
                            }


    public void makeCoffeeCapuchino() throws InterruptedException {
        checking();
        if(!noOperational){
            System.out.println("Make Capuchino...");
            isActive=true;
            waterTank=getWaterTank()-200;
            milkTank=getMilkTank()-50;
            coffeeTank=getCoffeeTank()-10;
            Thread.sleep(1000);

            for (int temp=20; temp==95;temp++){
                currentWaterTemp=temp;
            }
            garbageTank=getGarbageTank()+10;
            System.out.println("Capuchino is ready");
            numberOfCups++;
            if (serviceRequired==false&&numberOfCups%10000==0){
                serviceRequired=true;}
            isActive=false;
            checking();
        }
    }





























    public void makeCoffeeAmericano() throws InterruptedException {
           checking();
           if(!noOperational){
               System.out.println("Make Americano...");
               isActive=true;
               waterTank=getWaterTank()-250;
               milkTank=getMilkTank()-0;
               coffeeTank=getCoffeeTank()-15;
               Thread.sleep(1000);

               for (int temp=20; temp==95;temp++){
                   currentWaterTemp=temp;
               }
               garbageTank=getGarbageTank()+15;
               System.out.println("Americano is ready");
               numberOfCups++;
if (serviceRequired==false&&numberOfCups%10000==0){
    serviceRequired=true;}
isActive=false;
               checking();
           }
}





}
