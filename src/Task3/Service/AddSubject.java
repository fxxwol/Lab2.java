package Task3.Service;

import Task2.Group;
import Task2.Student;
import Task2.Subject;

import java.util.HashMap;
import java.util.Map;

public class AddSubject {
    public static void addSubject(final Subject subjectToAdd, final Group group) throws Exception {
        for (final Subject s : group.getSubjects()) {
            if (!s.equals(subjectToAdd)) {
                group.getSubjects().add(subjectToAdd);
            } else {
                throw new Exception("Subject is already added");
            }
        }
    }

    public static void addSubject(final String subjectToAdd, final Group group) throws Exception {
        for (final Subject s : group.getSubjects()) {
            if (!s.getName().equals(subjectToAdd)) {
                final Map<Student, Integer> map = new HashMap<>();
                for (final Student student : group.getStudents()) {
                    map.put(student, 0);
                }
                final Subject newSubject = new Subject(subjectToAdd, map);
                addSubject(newSubject, group);
            } else {
                throw new Exception("Subject is already added");
            }
        }
    }
}
