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

        int menu = scanner.nextInt();
        scanner.nextLine();
        return menu;
    }
}
