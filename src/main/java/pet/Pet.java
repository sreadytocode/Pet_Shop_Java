package pet;

public abstract class Pet {
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
}
