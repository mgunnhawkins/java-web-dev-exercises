package exercises.controlFlowAndCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {


        int[] array = {1, 1, 2, 3, 5, 8};
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(1);
        newArray.add(2);
        newArray.add(3);
        newArray.add(4);
        newArray.add(5);
        newArray.add(6);
        newArray.add(7);
        newArray.add(8);
        newArray.add(9);
        newArray.add(10);


        for (int i : array) {
            if (i % 2 != 0) {
                //System.out.println(i);
            }
        }


        int sumOfEvenElements = ArrayListPractice.sumEven(newArray);
        //System.out.println(sumOfEvenElements);
        arrayPractice(sentence);
        arrayListPractice(sentence);

    }

    public static void arrayPractice(String sentence) {


        String[] sentenceSplit = sentence.split("\\.");
        String newSplitSentence = Arrays.toString(sentenceSplit);
        //System.out.println("This is the newSplitSentence: " + newSplitSentence);

        String[] splitSentence = sentence.split(" ");
        String goodArray = Arrays.toString(splitSentence);
        //System.out.println("This is the split array with commas:" + goodArray);

    }

     public static void arrayListPractice(String sentence) {

         Scanner input = new Scanner(System.in);
         System.out.println("Type a length: ");
         int lengthChoice = input.nextInt();
         sentence = sentence.replaceAll("[^a-zA-Z0-9]", " ");
         List<String> wordList = Arrays.asList(sentence.split(" "));
         //System.out.println("This is the word list " + wordList);
         for(String word: wordList){
             if(word.length() == lengthChoice){
                 System.out.println(word);
             }

         }

     }
} // end of class










