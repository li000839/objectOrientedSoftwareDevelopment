/**
 * Stockpile is a place that store fruits
 */
public class Stockpile extends FruitStorage{

    /**
     * this is name of stockpile
     */
    public static final String TYPE = "Stockpile";

    /**
     * this is image of stockpile
     */
    public static final String IMAGE = "res/images/cherries.png";

    /**
     * constructor of Stockpile
     * @param world a world that Stockpile contains
     * @param x - x axis of location of Stockpile
     * @param y - y axis of location of Stockpile
     */
    public Stockpile(World world, double x, double y) {
        super(world, IMAGE, TYPE, x, y, 0);
    }

    /**
     * update Stockpile
     */
    @Override
    public void update() {

    }

    /**
     * update Stockpile
     */
    @Override
    public void render() {
        super.render();
    }
}

