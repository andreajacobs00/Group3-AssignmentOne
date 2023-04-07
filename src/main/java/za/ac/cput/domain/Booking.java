package za.ac.cput.domain;

public class Booking {
    private String booking_ID;
    //private Customer cust_ID;
    //private Car model_Type;
    //private Contact cust_No;
    //private Package package_Code;
    private boolean booking_Cancellation;

    public Booking(Builder builder){
        this.booking_ID = builder.booking_ID;
        //this.cust_ID = builder.cust_ID;
        //this.model_Type = builder.model_Type;
        //this.cust_No = builder.cust_No;
        //this.package_Code = builder.package_Code;
        this.booking_Cancellation = builder.booking_Cancellation;
    }

    public Booking(){
    }

    public String getBooking_ID() {
        return booking_ID;
    }

//    public Customer getCust_ID(){
//        return cust_ID;
//    }

//    public Car getModel_Type(){
//        return model_Type;
//    }

//    public Contact getCust_No(){
//        return cust_No;
//    }

//    public Package getPackage_Code(){
//        return package_Code;
//    }

    public boolean getBooking_Cancellation(){
        return booking_Cancellation;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_ID='" + booking_ID + '\'' +
//                "cust_ID=" + cust_ID + '\'' +
//                "model_Type=" + model_Type + '\'' +
//                "cust_No=" + cust_No + '\'' +
//                "package_Code" + package_Code + '\'' +
                ", booking_Cancellation=" + booking_Cancellation +
                '}';
    }

    public static class Builder{
        private String booking_ID;
        //private Customer cust_ID;
        //private Car model_Type;
        //private Contact cust_No;
        //private Package package_Code;
        private boolean booking_Cancellation;

        public Builder setBooking_ID(String booking_ID){
            this.booking_ID = booking_ID;
            return this;
        }

//        public Builder setCust_ID(Customer cust_ID){
//            this.cust_ID = cust_ID;
//            return this;
//        }

//        public Builder setModel_Type(Car model_Type){
//            this.model_Type = model_Type;
//            return this;
//        }

//        public Builder setCust_No(Contact cust_No){
//            this.cust_No = cust_No;
//            return this;
//        }

//        public Builder setPackage_Code(Package package_Code){
//            this.package_Code = package_Code;
//            return this;
//        }

        public Builder setBooking_Cancellation(boolean booking_Cancellation){
            this.booking_Cancellation = booking_Cancellation;
            return this;
        }

        public Builder copy(Booking booking){
            this.booking_ID = booking.booking_ID;
            //this.cust_ID = booking.cust_ID;
            //this.model_Type = booking.model_Type;
            //this.cust_No = booking.cust_No;
            //this.package_Code = booking.package_Code;
            this.booking_Cancellation = booking.booking_Cancellation;
            return this;
        }

        public Booking build(){return new Booking(this);}
    }


}
