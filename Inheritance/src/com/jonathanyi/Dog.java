package com.jonathanyi;

public class Dog extends Animal {
    // these are fields that are specific to Dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // needs a constructor and inherit animal class using the keyword super
    // inherits all fields of Animal and all methods of Animals
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    public void walk() {
        System.out.println("Dog.walk() called");
        // can called the Animal move method using either move() or super.move()
        // it is recommended to use move() instead of super.move() just in case the
        // method gets overwritten in the dog class.
        move(5);
        //super.move();
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
}
