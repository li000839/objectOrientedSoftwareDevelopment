package Q2;

public class Javamon implements Comparable <Javamon> {
    public final int javadexNum;
    public final String name;

    public Javamon(int javadexNum, String name) {
        this.javadexNum = javadexNum;
        this.name = name;
    }

    public int compareTo(Javamon other) {
        int result = this.javadexNum - other.javadexNum;
        if (result != 0) {
            return result;
        }
        return this.name.compareTo(other.name);
    }
}
