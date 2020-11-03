public class IOException  extends Exception{
    public  NotEnoughEntriesException(String fileName) {
        super(fileName + "contains a row which has fewer entries than header row)");
    }
}
