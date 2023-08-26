import java.util.ArrayList;
import java.util.Scanner;

public class BillUI {
    private Bill bill;
    private ArrayList<Product> products ;
    private double sumPrice;
    public BillUI() {
        this.bill = null;
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        products  = new ArrayList<Product>();

        for(;;){
            System.out.println("Enter Product (end = exit): ");
            String name = input.next();
            if(name.equalsIgnoreCase("end")){
                break;
            }
            System.out.println("Price");
            double price = input.nextDouble();
            System.out.println("QTY (count): ");
            int count = input.nextInt();
//            System.out.println(name+" "+price+" "+count);
            products.add(new Product(name,count,price));

        }
//        System.out.println("end");
        input.close();
        runMain();
    }

    private void runMain() {
        if(products.size()!=0){
            sumPrice=0;
            System.out.println("              INVOICE");
            System.out.println("Sam's Small Appliances\n" +
                "100 Main Street\n" +
                "Anytown, CA 98765");
            System.out.println("\nDescription         Price    Qty   Subtotal");
            for(int i=0 ;i< products.size();i++){
                bill = new Bill (products.get(i));
                double pay = bill.totalPay();
                System.out.printf("%-10s %15.2f   %2d   %8.2f\n",products.get(i).getNameProduct(),products.get(i).getPrices(),products.get(i).getCountOfProduct(),pay);
                sumPrice += pay;

            }
            System.out.println("\nTOTAL TO PAY: $ "+sumPrice);
        }
    }


}
