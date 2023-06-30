import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Serices.CoinDespenser;
import Serices.Display;
import Serices.Holder;
import Serices.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays", 010);
        Product item2 = new Product(50, 2, "Cola", 110);
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, 1.5f);
        Product item4 = new HotDrink(50, 4, "Cappucino", 103, 73);
        Product item5 = new HotDrink(55, 5, "Latte", 104, 75);
        Product item6 = new HotDrink(45, 6, "Americano", 111, 90);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);
        Holder hold1 = new Holder(4, 4);
        Display disp = new Display();
        CoinDespenser coinDesp = new CoinDespenser(200);
        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        for (Product prod : venMachine.getProducts()) {
            System.out.println(prod);
        }

        // System.out.println("Hello, World!");
    }
}
