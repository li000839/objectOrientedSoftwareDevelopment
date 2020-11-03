/**
 * this class represent thief with a black cat
 * it keep steal fruit
 */
public class Thief extends Player {

    /**
     * this is name of gatherer
     */
    public static final String TYPE = "Thief";

    /**
     * this is image of gatherer
     */
    public static final String IMAGE = "res/images/thief.png";
    private boolean consuming;

    /**
     * constructor of thief
     * @param world - thief contains a world
     * @param x - x axis of location of thief
     * @param y - y axis of location of thief
     */
    public Thief(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y,
                Direction.UP, false, true);
        this.consuming = false;
    }

    /**
     *  thief move on tree
     *  thief take one fruit from tree
     * @param tree - tree loaded from csv file
     */
    @Override
    public void onTree(Tree tree) {
        if(!consuming){
            if(tree.getFruit() >= 1){
                tree.setFruit(tree.getFruit()-1);
                setCarrying(true);
            }
        }
    }

    /**
     * thief move on golden tree
     * take one fruit
     * @param goldenTree - golden tree loaded from csv file
     */
    @Override
    public void onGoldenTree(GoldenTree goldenTree) {
        if(!consuming){
            goldenTree.setFruit(goldenTree.getFruit() - 1);
            setCarrying(true);
        }
    }

    /**
     * thief move on hoard, take one fruit, turn right
     * if thief already has one fruit, then give it to hoard and turn right
     * @param hoard - hoard loaded from csv file
     */
    @Override
    public void onHoard(Hoard hoard) {
        if(consuming) {
            consuming = false;
            if(!getCarrying()){
                if(hoard.getFruit() >= 1){
                    setCarrying(true);
                    hoard.setFruit(hoard.getFruit() - 1);
                } else {
                    clockwise();
                }
            }

        } else if (getCarrying()) {
            setCarrying(false);
            hoard.setFruit(hoard.getFruit() + 1);
            clockwise();
        }
    }

    /**
     * thief move on stockpile
     * take one fruit and turn right
     * if no fruit, turn right
     * @param stockpile - stockpile loaded from csv file
     */
    @Override
    public void onStockpile(Stockpile stockpile) {
        if(!getCarrying()) {
            if(stockpile.getFruit() >= 1) {
                setCarrying(true);
                consuming = false;
                stockpile.setFruit(stockpile.getFruit() - 1);
                clockwise();
            }
        } else {
            clockwise();
        }
    }

    /**
     * thief move on gatherer, turn left
     */
    @Override
    public void onGatherer() {

        // Rotate direction by 270 degrees clockwise.
        counterClockwise();
    }

    /**
     * thief move on pad, get ready to consume fruit
     */
    @Override
    public void onPad() {
        consuming = true;
    }

    /**
     * thief updates
     */
    @Override
    public void update() {
        super.update();
    }

    /**
     * thief move on pool
     * get one copy turn left and move one tile
     * get one copy turn right and move one tile
     * thief suicide
     */
    @Override
    protected void doMitosis() {
        Thief thiefA = (Thief) getWorld().getActorFactory().create(TYPE, getX(), getY());
        thiefA.setDirection(getDirection());
        thiefA.clockwise();
        thiefA.moveForward();

        Thief thiefB = (Thief) getWorld().getActorFactory().create(TYPE, getX(), getY());
        thiefB.setDirection(getDirection());
        thiefB.counterClockwise();
        thiefB.moveForward();

        suicide();
    }
}
