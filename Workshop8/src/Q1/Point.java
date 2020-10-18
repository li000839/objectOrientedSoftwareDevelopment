package Q1;

import java.io.BufferedWriter;
import java.io.IOException;

public class Point implements FileWriteable {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void writeToFile(BufferedWriter writer) throws IOException{
        String result = String.format("%f, %f", x, y);
        writer.write(result, 0, result.length());
        writer.newLine();
    }
}
