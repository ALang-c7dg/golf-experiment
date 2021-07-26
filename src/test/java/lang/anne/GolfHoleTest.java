package lang.anne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GolfHoleTest {
    @Test
    public void retrieveHoleInfo(){
        GolfHole hole1 = new GolfHole(1,5,500);
        assertEquals(1, hole1.getHoleNumber());
        assertEquals(5, hole1.getPar());
        assertEquals(500, hole1.getDistance());
    }
    public void retrieveFormattedHoleInfo(){
        GolfHole hole1 = new GolfHole(1,5,500);
        assertEquals("Hole 1: Par 5 - 500 Yards", hole1.toString());
    }

}
