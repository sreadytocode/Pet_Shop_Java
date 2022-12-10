package pet.cat;

import behaviour.IMeow;
import behaviour.IPlay;

public class Ragdoll extends Cat implements IMeow, IPlay {

    public Ragdoll(double priceBought, double priceSold, String name, CatAgeType catAgeType) {
        super(priceBought, priceSold, name, catAgeType);
    }

    @Override
    public String meow(String name) {
        return String.format("Meow meow meowwwwww %s meoww", name);
    }

    @Override
    public String play() {
        return "Playtime wohoo then naptime";
    }
}
