package Task2;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static University createUniversity(){
        final List<Group> groups = new ArrayList<>(List.of(
                new Group("IT-21"), new Group ("IT-22"), new Group ("KN-11")
        ));
        final List<Student> students= new ArrayList<>(List.of(
                new Student("Mykola", "Garda",groups.get(0)),
                new Student("Maksym", "Panas",groups.get(1)),
                new Student("Ivan", "Kobryn",groups.get(2)),
                new Student("Tetyana", "Bezdil",groups.get(0)),
                new Student("Natalia", "Dolishnia",groups.get(2)),
                new Student("Denys", "Novak",groups.get(2)),
                new Student("Mariya", "Maksymets",groups.get(1)),
                new Student("Diana", "Hasyn",groups.get(0))
        ));
        groups.get(0).setStudents(students);
        groups.get(1).setStudents(students);
        groups.get(2).setStudents(students);

        groups.get(0).setSubjects(new ArrayList<>(List.of(
                new Subject("Data Analyse", "Stepan Dumych", new HashMap<>(){{
                    put(groups.get(0).getStudents().get(0), 30);
                    put(groups.get(0).getStudents().get(1), 45);
                    put(groups.get(0).getStudents().get(2), 40);}},
                        new ArrayList<>(List.of(LocalDate.of(2022, 9, 6),
                                LocalDate.of(2022, 9, 9)))),
                new Subject("Collecting data", "Vitalina Baksa", new HashMap<>(){{
                    put(groups.get(0).getStudents().get(0), 78);
                    put(groups.get(0).getStudents().get(1), 61);
                    put(groups.get(0).getStudents().get(2), 57); }},
                        new ArrayList<>(List.of(LocalDate.of(2022, 9, 7),
                                LocalDate.of(2022, 9, 9)))),
                new Subject("Physical Education", "Stepan Festryha", new HashMap<>(){{
                    put(groups.get(0).getStudents().get(0), 88);
                    put(groups.get(0).getStudents().get(1), 67);
                    put(groups.get(0).getStudents().get(2), 91); }},
                        new ArrayList<>(List.of(LocalDate.of(2022, 9, 8),
                                LocalDate.of(2022, 9, 10))))
        )));
        groups.get(1).setSubjects(new ArrayList<>(List.of(
                new Subject("Information systems and technologies", "Orest Kostiv", new HashMap<>(){{
                    put(groups.get(1).getStudents().get(0), 61);
                    put(groups.get(1).getStudents().get(1), 70);}},
                        new ArrayList<>(List.of(LocalDate.of(2022, 9, 6),
                                LocalDate.of(2022, 9, 9)))),
                new Subject("Physics", "Oleksandr Kolomiets", new HashMap<>(){{
                    put(groups.get(1).getStudents().get(0), 65);
                    put(groups.get(1).getStudents().get(1), 56);}},
                        new ArrayList<>(List.of(LocalDate.of(2022, 9, 6),
                                LocalDate.of(2022, 9, 9))))
                )));
        groups.get(2).setSubjects(new ArrayList<>(List.of(
                new Subject("Team Work", "Viktor Hryhorovych", new HashMap<>(){{
                    put(groups.get(2).getStudents().get(0), 88);
                    put(groups.get(2).getStudents().get(1), 91);
                    put(groups.get(2).getStudents().get(2), 100);}},
                        new ArrayList<>(List.of(LocalDate.of(2022, 9, 6),
                                LocalDate.of(2022, 9, 9)))),
                new Subject("Physical Education", "Stepan Festryha", new HashMap<>(){{
                    put(groups.get(2).getStudents().get(0), 65);
                    put(groups.get(2).getStudents().get(1), 56);
                    put(groups.get(2).getStudents().get(2), 87);}},
                        new ArrayList<>(List.of(LocalDate.of(2022, 9, 6),
                                LocalDate.of(2022, 9, 9))))
        )));
        return new University("Lviv Polytechnic National University", groups);
    }
    public static void main(final String[] args) {
        final University university = createUniversity();
        System.out.println(university);
    }
}
