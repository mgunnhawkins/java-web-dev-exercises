package org.launchcode.java.demos.lsn6inheritance.main;

public abstract class Cat implements Feedable{

    private boolean tired = false;
    private boolean hungry = false;
    private double weight;

    // The biological family for all cat species
    private String family = "Felidae";
    public Cat (double aWeight) {
        weight = aWeight;
    }

    public Cat () {  //additional constructor
        weight = 13;
    }

    /**** Getters and Setters ****/

    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean aTired) {
        tired = aTired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean aHungry) {
        hungry = aHungry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double aWeight) {
        weight = aWeight;
    }

    public String getFamily() {
        return family;
    }//allows family to be read by getter.  no setter because family of a cat should not change

    /**** Instance Methods ****/

    // A cat is rested and hungry after it sleeps
    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    @Override
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }

    public abstract String noise (); //forces subclasses to provide their own version of noise();



}
