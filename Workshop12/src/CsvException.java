import java.lang.Exception;

public class CsvException extends Exception {
    public CsvException(String fileName) {
        super(fileName + " is not valid.");
    }

}
