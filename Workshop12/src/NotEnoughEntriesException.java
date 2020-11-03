import java.lang.Exception;

public class NotEnoughEntriesException extends Exception  {
    public NotEnoughEntriesException(String fileName) {
        super(fileName + "contains a row which has fewer entries than header row)");
    }
}