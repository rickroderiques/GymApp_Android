package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.CreateUserSchedule;
import com.example.rick.gymapp_android.factory.ICreateUserScheduleFactory;

/**
 * Created by Rick on 17-Apr-16.
 */
public class CreateUserScheduleFactory  implements ICreateUserScheduleFactory {
    private static CreateUserScheduleFactory factory = null;

    public CreateUserScheduleFactory(){}

    public static CreateUserScheduleFactory getFactoryInstance()
    {
        if(factory == null)
            factory = new CreateUserScheduleFactory();

        return factory;
    }

    public CreateUserSchedule createSchedule(String membershipNumber, String gymLocation, String sessionType, String dateTime)
    {
        CreateUserSchedule createUserSchedule = new CreateUserSchedule
                .Builder()
                .setMembershipNumber(membershipNumber)
                .setGymLocation(gymLocation)
                .setSessionType(sessionType)
                .setDateTime(dateTime)
                .build();

        return createUserSchedule;
    }
}
