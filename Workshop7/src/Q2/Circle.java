package Q2;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("The circle in (%f, %f) has radius = %f" +
                "Area = %f and Perimeter = %f", x, y, radius,
                getArea(), getPerimeter());
    }
}
