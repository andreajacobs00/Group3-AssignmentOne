/*
 * Products Factory class
 * Author: Ziyaad Hendricks
 * Student Number: 220257868
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Products;
import za.ac.cput.util.Helper;
public class ProductsFactory {
    public static Products createProductsID(String product_Desc, double product_Price){
        if(Helper.isNullorEmpty(product_Desc) || Helper.isNullorEmpty(String.valueOf(product_Price))){
            return null;
        }

        String product_ID = Helper.generateProductsID();

        return new Products.Builder().setProduct_ID(product_ID)
                .setProduct_Desc(product_Desc)
                .setProduct_Price(product_Price)
                .build();

    }
}
