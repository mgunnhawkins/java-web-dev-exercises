package org.launchcode.java.demos.lsn6inheritance.main;

public class CatOwner extends PetOwner {
    private Cat pet;//declare pet of type Feedable

    public CatOwner(Feedable pet) {
        super(pet);
    }
    //    public CatOwner(Feedable pet) {//only behavior of pet that we will need within this class is the abilitty to eat
//        this.pet = pet;
//    }

    public void feedThePet() {  //uses field pet which is of type class Cat
        //can use instances of HouseCat and Tiger because these are child classes of type Cat
        //code to prepare the cat's meal

        pet.eat();
    }
}
