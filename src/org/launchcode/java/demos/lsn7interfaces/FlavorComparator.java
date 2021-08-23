package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {//compares 2 flavor objects and always returns 0
        return flavor1.getName().compareTo(flavor2.getName());
    }

}
