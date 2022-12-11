package petshop;

import behaviour.ISell;
import org.junit.Before;
import org.junit.Test;
import pet.cat.CatAgeType;
import pet.cat.MaineCoon;
import pet.cat.Persian;
import pet.cat.Ragdoll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Till till;

    MaineCoon mrsNorris;
    Ragdoll maya;

    Persian diva;

    @Before
    public void before(){
        mrsNorris = new MaineCoon(750, 1000, "Mrs Norris", CatAgeType.Adult);
        maya = new Ragdoll(1000, 1200, "Maya", CatAgeType.Teenager);
        diva = new Persian(1100, 1200, "Diva", CatAgeType.Kitten);
        ArrayList<ISell> stock = new ArrayList<>();
        stock.add(mrsNorris);
        stock.add(maya);
        stock.add(diva);


        till = new Till(10000);
        shop = new Shop("Sara's cat shop", till, stock);
        shop.cats = Arrays.asList("Maya", "Diva", "Mrs Norris");


    }

    @Test
    public void hasName(){
        assertEquals("Sara's cat shop", shop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(10000.00, shop.getTill().getCash(), 0.0);
    }

    @Test
    public void hasStock(){
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void hasGetCatMaya(){
        assertEquals("Maya", shop.findCat("Maya"));
    }
    @Test
    public void hasGetCatDiva(){
        assertEquals("Diva", shop.findCat("Diva"));
    }
    @Test
    public void hasGetCatNorris(){
        assertEquals("Mrs Norris", shop.findCat("Mrs Norris"));
    }

    @Test
    public void hasGetCatNullIfNone(){
        assertEquals(null, shop.findCat("Jane"));
    }

    @Test
    public void canAddPetToStock(){
        MaineCoon jasmine = new MaineCoon(750, 1000, "Jasmine", CatAgeType.Kitten);
        shop.addToStock(jasmine);
        assertEquals(4, shop.getStockCount());
    }

    @Test
    public void canRemovePetFromStock(){
        MaineCoon jasmine = new MaineCoon(750, 1000, "Jasmine", CatAgeType.Kitten);
        shop.removeStock(jasmine);
        assertEquals(3, shop.getStockCount());
    }

}
