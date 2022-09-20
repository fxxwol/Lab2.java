package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private List<Student> students;
    private List<Subject> subjects;

    public Group(final  String name, final List<Student> givenStudents) {
        this.name = name;
        final List<Student> newList = new ArrayList<>();
        for (final Student s: givenStudents) {
            if (s.getGroup().equals(this)) {
                newList.add(s);
            }
        }
        students = newList;
    }
    public Group(final  String name) {
        this.name = name;
    }
    public Group(final List<Student> givenStudents) {
        final List<Student> newList = new ArrayList<>();
        for (final Student s: givenStudents) {
            if (s.getGroup().equals(this)) {
                newList.add(s);
            }
        }
        students = newList;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> givenStudents) {
        final List<Student> newList = new ArrayList<>();
        for (final Student s: givenStudents) {
            if (s.getGroup().equals(this)) {
                newList.add(s);
            }
        }
        students = newList;
    }
    public int getStudentsNumber(){
        return students.size();
    }
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        final Group group = (Group) o;
        return Objects.equals(getName(), group.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudents(), getStudentsNumber(), getSubjects());
    }

    @Override
    public String toString() {
        return "Group{" +
                "name=" + name +
                ", \nstudents=" + students +
                ", \nsubjects=" + subjects +
                "}" + "\n";
    }
}
