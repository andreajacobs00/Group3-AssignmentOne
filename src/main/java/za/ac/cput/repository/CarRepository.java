package za.ac.cput.repository;

import za.ac.cput.domain.Car;

import java.util.HashSet;
import java.util.Set;

public class CarRepository implements ICarRepository{

    private static CarRepository respository = null;

    // this is to add objects in my set
    private Set<Car> carDB = null;

    private CarRepository() { carDB = new HashSet<Car>();
    }
    // my signaltin methods to sort data
    public static CarRepository getRespository(){

        if (respository == null){
            respository = new CarRepository();

        }
        return respository;
    }
    @Override
    public Car create(Car car){
        boolean success = carDB.add(car);
        if (!success)
            return null;
        return car;
    }
    // where i read i need to use the primary key
    // passing a the primary key returning an objects
    @Override
    public Car read(String  carID){
        Car car = carDB.stream()
                .filter(e-> e.getCarID().equals(carID))
                .findAny()
                .orElse(null);
        return car;

    }
    //passing through objects to get old values and remove then amd then update it
    @Override
    public Car update (Car car){
        Car oldCar = read(car.getCarID());
        if(oldCar != null){
            carDB.remove(oldCar);
            carDB.add(car);
            return car;
        }
        else{
            carDB.add(car);
            return car;
        }



    }

    @Override
    public boolean delete(String carID){
        Car carToDelete = read(carID);
        if(carToDelete == null)
            return false;
        carDB.remove(carToDelete);
        return true;

    }
    @Override
    public Set<Car> getAll(){
        return carDB;
    }

}

