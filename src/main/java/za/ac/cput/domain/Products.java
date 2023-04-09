package za.ac.cput.domain;

public class Products {
    private String product_ID;
    private String product_Desc;
    private double product_Price;

    public Products(Builder builder){
        this.product_ID = builder.product_ID;
        this.product_Desc = builder.product_Desc;
        this.product_Price = builder.product_Price;
    }

    public Products(){
    }

    public String getProduct_ID() {
        return product_ID;
    }

    public String getProduct_Desc() {
        return product_Desc;
    }

    public double getProduct_Price() {
        return product_Price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_ID='" + product_ID + '\'' +
                ", product_Desc='" + product_Desc + '\'' +
                ", product_Price=" + product_Price +
                '}';
    }

    public static class Builder{
        private String product_ID;
        private String product_Desc;
        private double product_Price;

        public Builder setProduct_ID(String product_ID){
            this.product_ID = product_ID;
            return this;
        }

        public Builder setProduct_Desc(String product_Desc){
            this.product_Desc = product_Desc;
            return this;
        }

        public Builder setProduct_Price(double product_Price){
            this.product_Price = product_Price;
            return this;
        }

        public Products.Builder copy(Products products){
            this.product_ID = products.product_ID;
            this.product_Desc = products.product_Desc;
            this.product_Price = products.product_Price;
            return this;
        }

        public Products build(){return new Products(this);}
    }
}
