package exercises.dataTypes;
import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons have you consumed?");
        Double gallonsUsed = input.nextDouble();

        Double mpg = milesDriven / gallonsUsed;
        System.out.println("Your car has approximately " + mpg + " mpg.");




        }

}

