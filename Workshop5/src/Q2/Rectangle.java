package Q2;

public class Rectangle {
    private Point leftTop;
    private Point rightBottom;

    public Rectangle(double left, double top, double right, double bottom) {
        leftTop = new Point(left, top);
        rightBottom = new Point(right, bottom);
    }
    public double getLeft() {
        return leftTop.getX();
    }
    public double getTop() {
        return this.leftTop.getY();
    }
    public double getWidth() {
        return rightBottom.getX() - leftTop.getX();
    }
    public double getHeight() {
        return rightBottom.getY() - leftTop.getY();
    }
}