package com.jonathanyi;

public class Main {
    //methods can be also referred to as a function
    public static void main(String[] args) {

	    int highScore = calculateScore1(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        calculateScore(true, 10000, 8, 200);

    }

    // need public static void for method void tells you that you arent returning anything
    // void method can be referred to as a procedure
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }

    }
    // this will return data type int instead of void
    public static int calculateScore1(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }
}
