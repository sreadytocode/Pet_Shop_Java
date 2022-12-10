package pet.cat;

import behaviour.IMeow;
import behaviour.IPlay;

public class MaineCoon extends Cat implements IMeow, IPlay {

    public MaineCoon(double priceBought, double priceSold, String name, CatAgeType catAgeType) {
        super(priceBought, priceSold, name, catAgeType);
    }

    public String meow(String name) {
        return String.format("%s goes moewww time to tell Filch", name);
    }


    @Override
    public String play() {
        return "Time to catch if any Hogwart Student's are breaking any rules";
    }
}
