/*
 * Ziyaad Hendricks
 * 22025768
 * Interface Repository for Booking
 * */
package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.Set;

public interface IBookingRepo extends IRepository<Booking, String> {
    public Set<Booking> getAll();
}
