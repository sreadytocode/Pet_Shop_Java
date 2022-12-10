package petshop;

public class Shop {
    private String name;
    Till till;

    public Shop(String name, Till till) {
        this.name = name;
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public Till getTill() {
        return this.till;
    }
}
