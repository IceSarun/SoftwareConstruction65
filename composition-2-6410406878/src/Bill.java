import java.util.Scanner;

public class Bill {
    private Product product;
    private double sumPrice;

    public Bill(Product product) {
        this.product = product;
        sumPrice=0;
    }

    public double totalPay(){
        sumPrice += product.subTotal();
        return sumPrice;
    }

    public Product getProduct() {
        return product;
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void end() {
        product = null;
    }

}
