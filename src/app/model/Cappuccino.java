package app.model;

public class Cappuccino implements CoffeeMachine {

    @Override
    public void make() {
        System.out.println("Cappuccino is being prepared");
    }
}
