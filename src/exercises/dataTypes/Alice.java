package exercises.dataTypes;
import java.util.Locale;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lowerCaseSentence = sentence.toLowerCase();
        System.out.println("Here is the first sentence of 'Alice in Wonderland' : " + sentence);
        System.out.println("Type a word here and it will search for it in the Alice sentence:  " );
        String wordSearched = input.next().toLowerCase();


        //have questions about index. I am not getting a proper index if use alice.
        Integer index = lowerCaseSentence.indexOf(wordSearched);
        System.out.println("The index is " + index);

        Integer length = wordSearched.length();
        System.out.println("The length is " + length);

        String changedSentence = sentence.replace(wordSearched, "");
        System.out.println(changedSentence);








    }
}
