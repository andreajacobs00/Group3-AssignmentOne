/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 04 April 2023
 */
package domain;

public class CustomerAddress {
    private String houseNumber;
    private String streetName;
    private String suburb;
    private String postalCode;
    private String customerID;
    public CustomerAddress(Builder builder) {
        this.houseNumber = builder.houseNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.postalCode = builder.postalCode;
        this.customerID = builder.customerID;
    }
    public CustomerAddress() {
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String customerID() {
        return customerID;
    }
    @Override
    public String toString() {
        return "CustomerAddress{" +
                "houseNumber='" + houseNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", customerID='" + customerID + '\'' +
                '}';
    }
    public static class Builder {
        private String houseNumber;
        private String streetName;
        private String suburb;
        private String postalCode;
        private String customerID;
        public Builder setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
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

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }
        public Builder copy(CustomerAddress address) {
            this.houseNumber = address.houseNumber;
            this.streetName = address.streetName;
            this.suburb = address.suburb;
            this.postalCode = address.postalCode;
            this.customerID = address.customerID;
            return this;
        }
        public CustomerAddress build() {
            return new CustomerAddress(this);
        }
    }
}
