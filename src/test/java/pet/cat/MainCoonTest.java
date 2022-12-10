package pet.cat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainCoonTest{
    MaineCoon maineCoon;

    @Before
    public void before(){
        maineCoon = new MaineCoon(750, 1000, "Mrs Norris", CatAgeType.Adult);
    }

    @Test
    public void hasName(){
        assertEquals("Mrs Norris", maineCoon.getName());
    }
    @Test
    public void hasPriceBrought(){
        assertEquals(750, maineCoon.getPriceBought(), 0.0);
    }
    @Test
    public void hasPriceSold(){
        assertEquals(1000, maineCoon.getPriceSold(), 0.0);
    }

    @Test
    public void hasCatAgeType(){
        assertEquals(CatAgeType.Adult, maineCoon.getCatAgeType());
    }

    @Test
    public void canMeow(){
        assertEquals("Mrs Norris goes moewww time to tell Filch", maineCoon.meow("Mrs Norris"));
    }

    @Test
    public void canPlay(){
        assertEquals("Time to catch if any Hogwart Student's are breaking any rules", maineCoon.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(250,maineCoon.calculateMarkup(), 0.0);
    }
}
