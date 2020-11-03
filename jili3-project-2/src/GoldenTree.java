/**
 * golden tree has infinity fruit
 */
public class GoldenTree extends FruitStorage{

    /**
     * this is name of golden tree
     */
    public static final String TYPE = "GoldenTree";

    /**
     * this is image of golden tree
     */
    public static final String IMAGE = "res/images/gold-tree.png";

    /**
     * constructor of Golden Tree
     * @param world a world that tree contains
     * @param x - x axis of location of Golden Tree
     * @param y - y axis of location of Golden Tree
     */
    public GoldenTree(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y, Double.POSITIVE_INFINITY);
    }

    /**
     * update Golden Tree
     */
    @Override
    public void update() {

    }

    /**
     * render Golden Tree without number of fruit
     */
    @Override
    public void render() {
        getImage().drawFromTopLeft(getX(), getY());
    }
}
