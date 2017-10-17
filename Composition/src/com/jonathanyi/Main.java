package com.jonathanyi;

public class Main {
    // look at using composition over inheritance has added advantages and more flexibility
    // composition is based on has a relationship
    // has its advantage over extends because extends you can only inherit one class at a time
    // composition is essentially creating objects within objects
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    // instead of making assigning a new Resolution to a variable you can directly create the instance inside the
        // constructor of monitor.
	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

	    // this is composition and how you use it to call methods of classes that are part of the PC
        // PC has a case, has a motherboard, and has a monitor
	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
	    // how to access the drawPixelAt method of the class Monitor
//	    thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//	    thePC.getMotherboard().loadProgram("Windows 1.0");
//	    thePC.getTheCase().pressPowerButton();
        thePC.powerUp();


        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tim", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();


    }
}
