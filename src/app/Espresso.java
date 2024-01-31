package app;

class Espresso implements CoffeeMachine {

    @Override
    public void make() {

        System.out.println("Espresso is being prepared");
    }
}
