import bagel.*;

/**
 * Actor class present every object in shadow life
 */
public abstract class Actor {
    private double x;
    private double y;
    private final Image image;
    private final String type;
    private final World world;

    /**
     * from project 1 sample solution, constructor of actor
     * @param imageFileName actor image file
     * @param type actor name
     * @param x actor location
     * @param y actor location
     */
    public Actor(World world, String imageFileName, String type, double x, double y) {
        this.world = world;
        image = new Image(imageFileName);
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public boolean overlap(Actor actor){
        return this.x == actor.x && this.y == actor.y;
    }

    /**
     * from project 1 sample solution.
     * update AbstractGame one time
     */
    public abstract void update();

    /**
     * from project 1 sample solution.
     * actor move one time
     */
    public final void tick(){
        update();
    }

    /**
     * from project 1 sample solution.
     * draw image on screen
     */
    public void render() {
        image.drawFromTopLeft(x, y);
    }

    /**
     * get x axis of location of actor
     * @return x axis of location of actor
     */
    public double getX() {
        return x;
    }

    /**
     * set x axis of location of actor
     * @param x - x axis of location of actor
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * get y axis of location of actor
     * @return y axis of location of actor
     */
    public double getY() {
        return y;
    }

    /**
     * set y axis of location of actor
     * @param y - y axis of location of actor
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * get actor name
     * @return actor name
     */
    public String getType() {
        return type;
    }

    /**
     * get world that actor contain
     * @return world that actor contain
     */
    public World getWorld() {
        return world;
    }

    /**
     * get image that actor contain
     * @return image that actor contain
     */
    public Image getImage() {
        return image;
    }
}
