package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of your circle: ");
        double radius = input.nextDouble();
        double circleArea = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " +
                radius + " is: " + circleArea);
        input.close();

    }
}
