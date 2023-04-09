/*
Author@ Joshua Edward Nolte _ 219342717
 Domain Class for Customer
 */
package za.ac.cput.domain;

public class Customer {

    //Variable Names
    private String custId;
    private String firstName;
    private String lastName;

    //private Builder Constructors
    private Customer(Builder builder){
        this.custId = builder. custId;
        this.firstName = builder. firstName;
        this.lastName = builder. lastName;
    }
    //Getters
    public String getCustId() {
        return custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //toString
    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    //Builder Class
    public static class Builder {
        private String custId;
        private String firstName;
        private String lastName;

        //Builder Setters
        public Builder setCustId(String custId) {
            this.custId = custId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        //Builder Copy Object

        public Builder copy (Customer customer){
            this.custId = customer.custId;
            this.firstName = customer.firstName;
            this.lastName= customer.lastName;
            return this;
        }
        public Customer build(){
            return new Customer(this); //anonymous object
        }
    }
}
