// Aquilla Williams
// 217284205
//ADP3 Assignment1

package za.ac.cput.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Car;
import za.ac.cput.domain.Contact;
import za.ac.cput.factory.CarFactory;
import za.ac.cput.factory.ContactFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class CarRepositoryTest {

    private static CarRepository repository = CarRepository.getRespository();
    private static Car car = CarFactory.createCar("12358CAA", "0006", "Toyota", "gray");


    @Test
    void a_create() {

        Car created = repository.create(car);
        assertEquals(car.getCarID(), created.getCarID());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read(){
        Car read = repository.read(car.getCarID());
        assertNotNull(read);
        System.out.println("Read:"+ read);
}
    @Test
    void c_update() {

        Car updated = new Car.Builder().copy(car).setCarID("125879CAA")
                .setCustID("0003")
                .setModelType("BMW")
                .setCarColor("blue")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Update: "+ updated);
    }

    @Test
    void d_delete() {

        boolean success = repository.delete(car.getCarID());
        assertTrue(success);
        System.out.println("Delete:"+ success);
    }

    @Test
    void e_getAll() {

        System.out.println("Show all the values");
        System.out.println(repository.getAll());
    }
}