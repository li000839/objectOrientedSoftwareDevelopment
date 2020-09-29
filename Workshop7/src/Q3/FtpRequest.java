package Q3;

public class FtpRequest extends Request {
    private static final short PORT = 21;

    public FtpRequest(String address, String file) {
        super(address, file);
    }
    public short getPort() {
        return PORT;
    }
    public String getFullRequest() {
        return String.format("RETR %s\u0015\u0012", file);
    }
}
