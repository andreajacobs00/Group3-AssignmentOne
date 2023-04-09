/*
Author@ Joshua Edward Nolte _ 219342717
 Domain Class for Employee
 */
package za.ac.cput.domain;

public class Employee {
    //Variable names
    private String employeeId;

    //Builder Constructor
    private Employee(Builder builder){
        this.employeeId = builder.employeeId;
    }
    //Getters
    public String getEmployeeId() {
        return employeeId;
    }

    //toString
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }

    //Builder Class
    public static class Builder {
        private String employeeId;
        //Builder Setters
        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        //Builder Copy Object
        public Builder copy (Employee employee){
            this.employeeId = employee.employeeId;
            return this;
        }
        public Employee build(){
            return new Employee(this); //anonymous object
        }
    }
}
