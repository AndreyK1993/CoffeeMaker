package app.view;

import java.util.Scanner;

public class AppView {

    private static Scanner scanner = new Scanner(System.in);

    public static int getMenu() {
        System.out.println("""
                _____ MENU ________________
                1 - Espresso.
                2 - Cappuccino.
                3 - Latte.
                0 - Turn off coffee machine.
                """);

        int menu;
        do {
            System.out.print("Choose a drink: ");
            menu = scanner.nextInt();
            scanner.nextLine();
            if (menu < 0 || menu > 3) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (menu < 0 || menu > 3);
        return menu;
    }
}
