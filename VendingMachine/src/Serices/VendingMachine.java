package Serices;

import java.util.List;

import Domen.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDespenser dispenser;
    private List<Product> assort;
    private Display display;

    public VendingMachine(Holder holder, CoinDespenser dispenser, List<Product> assort, Display display) {
        this.holder = holder;
        this.dispenser = dispenser;
        this.assort = assort;
        this.display = display;
    }

    public List<Product> getProducts() {
        return assort;
    }

    public void buyProduct(Product p, int price) {
        if (assort.contains(p) && holder.getBalance() >= price) {
            if (dispenser.dispense(price)) {
                releaseProduct(p, holder);
                display.print("You have successfully bought " + p.getName() + ".");
            }
        } else {
            display.print("Product not available or insufficient balance.");
        }
    }

    public void releaseProduct(Product p, Holder h) {
        h.release(0, 0);
        assort.remove(p);
    }

    public void cancel() {
        dispenser.giveChahge(10, 5);
    }
}
