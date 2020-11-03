/**
 * Fence is where gatherer and thief hault
 */
public class Fence extends Actor{

    /**
     * this is name of fence
     */
    public static final String TYPE = "Fence";

    /**
     * this is image of fence
     */
    public static final String IMAGE = "res/images/fence.png";

    /**
     * constructor of fence
     * @param world fence contains a world
     * @param x - x axis of location of fruit storage
     * @param y - y axis of location of fruit storage
     */
    public Fence(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y);
    }

    /**
     * fence updates
     */
    @Override
    public void update() {

    }
}
