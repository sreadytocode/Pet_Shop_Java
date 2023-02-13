package petshop;

import behaviour.ISell;
import org.junit.Before;
import org.junit.Test;
import pet.cat.*;


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

    Cat cat;



    @Before
    public void before(){
        mrsNorris = new MaineCoon(750, 1000, "Mrs Norris", CatAgeType.Adult);
        maya = new Ragdoll(1000, 1200, "Maya", CatAgeType.Teenager);
        diva = new Persian(1100, 1200, "Diva", CatAgeType.Kitten);
//        ArrayList<ISell> stock = new ArrayList<>();
        List<Cat> stock = Arrays.asList(mrsNorris, maya, diva);
//        stock.add(mrsNorris);
//        stock.add(maya);
//        stock.add(diva);


        till = new Till(10000);
        shop = new Shop("Sara's cat shop", till, stock);
//        shop.cats = Arrays.asList("Maya", "Diva", "Mrs Norris");


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
        assertEquals(maya, shop.findCat("Maya"));
    }
    @Test
    public void hasGetCatDiva(){
        assertEquals(diva, shop.findCat("Diva"));
    }
    @Test
    public void hasGetCatNorris(){
        assertEquals(mrsNorris, shop.findCat("Mrs Norris"));
    }

    @Test
    public void hasGetCatNullIfNone(){
        assertEquals(null, shop.findCat("Jane"));
    }

//    @Test
//    public void canAddPetToStock(){
//        MaineCoon jasmine = new MaineCoon(750, 1000, "Jasmine", CatAgeType.Kitten);
//        shop.addToStock(jasmine);
//        assertEquals(4, shop.getStockCount());
//    }

    @Test
    public void canRemovePetFromStock(){
        MaineCoon jasmine = new MaineCoon(750, 1000, "Jasmine", CatAgeType.Kitten);
        shop.removeStock(jasmine);
        assertEquals(3, shop.getStockCount());
    }
    

}
