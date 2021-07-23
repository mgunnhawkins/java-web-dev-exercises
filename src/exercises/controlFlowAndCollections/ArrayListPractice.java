package exercises.controlFlowAndCollections;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> array){
        int total = 0;
        for(int integer: array){
            if(integer %2 ==0){
                total += integer;
            }
        }
        return total;
    }


}



    //Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.