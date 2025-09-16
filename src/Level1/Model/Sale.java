package Level1.Model;

import Level1.Exceptions.EmptySaleException;

import java.util.ArrayList;

public class Sale {
    ArrayList<Product> products = new ArrayList<>();
    int totalPrice;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotalPrice() throws EmptySaleException {
        if (products.isEmpty()){
            throw new EmptySaleException();
        }
        totalPrice = 0;
        for(Product product: products){
            totalPrice += product.getPrice();
        }
    }
}
