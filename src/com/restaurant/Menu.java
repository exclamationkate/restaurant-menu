package com.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private LocalDateTime lastUpdated = LocalDateTime.now();
    private LinkedHashMap<String, String> categories = new LinkedHashMap<>();

    // Constructor
    public Menu() {
        categories.put("Appetizers", "Appetizer");
        categories.put("Main Courses", "Main Course");
        categories.put("Desserts", "Dessert");
    }

    // Getters and Setters
    public ArrayList<MenuItem> getMenuItems() { return menuItems; }

    public void addMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDateTime getLastUpdated() { return lastUpdated; }

    public void setLastUpdated() { lastUpdated = LocalDateTime.now(); }

    public HashMap<String, String> getCategories() { return categories; }

    public void addCategory(String menuTitle, String category) {
        categories.put(menuTitle, category);
    }

    // Instance Methods
    public void addMenuItem(MenuItem menuItem) {
        boolean isOnMenu = false;
        for (MenuItem item : menuItems) {
            if (item.equals(menuItem)) {
                System.out.println("Item is already on the menu.\n");
                isOnMenu = true;
            }
        }
        if (!isOnMenu) {
            menuItems.add(menuItem);
            lastUpdated = LocalDateTime.now();
        }
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
        lastUpdated = LocalDateTime.now();
    }

    public void displayMenu() {
        for (Map.Entry<String, String> entry : categories.entrySet()) {
            System.out.println("** " + entry.getKey() + " **");
            for (MenuItem item : menuItems) {
                if (item.getCategory() == entry.getValue()) {
                    item.displayMenuItem();
                }
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
