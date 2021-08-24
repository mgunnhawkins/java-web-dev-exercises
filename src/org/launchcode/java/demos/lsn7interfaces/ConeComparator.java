package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone>{
    @Override
    public int compare(Cone cone1, Cone cone2) {//example...comparing people by height
        if(cone1.getCost() - (cone2.getCost()) < 0){
            return -1;
        } else if (cone1.getCost() - (cone2.getCost()) > 0){
            return 1;
        } else {
            return 0;
        }


    }
}
