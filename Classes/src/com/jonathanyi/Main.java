package com.jonathanyi;

// think of a class as a template/blueprint for creating objects
// can think of it as a user defined type
// class name should start with an upper case letter
public class Main {

    public static void main(String[] args) {
        // this car can be considered a data type which is a class/object which is available
        // publicly in this package
        // this is how you define an object of type Car and initializing it using new keyword
        Car porsche = new Car();
        Car holden = new Car();
        // the setModel method allows access to the private field model available to Car class and sets the variable
        porsche.setModel("Carrera");
        // will print out the private Carrera by using the getModel method of Car class
        System.out.println("Model is " + porsche.getModel());
    }
}
