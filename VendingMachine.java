package UTS;

public interface VendingMachine {
    void displayProduct();

    void selectProduct(int product);

    void displayEnterCoinsMessage();

    void enterCoins(int... coin);
    
    void displayChangeMessage();
}
