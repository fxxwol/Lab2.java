package Task3.Service;

import Task2.Group;
import Task2.Subject;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public class AdditionalSubjectData {
    public static void addDate(final Group group, final Subject subject, final LocalDate date) {
        for (final Subject s : group.getSubjects()) {
            if (s.equals(subject)) {
                subject.getDate().add(date);
            }
        }
        display(group, subject.getName());
    }

    public static void addDate(final Group group, final String subjectName, final String date) {
        final Subject subjectByName = getSubjectByName(group, subjectName);
        subjectByName.getDate().add(LocalDate.parse(date));
        display(group, subjectName);
    }

    public static Subject getSubjectByName(final Group group, final String subjectName) {
        for (final Subject s : group.getSubjects()) {
            if (s.getName().equals(subjectName)) {
                return s;
            }
        }
        throw new InvalidParameterException("No such name subject or " + subjectName + " isn't added to schedule of " + group.getName());
    }

    public static void display(final Group group, final String subjectName) {
        System.out.println(group.getName() + ", " + subjectName + getSubjectByName(group, subjectName).getDate());

    }
}
