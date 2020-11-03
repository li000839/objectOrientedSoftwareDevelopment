/**
 * Pool is where motisis happened
 */
public class Pool extends Actor{

    /**
     * this is name of pool
     */
    public static final String TYPE = "Pool";

    /**
     * this is image of pool
     */
    public static final String IMAGE = "res/images/pool.png";

    /**
     * constructor of pool
     * @param world pool contains a world
     * @param x - x axis of location of pool
     * @param y - y axis of location of pool
     */
    public Pool(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y);
    }

    /**
     * pool updates
     */
    @Override
    public void update() {

    }
}
