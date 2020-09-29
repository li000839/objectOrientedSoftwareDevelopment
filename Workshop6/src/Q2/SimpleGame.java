package Q2;

import bagel.*;

public class SimpleGame extends AbstractGame {
    private Image imPlayer = new Image("res\\player.png");
    private Image imHouse = new Image("res\\house.png");
    private Font font = new Font("res\\conformable.otf", 24);
    double x = 50;
    double y = 350;
    double doorX = 854;
    double doorY = 268;
    final double WITHIN = 55;

    public SimpleGame() {
        super(1024, 768, "Simple game");
    }

    public double DistanceToDoor(double x, double y) {
        return Math.sqrt(Math.pow((x - doorX), 2.0) +
                Math.pow((y - doorY), 2.0));
    }
    public void WithinDistance(double x, double y) {
        if(DistanceToDoor(x, y) <= WITHIN) {
            font.drawString("Welcome home!", 32, 32);
        }
    }


    @Override
    protected void update(Input input) {
        double speed = 10;

        if (input.isDown(Keys.LEFT)) {
            x -= speed;
        }
        if (input.isDown(Keys.RIGHT)) {
            x += speed;
        }
        if (input.isDown(Keys.UP)) {
            y -= speed;
        }
        if (input.isDown(Keys.DOWN)) {
            y += speed;
        }

        if (input.wasPressed(Keys.ESCAPE)) {
            Window.close();
        }

        imPlayer.draw(x, y);
        imHouse.draw(850, 180);
        WithinDistance(x, y);
    }

    public static void main(String[] args) {
        SimpleGame game = new SimpleGame();
        game.run();
    }
}
