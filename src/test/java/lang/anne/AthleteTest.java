package lang.anne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AthleteTest {

    @Test
    public void returnAthleteInfo(){
        Athlete basketballPlayer = new Athlete("James", "Pro");
        assertEquals("James", basketballPlayer.getName());
        assertEquals("Pro", basketballPlayer.getStatus());
    }

    @Test
    public void passOnlyName(){
        Athlete tennisPlayer = new Athlete("Mark");
        assertEquals("Mark", tennisPlayer.getName());
        assertEquals("Beginner", tennisPlayer.getStatus());
    }
}
