import bagel.*;

/**
 * this is fruit storage inherite from actor
 * it contains number of fruit
 */
public abstract class FruitStorage extends Actor{
    private double fruit;
    private Font fruitNumber = new Font("res\\conformable.otf", 24);

    /**
     * draw fruit number on the fruit image
     */
    @Override
    public void render() {
        super.render();
        int intFruit = (int) fruit;
        fruitNumber.drawString(String.valueOf(intFruit), getX(), getY());
    }

    /**
     * constructor of fruit storage
     * @param world - a world that contains by fruit storage
     * @param imageFileName - image of fruit storage
     * @param type - name of fruit storage
     * @param x - x axis of location of fruit storage
     * @param y - y axis of location of fruit storage
     * @param fruit- number of fruit on this fruit storage
     */
    public FruitStorage(World world, String imageFileName, String type, double x, double y, double fruit) {
        super(world, imageFileName, type, x, y);
        this.fruit = fruit;
    }

    /**
     * get number of fruit
     * @return number of fruit
     */
    public double getFruit() {
        return fruit;
    }

    /**
     * set number of fruit
     * @param fruit number of fruit
     */
    public void setFruit(double fruit) {
        this.fruit = fruit;
    }


}
