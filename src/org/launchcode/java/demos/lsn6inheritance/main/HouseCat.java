package org.launchcode.java.demos.lsn6inheritance.main;



public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        if (isSatisfied()){
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise(); //This calls the overridden method in the base class via super.noise(), carrying out the original behavior if the given conditional branch is reached
        }

    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
