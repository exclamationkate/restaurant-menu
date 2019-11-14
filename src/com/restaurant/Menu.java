package com.restaurant;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


public class Menu {

    private ArrayList<MenuItem> appetizers;
    private ArrayList<MenuItem> mainCourses;
    private ArrayList<MenuItem> desserts;
    private Date lastUpdated;


    public Menu(ArrayList<MenuItem> appetizers, ArrayList<MenuItem> mainCourses, ArrayList<MenuItem> desserts, Date lastUpdated) {
        this.appetizers = appetizers;
        this.mainCourses = mainCourses;
        this.desserts = desserts;
        this.lastUpdated = lastUpdated;
    }

    public Menu() {
        this(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new Date());
    }

    public ArrayList<MenuItem> getAppetizers() {
        return appetizers;
    }

    public void addAppetizer(MenuItem menuItem) {
        appetizers.add(menuItem);
    }

    public ArrayList<MenuItem> getMainCourses() {
        return mainCourses;
    }

    public void addMainCourse(MenuItem menuItem) {
        mainCourses.add(menuItem);
    }

    public ArrayList<MenuItem> getDesserts() {
        return desserts;
    }

    public void addDessert(MenuItem menuItem) {
        desserts.add(menuItem);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated() {
        lastUpdated.getTime();
    }

    // TO DO: Refactor this method to make it DRY
    public void displayMenu() {
        System.out.println("Appetizers:");
        for (MenuItem item : appetizers) {
            System.out.print(item.getName() + " $" + item.getPrice());
            if (item.getIsNew()) {
                System.out.print(" New Item!!");
            }
            System.out.println("\n\t" + item.getDescription());
        }
        System.out.println("\nMain Courses:");
        for (MenuItem item : mainCourses) {
            System.out.print(item.getName() + " $" + item.getPrice());
            if (item.getIsNew()) {
                System.out.print(" New Item!!");
            }
            System.out.println("\n\t" + item.getDescription());
        }
        System.out.println("\nDesserts:");
        for (MenuItem item : desserts) {
            System.out.print(item.getName() + " $" + item.getPrice());
            if (item.getIsNew()) {
                System.out.print(" New Item!!");
            }
            System.out.println("\n\t" + item.getDescription());
        }
        System.out.println("\nMenu last updated on: " + lastUpdated);
    }
}
