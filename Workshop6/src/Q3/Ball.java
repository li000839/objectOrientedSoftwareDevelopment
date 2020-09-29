package Q3;
import bagel.Image;
import bagel.Window;
import bagel.util.Point;

public class Ball {
    private final Image ballImage = new Image("res\\ball.png");

    private double x;
    private double y;

    private static final double SPEED = 0.2;
    private double xSpeed;
    private double ySpeed;

    public Ball() {
        resetPosition();
        xSpeed = (Math.random() > 0.5 ? 1 : -1) * SPEED;
        ySpeed = (Math.random() > 0.5 ? 1 : -1) * SPEED;
    }
    public Point getPoint() {
        return new Point(x, y);
    }

    public void resetPosition() {
        x = Math.random() * Window.getWidth();
        y = Math.random() * Window.getHeight();
    }

    public void update() {
        if (x < 0 || x > Window.getWidth()) {
            xSpeed *= -1;
        }
        if (y < 0 || y > Window.getHeight()) {
            ySpeed *= -1;
        }
        x += xSpeed;
        y += ySpeed;
        ballImage.draw(x, y);
    }
}
