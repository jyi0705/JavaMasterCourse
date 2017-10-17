package com.jonathanyi;

// public keyword is an access modifier access others have to the class
// public gives unrestricted access
// private no other classes can access that class
// protected allows classes in the package (com.jonathanyi) to access your class
// can remove access modifier if you prefer

public class Car {
    // member variables or fields aka variables that are only accessible by class
    // when you make a field private it allows for encapsulation to hide field outside from objects definition
    // can be considered the state variables of the car
    private int doors;
    private int wheels;
    // this public variable is available/accessible for the Car class
    // public String model;
    private String model;
    private String engine;
    private String colour;

    // using setters and getters allow encapsulation and allow validation of data before setting it
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        // this checks/validate data before setting it
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
