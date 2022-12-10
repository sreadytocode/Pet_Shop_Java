package petshop;

public class Till {
 private double cash;

    public Till(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void addMoney(double money) {
        cash += money;
    }

    public void reduceMoney(double money) {
        cash -= money;
    }
}
