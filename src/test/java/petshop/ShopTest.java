package petshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Till till;

    @Before
    public void before(){
        till = new Till(10000);
        shop = new Shop("Sara's cat shop", till);
    }

    @Test
    public void hasName(){
        assertEquals("Sara's cat shop", shop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(10000.00, shop.getTill().getCash(), 0.0);
    }

}
