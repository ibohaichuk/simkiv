package lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
1) Write class Student that provides information about the name of the student and his course.
2) Class Student should consists of
    a) properties for access to these fields
    b) constructor with parameters
    c) method printStudents (List students, Integer course),
        which receives a list of students and the course number
        and prints to the console the names of the students from the list,
        which are taught in this course (use an iterator)
    d) methods to compare students by name and by course
3) In the main() method
    a) declare List students and add to the list five different students
    b) display the list of students ordered by name
    c) display the list of students ordered by course.
 */

public class App
{
    public static void main( String[] args )
    {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Bob", 1));
        studentList.add(new Student("Pedro", 2));
        studentList.add(new Student("Juanita", 3));
        studentList.add(new Student("Francesca", 2));
        studentList.add(new Student("Mario", 1));

        System.out.println("Enter the number of course, please");
        Student.printStudents(studentList, new Scanner(System.in).nextInt());

        System.out.println("List sorted by course");
        Collections.sort(studentList, Student.studentByCourseComparator);
        Student.printAllStudents(studentList);

        System.out.println("List sorted by name");
        Collections.sort(studentList, Student.studentByNameComparator);
        Student.printAllStudents(studentList);
    }
}
