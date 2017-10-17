package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
	    double price = hamburger.itemizeHamburger();
	    hamburger.addHamburgerAddition1("Tomato", 0.27);
	    hamburger.addHamburgerAddition2("Lettuce", 0.75);
	    hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthBurger healthBurger = new HealthBurger("Bacon", 5.67);
        healthBurger.addHamburgerAddition1("Egg", 5.43);
        healthBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}
