package Task3.Service;

import Task2.Group;
import Task2.Student;
import Task2.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectAttendance {
    public static List<Student> subjectAttendance(final String subjectName, final Group group) throws Exception {
        final List<Student> students = new ArrayList<>();
        for (final Subject s : group.getSubjects()) {
            if (s.getName().equals(subjectName)) {
                students.addAll(s.getMarks().keySet());
                return students;
            } else {
                throw new Exception("This subject doesn't exist");
            }
        }
        return students;
    }
}
