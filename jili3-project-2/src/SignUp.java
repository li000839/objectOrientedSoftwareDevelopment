/**
 * sign up change gatherer and thief direction to down
 */
public class SignUp extends Actor{

    /**
     * this is name of sign up
     */
    public static final String TYPE = "SignUp";

    /**
     * this is image of sign up
     */
    public static final String IMAGE = "res/images/up.png";

    /**
     * constructor of sign up
     * @param world sign up contains a world
     * @param x - x axis of location of sign up
     * @param y - y axis of location of sign up
     */
    public SignUp(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y);
    }

    /**
     * sign up updates
     */
    @Override
    public void update() {

    }
}
