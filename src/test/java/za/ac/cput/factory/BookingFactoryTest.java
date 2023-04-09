package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Car;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {
    @Test
    public void test(){
        Customer customer = CustomerFactory.createCustomer("219104409", "Cebisani", "Lamani");
        Car car = CarFactory.createCar("5153158","219104409", "Almera", "White");
        Contact contact = ContactFactory.createContact("12", "219104409", "clamani@gmail.com", "124637357");
        //Package package = PackageFactory.createPackage();
        //Booking booking = BookingFactory.createBookingID(customer, car, contact , package, false);
        //System.out.println(booking.toString());
        //assertNotNull(booking);
    }
}
