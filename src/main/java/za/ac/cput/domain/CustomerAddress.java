/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 04 April 2023
 */
package za.ac.cput.domain;

import java.util.Date;

public class CustomerAddress {
    private String address_ID;
    private Customer cust_ID;
    private String house_No;
    private String streetName;
    private String suburb;
    private long postal_Code;

    public CustomerAddress (Builder builder) {
        this.address_ID = builder.address_ID;
        this.cust_ID = builder.cust_ID;
        this.house_No = builder.house_No;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.postal_Code = Long.parseLong(builder.postal_code);
    }
    public CustomerAddress() {}

    public String getAddress_ID() {
        return address_ID;
    }

     public Customer getCust_ID() {
        return cust_ID;
    }

    public String getHouse_No() {
        return house_No;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public long getPostal_Code() {
        return postal_Code;
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "address_ID='" + address_ID + '\'' +
                ", cust_ID=" + cust_ID +
                ", house_No='" + house_No + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", postal_Code=" + postal_Code +
                '}';
    }
    public static class Builder {
        private String address_ID;
        private Customer cust_ID;
        private String house_No;
        private String streetName;
        private String suburb;
        private String postal_code;

        public Builder setAddress_ID(String address_ID) {
            this.address_ID = address_ID;
            return this;
        }

        public Builder setCust_ID(Customer cust_ID) {
            this.cust_ID = cust_ID;
            return this;
        }

        public Builder setHouse_No(String house_No) {
            this.house_No = house_No;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setPostal_code(String postal_code) {
            this.postal_code = postal_code;
            return this;
        }

        public Builder copy(CustomerAddress customerAddress) {
            this.address_ID = customerAddress.address_ID;
            this.cust_ID = customerAddress.cust_ID;
            this.house_No = customerAddress.house_No;
            this.streetName = customerAddress.streetName;
            this.suburb = customerAddress.suburb;
            this.postal_code = String.valueOf(customerAddress.postal_Code);
            return this;
        }

        public CustomerAddress build() {
            return new CustomerAddress(this);
        }
    }
}
