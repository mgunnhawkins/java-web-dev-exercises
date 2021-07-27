package exercises.classesAndObjects.school;

public class Teacher {
    //fields
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    //constructor- allows me to create a teacher if I want to.  Standard practice should be to create a constructor.
    public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching =  yearsTeaching;
    }
//setters help change variables within private field variables
    public void setFirstName(String aFirstName){
       firstName = aFirstName;
    }

    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    public void setSubject(String aSubject) {
        subject = aSubject;
    }

    public void setYearsTeaching(int aYearsTeaching){
        yearsTeaching = aYearsTeaching;
    }

    //the getters are going to return the field variables.  Pull what has been established.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }

}
