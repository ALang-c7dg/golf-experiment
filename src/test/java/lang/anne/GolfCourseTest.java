package lang.anne;

import org.junit.jupiter.api.Test;


import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class GolfCourseTest {
    @Test
    public void createACourseWith2Holes(){
        GolfHole hole1  = new GolfHole(1,5,500);
        GolfHole hole2 = new GolfHole(2,4,300);
        List<GolfHole> myFavoriteHoles = new LinkedList<>();
        myFavoriteHoles.add(hole1);
        myFavoriteHoles.add(hole2);

        GolfCourse myFavoriteCourse = new GolfCourse(myFavoriteHoles);
        assertEquals(2, myFavoriteCourse.getNumberOfHoles());
    }

    @Test
    public void retrieveHole1InfoforCourse(){
        GolfHole hole1  = new GolfHole(1,5,500);
        GolfHole hole2 = new GolfHole(2,4,300);
        List<GolfHole> myFavoriteHoles = new LinkedList<>();
        myFavoriteHoles.add(hole1);
        myFavoriteHoles.add(hole2);
        GolfCourse myFavoriteCourse = new GolfCourse(myFavoriteHoles);

        String holeInfo1 = myFavoriteCourse.getHoleInfo(0);
        assertEquals("Hole 1: Par 5 - 500 Yards", holeInfo1);

    }
}
