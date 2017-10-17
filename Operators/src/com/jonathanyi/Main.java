package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
        // operators are =, +, %, == , !=, >, >=, <, <=, &&, ||
        int result = 1 + 2;
        System.out.printf("1+2 =" + result); // 3

        int previousResult = result;

        result = result - 1;
        System.out.println("result = " + result); // 2

        previousResult = result;
        result = result * 10;
        System.out.println("previousResult" + " * 10 = " + result); // 20

        previousResult = result;
        result = result / 5;
        System.out.println("previousResult" + " * 10 = " + result); // 4

        previousResult = result;
        result = result % 3; // 4 % 3
        System.out.println("previousResult" + " * 10 = " + result); // 1

        result++; // 2
        result--; // 1
        result += 2; // 3
        result *= 10; // 30
        result -= 10; // 20
        result /= 10; // 2

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!"); // will not print

        int topScore = 101;
        if (topScore != 100)
            System.out.println("You got the high score"); // will print

        boolean isCar = false;
        // this will print out because in the if statement since there is only 1 equal sign it assigns the isCar to
        // equal true and then if(true) will print out the statement
        if(isCar = true)
            System.out.println("This is not suppose to happen");
        // make sure to use two == so it doesnt assign it to true
        // can also do if(isCar)

        // if isCar is true it will return true and assign that to wascar
        boolean wasCar = isCar ? true : false;

        // bit wise AND uses single & and bit wise OR uses single |

    }
}
