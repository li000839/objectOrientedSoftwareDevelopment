/**
 * sign right change gatherer and thief direction to down
 */
public class SignRight extends Actor{

    /**
     * this is name of sign right
     */
    public static final String TYPE = "SignRight";

    /**
     * this is image of sign right
     */
    public static final String IMAGE = "res/images/right.png";

    /**
     * constructor of sign right
     * @param world sign right contains a world
     * @param x - x axis of location of sign right
     * @param y - y axis of location of sign right
     */
    public SignRight(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y);
    }

    /**
     * sign right updates
     */
    @Override
    public void update() {

    }
}
