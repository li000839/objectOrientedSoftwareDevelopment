import java.util.ArrayList;

public class Subject {
    private String name;
    private final ArrayList<Student> students = new ArrayList<>();

    public void enrol(Student student) {
        students.add(student);
    }
}
