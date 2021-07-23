package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a sentence: ");
        String sentence = input.nextLine().toLowerCase();
        String noCharacterSentence = remove(sentence);
        char[] charactersInSentence = noCharacterSentence.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char letter : charactersInSentence){
            if(charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter)+ 1);
            } else {
                charCount.put(letter,1);
            }
        }



        for(Map.Entry<Character,Integer> printChar : charCount.entrySet()){
            System.out.println(printChar.getKey()+ ":" + printChar.getValue());
        }

        System.out.println(noCharacterSentence);

    }

    public static String remove(String sentence){
        sentence = sentence.replaceAll( "[^a-zA-Z0-9]", "");
        return sentence;
    }



}
