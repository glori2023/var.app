package by.itstep.oop.patterns.factorymethod;

public abstract class Logistics {
    abstract void planeDelivery();
    abstract Transport createTransport();
}

class SeaLogistics extends Logistics{

    @Override
    void planeDelivery() {
        System.out.println("sea delivery plane ");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}

class FlyLogistics extends Logistics{

    @Override
    void planeDelivery() {
        System.out.println("fly delivery plane ");
    }

    @Override
    Transport createTransport() {
        return new Plane();
    }
}
class RoadLogistics extends Logistics{

    @Override
    void planeDelivery() {
        System.out.println("road delivery plane ");
    }

    @Override
    Transport createTransport() {
        return new Truck();
    }
}
class LogisticsProvider{
    public static Logistics chooseLogistics(String type){
        switch (type){
            case "Air":
                return new FlyLogistics();
            case "Sea":
                return new SeaLogistics();
            case "Road":
                return new RoadLogistics();
            default:
                System.out.println("  wrong   " + type);
                return new RoadLogistics();
        }

    }
}

class LogisticsClient{


    public static void main(String[] args) {

        Logistics logistics = LogisticsProvider.chooseLogistics("Air");
        logistics.createTransport();
        logistics.planeDelivery();


    }
}