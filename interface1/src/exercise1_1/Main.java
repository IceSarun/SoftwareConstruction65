package exercise1_1;

public class Main {
    public static void main(String[] args) {

        Measurable[] car = new Measurable[4];
        car[0] = new Car("B-1",2303.5);
        car[1] = new Car("B-2",560.75);
        car[2] = new Car("B-3",290.34);
        car[3] = new Car("B-4",4500);

        double min = Data.min(car);
        System.out.println("Min kilo = "+min);

        Measurable[] product = new Measurable[4];
        product[0] = new Product("Avalon",765);
        product[1] = new Product("Salem",900);
        product[2] = new Product("Oceans",2500);
        product[3] = new Product("Bingo",4000);

        double min2 = Data.min(product);
        System.out.println("Min price = "+min2);
    }
}
