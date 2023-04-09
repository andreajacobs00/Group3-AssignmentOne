/*
* Ziyaad Hendricks
* 220257868
* Booking Pojo builder class
* */
package za.ac.cput.domain;

public class Booking {
    private String booking_ID;
    private Customer custId;
    private Car modelType;
    private Contact custNumber;
    private Package package_Code;
    private boolean booking_Cancellation;

    public Booking(Builder builder){
        this.booking_ID = builder.booking_ID;
        this.custId = builder.custId;
        this.modelType = builder.modelType;
        this.custNumber = builder.custNumber;
        this.package_Code = builder.package_Code;
        this.booking_Cancellation = builder.booking_Cancellation;
    }

    public Booking(){
    }

    public String getBooking_ID() {
        return booking_ID;
    }

    public Customer getCustId(){
        return custId;
    }

    public Car getModelType(){
        return modelType;
    }

    public Contact getCustNumber(){
        return custNumber;
    }

    public Package getPackage_Code(){
        return package_Code;
    }

    public boolean getBooking_Cancellation(){
        return booking_Cancellation;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_ID='" + booking_ID + '\'' +
                "custId=" + custId + '\'' +
                "modelType=" + modelType + '\'' +
                "cust_No=" + custNumber + '\'' +
                "package_Code" + package_Code + '\'' +
                ", booking_Cancellation=" + booking_Cancellation +
                '}';
    }

    public static class Builder{
        private String booking_ID;
        private Customer custId;
        private Car modelType;
        private Contact custNumber;
        private Package package_Code;
        private boolean booking_Cancellation;

        public Builder setBooking_ID(String booking_ID){
            this.booking_ID = booking_ID;
            return this;
        }

        public Builder setCustId(Customer custId){
            this.custId = custId;
            return this;
        }

        public Builder setModel_Type(Car modelType){
            this.modelType = modelType;
            return this;
        }

        public Builder setCustNumber(Contact custNumber){
            this.custNumber = custNumber;
            return this;
        }

        public Builder setPackage_Code(Package package_Code){
            this.package_Code = package_Code;
            return this;
        }

        public Builder setBooking_Cancellation(boolean booking_Cancellation){
            this.booking_Cancellation = booking_Cancellation;
            return this;
        }

        public Builder copy(Booking booking){
            this.booking_ID = booking.booking_ID;
            this.custId = booking.custId;
            this.modelType = booking.modelType;
            this.custNumber = booking.custNumber;
            this.package_Code = booking.package_Code;
            this.booking_Cancellation = booking.booking_Cancellation;
            return this;
        }

        public Booking build(){return new Booking(this);}
    }


}
