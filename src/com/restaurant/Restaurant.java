package com.restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Restaurant {

    public static void main(String[] args) {
        Menu menu = new Menu();
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        // Create several items and add them to a menu
        MenuItem menuItem1 = new MenuItem("Buffalo Wings", 11.99F, "Chicken Wings tossed in hot buffalo sauce.", "Appetizer", false);
        MenuItem menuItem2 = new MenuItem("Country Fried Steak", 12.99F, "Cube steak breaded and fried. Served with your choice of two sides.", "Main Course", true);
        MenuItem menuItem3 = new MenuItem("Chicken Caesar Salad", 10.99F, "Grilled, blackened chicken and romaine lettuce tossed in Caesar dressing.", "Main Course", false);
        MenuItem menuItem4 = new MenuItem("Key Lime Pie", 6.99F, "Our secret recipe!", "Dessert", false);

        Collections.addAll(menuItems, menuItem1, menuItem2, menuItem3, menuItem4);

        menu.addMenuItems(menuItems);

        // Print the entire menu to the screen
        System.out.println("Print the entire menu:\n" + menu + "\n");

        // Print an individual menu item to the screen.
        System.out.println("Print an individual menu item:\n" + menuItem4);

        // Create and add an individual menu item to the menu, then reprint the menu
        MenuItem menuItem5 = new MenuItem("Brownie a la Mode", 5.99F, "Chocolate chip brownie with a scoop of vanilla ice cream and hot fudge on top.", "Dessert", true);
        menu.addMenuItem(menuItem5);

        System.out.println("Create and add an individual menu item to the menu, then reprint the menu:\n" + menu + "\n");

        // Delete an item from a menu, then reprint the menu.
        menu.removeMenuItem(menuItem3);

        System.out.println("Delete an item from a menu, then reprint the menu:\n" + menu + "\n");

        // Test method to tell if menu item is new
        System.out.println("Test method to tell if menu item is new:");
        System.out.println("Is menuItem1 new? " + menuItem1.getIsNew());
        System.out.println("Is menuItem2 new? " + menuItem2.getIsNew() + "\n");

        // Test method to tell when menu was last updated
        System.out.println("Test method to tell when menu was last updated:");
        System.out.println("Menu was last updated on: " + menu.getLastUpdated() + "\n");

        //Create duplicate menu item and try to add it to the menu
        MenuItem menuItem6 = new MenuItem("Buffalo Wings", 11.99F, "Chicken Wings tossed in hot buffalo sauce", "Appetizer", false);

        System.out.println("Create duplicate menu item and try to add it to the menu:");
        menu.addMenuItem(menuItem6); // Prints 'Item is already on the menu.'

        // Prettier presentation of the menu
        System.out.println("Prettier presentation of the menu:");
        menu.displayMenu();

    }
}
