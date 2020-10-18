package Q1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Database {
    private final FileWriteable[] data = new FileWriteable[100];

    public void add(FileWriteable row) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = row;
                break;
            }
        }
    }

    public void remove(FileWriteable row) {
        for (int i = 0; i < data.length; i++) {
            if (row.equals(data[i])) {
                data[i] = null;
                break;
            }
        }
    }


    public void writeAll(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (FileWriteable row : data) {
                if (row != null) {
                    row.writeToFile(writer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        Database db = new Database();
        db.add(new Student ("Alice", 766050));
        db.add(new Point (4.2, 6.9));
        db.add(new Car("Corolla", "white"));
        db.writeAll("sample.txt");
    }

}
