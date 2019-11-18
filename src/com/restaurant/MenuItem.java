package com.restaurant;

import java.util.Objects;

public class MenuItem {

    private String name;
    private float price;
    private String description;
    private String category;
    private boolean isNew;

    // Constructors
    public MenuItem(String name, float price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(String name, float price, String description, String category) {
        this(name, price, description, category, false);
    }

    // Instance methods
    public void displayMenuItem() {
        System.out.print(name + " " + price);
        if (isNew) {
            System.out.print(" (New Item!)");
        }
        System.out.println(" - " + description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                "}\n";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean aIsNew) {
        this.isNew = aIsNew;
    }

}

