package org.launchcode.java.demos.lsn4classes2;

//import exercises.classesAndObjects.school.Student;
//import exercises.classesAndObjects.school.Teacher;
import org.launchcode.java.demos.lsn4classes2.Student;
import org.launchcode.java.demos.lsn4classes2.Teacher;
import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents){
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;


    }
    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
        public String toString() {
            String courseInformation = String.format("Course topic: %s\n Instructor: %s\n Students Enrolled: %s",
                    this.getTopic(), this.getInstructor(), this.getEnrolledStudents());
            return courseInformation;
        }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
        public boolean equals(Object toBeCompared){
            if(toBeCompared == this){
                return true;
            }
            if(toBeCompared == null){
                return false;
            }
            if(toBeCompared.getClass() != getClass()){
                return false;
            }
            Course theCourse = (Course)toBeCompared;
            return theCourse.getEnrolledStudents() == getEnrolledStudents();
        }

        public String getTopic(){
            return topic;
        }

        public Teacher getInstructor() {
            return instructor;
        }

        public ArrayList<Student> getEnrolledStudents() {
            return enrolledStudents;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public void setInstructor(Teacher instructor) {
            this.instructor = instructor;
        }

        public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
            this.enrolledStudents = enrolledStudents;
        }
}
