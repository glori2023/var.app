package by.itstep.oop.model;

public class Barista {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine coffeeMachine= new CoffeeMachine("Delonghy");
        coffeeMachine.switchOn();
        coffeeMachine.switchOn();
        coffeeMachine.addWater(1000);
        coffeeMachine.addMilk(500);
        coffeeMachine.addCoffee(200);
        coffeeMachine.makeCoffeeLatte();
        coffeeMachine.makeCoffeeAmericano();
        coffeeMachine.makeCoffeeCapuchino();
    }
}
