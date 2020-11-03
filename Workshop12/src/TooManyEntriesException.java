import java.lang.Exception;

public class TooManyEntriesException extends Exception  {
    public TooManyEntriesException(String fileName) {
        super(fileName + "has too many entries than header row)");
    }
}
