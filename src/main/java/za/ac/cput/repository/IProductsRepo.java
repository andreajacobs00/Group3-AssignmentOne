/*
* Ziyaad Hendricks
* 22025768
* Interface Repository for Products
* */
package za.ac.cput.repository;

import za.ac.cput.domain.Products;
import java.util.Set;
public interface IProductsRepo extends IRepository<Products, String>{
    public Set<Products> getAll();
}
