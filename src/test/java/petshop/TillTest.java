package petshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {
    Till till;

    @Before
    public void before(){
        till = new Till(10000);
    }

    @Test
    public void hasCash(){
        assertEquals(10000, till.getCash(), 0.0);
    }

    @Test
    public void canAddMoney(){
        till.addMoney(1200);
        assertEquals(11200, till.getCash(), 0.0);
    }

    @Test
    public void canReduceMoney(){
        till.reduceMoney(700);
        assertEquals(9300, till.getCash(), 0.0);
    }
}
