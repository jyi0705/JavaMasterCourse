package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
        // usually use doubles for calculations
	    // float is single precision and double is double precision
        // doubles has twice as much details as floats
        // put and f after floats and d after for double
        // java automatically assumes numbers with a decimal is a double
        // width of int is 32 (4bytes) floats is 32 (4bytes) and double is 64 (8bytes)
        int myIntValue = 5 / 2; // returns 2 doesn't account for remainder
        float myFloatValue = 5f; // stores as 5.0
        double myDoubleValue = 5d; // stores at 5.0

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        int myIntValue1 = 5 / 3; // outputs 1
        float myFloatValue1 = 5f / 3f; // outputs 1.6666666
        // doubles is faster on modern computers, java built in functions uses double, doubles are far more precise
        double myDoubleValue1 = 5d / 3d; // outputs 1.6666666666666667

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms); // 90.7185
        // 90.7185
        // can use underscore with float/double literals as well
        double pi = 3.141_592_7d;
        double pi2 = 3_000_000.1415927d;
    }
}
