import java.io.*;
import java.util.*;

public class ReadCsv {
    private String fileName;

    public List<List<String>> ReadCsv(String fileName)
            throws IOException, CsvException {
        this.fileName = fileName;
        int row;
        int col;

        List<List<String>> data = new ArrayList<>();
        try(BufferedReader br =
                    new BufferedReader(new FileReader(fileName))){
            // read header
            String text;
            text = br.readLine();
            String[] header = text.split(",");
            row = header.length;
            // read others
            while((text = br.readLine()) != null ) {
                String[] columns = text.split(",");
                col = columns.length;
            }
            return fileName[row][col];
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (){
            throw new NotEnoughEntriesException();
        }
        if () {
            throw new TooManyEntriesException();
        }
        if () {
            throw new UnmatchedQuoteException();
        }

    }
}
