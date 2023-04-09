package za.ac.cput.repository;
import za.ac.cput.domain.Car;
import java.util.Set;

public interface ICarRepository extends IRepository<Car, String>{

    public Set<Car> getAll();


}
