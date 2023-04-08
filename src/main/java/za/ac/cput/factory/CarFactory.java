package za.ac.cput.factory;

import za.ac.cput.domain.Car;
import za.ac.cput.util.Helper;

public class CarFactory {


    public static Car createCar(String carID, String custID, String modelType, String carColor){

        if(Helper.isNullorEmpty(carID) || Helper.isNullorEmpty(custID) || Helper.isNullorEmpty(modelType) || Helper.isNullorEmpty(carColor))
            return null;
        return new Car.Builder().setCarID(carID)
                .setCustID(custID)
                .setModelType(modelType)
                .setCarColor(carColor)
                .build();
    }
}
