/**
 *  tree has 3 fruits
 */
public class Tree extends FruitStorage{

    /**
     * this is name of tree
     */
    public static final String TYPE = "Tree";

    /**
     * this is image of tree
     */
    public static final String IMAGE = "res/images/tree.png";

    /**
     * constructor of Tree
     * @param world a world that tree contains
     * @param x - x axis of location of tree
     * @param y - y axis of location of tree
     */
    public Tree(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y, 3);
    }

    /**
     * update Tree
     */
    @Override
    public void update() {

    }

    /**
     * render Tree
     */
    @Override
    public void render() {
        super.render();
    }
}
