package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.MakeBooking;
import com.example.rick.gymapp_android.factory.IMakeBookingFactory;

import java.util.UUID;

/**
 * Created by Rick on 17-Apr-16.
 */
public class MakeBookingFactory implements IMakeBookingFactory {
    private static MakeBookingFactory factory = null;

    public static MakeBookingFactory getFactoryInstance()
    {
        if(factory == null)
            factory = new MakeBookingFactory();

        return factory;
    }

    public MakeBooking createBooking(String bookingName, String date, String timeSlot, String instructor, String gymLocation){
        MakeBooking makeBooking = new MakeBooking
                .Builder()
                .setId(UUID.randomUUID().toString())
                .setBookingName(bookingName)
                .setDate(date)
                .setTimeSlot(timeSlot)
                .setInstructor(instructor)
                .setGymLocation(gymLocation)
                .build();

        return makeBooking;
    }
}
