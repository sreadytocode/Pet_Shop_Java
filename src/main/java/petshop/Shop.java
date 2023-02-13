package petshop;

import behaviour.ISell;
import pet.Pet;
import pet.cat.Cat;

import java.util.List;

public class Shop implements ISell {

    List<String> cats;

    Cat cat;
    Pet pet;
    private String name;
    Till till;

    private List<Cat> stock;

    public Shop(String name, Till till, List<Cat> stock) {
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

    public List<Cat> getStock() {
        return stock;
    }

    @Override
    public Double calculateMarkup() {
        return pet.calculateMarkup();
    }

    public int getStockCount() {
        return stock.size();
    }

    public Cat findCat(String catToFind) {
        return stock
                .stream()
                .filter(cats -> cats.getName().equals(catToFind))
                        .findFirst()
                .orElse(null);

    }

//    public boolean addToStock(Cat cat) {
//        return stock.add(cat);
//    }

    public void removeStock(Cat cat) {
        stock.remove(cat);
    }

}
