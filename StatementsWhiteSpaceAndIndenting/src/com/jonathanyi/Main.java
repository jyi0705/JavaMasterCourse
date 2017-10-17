package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
        // these below are statements
	    int myVariable = 50;
	    myVariable++;
	    myVariable--;
        System.out.println("This is a test");

        // java will evaluate this as " this is another still more" and ignore whitespaces
        System.out.println("This is" +
                " another" +
                " still more.");

        // can put statments on same line but shouldnt cuz its confusing
        int anotherVariable = 50;myVariable--;
        System.out.println("This is another one");

        // can also have a lot of spaces java deletes them out when it compiles
        int             myVar =              10;

    }

}
