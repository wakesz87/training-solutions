package week05d04;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Store {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public Store(List<Product> products) {
        this.products = products;
    }

    public Store() {
        this.products = products;
    }

    public void addProduct(Product plusProduct) {
        boolean add = true;
        for (Product product : products) {
            if (plusProduct.getExpired().isBefore(LocalDate.now()) || product.getProductName().equals(plusProduct.getProductName())) {
                add = false;
            }
        }
        if (add) {
            products.add(plusProduct);
        }
    }

    public int getNumberOfExpired() {
        int counter = 0;
        for (Product product : products) {
            if (product.getExpired().isBefore(LocalDate.now())) {
                counter++;
            }
        }
        return counter;
    }


}
