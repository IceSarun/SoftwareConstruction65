package exercise2_1;

public class PriceMeasure implements Measurer{

    @Override
    public double measure(Object object) {
        Product product = (Product) object;
        return product.getPrice();
    }
}
