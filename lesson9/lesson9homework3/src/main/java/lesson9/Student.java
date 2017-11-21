package lesson9;

import java.util.Comparator;
import java.util.List;

public class Student{
    String name;
    Integer course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return name + ", course: " + course;
    }

    public static void printStudents(List<Student> students, Integer course) {
        for (Student student : students) {
            if (course.equals(student.getCourse())) {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }

    public static void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    public static Comparator<Student> studentByNameComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Student> studentByCourseComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            return o1.getCourse().compareTo(o2.getCourse());
        }
    };
}
