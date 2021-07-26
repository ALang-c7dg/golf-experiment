package lang.anne;

public class GolfHole {
    private int holeNumber;
    private int par;
    private int distance;

    public GolfHole(int holeNumber, int par, int holeDistance){
        this.holeNumber = holeNumber;
        this.par = par;
        this.distance = holeDistance;
    }

    public int getDistance() {
        return distance;
    }

    public int getPar() {
        return par;
    }

    public int getHoleNumber() {
        return holeNumber;
    }

    @Override
    public String toString(){
        return String.format("Hole %d: Par %d - %d Yards", holeNumber, par, distance);
    }
}
