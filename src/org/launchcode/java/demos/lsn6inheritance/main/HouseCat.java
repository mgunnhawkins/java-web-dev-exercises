package org.launchcode.java.demos.lsn6inheritance.main;



public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String name, double aWeight) {
        super(aWeight);
        this.name = name;
    }
    public HouseCat(String aName) { //super keyword allows subclsss to access constructor from base
        // class.  Call to base class must be the firist line of the subclass constructor.
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

//    @Override
//    public String noise() {
//        if (isSatisfied()){
//            return "Hello, my name is " + name + "!"; }
////        else {
////            return super.noise(); //This calls the overridden method in the base class via super.noise(), carrying out the original behavior if the given conditional branch is reached
//            //method signatures must be exactly tthe same(method name, access level, return type, type and number of
//            // paramaters)




    public String purr() {
        return "I'm a HouseCat";
    }

    @Override
    public String noise() {
        return "Meowwww!";
    }
}
