package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.CreateUserSchedule;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface ICreateUserScheduleFactory {
    CreateUserSchedule createSchedule(String membershipNumber, String gymLocation, String sessionType, String dateTime);
}
