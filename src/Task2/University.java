package Task2;

import java.util.List;
import java.util.Objects;

public class University {
    private  String name;
    private List<Group> groups;

    public University(final String name, final List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(final List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        final University that = (University) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getGroups(), that.getGroups());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGroups());
    }

    @Override
    public String toString() {
        return "\nUniversity{" +
                "name=" + name + ",\n\n" +
                "groups=" + groups +
                '}';
    }
}
