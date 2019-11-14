package com.restaurant;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem appetizer1 = new MenuItem("Toasted Ravioli", 9.99F, "Lightly breaded and fried ravioli.", false);
        MenuItem appetizer2 = new MenuItem("Buffalo Wings", 11.99F, "Chicken wings tossed in Buffalo sauce.", true);
        MenuItem mainCourse1 = new MenuItem("Cajun Chicken Pasta", 13.99F, "Grilled chicken and penne pasta in a cream sauce.", false);
        MenuItem mainCourse2 = new MenuItem("Country Fried Steak", 12.99F, "Breaded and fried cube steak with a side of mashed potatoes and green beans.", false);
        MenuItem mainCourse3 = new MenuItem("Bacon Cheeseburger", 9.99F, "Bacon and cheese Angus beef burger on a pretzel bun with fries.", true);
        MenuItem dessert1 = new MenuItem("Death by Chocolate", 7.99F, "Chocolate cake with chocolate icing and chocolate chips on top.", false);
        MenuItem dessert2 = new MenuItem("Apple Pie", 6.99F, "Slice of apple pie with a scoop of vanilla ice cream.", false);

        menu.addAppetizer(appetizer1);
        menu.addAppetizer(appetizer2);
        menu.addMainCourse(mainCourse1);
        menu.addMainCourse(mainCourse2);
        menu.addMainCourse(mainCourse3);
        menu.addDessert(dessert1);
        menu.addDessert(dessert2);

        menu.displayMenu();
    }
}
