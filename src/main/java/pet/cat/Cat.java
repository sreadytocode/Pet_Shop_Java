package pet.cat;

import pet.Pet;

public abstract class Cat extends Pet {

    private String name;

    public Cat(double priceBought, double priceSold, String name) {
        super(priceBought, priceSold);
        this.name = name;
    }
}
