package week06d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void testProduct() {
        Product product1 = new Product("Kenyér", 220, Category.DAIRY);
        assertEquals("Kenyér", "Kenyér", product1.toString());
    }

    @Test
    public void testProductNoName() throws NullPointerException {
        Exception ex = assertThrows(NullPointerException.class, () -> new Product(null, 220, Category.DAIRY));
        assertEquals("A termék neve nem lehet Null!", ex.getMessage());
    }

    @Test
    public void testProductNoCategory() throws NullPointerException {
        Exception ex = assertThrows(NullPointerException.class, () -> new Product("Kenyér", 220, null));
        assertEquals("A termék kategóriája nem lehet Null!", ex.getMessage());
    }

    @Test
    public void testProductNoPrice() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Product("Kenyér", 0, Category.DAIRY));
        assertEquals("A termék ára nem lehet nulla vagy kisebb!", ex.getMessage());
    }

}
