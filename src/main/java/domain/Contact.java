package domain;

public class Contact {

    private String custNumber;

    private String custID;

    private String custEmail;

    private String custAltNumber;


    //builder COnstructor

    private Contact(){}

    private Contact(Builder builder){

        this.custNumber = builder.custNumber;
        this.custID = builder.custID;
        this.custEmail = builder.custEmail;
        this.custAltNumber = builder.custAltNumber;

    }

    // getter as the class will be immuteable


    public String getCustNumber() {
        return custNumber;
    }

    public String getCustID() {
        return custID;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public String getCustAltNumber() {
        return custAltNumber;
    }

    public static  class Builder{

        private String custNumber;

        private String custID;

        private String custEmail;

        private String custAltNumber;

        public Builder setCustNumber(String custNumber){
            this.custNumber = custNumber;
            return this;
        }
        public Builder setCustID(String custID){
            this.custID = custID;
            return this;
        }
        public Builder setCustEmail(String custEmail){
            this.custEmail = custEmail;
            return this;
        }
        public Builder setCustAltNumber(String custAltNumber){
            this.custAltNumber = custAltNumber;
            return this;
        }

        public Builder copy(Contact contact){

            this.custNumber = contact.custNumber;
            this.custID = contact.custID;
            this.custEmail = contact.custEmail;
            this.custAltNumber = contact.custAltNumber;
            return this;
        }

        public Contact build(){
            return new Contact(this);

        }
    }
    @Override
    public String toString() {
        return "Contact{" +
                "custNumber='" + custNumber + '\'' +
                ", custID='" + custID + '\'' +
                ", custEmail='" + custEmail + '\'' +
                ", custAltNumber='" + custAltNumber + '\'' +
                '}';
    }
}
