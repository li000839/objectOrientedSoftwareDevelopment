import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * There is only one world. Every actor contains this world.
 * Each world contains actorFactory
 */
public class World {

    /**
     * tile size using to make one move
     */
    public static final double TILE_SIZE = 64;
    private final ActorFactory actorFactory;

    /**
     * constructor of world, world contains a actorFactory
     */
    public World() {
        this.actorFactory = new ActorFactory(this);
    }

    /**
     * load actors from csv file and put it into actorList
     * @param worldFileName csv file name
     */
    public void loadActors(String worldFileName) {
        int lineCount = 1;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(worldFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                int x = Integer.parseInt(parts[1]);
                int y = Integer.parseInt(parts[2]);

                switch (type) {
                    case Thief.TYPE:
                        actorFactory.create(Thief.TYPE, x, y);
                        break;
                    case Gatherer.TYPE:
                        actorFactory.create(Gatherer.TYPE, x, y);
                        break;
                    case Fence.TYPE:
                        // todo: finish changing this
                        actorFactory.create(Fence.TYPE, x, y);
                        break;
                    case Pool.TYPE:
                        actorFactory.create(Pool.TYPE, x, y);
                        break;
                    case Pad.TYPE:
                        actorFactory.create(Pad.TYPE, x, y);
                        break;
                    case SignUp.TYPE:
                        actorFactory.create(SignUp.TYPE, x, y);
                        break;
                    case SignDown.TYPE:
                        actorFactory.create(SignDown.TYPE, x, y);
                        break;
                    case SignLeft.TYPE:
                        actorFactory.create(SignLeft.TYPE, x, y);
                        break;
                    case SignRight.TYPE:
                        actorFactory.create(SignRight.TYPE, x, y);
                        break;
                    case Tree.TYPE:
                        actorFactory.create(Tree.TYPE, x, y);
                        break;
                    case GoldenTree.TYPE:
                        actorFactory.create(GoldenTree.TYPE, x, y);
                        break;
                    case Hoard.TYPE:
                        actorFactory.create(Hoard.TYPE, x, y);
                        break;
                    case Stockpile.TYPE:
                        actorFactory.create(Stockpile.TYPE, x, y);
                        break;
                    default:
                        System.out.println("Invalid Type");
                        System.exit(-1);
                }

                lineCount++;
            }
        } catch (FileNotFoundException e) {
            System.out.printf("error: file \"<%s>\" not found", worldFileName);
            System.exit(-1);
        } catch (IOException e) {
            System.out.printf("error: in file \"<%s>\" at line <%d>", worldFileName, lineCount);
            System.exit(-1);
        } catch (Exception e) {
            System.out.println("Some other exception");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    /**
     * call actor factory
     * @return actor factory
     */
    public ActorFactory getActorFactory() {
        return actorFactory;
    }
}
