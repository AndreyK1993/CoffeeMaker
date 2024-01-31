package app;

import app.model.CoffeeMachine;

public class Cup {
    private CoffeeMachine coffeeMachine;

    public void setCoffeeMachine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void startPreparing() {
        if (coffeeMachine != null) {
            coffeeMachine.make();
        } else {
            System.out.println("Please set a CoffeeMachine first.");
        }
    }
}
