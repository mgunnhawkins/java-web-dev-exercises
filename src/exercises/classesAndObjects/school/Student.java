package exercises.classesAndObjects.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {
//fields
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

//constructor
    //could put "Melanie" as name in constructor if there is only one student.
    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits= numberOfCredits;
        this.gpa = gpa;
    }

    //set - updating a value...moving value in place
    public void setName(String aName){
       name = aName;
    }
    public String getName(){
        return name;
    }

    public void setStudentId(int aStudentId){
     studentId = aStudentId;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public void setGpa(double aGpa){
        gpa = aGpa;
    }


//calculated values are typically good for getters but not setters
    public double getGpa(){
        return gpa;
    }



}