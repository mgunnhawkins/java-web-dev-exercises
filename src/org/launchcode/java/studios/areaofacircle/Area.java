package org.launchcode.java.studios.areaofacircle;
import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input;
        Double circle;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        //need help with connecting get Area to area
        circle = getArea();
        System.out.println(circle);
    }


}
