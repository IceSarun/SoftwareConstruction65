package Store;

import java.util.List;

class CountProductQuantity implements Counter<Product>{
    public int countProduct(List<Product> products){
        int count=0;
        for(Product prod : products){
            count+=prod.getQuantity();
        }
        return count;
    }
}
