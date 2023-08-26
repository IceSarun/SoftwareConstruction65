package Store;

import java.util.List;

public class CountProductInStock implements Counter<Product>{
    public int countProduct(List<Product> products){
        int count=0;
        for(Product prod : products){
            if(prod.getQuantity()>0){
                count+=1;
            }
        }
        return count;
    }
}
