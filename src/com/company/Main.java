package com.company;

import menu.Menu;
import menu.SubMenu;

import java.io.IOException;
import java.util.*;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // write your code here


        Menu menu = new Menu("Make order");
        Menu menu1 = new Menu("Change product");
        Menu menu2 = new Menu("Change password");
        Menu menu3 = new Menu("Log out");

        Map<Integer, Menu> mainMenu = new HashMap<>();

        mainMenu.put(1, menu);
        mainMenu.put(2, menu1);
        mainMenu.put(3, menu2);
        mainMenu.put(4, menu3);

        Map<Integer, SubMenu> subMenus = new HashMap<>();

        SubMenu menu1Sub1 = new SubMenu("Add product");
        SubMenu menu1Sub2 = new SubMenu("Show total price");
        SubMenu menu1Sub3 = new SubMenu("Check");
        SubMenu menu1Sub4 = new SubMenu("Close the order");

        subMenus.put(1, menu1Sub1);
        subMenus.put(2, menu1Sub2);
        subMenus.put(3, menu1Sub3);
        subMenus.put(4, menu1Sub4);

        mainMenu.get(1).addToMap(subMenus);
        mainMenu.get(1).getSubMenu().get(1).addToMap(subMenus);
        boolean logOut;
        do {
            logOut = false;
            System.out.println("Welcome to the club: ");

            for (Map.Entry<Integer, Menu> pair : mainMenu.entrySet()) {
                System.out.println(String.format("[%s]", pair.getKey()) + " " + pair.getValue().getName());
            }
            System.out.print("Insert Selection: ");
            int selection = in.nextInt();
            Menu currentMenuLevel = mainMenu.get(selection);
            for (Map.Entry<Integer, SubMenu> pair : currentMenuLevel.getSubMenu().entrySet()) {
                System.out.println(String.format("[%s]", pair.getKey()) + " " + pair.getValue().getName());
            }
            System.out.print("Insert Selection: ");
            selection = in.nextInt();
            if (selection == 4) {
                continue;
            }
            logOut = true;
        } while (logOut);
    }
}