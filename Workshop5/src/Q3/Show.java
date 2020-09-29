package Q3;

public class Show {
    private String name;
    private int duration;
    private int airTimeTotal;

    public Show(String name, int duration, int airTimeHrs, int airTimeMins, int airTimeTotal) {
        this.name = name;
        this.duration = duration;
        this.airTimeTotal = airTimeHrs * 60 + airTimeMins;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAirTimeTotal() {
        return airTimeTotal;
    }

    public void setAirTimeTotal(int airTimeTotal) {
        this.airTimeTotal = airTimeTotal;
    }
}
