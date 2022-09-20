package Task3.Service;

import Task2.Group;
import Task2.Student;
import Task2.Subject;

import java.util.List;

public class AddSubject {
    public static void addSubject(final Subject subjectToAdd, final Group group) throws Exception {
        for (final Subject s : group.getSubjects()) {
            if (!s.equals(subjectToAdd)) {
                group.getSubjects().add(subjectToAdd);
                for (final Student st: group.getStudents()) {
                    subjectToAdd.getMarks().put(st, List.of(0));
                }
            } else {
                throw new Exception("Subject is already added");
            }
        }
    }
}
