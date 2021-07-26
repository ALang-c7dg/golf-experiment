package lang.anne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GolferTest {
    @Test
    public void returnGolferInfo(){
        Athlete golfer1 = new Golfer("Julie", "Pro");
        assertEquals("Julie", golfer1.getName());
        assertEquals("Pro", golfer1.getStatus());
    }
}
