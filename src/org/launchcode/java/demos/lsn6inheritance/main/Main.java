package org.launchcode.java.demos.lsn6inheritance.main;



public class Main {
    public static void main(String[] args){
        HouseCat garfield = new HouseCat("Garfield");
        garfield.eat();
        System.out.println(garfield.isTired());

        System.out.println("Melanie");// prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        //Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        //System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

        HouseCat suki = new HouseCat("Suki", 12);
        CatOwner Annie = new CatOwner (suki);

        Annie.feedThePet();
    }
}
