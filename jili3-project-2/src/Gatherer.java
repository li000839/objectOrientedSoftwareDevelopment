import java.util.List;

/**
 * this class represent gatherer with a white cat
 * it keep collection fruit
 */
public class Gatherer extends Player{

    /**
     * this is name of gatherer
     */
    public static final String TYPE = "Gatherer";

    /**
     * this is image of gatherer
     */
    public static final String IMAGE = "res/images/gatherer.png";

    /**
     * constructor of gatherer
     * @param world gatherer contains a world
     * @param x - x axis of location of gatherer
     * @param y - y axis of location of gatherer
     */
    public Gatherer(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y,
                Direction.LEFT, false, true);
    }

    /**
     * gatherer move on a tree
     * gatherer take one fruit from tree
     * and gatherer turn 180 degree
     * @param tree - tree loaded from csv file
     */
    @Override
    public void onTree(Tree tree) {
        if (tree.getFruit() >= 1){
            tree.setFruit(tree.getFruit() - 1);
            setCarrying(true);
            clockwise();
            clockwise();
        }
    }

    /**
     * gatherer move on a golden tree
     * gatherer take one fruit from golden tree
     * and gatherer turn 180 degree
     * @param goldenTree - golden tree loaded from csv file
     */
    @Override
    public void onGoldenTree(GoldenTree goldenTree) {
        goldenTree.setFruit(goldenTree.getFruit() - 1);
        setCarrying(true);
        clockwise();
        clockwise();
    }

    /**
     * gatherer move on a hoard
     * gatherer give one fruit from hoard
     * and gatherer turn 180 degree
     * @param hoard - hoard loaded from csv file
     */
    @Override
    public void onHoard(Hoard hoard) {
        if(getCarrying()) {
            setCarrying(false);
            hoard.setFruit(hoard.getFruit() + 1);
        }
        clockwise();
        clockwise();
    }

    /**
     * gatherer move on a stockpile
     * gatherer give one fruit from hoard
     * @param stockpile - stockpile loaded from csv file
     */
    @Override
    public void onStockpile(Stockpile stockpile) {
        if(getCarrying()) {
            setCarrying(false);
            stockpile.setFruit(stockpile.getFruit() + 1);
        }
        clockwise();
        clockwise();
    }

    /**
     * gatherer move on a pad, do this
     */
    @Override
    public void onPad() {

    }

    /**
     * gatherer move on a gatherer, do this
     */
    @Override
    public void onGatherer() {

    }

    /**
     * gatherer move on a pool
     * created one copy of gatherer, turn left and move one tile
     * created one copy of gatherer, turn right and move one tile
     * destroy gatherer
     */
    @Override
    protected void doMitosis() {
        Gatherer gathererA = (Gatherer) getWorld().getActorFactory().create(TYPE, getX(), getY());
        gathererA.setDirection(getDirection());
        gathererA.clockwise();
        gathererA.moveForward();

        Gatherer gathererB = (Gatherer) getWorld().getActorFactory().create(TYPE, getX(), getY());
        gathererB.setDirection(getDirection());
        gathererB.counterClockwise();
        gathererB.moveForward();

        suicide();
    }
}
