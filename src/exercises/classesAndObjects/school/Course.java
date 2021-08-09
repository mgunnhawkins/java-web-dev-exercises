package exercises.classesAndObjects.school;

import java.util.HashMap;
import java.util.ArrayList;


public class Course {

    private String courseName;
    private String courseDescription;
    private String teacher;
    private ArrayList<Student> studentRoster = new ArrayList<Student>();
    //roster with one piece of info can be an array list.  If wanting more than one piece of info then it can be a
    // hashmap.

    //if Array list holds class Student then all info for student will come with it(name, id, gpa,etc...)
    //don't worry about populating now.
    public Course(String courseName,
                  String courseDescription,
                  String teacher){
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.teacher = teacher;

    }

    protected void setCourseName(String aCourseName){ courseName = aCourseName;}

    protected void setCourseDescription(String aCourseDescription) {courseDescription = aCourseDescription;}

    protected void setTeacher(String aTeacher) { teacher = aTeacher;}

    protected String getCourseName() { return courseName; }

    protected String getCourseDescription() { return courseDescription; }

    protected String getTeacher() { return teacher; }
}
