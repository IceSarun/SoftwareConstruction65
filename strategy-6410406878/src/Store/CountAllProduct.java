package Store;

import java.util.List;

public class CountAllProduct implements Counter<Product>{
    public int countProduct(List<Product> products){
        int count=0;
        for(Product prod : products){
            count+=1;
        }
        return count;
    }
}