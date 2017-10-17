package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
        // Bad way of implementation
//	    Player player = new Player();
//	    // when giving direct access to fields it can be a problem if the variable name changes in the player class
//        // when an application gets really big this can be a hassle to find and fix all of these instances
//	    player.name = "Tim";
//	    // if not using a constructor and you forget to define a field of that class the undeclared fields will be invalid
//        // a constructor makes sure that the data is valid for all fields
//	    // player.health = 20;
//	    player.weapon = "sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 100;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());


        // Encapsulation gives you more control and adds validation
        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
