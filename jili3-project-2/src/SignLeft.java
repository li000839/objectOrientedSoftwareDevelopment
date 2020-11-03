/**
 * sign left change gatherer and thief direction to down
 */
public class SignLeft extends Actor{

    /**
     * this is name of sign left
     */
    public static final String TYPE = "SignLeft";

    /**
     * this is image of sign left
     */
    public static final String IMAGE = "res/images/left.png";

    /**
     * constructor of sign left
     * @param world sign left contains a world
     * @param x - x axis of location of sign left
     * @param y - y axis of location of sign left
     */
    public SignLeft(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y);
    }

    /**
     * sign left updates
     */
    @Override
    public void update() {

    }
}
