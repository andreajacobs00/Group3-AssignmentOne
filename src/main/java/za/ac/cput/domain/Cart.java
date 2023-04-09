/** Cart.java
 * This is a POJO class
 * This class is immutable (objects should not be changed)
 * Cebisani Lamani (219104409)
 * 17 March 2023
 * */
package za.ac.cput.domain;
public class Cart {
    private String cart_ID;
    private Customer customer_ID;
    private Products product_ID;
    private int quantity;
    private double total_Amount;

    public Cart() {
    }
    // Builder Constructor
    public Cart(Builder builder){
        this.cart_ID = builder.cart_ID;
        this.customer_ID = builder.customer_ID;
        this.product_ID = builder.product_ID;
        this.quantity = builder.quantity;
        this.total_Amount = builder.total_Amount;
    }


    public String getCart_ID() {
        return cart_ID;
    }

    public Customer getCustomer_ID() {
        return customer_ID;
    }

    public Products getProduct_ID() {
        return product_ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal_Amount() {
        return total_Amount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "booking_ID='" + cart_ID + '\'' +
                ", customer_ID=" + customer_ID.getCustId() +
                ", product_ID=" + product_ID +
                ", quantity=" + quantity +
                ", total_Amount=" + total_Amount +
                '}';
    }

    public static class Builder{
        private String cart_ID;
        private Customer customer_ID;
        private Products product_ID;
        private int quantity;
        private double total_Amount;

        public Builder setCart_ID(String cart_ID) {
            this.cart_ID = cart_ID;
            return this;
        }

        public Builder setCustomer_ID(Customer customer_ID) {
            this.customer_ID = customer_ID;
            return this;
        }

        public Builder setProduct_ID(Products product_ID) {
            this.product_ID = product_ID;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            this.total_Amount = (quantity >= 1) ? product_ID.getProduct_Price() * quantity : 0.0;
            return this;
        }

        public Builder setTotal_Amount(double total_Amount) {
            this.total_Amount = total_Amount;
            return this;
        }

        public Builder copy(Cart cart){
            this.cart_ID = cart.cart_ID;
            this.customer_ID = cart.customer_ID;
            this.product_ID = cart.product_ID;
            this.quantity = cart.quantity;
            this.total_Amount = cart.total_Amount;
            return this;
        }

        public Cart build(){return new Cart(this);}
    }
}