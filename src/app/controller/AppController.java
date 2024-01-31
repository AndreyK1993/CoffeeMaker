package app.controller;

import app.Cup;
import app.model.CoffeeMachine;
import app.model.Espresso;
import app.model.Cappuccino;
import app.model.Latte;
import app.view.AppView;

public class AppController {

    Cup cup = new Cup();

    public void runApp() {
        int option;
        do {
            option = AppView.getMenu();
            switch (option) {
                case 1 -> preparingDrink(new Espresso());
                case 2 -> preparingDrink(new Cappuccino());
                case 3 -> preparingDrink(new Latte());
                case 0 -> System.out.println("Turn off coffee machine.");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (option != 0);
        System.exit(0);
    }

    private void preparingDrink(CoffeeMachine coffeeMachine) {
        cup.setCoffeeMachine(coffeeMachine);
        cup.startPreparing();
    }
}
