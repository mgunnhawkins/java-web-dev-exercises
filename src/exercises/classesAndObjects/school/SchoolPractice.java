package exercises.classesAndObjects.school;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Melanie", 555555, 1, 4.0);
        System.out.println(newStudent);

        Teacher newTeacher = new Teacher("Noah", "Hollenkamp", "Math", 12);
        System.out.println(newTeacher);

        Course newCourse = new Course("Intro to WebDev", "This is an intro course.", "Noah Hollenkamp");
        System.out.println(newCourse);
    }
}
