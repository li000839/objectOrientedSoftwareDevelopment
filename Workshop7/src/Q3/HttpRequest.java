package Q3;

public class HttpRequest extends Request {
    private static final short PORT = 80;
    public final String method;

    public HttpRequest(String address, String file, String method) {
        super(address, file);
        this.method = method;
    }

    public short getPort() {
        return PORT;
    }

    public String getFullRequest() {
        return String.format("%s %s HTTP/1.1\r\n\r\n", method, file);
    }
}
