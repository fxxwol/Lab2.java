package Task3.Service;

import Task2.Group;
import Task2.Student;

import java.util.Comparator;
import java.util.List;

public class SortStudent {
    public static List<Student> sortStudent(final Group group){
        final List <Student> students = group.getStudents();
        students.sort(Comparator.comparing(Student::getFullName));
        return students;
    }
}
