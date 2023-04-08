/** Cart.java
 * This is a POJO class
 * This class is immutable (objects should not be changed)
 * Cebisani Lamani (219104409)
 * 17 March 2023
 * */
package za.ac.cput.domain;

public class EmployeeAddress {
    private String address_ID;
    private Employee employee_ID;
    private String house_No;
    private String street_Name;
    private String suburb;
    private String postal_Code;


    public EmployeeAddress() {
    }
    // Builder Constructor
    public EmployeeAddress(Builder builder){
        this.address_ID = builder.address_ID;
        this.employee_ID = builder.employee_ID;
        this.house_No = builder.house_No;
        this.street_Name = builder.street_Name;
        this.suburb = builder.suburb;
        this.postal_Code = builder.postal_Code;
    }

    public String getAddress_ID() {
        return address_ID;
    }

    public Employee getEmployee_ID() {
        return employee_ID;
    }

    public String getHouse_No() {
        return house_No;
    }

    public String getStreet_Name() {
        return street_Name;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getPostal_Code() {
        return postal_Code;
    }

    @Override
    public String toString() {
        return "EmployeeAddressFactory{" +
                "address_ID=" + address_ID +
                ", employee_ID=" + employee_ID.getEmployee_ID() +
                ", house_No='" + house_No + '\'' +
                ", street_Name='" + street_Name + '\'' +
                ", suburb='" + suburb + '\'' +
                ", postal_Code='" + postal_Code + '\'' +
                '}';
    }

    public static class Builder{
        private String address_ID;
        private Employee employee_ID;
        private String house_No;
        private String street_Name;
        private String suburb;
        private String postal_Code;

        public Builder setAddress_ID(String address_ID) {
            this.address_ID = address_ID;
            return this;
        }

        public Builder setEmployee(Employee employee) {
            this.employee_ID = employee;
            return this;
        }

        public Builder setHouse_No(String house_No) {
            this.house_No = house_No;
            return this;
        }

        public Builder setStreet_Name(String street_Name) {
            this.street_Name = street_Name;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setPostal_Code(String postal_Code) {
            this.postal_Code = postal_Code;
            return this;
        }
        // Builder class copy builder
        public Builder copy(EmployeeAddress employeeAddress){
            this.address_ID = employeeAddress.address_ID;
            this.employee_ID = employeeAddress.employee_ID;
            this.house_No = employeeAddress.house_No;
            this.street_Name = employeeAddress.street_Name;
            this.suburb = employeeAddress.suburb;
            this.postal_Code = employeeAddress.postal_Code;
            return this;
        }

        public EmployeeAddress build(){return new EmployeeAddress(this);}

    }
}