/* 
 * Copyright 2015 Mark Russell <mark.russell@lambtoncollege.ca>. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */
package cpd3314.assign5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author <ENTER YOUR NAME HERE>
 */
public class CPD3314Assign5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        System.out.println("enter the number of exercise you want to run:");
        System.out.println("1. Retail value calculator:\n"
                + "2.Celsius Temperature Table\n"
                + "3.Distance travelled by a vehicle\n"
                + "4.prime number\n"
                + "5.even number ");
        ch = in.nextInt();
        switch (ch) {
            case 1:
                doExercise2();

                break;
            case 2:
                doExercise6();
                break;
            case 3:
                doExercise9();
            case 4:
                doExercise13();
            case 5:
                doExercise15();

        }

        // TODO: This is a sandbox. 
        /* Modify it and use it to call whatever methods below you want to run.
         * 
         * To be clear: Your task is to create methods. All of the automated
         * tests in CPD3314Assign5Test.java are based on the methods described
         * below. So for example, in Ex#2, you must build the calculateRetail
         * method. The automated tests will tell you if you built it correctly.
         *
         */
    }

    /*
     * Exercise #2 - Retail Price Calculator
     * 
     * Write a program that asks the user to enter an item's wholesale cost and 
     * its markup percentage. It should then display the item's retail price. 
     * For example:
     *   - If an item's wholesale cost is 5.00 and its markup percentage is 100 
     *       percent, then the item's retail price is 10.00.
     *   - If an item's wholesale cost is 5.00 and its markup percentage is 50 
     *       percent, then the item's retail price is 7.50.
     * The program should reference a method named calculateRetail that receives 
     * the wholesale cost and the markup percentage as arguments, and returns 
     * the retail price of the item.
     * - Gaddis pg. 316
     */
    // TODO: Build the calculateRetail method here
    public static void doExercise2() {
        Scanner in = new Scanner(System.in);
        double wholesalecost;
        double markup;
        System.out.println("enter the wholesale cost of the item:");
        wholesalecost = in.nextDouble();
        System.out.println("enter the mark up value of the item:");
        markup = in.nextDouble();

        double r = calculateRetail(wholesalecost, markup);
        System.out.println("the retail price of the item is:" + r);
        // TODO: Complete the rest of Exercise #2 here to test calculateRetail

    }

    public static double calculateRetail(double w, double m) {
        double retail;
        retail = w + (w * m) / 100;
        return retail;
    }

    /**
     * Exercise #6 - Celsius Temperature Table
     *
     * The formula for converting a temperature from Fahrenheit to Celsius is C
     * = (5.0/9.0) * (F - 32) Where F is the Fahrenheit temperature and C is the
     * Celsius temperature. Write a method named celsius that accepts a
     * Fahrenheit temperature as an argument. The method should return the
     * temperature, converted to Celsius. Demonstrate the method by calling it
     * in a loop that displays a table of the Fahrenheit temperatures 0 through
     * 20 and their Celsius equivalents.
     */
    // TODO: Build the celsius method here
    public static void doExercise6() {
        double f;
        int i;
        Scanner ch = new Scanner(System.in);
        // System.out.println("enter the temprature in fahrenheit:");
        //f=ch.nextDouble();
        System.out.println("the conversion is:");
        System.out.println("Fahrenheit          Celsius");
        System.out.println("--------------------------");
        DecimalFormat format = new DecimalFormat("#.00");

        for (i = 0; i <= 20; i++) {
            double temp = celsius(i);
            System.out.println(+i + "           " + format.format(temp));
        }

        // TODO: Complete the rest of Exercise #6 here to test celsius
    }

    public static double celsius(double ft) {
        double ct;
        ct = (5.0 / 9.0) * (ft - 32);
        return ct;
    }

    /*
     * Exercise #9 - Distance Traveled Modification
     * 
     * The distance a vehicle travels can be calculated as follows:
     *   Distance = Speed * Time
     * Write a method named distance that accepts a vehicle's speed and time as 
     * arguments, and returns the distance the vehicle has traveled. Modify the 
     * "Distance Traveled" program you wrote in Assignment #4 to use this 
     * method.
     * - Gaddis pg. 319
     */
    // TODO: Build the distance method here
    public static void doExercise9() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the speed of the vehicle in mph");
        double speed = in.nextInt();
        System.out.println("enter the hours it travelled");
        double hours = in.nextInt();
        System.out.println("hours             Distance travelled");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= hours; i++) {
            if (hours > 1 && speed > 0) {
                double result = distance(speed, i);
                System.out.println(+i + "                " + result);
            } else {
                System.out.println("enter valid value");
            }
        }
        // TODO: Build the rest of exercise #9 here to test the distance method

    }

    public static double distance(double s, double h) {

        double dis = s * h;

        return dis;
    }

    /*
     * Exercise #13 - isPrime Method
     * 
     * A prime number is a number that is evenly divisible only by itself and 1. 
     * For example, the number 5 is prime because it can be evenly divided only 
     * by 1 and 5. The number 6, however, is not prime because it can be divided 
     * evenly by 1, 2, 3, and 6.
     * Write a method named isPrime, which takes an integer as an argument and 
     * returns true if the argument is a prime number, or false otherwise.
     * - Gaddis pg. 320
     */
    // TODO: Build the isPrime method here
    public static void doExercise13() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any intiger:");
        int p = in.nextInt();
        boolean check = isPrime(p);
        if (check) {
            System.out.println("the number " + p + " is prime");
        } else {
            System.out.println("the number " + p + " is not prime");
        }
        // TODO: Build a sample program to test the isPrime method here

    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                return false;

            }
        }

        return true;

    }

    /*
     * Exercise #15 - Even/Odd Counter
     * 
     * You can use the following logic to determine if a number is even or odd:
     *   if ((number % 2) == 0) {
     *     // The number is even
     *   }
     *   else {
     *     // The number is odd
     *   }
     * Write a program method named isEven that accepts an int argument. The 
     * method should return true if the argument is even, or false otherwise.
     */
    // TODO: Build the isEven method here
    public static void doExercise15() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        boolean check = isEven(num);
        if (check) {
            System.out.println("the number " + num + " is even");
        } else {
            System.out.println("the number " + num + " is not even");
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

        // TODO: Build a sample program to test the isEven method here
}
