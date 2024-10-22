package org.launchcode;
import java.util.Scanner; //import the scanner class

public class NumericTypes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// scanner for user input
        System.out.println("Enter rectangle length:");//user prompt length
        double length = input.nextDouble();//variable to hold user input
        System.out.println("Enter rectangle width:"); //user prompt width
        double width = input.nextDouble();//variable to hold user input
        double area = length * width;//calculate
        System.out.println("The area of the rectangle is: " + area);//print area
input.close();
    }
}