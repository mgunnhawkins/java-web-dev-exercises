package org.launchcode.java.demos.lsn6inheritance;



public class Main {
    public static void main(String[] args){
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        System.out.println("Melanie");// prints true
    }
}
