/**
 * Pad set thief ready to consume fruit
 */
public class Pad extends Actor{

    /**
     * this is name of pad
     */
    public static final String TYPE = "Pad";

    /**
     * this is image of pad
     */
    public static final String IMAGE = "res/images/pad.png";

    /**
     * constructor of pad
     * @param world pad contains a world
     * @param x - x axis of location of pad
     * @param y - y axis of location of pad
     */
    public Pad(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y);
    }

    /**
     * pad updates
     */
    @Override
    public void update() {

    }
}
