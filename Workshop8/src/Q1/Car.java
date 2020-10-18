package Q1;

import java.io.BufferedWriter;
import java.io.IOException;

public class Car implements FileWriteable {
    public final String model;
    public final String colour;

    public Car(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    @Override
    public void writeToFile(BufferedWriter writer) throws IOException {
        String result = String.format("%s, %s", model, colour);
        writer.write(result, 0, result.length());
        writer.newLine();
    }
}
