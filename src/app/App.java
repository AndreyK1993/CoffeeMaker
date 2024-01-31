package app;

public class App {

    public static void main(String[] args) {

        Cup cup = new Cup();

        cup.setCoffeeMachine(
                new Espresso() // Espresso injection
        );

        cup.startPreparing();

        cup.setCoffeeMachine(
                new Cappuccino() // Cappuccino injection
        );

        cup.startPreparing();

        cup.setCoffeeMachine(
                new Latte() // Latte injection
        );

        cup.startPreparing();
    }
}
