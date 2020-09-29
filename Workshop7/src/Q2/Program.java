package Q2;

public class Program {
    // create one shape
    private static Shape randomShape() {
        double x = Math.random() * 5;
        double y = Math.random() * 5;
        if (Math.random() < 0.5) {
            double width = Math.random() * 5;
            double height = Math.random() * 5;
            return new Rectangle(x, y, width, height);
        } else {
            double radius = Math.random() * 5;
            return new Circle(x, y, radius);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = randomShape();
        }
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
