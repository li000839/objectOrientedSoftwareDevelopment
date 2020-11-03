import bagel.*;

import java.util.List;

/**
 * Shadow life contains main method and it updates and draw everything
 */
public class ShadowLife extends AbstractGame {
    private final Image background = new Image("res/images/background.png");
    private long lastTick = 0;
    private final long TICK_RATE;
    private final long MAX_TICK;
    private int countTick = 0;
    World world = new World();

    /**
     * constructor of shadowlife
     * @param args command line arguments
     */
    public ShadowLife(String[] args) {
        TICK_RATE = Integer.parseInt(args[0]);
        MAX_TICK = Integer.parseInt(args[1]);
        String CSVFileName = args[2];
        world.loadActors(CSVFileName);
    }

    /**
     * check command line arguments
     * @param args command line arguments
     */
    public void checkArguments(String[] args) {
        if(args.length != 3) {
            System.out.println("usage: ShadowLife <tick rate> <max ticks> <world file>");
            System.exit(-1);
        } else if(Integer.parseInt(args[0]) < 0 || Integer.parseInt(args[1]) < 0) {
            System.out.println("usage: ShadowLife <tick rate> <max ticks> <world file>");
            System.exit(-1);
        }

    }

    @Override
    protected void update(Input input) {
        // If enough time has passed, run the next tick
        if (countTick > MAX_TICK) {
            System.out.println("Timed out");
            System.exit(-1);
        } else if (System.currentTimeMillis() - lastTick > TICK_RATE) {
            countTick++;
            lastTick = System.currentTimeMillis();
            List<Actor> actorList = world.getActorFactory().getActorListCopy();
            for (Actor actor : actorList) {
                if (actor != null) {
                    actor.tick();
                }
            }
        }

        // Draw all elements
        background.drawFromTopLeft(0, 0);
        List<Actor> actorList = world.getActorFactory().getActorListCopy();
        for (Actor actor : actorList) {
            if (actor != null) {
                actor.render();
            }
        }

        if (shouldHalt()) halt();
    }

    private boolean shouldHalt() {
        for (Actor actor : world.getActorFactory().getActorListCopy()) {
            if (actor.getType().equals(Gatherer.TYPE) || actor.getType().equals(Thief.TYPE)) {
                if (((Player) actor).isActive()) return false;
            }
        }

        return true;
    }

    private void halt() {
        System.out.println(countTick + " ticks");

        for (Actor actor : world.getActorFactory().getActorListCopy()) {
            if (actor.getType().equals(Stockpile.TYPE) || actor.getType().equals(Hoard.TYPE)) {
                System.out.println((int) ((FruitStorage) actor).getFruit());
            }
        }

        System.exit(0);
    }

    /**
     * main function
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new ShadowLife(args).run();
    }
}
