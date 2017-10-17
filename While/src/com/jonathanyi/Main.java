package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while(count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//	        if(count == 5) {
//	            break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                // instead of break it will stop code here then continue the while loop without executing the code on line 41 and 42
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        }
        return false;
    }
}
