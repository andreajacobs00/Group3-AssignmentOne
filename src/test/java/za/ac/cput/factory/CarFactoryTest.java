// Aquilla Williams
// 217284205
//ADP3 Assignment1
package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    public void test() {
        Car car = CarFactory.createCar("54625CAA", "001", "Audi", "White");
        assertNotNull(car);
        System.out.println(car.toString());

    }
}