package Task4;

import Task2.Group;
import Task2.Student;
import Task2.Subject;

import java.util.*;

public class GroupJournal {
    private Group group;
    private Map<Subject, Map<Student, List<Integer>>> marks;

    public GroupJournal(final Group group) {
        this.group = group;
        this.marks = new HashMap<>();
        final List<Student> allStudents = group.getStudents();
        for (final Subject s : group.getSubjects()) {
            final Map<Student, List<Integer>> pairStudentMark = s.getMarks();
            marks.put(s, pairStudentMark);
        }
    }

    public Map<Subject, Map<Student, List<Integer>>> getMarks() {
        return marks;
    }

    public void setMarks(final Map<Subject, Map<Student, List<Integer>>> marks) {
        this.marks = marks;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
    }

    public boolean validateStudent(final Student student) {
        if (group.getStudents().contains(student)) {
            return true;
        } else {
            System.out.println(student.getName() + " isn't in " + group.getName());
            return false;
        }
    }

    public boolean validateSubject(final Subject subject) {
        if (group.getSubjects().contains(subject)) {
            return true;
        } else {
            System.out.println(subject.getName() + " isn't in " + group.getName());
            return false;
        }
    }

    public void changeMark(final Student student, final Subject subject, final Integer oldMark, final Integer newMark) {
        if (validateStudent(student) && validateSubject(subject)) {
            final List<Integer> allMarks = new ArrayList<>(marks.get(subject).get(student));
            allMarks.set(allMarks.indexOf(oldMark), newMark);
            marks.get(subject).put(student, allMarks);
        }
    }

    public void addMark(final Student student, final Subject subject, final List<Integer> newMark) {
        if (validateStudent(student) && validateSubject(subject)) {
            marks.get(subject).put(student, newMark);
        }
    }

    public void deleteMark(final Student student, final Subject subject, final Integer markToDelete) {
        if (validateStudent(student) && validateSubject(subject)) {
            final List<Integer> allMarks = new ArrayList<>(marks.get(subject).get(student));
            allMarks.remove(markToDelete);
            marks.get(subject).put(student, allMarks);
        }
    }

    public List<Integer> getAllMarksBySubject(final Subject subject) {
        final List<Integer> allMarks = new ArrayList<>();
        for (final Map.Entry<Subject, Map<Student, List<Integer>>> entry : marks.entrySet()) {
            if (entry.getKey().equals(subject)) {
                for (final Student st : group.getStudents()) {
                    allMarks.addAll(entry.getValue().get(st));
                }
            }
        }
        return allMarks;
    }

    public List<Integer> getAllMarksByStudent(final Student student) {
        final List<Integer> allMarks = new ArrayList<>();
        for (final Subject s : group.getSubjects()) {
            for (final Map.Entry<Student, List<Integer>> entry : s.getMarks().entrySet()) {
                if (entry.getKey().equals(student)) {
                    allMarks.addAll(entry.getValue());
                }
            }
        }
        return allMarks;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(group.getName()).append(" journal:\n");
        for (final Map.Entry<Subject, Map<Student, List<Integer>>> item : marks.entrySet()) {
            builder.append(item.getKey()).append(":\n ").append(item.getValue()).append('\n');
        }
        return builder.toString();
    }
}
