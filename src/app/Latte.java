package app;

class Latte implements CoffeeMachine {

    @Override
    public void make() {

        System.out.println("Latte is being prepared");
    }
}
