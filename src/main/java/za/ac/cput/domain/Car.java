package za.ac.cput.domain;

public class Car {


    private String carID;

    private String custID;

    private String modelType;

    private String carColor;

    // Builder Constructor
    private Car (Builder builder){


        this.carID = builder.carID;
        this.custID = builder.custID;
        this.modelType = builder.modelType;
        this.carColor = builder.carColor;


    }
    // Getters


    public String getCarID() {
        return carID;
    }

    public String getCustID() {
        return custID;
    }

    public String getModelType() {
        return modelType;
    }

    public String getCarColor() {
        return carColor;
    }
    public static  class Builder{

        private String carID;

        private String custID;

        private String modelType;

        private String carColor;

        public Car.Builder setCarID(String carID){
            this.carID = carID;
            return this;
        }
        public Car.Builder setCustID(String custID){
            this.custID = custID;
            return this;
        }
        public Car.Builder setModelType(String modelType){
            this.modelType = modelType;
            return this;
        }
        public Car.Builder setCarColor(String carColor){
            this.carColor = carColor;
            return this;
        }

        public Car.Builder copy(Car car){

            this.carID = car.carID;
            this.custID = car.custID;
            this.modelType = car.modelType;
            this.carColor = car.carColor;
            return this;
        }

        public Car build(){
            return new Car(this);

        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "carID='" + carID + '\'' +
                ", custID='" + custID + '\'' +
                ", modelType='" + modelType + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
