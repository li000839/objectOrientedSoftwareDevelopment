import java.util.ArrayList;
import java.util.List;

/**
 * There is only one actor factory
 * Actor Factory has 1-1 relationship with world
 * this class do operation to actor list
 */
public class ActorFactory {
    private List<Actor> actorList = new ArrayList<>();
    private World world;

    /**
     * constructor of actor factory
     * @param world - actor factory contain a world
     */
    public ActorFactory(World world) {
        this.world = world;
    }

    /**
     * get a copy of actorList and modify this copy
     * @return
     */
    public List<Actor> getActorListCopy() {
        return List.copyOf(actorList);
    }

    /**
     * create an actor inside actorList
     * @param type - actor name
     * @param x - x axis of location of actor
     * @param y - y axis of location of actor
     * @return the actor be created
     */
    public Actor create(String type, double x, double y) {
        Actor actor = null;
        switch (type) {
            case Thief.TYPE:
                actor = new Thief(world, x, y);
                break;
            case Gatherer.TYPE:
                actor = new Gatherer(world, x, y);
                break;
            case Fence.TYPE:
                actor = new Fence(world, x, y);
                break;
            case Pool.TYPE:
                actor = new Pool(world, x, y);
                break;
            case Pad.TYPE:
                actor = new Pad(world, x, y);
                break;
            case SignUp.TYPE:
                actor = new SignUp(world, x, y);
                break;
            case SignDown.TYPE:
                actor = new SignDown(world, x, y);
                break;
            case SignLeft.TYPE:
                actor = new SignLeft(world, x, y);
                break;
            case SignRight.TYPE:
                actor = new SignRight(world, x, y);
                break;
            case Tree.TYPE:
                actor = new Tree(world, x, y);
                break;
            case GoldenTree.TYPE:
                actor = new GoldenTree(world, x, y);
                break;
            case Hoard.TYPE:
                actor = new Hoard(world, x, y);
                break;
            case Stockpile.TYPE:
                actor = new Stockpile(world, x, y);
                break;
            default:
                System.out.println("Invalid Type at ActorFactory");
                System.exit(-1);
        }
        actorList.add(actor);

        return actor;
    }

    /**
     * remove an actor from actorList
     * @param actor - the actor be removed
     */
    public void destroy(Actor actor) {
        actorList.remove(actor);
    }
}
