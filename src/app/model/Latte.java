package app.model;

public class Latte implements CoffeeMachine {

    @Override
    public void make() {

        System.out.println("Latte is being prepared");
    }
}
