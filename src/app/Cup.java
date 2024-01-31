package app;

// Клас Cup тримає посилання
// на інтерфейс CoffeeMachine, а НЕ на конкретний клас.
class Cup {

    private CoffeeMachine coffeeMachine;

    public void setCoffeeMachine(CoffeeMachine coffeeMachine) {

        this.coffeeMachine = coffeeMachine;
    }

    public void startPreparing() {

        coffeeMachine.make();
    }
}
