import java.util.*;

public class Student extends Person{
    private int number;
    private final ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    public void enrol(Subject subject) {
        subjects.add(subject);
    }
}
