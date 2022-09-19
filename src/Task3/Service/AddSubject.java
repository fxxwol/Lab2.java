package Task3.Service;

import Task2.Group;
import Task2.Subject;

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
}
