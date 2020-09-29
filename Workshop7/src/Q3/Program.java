package Q3;
import java.util.Scanner;

public class Program {
    public static Request getRequest(String[] args) {
        if (args.length == 0) {
            System.out.println("Must pass at least one argument.");
            System.exit(-1);
        } else if (args[0].equalsIgnoreCase("http")) {
            if (args.length < 4) {
                System.out.println("Must pass 3 arguments for HTTP.");
                System.exit(-1);
            } else {
                return new HttpRequest(args[1], args[3], args[2]);
            }
        } else if (args[0].equalsIgnoreCase("ftp")) {
            if (args.length < 3) {
                System.out.println("Must pass 4 arguments for FTP.");
            } else {
                return new FtpRequest(args[1], args[2]);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Request req = getRequest(args);
        System.out.println(req.getFullRequest());
    }
}
