package petshop;

import behaviour.ISell;
import pet.Pet;
import pet.cat.Cat;
import pet.cat.Ragdoll;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ISell {

    List<String> cats;

    Cat cat;
    Pet pet;
    private String name;
    Till till;

    private ArrayList<ISell> stock;

    public Shop(String name, Till till, ArrayList<ISell> stock) {
        this.name = name;
        this.till = till;
        this.stock = stock;

    }

    public String getName() {
        return name;
    }

    public Till getTill() {
        return this.till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    @Override
    public Double calculateMarkup() {
        return pet.calculateMarkup();
    }

    public int getStockCount() {
        return stock.size();
    }

    public String findCat(String catToFind) {
        return cats
                .stream()
                .filter(cat -> cat.equals(catToFind))
                        .findFirst()
                .orElse(null);

    }
}
