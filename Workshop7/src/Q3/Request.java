package Q3;

public abstract class Request {
    public final String address;
    public final String file;

    public Request(String address, String file) {
        this.address = address;
        this.file = file;
    }

    public abstract short getPort();
    public String getAddress() {
        return address;
    }

    public abstract String getFullRequest();

}
