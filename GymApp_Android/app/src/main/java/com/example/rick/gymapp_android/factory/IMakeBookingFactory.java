package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.MakeBooking;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface IMakeBookingFactory {
    MakeBooking createBooking(String bookingName, String date, String timeSlot, String instructor, String gymLocation);
}
