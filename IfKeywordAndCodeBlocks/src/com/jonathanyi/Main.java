package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 5000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    // can take out the {} if there is only 1 line that you need to execute for if statement
        // only execute the 1 line below
	    if(score == 5000)
            System.out.println("Your score was 5000");


	    if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if(score < 1000) {
            System.out.println("Your score less than 1000");
        } else {
            System.out.println("Got here");
        }


    }
}
