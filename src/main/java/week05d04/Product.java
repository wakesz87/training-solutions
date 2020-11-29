package week05d04;

import java.time.LocalDate;

public class Product {
    private String productName;
    private LocalDate expired;

    public Product(String productName, int year, int month, int day) {
        this.productName = productName;
        this.expired = LocalDate.of(year, month, day);
    }

    public String getProductName() {
        return productName;
    }

    public LocalDate getExpired() {
        return expired;
    }
}
