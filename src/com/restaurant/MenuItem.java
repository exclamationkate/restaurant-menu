package com.restaurant;

public class MenuItem {

    private String name;
    private float price;
    private String description;
    private boolean isNew;

    public MenuItem(String name, float price, String description, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.isNew = isNew;
    }

    public MenuItem(String name, float price, String description) {
        this(name, price, description, false);
    }

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

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean aIsNew) {
        this.isNew = aIsNew;
    }
}

