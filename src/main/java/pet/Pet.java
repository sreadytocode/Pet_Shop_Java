package pet;

import behaviour.ISell;

public abstract class Pet implements ISell {
    private double priceBought;
    private double priceSold;

    public Pet(double priceBought, double priceSold) {
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }

    @Override
    public Double calculateMarkup() {
        return priceSold - priceBought;
    }

}
