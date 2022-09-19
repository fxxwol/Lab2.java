package Task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Subject {
    private String name;
    private String teacherName;
    private Map<Student, List<Integer>> marks;
    private List<LocalDate> dates;

    public Subject(final String name, final String teacherName, final Map<Student, List<Integer>> marks,
                   final List<LocalDate> dates) {
        this.name = name;
        this.teacherName = teacherName;
        this.marks = marks;
        this.dates = dates;
    }
    public Subject(final String name, final Map<Student, List<Integer>> marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(final String teacherName) {
        this.teacherName = teacherName;
    }

    public Map<Student, List<Integer>> getMarks() {
        return marks;
    }

    public void setMarks(final Map<Student, List<Integer>> marks) {
        this.marks = marks;
    }

    public List<LocalDate> getDate() {
        return dates;
    }

    public void setDate(final List<LocalDate> date) {
        this.dates = date;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;
        final Subject subject = (Subject) o;
        return Objects.equals(getName(), subject.getName()) && Objects.equals(getTeacherName(), subject.getTeacherName()) && Objects.equals(getMarks(), subject.getMarks()) && Objects.equals(getDate(), subject.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTeacherName(), getMarks(), getDate());
    }

    @Override
    public String toString() {
        return name;
    }
}
