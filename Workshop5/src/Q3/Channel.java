package Q3;

public class Channel {
    private String name;
    private final int MAXSHOW = 5;
    private Show[] shows = new Show[MAXSHOW];
    private static int numShows = 0;

    public void addShow(Show show) {
        if (numShows < MAXSHOW) {
            for (int i = 0; i < MAXSHOW; i++) {
                int startTime = shows[i].getAirTimeTotal();
                int endTime = startTime + shows[i].getDuration();
                if (!(endTime < show.getAirTimeTotal() || startTime >
                        (show.getAirTimeTotal() + show.getDuration()))) {
                    return;
                }
            }
            shows[numShows++] = show;
        }
    }

    public String getShow(int airTimeHrs, int airTimeMins) {
        for (int i = 0; i < numShows; i++) {
            int airTimeTotal = airTimeHrs + airTimeMins;
            if (shows[i].getAirTimeTotal() == airTimeTotal) {
                return shows[i].getName();
            }
        }
        return null;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMAXSHOW() {
        return MAXSHOW;
    }

    public Show[] getShows() {
        return shows;
    }

    public void setShows(Show[] shows) {
        this.shows = shows;
    }

    public static int getNumShows() {
        return numShows;
    }

    public static void setNumShows(int numShows) {
        Channel.numShows = numShows;
    }
}
