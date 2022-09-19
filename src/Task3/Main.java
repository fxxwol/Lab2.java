package Task3;

import Task2.Student;
import Task2.University;
import Task3.Service.AddSubject;
import Task3.Service.AdditionalSubjectData;
import Task3.Service.SortStudent;
import Task3.Service.SubjectAttendance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final University university = Task2.Main.createUniversity();

        try {
            AddSubject.addSubject( university.getGroups().get(2).getSubjects().get(0), university.getGroups().get(0));
        } catch (final Exception e) {
            System.out.println(e);
        }
        System.out.printf("List of subjects after adding 'Team work' to group IT-21:\n");
        System.out.println(university.getGroups().get(0).getSubjects());

        AdditionalSubjectData.addDate(university.getGroups().get(1), university.getGroups().get(1).getSubjects().get(0), LocalDate.of(2022, 9, 25));

        final List<Student> unSortedStudents = new ArrayList<>(university.getGroups().get(2).getStudents());
        final List<Student> sortedStudents = SortStudent.sortStudent(university.getGroups().get(2));
        System.out.println("\n Sort students of " + university.getGroups().get(2).getName() + " alphabetically");
        System.out.println(unSortedStudents);
        System.out.printf("After sorting:\n");
        System.out.println(sortedStudents);

        System.out.println("\n Attendance of Data Analyse");
        try {
            System.out.println(SubjectAttendance.subjectAttendance("Data Analyse", university.getGroups().get(0)));
        } catch (final Exception e) {
            System.out.println(e);
        }

    }
}
