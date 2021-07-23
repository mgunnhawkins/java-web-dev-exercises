package exercises.controlFlowAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent = "";

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("ID: ");
            int newId = input.nextInt();

            if (newId != -1) {
                System.out.print("Student Name: ");
                newStudent = input.next();
                students.put(newId, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
//        System.out.println("\nClass roster:");
//
//        for (String student: students.values()) {
//            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//        }
//
//        System.out.println();


    }
}