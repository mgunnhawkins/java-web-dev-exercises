package org.launchcode.java.studios.areaofacircle;
import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       System.out.println("Enter a radius: ");
       String radius = input.nextLine();
       if (radius.equals("")){
           System.out.println("You did not enter in a quantity.");
       }


       double convertedRadius = Double.parseDouble(radius);
       if (convertedRadius < 0) {
           System.out.println("Please enter a positive number");
       } else {
           double area = Circle.getArea(convertedRadius);
           System.out.println("The area of a circle with radius " + radius + " is: " + area);
       }

       }





    }





