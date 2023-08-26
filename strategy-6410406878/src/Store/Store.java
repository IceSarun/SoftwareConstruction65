package Store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    private Counter counter;

    public Store(Counter counter) {
        this.counter = counter;
        products = new ArrayList<>();
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public int countProduct(){
        return counter.countProduct(products);
    }





}
