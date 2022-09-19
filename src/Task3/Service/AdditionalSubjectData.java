package Task3.Service;

import Task2.Group;
import Task2.Subject;

import java.time.LocalDate;

public class AdditionalSubjectData {
    public static void addDate(final Group group, final Subject subject, final LocalDate date) {
        for (final Subject s : group.getSubjects()) {
            if (s.equals(subject)) {
                subject.getDate().add(date);
            }
        }
        display(group, subject);
    }

    public static void display(final Group group, final Subject subject) {
        System.out.println(group.getName() + ", " + subject.getName() + subject.getDate());
    }
}