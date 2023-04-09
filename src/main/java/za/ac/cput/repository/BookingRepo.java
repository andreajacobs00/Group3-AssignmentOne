/*
 * Ziyaad Hendricks
 * 22025768
 * Repository for Booking
 * */
package za.ac.cput.repository;

import za.ac.cput.domain.Booking;
import java.util.HashSet;
import java.util.Set;

public class BookingRepo implements IBookingRepo{
    private static BookingRepo repo = null;
    private Set<Booking> bookingDB = null;

    public static BookingRepo getRepo(){
        if (repo == null){
            repo = new BookingRepo();
        }
        return repo;
    }

    @Override
    public Booking create(Booking booking){
        boolean success = bookingDB.add(booking);
        if(!success){
            return null;
        }
        return booking;
    }

    @Override
    public Booking read(String booking_ID){
        Booking booking = bookingDB.stream()
                .filter(c -> c.getBooking_ID().equals(booking_ID))
                .findAny()
                .orElse(null);
        return booking;
    }

    @Override
    public Booking update(Booking booking){
        Booking oldBooking = read(booking.getBooking_ID());
        if(oldBooking != null){
            bookingDB.remove(oldBooking);
            bookingDB.add(booking);
            return booking;
        } else{
            bookingDB.add(booking);
            return booking;
        }
    }

    @Override
    public boolean delete(String booking_ID){
        Booking bookingToDelete = read(booking_ID);
        if(bookingToDelete == null){
            return false;
        }
        bookingDB.remove(bookingToDelete);
        return true;
    }

    @Override
    public Set<Booking> getAll() {
        return null;
    }
}
