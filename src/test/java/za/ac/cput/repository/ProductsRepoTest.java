/*
 * Ziyaad Hendricks
 * 22025768
 * Repository Test class for Products
 * */
package za.ac.cput.repository;

import za.ac.cput.domain.Products;
import za.ac.cput.factory.ProductsFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ProductsRepoTest{
    private static ProductsRepo repo = ProductsRepo.getRepo();
    private static Products product = ProductsFactory.createProductsID("Sticky", 79.99);

    @Test
    void a_create(){
        Products created = repo.create(product);
        assertEquals(product.getProduct_ID(), created.getProduct_ID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read(){
        Products read = repo.read(product.getProduct_ID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update(){
        Products updated = new Products.Builder().copy(product)
                .setProduct_Desc("Clean")
                .setProduct_Price(89.99)
                .build();
        assertNotNull(repo.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete(){
        boolean success = repo.delete(product.getProduct_ID());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void e_getAll(){
        System.out.println("Show all: ");
        System.out.println(repo.getAll());
    }
}
