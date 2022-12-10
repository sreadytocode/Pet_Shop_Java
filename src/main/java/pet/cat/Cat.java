package pet.cat;

import pet.Pet;

public abstract class Cat extends Pet {

    private String name;
    CatAgeType catAgeType;

    public Cat(double priceBought, double priceSold, String name, CatAgeType catAgeType) {
        super(priceBought, priceSold);
        this.name = name;
        this.catAgeType = catAgeType;
    }

    public String getName() {
        return name;
    }

    public CatAgeType getCatAgeType() {
        return catAgeType;
    }
}
