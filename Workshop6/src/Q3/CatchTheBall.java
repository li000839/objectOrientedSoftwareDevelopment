package Q3;
import bagel.*;
import bagel.util.Point;

public class CatchTheBall extends AbstractGame {
    private final Image playerImage = new Image("res\\player.png");
    private final Ball ball = new Ball();
    private final Font font = new Font("res\\conformable.otf", 48);

    private static final double PLAYER_SPEED = 0.25;
    private static final double BALL_DISTANCE = 24;
    private double playerX = 512;
    private double playerY = 384;

    private int score = 0;

    protected void update(Input input) {
        if (input.isDown(Keys.LEFT)) {
            playerX -= PLAYER_SPEED;
        }
        if (input.isDown(Keys.RIGHT)) {
            playerX += PLAYER_SPEED;
        }
        if (input.isDown(Keys.UP)) {
            playerY -= PLAYER_SPEED;
        }
        if (input.isDown(Keys.DOWN)) {
            playerY += PLAYER_SPEED;
        }

        if (new Point(playerX, playerY).distanceTo(ball.getPoint()) < BALL_DISTANCE) {
            score++;
            ball.resetPosition();
        }

        ball.update();
        playerImage.draw(playerX, playerY);

        font.drawString("Score " + score, 32, 32);
    }

    public static void main(String[] args) {
        new CatchTheBall().run();
    }
}
