package Store;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Store store = new Store(new CountAllProduct());
        store.addProduct("Big Java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);
        System.out.println("Count all product : "+ store.countProduct());

        store.setCounter(new CountProductInStock());
        System.out.println("Count product in stock : "+store.countProduct());

        store.setCounter(new CountProductQuantity());
        System.out.println("Count product quantity : "+store.countProduct());
    }




}
