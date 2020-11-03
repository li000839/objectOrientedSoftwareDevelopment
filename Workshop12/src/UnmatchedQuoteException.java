public class UnmatchedQuoteException extends Exception {
    public UnmatchedQuoteException(String fileName) {
        super(fileName + "has unmatched quotation marks)");
    }
}
