/*
 * Booking Factory class
 * Author: Ziyaad Hendricks
 * Student Number: 220257868
 * Date: 07 April 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Car;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class BookingFactory {
    public static Booking createBookingID(Customer custId, Car modelType, Contact custNumber, Package package_Code, boolean booking_Cancellation){
        if(Helper.isNullorEmpty(String.valueOf(custId)) || Helper.isNullorEmpty(String.valueOf(modelType)) || Helper.isNullorEmpty(String.valueOf(custNumber)) || Helper.isNullorEmpty(String.valueOf(package_Code)) || Helper.isNullorEmpty(String.valueOf(booking_Cancellation))){
            return null;
        }

        String booking_ID = Helper.generateBookingID();


        return new Booking.Builder().setBooking_ID(booking_ID)
                .setCustId(custId)
                .setModel_Type(modelType)
                .setCustNumber(custNumber)
                .setPackage_Code(package_Code)
                .setBooking_Cancellation(booking_Cancellation)
                .build();
    }
}
