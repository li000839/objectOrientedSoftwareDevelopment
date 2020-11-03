import java.util.List;

/**
 * Player has common behaviour with thief and gatherer
 */
public abstract class Player extends Actor {
    private Direction direction;
    private boolean carrying;
    private boolean active;

    /**
     * constructor of player
     * @param world - player contains a world
     * @param imageFileName - player image
     * @param type - player name
     * @param x - x axis of location of player
     * @param y - y axis of location of player
     * @param direction - direction of player
     * @param carrying - whether player carrying something
     * @param active - whether player moving
     */
    public Player(World world, String imageFileName, String type, double x, double y,
                  Direction direction, boolean carrying, boolean active) {
        super(world,imageFileName, type, x, y);
        this.direction = direction;
        this.carrying = carrying;
        this.active = active;
    }

    /**
     * update of player, for every update
     * do:
     * A move one tile
     * B check whether this player on something
     * B if on something, do corresponding job
     */
    @Override
    public void update() {
        // move 1 tile
        if(isActive()) {
            moveForward();
        }

        List<Actor> actorList = getWorld().getActorFactory().getActorListCopy();

        for (Actor actor : actorList) {
            if (overlap(actor) && !actor.equals(this)) {
                switch (actor.getType()) {
                    case Fence.TYPE:
                        onFence();
                        break;
                    case SignUp.TYPE:
                        onSign(Direction.UP);
                        break;
                    case SignDown.TYPE:
                        onSign(Direction.DOWN);
                        break;
                    case SignLeft.TYPE:
                        onSign(Direction.LEFT);
                        break;
                    case SignRight.TYPE:
                        onSign(Direction.RIGHT);
                        break;
                    case Pool.TYPE:
                        doMitosis();
                        break;
                    case Tree.TYPE:
                        onTree((Tree) actor);
                        break;
                    case GoldenTree.TYPE:
                        onGoldenTree((GoldenTree) actor);
                        break;
                    case Hoard.TYPE:
                        onHoard((Hoard) actor);
                        break;
                    case Stockpile.TYPE:
                        onStockpile((Stockpile) actor);
                        break;
                    case Pad.TYPE:
                        onPad();
                        break;
                    case Gatherer.TYPE:
                        onGatherer();
                        break;
                    case Thief.TYPE:
                        break;
                    default:
                        System.out.println(actor.getType());
                        System.out.println("Invalid type at Player");
                        System.exit(-1);
                }
            }
        }
    }

    /**
     * move one tile along direction
     */
    public void moveForward() {
        switch(direction) {
            case UP:
                setY(getY() - World.TILE_SIZE);
                break;
            case DOWN:
                setY(getY() + World.TILE_SIZE);
                break;
            case LEFT:
                setX(getX() - World.TILE_SIZE);
                break;
            case RIGHT:
                setX(getX() + World.TILE_SIZE);
                break;
            default:
                System.out.println("Move method has wrong direction");
        }
    }

    /**
     * move back one tile
     */
    public void moveBack() {
        switch(direction) {
            case UP:
                setY(getY() + World.TILE_SIZE);
                break;
            case DOWN:
                setY(getY() - World.TILE_SIZE);
                break;
            case LEFT:
                setX(getX() + World.TILE_SIZE);
                break;
            case RIGHT:
                setX(getX() - World.TILE_SIZE);
                break;
            default:
                System.out.println("MoveBack method has wrong direction");
        }
    }

    /**
     * if player on fence, stop moving and move back one tile
     */
    public void onFence(){
        active = false;
        moveBack();
    }

    /**
     * if player on sign, change direction corresponding to sign
     * @param direction - direction that sign present
     */
    public void onSign(Direction direction){
        this.direction = direction;
    }

    /**
     * change player direction with 90 degrees clockwise
     */
    public void clockwise(){
        switch(getDirection()) {
            case UP:
                setDirection(Direction.RIGHT);
                break;
            case DOWN:
                setDirection(Direction.LEFT);
                break;
            case LEFT:
                setDirection(Direction.UP);
                break;
            case RIGHT:
                setDirection(Direction.DOWN);
                break;
            default:
                System.out.println("clockwise has wrong direction");
        }
    }

    /**
     * change player direction with 90 degrees counter-clockwise
     */
    public void counterClockwise(){
        switch(getDirection()) {
            case UP:
                setDirection(Direction.LEFT);
                break;
            case DOWN:
                setDirection(Direction.RIGHT);
                break;
            case LEFT:
                setDirection(Direction.DOWN);
                break;
            case RIGHT:
                setDirection(Direction.UP);
                break;
            default:
                System.out.println("clockwise has wrong direction");
        }
    }

    /**
     * get direction of player
     * @return - direction of player
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * set direction of player
     * @param direction - direction of player
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * show whether player carrying fruit
     * @return - whether player carrying fruit
     */
    public boolean getCarrying() {
        return carrying;
    }

    /**
     * set whether player carrying fruit
     * @param carrying whether player carrying fruit
     */
    public void setCarrying(boolean carrying) {
        this.carrying = carrying;
    }

    /**
     * show whether player moving
     * @return whether player moving
     */
    public boolean isActive() {
        return active;
    }

    /**
     * set whether player moving
     * @param active whether player moving
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * player move on a tree, do this job
     * @param tree - tree loaded from csv file
     */
    public abstract void onTree(Tree tree);

    /**
     * player move on a golden tree, do this job
     * @param goldenTree - golden tree loaded from csv file
     */
    public abstract void onGoldenTree(GoldenTree goldenTree);

    /**
     * player move on a hoard, do this job
     * @param hoard - hoard loaded from csv file
     */
    public abstract void onHoard(Hoard hoard);

    /**
     * player move on a stockpile, do this job
     * @param stockpile - stockpile loaded from csv file
     */
    public abstract void onStockpile(Stockpile stockpile);

    /**
     * player move on a gatherer, do this job
     */
    public abstract void onGatherer();

    /**
     * player move on a pad, do this job
     */
    public abstract void onPad();

    /**
     *  player move on a pool, do this job
     */
    protected abstract void doMitosis();

    /**
     *  destroy this actor when actor move on pool
     */
    protected void suicide() {
        active = false;
        getWorld().getActorFactory().destroy(this);
    }
}
