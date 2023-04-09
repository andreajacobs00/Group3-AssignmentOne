/*
 * Ziyaad Hendricks
 * 22025768
 * Repository Test class for Booking
 * */
package za.ac.cput.repository;

import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BookingRepoTest {
    private static BookingRepo repo = BookingRepo.getRepo();
    private static Booking booking = BookingFactory.createBookingID();

    @Test
    void a_create(){
        Booking created = repo.create(booking);
        assertEquals(booking.getBooking_ID(), created.getBooking_ID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read(){
        Booking read = repo.read(booking.getBooking_ID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
//    void c_update(){
//        Booking updated = new Booking.Builder().copy(booking)
//                .getCustId("124415")
//                .getModelType("Sedan")
//                .getCustNumber("021 523 2354")
//                .getPackage_Code("328")
//                .getBooking_Cancellation(false)
//                .build();
//        assertNotNull(repo.update(updated));
//        System.out.println("Updated: " + updated);
//    }

    @Test
    void d_delete(){
        boolean success = repo.delete(booking.getBooking_ID());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void e_getAll(){
        System.out.println("Show all: ");
        System.out.println(repo.getAll());
    }
}
