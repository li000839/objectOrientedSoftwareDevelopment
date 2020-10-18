package Q4;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private void CheckPoint() {
        System.out.format("x is %f", x);
        System.out.format("y is %f", y);
    }
}
