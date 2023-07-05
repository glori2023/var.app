package by.itstep.oop.patterns.factorymethod;

public abstract class Pizza {
    public abstract void printInfo();
}

class Margarita extends Pizza{

    @Override
    public void printInfo() {
        System.out.println("Tomatos");

    }
}

class Pepperoni extends Pizza{

    @Override
    public void printInfo() {
        System.out.println("classic pepperoni");
    }
}
class Fourseasons extends Pizza{

    @Override
    public void printInfo() {
        System.out.println(" 4 ingr");
    }
}

class Pizzeria {
    public static Pizza makePizza(int key){
        if (key==1){
            return  new Margarita();
        }else  if (key==2){
            return  new Pepperoni();
        }else  if (key==3){
            return  new Fourseasons();}
        throw  new IllegalArgumentException("no such num");
    }
}
class PizzaClient{
    public static void main(String[] args) {
        Pizza pizza= Pizzeria.makePizza(1);
        pizza.printInfo();

        Pizza[] pizzas={Pizzeria.makePizza(1),Pizzeria.makePizza(1),Pizzeria.makePizza(1)};

    }
}