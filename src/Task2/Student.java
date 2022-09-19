package Task2;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private Group group;

    public Student(final String name,final String surname,final Group group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
public String getFullName(){
        return surname + " " + name;
}
    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        final Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getSurname(), student.getSurname()) && Objects.equals(getGroup(), student.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname()/*, getGroup()*/);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", surname=" + surname + "}";
    }
}
