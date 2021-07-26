package lang.anne;


import java.util.List;

public class GolfCourse {
    private List<GolfHole> golfCourse;

    public GolfCourse(List<GolfHole> golfHoles){
        this.golfCourse = golfHoles;
    }

    public int getNumberOfHoles(){
        return golfCourse.size();
    }

    public String getHoleInfo(int holeNumber) {
        GolfHole hole = golfCourse.get(holeNumber);
        return hole.toString();
    }
}
