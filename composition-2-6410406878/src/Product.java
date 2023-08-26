public class Product {
    private String nameProduct;
    private int countOfProduct;
    private double prices;

    public Product(String nameProduct, int countOfProduct, double prices) {
        this.nameProduct = nameProduct;
        this.countOfProduct = countOfProduct;
        this.prices = prices;
    }


    public String getNameProduct() {
        return nameProduct;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public double getPrices() {
        return prices;
    }
    public double subTotal(){
        return prices * countOfProduct;
    }
}
