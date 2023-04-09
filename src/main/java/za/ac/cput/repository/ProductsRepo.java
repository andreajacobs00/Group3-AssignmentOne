/*
 * Ziyaad Hendricks
 * 22025768
 * Repository for Products
 * */
package za.ac.cput.repository;

import za.ac.cput.domain.Products;
import java.util.HashSet;
import java.util.Set;
public class ProductsRepo implements IProductsRepo{
    private static ProductsRepo repo = null;

    private Set<Products> productsDB = null;

    public static ProductsRepo getRepo(){
        if (repo == null){
            repo = new ProductsRepo();
        }
        return repo;
    }

    @Override
    public Products create(Products products){
        boolean success = productsDB.add(products);
        if(!success){
            return null;
        }
        return products;
    }

    @Override
    public Products read(String product_ID){
        Products products = productsDB.stream()
                .filter(c -> c.getProduct_ID().equals(product_ID))
                .findAny()
                .orElse(null);
        return products;
    }

    @Override
    public Products update(Products products){
        Products oldProduct = read(products.getProduct_ID());
        if(oldProduct != null){
            productsDB.remove(oldProduct);
            productsDB.add(products);
            return products;
        } else{
            productsDB.add(products);
            return products;
        }
    }

    @Override
    public boolean delete(String product_ID){
        Products productToDelete = read(product_ID);
        if(productToDelete == null){
            return false;
        }
        productsDB.remove(productToDelete);
        return true;
    }

    @Override
    public Set<Products> getAll() {
        return null;
    }
}
