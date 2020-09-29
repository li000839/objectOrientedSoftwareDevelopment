package Q2;

public abstract class Shape {
    public final double x;
    public final double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        return "Plain Shape";
    }
}