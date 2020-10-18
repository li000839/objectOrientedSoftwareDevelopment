package Q1;

import java.io.BufferedWriter;
import java.io.IOException;

public class Student implements FileWriteable {
    public final String name;
    public final int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void writeToFile(BufferedWriter writer) throws IOException {
        String result = String.format("%s, %d", name ,id);
        writer.write(result, 0, result.length());
        writer.newLine();
    }
}
