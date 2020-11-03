/**
 * sign down change gatherer and thief direction to down
 */
public class SignDown extends Actor{

    /**
     * this is name of sign down
     */
    public static final String TYPE = "SignDown";

    /**
     * this is image of sign down
     */
    public static final String IMAGE = "res/images/down.png";

    /**
     * constructor of sign down
     * @param world sign down contains a world
     * @param x - x axis of location of sign down
     * @param y - y axis of location of sign down
     */
    public SignDown(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y);
    }

    /**
     * sign down updates
     */
    @Override
    public void update() {

    }
}
