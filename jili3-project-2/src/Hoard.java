/**
 * Hoard is a place that store fruits
 */
public class Hoard extends FruitStorage{

    /**
     * this is name of hoard
     */
    public static final String TYPE = "Hoard";

    /**
     * this is image of hoard
     */
    public static final String IMAGE = "res/images/hoard.png";

    /**
     * constructor of Hoard
     * @param world a world that Hoard contains
     * @param x - x axis of location of Hoard
     * @param y - y axis of location of Hoard
     */
    public Hoard(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y, 0);
    }

    /**
     * update Hoard
     */
    @Override
    public void update() {

    }

    /**
     * render Hoard
     */
    @Override
    public void render() {
        super.render();
    }
}
