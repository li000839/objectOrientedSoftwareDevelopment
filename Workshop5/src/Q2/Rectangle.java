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

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        for (Rectangle rectangle : rectangles) {
            rectangle.
        }
    }
}