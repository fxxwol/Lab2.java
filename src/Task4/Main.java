package Task4;

import Task2.University;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final University university = Task2.Main.createUniversity();
        final GroupJournal journal = new GroupJournal(university.getGroups().get(0));


        System.out.println(journal);

        journal.addMark(university.getGroups().get(0).getStudents().get(0),
                university.getGroups().get(0).getSubjects().get(0),
                new ArrayList<>(List.of(88, 91)));

        journal.changeMark(university.getGroups().get(0).getStudents().get(0),
                university.getGroups().get(0).getSubjects().get(1),78, 50);

        journal.deleteMark(university.getGroups().get(0).getStudents().get(0),
                university.getGroups().get(0).getSubjects().get(2), 88);

        System.out.println(journal);
        System.out.println(university.getGroups().get(0).getSubjects().get(1).getName() + " marks: " +
                journal.getAllMarksBySubject(university.getGroups().get(0).getSubjects().get(1)));
        System.out.println(university.getGroups().get(0).getStudents().get(2).getFullName() + " marks: " +
                journal.getAllMarksByStudent(university.getGroups().get(0).getStudents().get(2)));
    }
}
