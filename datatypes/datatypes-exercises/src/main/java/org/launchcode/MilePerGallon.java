package org.launchcode;

import java.util.Scanner;

public class MilePerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// scanner for user input
        System.out.println("Enter miles driven:");//user prompt length
        double miles = input.nextDouble();//variable to hold user input
        System.out.println("Enter gas consumed in gallons:"); //user prompt width
        double gallons = input.nextDouble();//variable to hold user input
        double milesPerGallon = miles/gallons ;//calculate
        System.out.println("Your miles-per-gallon is: " + milesPerGallon);//print
        input.close();
    }
}
