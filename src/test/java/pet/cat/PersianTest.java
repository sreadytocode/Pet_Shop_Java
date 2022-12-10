package pet.cat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersianTest {
    Persian persian;

    @Before
    public void before(){
        persian = new Persian(1100, 1200, "Diva", CatAgeType.Kitten);
    }

    @Test
    public void hasPriceBought(){
        assertEquals(1100, persian.getPriceBought(), 0.0);
    }

    @Test
    public void hasPriceSold(){
        assertEquals(1200, persian.getPriceSold(), 0.0);
    }

    @Test
    public void hasName(){
        assertEquals("Diva", persian.getName());
    }

    @Test
    public void hasAgeType(){
        assertEquals(CatAgeType.Kitten, persian.getCatAgeType());
    }

    @Test
    public void canMeow(){
        assertEquals("Diva wants food now meow meow", persian.meow("Diva"));
    }

    @Test
    public void canPlay(){
        assertEquals("Yayy playtime *rolls around*", persian.play());
    }
}
