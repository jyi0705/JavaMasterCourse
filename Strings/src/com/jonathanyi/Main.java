package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
	    // these are primitive types defined by Java language built in
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        // can create your own data type using objects

        // not technically primitive byt 9th data type is a String which is a sequence of characters
        // use double quotes to signify this a string instead of single quotes
        // String is considered a class
        String myString = "this is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more"; // appending more text to original string
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        // will return 250.5549.95
        System.out.println( "The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        // will return 1050 converts int into a string to add to the end
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        // return 1050120.47
        System.out.println("LastString value: " + lastString);

    }
}
