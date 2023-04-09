package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Products;

import static org.junit.jupiter.api.Assertions.*;

class ProductsFactoryTest {
    @Test
    public void createProductsTest(){
        Products cProducts = ProductsFactory.createProductsID("Shiny",
                69.99);
        System.out.println(cProducts);
        assertNotNull(cProducts);
    }
}
