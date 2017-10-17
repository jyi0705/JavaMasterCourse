package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
        // int has enough space for -2.147 billion to 2.147 billion
        // has width of 32 (most commonly used for whole numbers)
	    // the underscore makes the number more readable. set module change to test for java 8
        // this is a literal if the number is really big use underscore to make it more readable
        // generally use int unless there is a special use case
	    int myMinValue = -2_147_483_648;
        int myMaxValue= 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // allocated a smaller amount of space by computer -128 to 127
        // byte is more efficient takes a quarter the amount of space as a integer
        // if you have lots of calculations more efficient to use a byte because computer is not allocating
        // as much space for a byte as to integer
        // if computer doesnt have lot of memory makes sense to use smaller data type
        // width of 8
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        // by default java types numbers into integer to make java recognize this as a byte you have to do
        // casting so you add (byte) in front of expression
        byte myNewByteValue = (byte) (myByteMinValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);


        // short is allocated approx twice space as byte and half amount of int
        // width of 16
        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;
        short myNewShortValue = (short) (myShortMaxValue / 2);
        // add L at the end the long value to let computer know this is a long
        // long has a width of 64
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        // dont need to cast myTypeTotal automaticaly coverted to a int
        long myTypeTotal = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("longTotal = " + myTypeTotal);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println("shortTotal = " + shortTotal);
    }
}
