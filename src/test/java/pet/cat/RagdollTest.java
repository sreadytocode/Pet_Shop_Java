package pet.cat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RagdollTest {
    Ragdoll ragdoll;

    @Before
    public void before(){
        ragdoll = new Ragdoll(1000, 1200, "Maya", CatAgeType.Teenager);
    }

    @Test
    public void hasPriceBrought(){
        assertEquals(1000, ragdoll.getPriceBought(), 0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(1200, ragdoll.getPriceSold(), 0.0);
    }

    @Test
    public void hasName(){
        assertEquals("Maya", ragdoll.getName());
    }

    @Test
    public void hasCatAgeType(){
        assertEquals(CatAgeType.Teenager, ragdoll.getCatAgeType());
    }

    @Test
    public void canMeow(){
        assertEquals("Meow meow meowwwwww Maya meoww", ragdoll.meow("Maya"));
    }

    @Test
    public void canPlay(){
        assertEquals("Playtime wohoo then naptime", ragdoll.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(200,ragdoll.calculateMarkup(), 0.0);
    }

}
