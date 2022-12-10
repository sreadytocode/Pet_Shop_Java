package pet.cat;

import behaviour.IMeow;
import behaviour.IPlay;

public class Persian extends Cat implements IMeow, IPlay {
    public Persian(double priceBought, double priceSold, String name, CatAgeType catAgeType) {
        super(priceBought, priceSold, name, catAgeType);
    }

    @Override
    public String meow(String name) {
        return String.format("%s wants food now meow meow", name);
    }

    @Override
    public String play() {
        return "Yayy playtime *rolls around*";
    }
}
