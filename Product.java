package UTS;

public enum Product {
    BAKSO_HALUS(3000), BAKSO_URAT(3500), BAKSO_TELUR_PUYUH(4000), BAKWAN(2000), TAHU(1000), MIE_BIHUN(1000);

    private int id;
    private int price;

    Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }
}
