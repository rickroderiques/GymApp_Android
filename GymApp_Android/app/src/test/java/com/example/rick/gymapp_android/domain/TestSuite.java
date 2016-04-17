package com.example.rick.gymapp_android.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Rick on 17-Apr-16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AccountDetailsTest.class,
        CreateUserScheduleTest.class,
        LocateGymTest.class,
        MakeBookingTest.class,
        MemberDetailsTest.class,
        SessionListTest.class,
        TrackProgressTest.class,
        TrackVisitsTest.class,
        TrainerListTest.class,
        UserPasswordTest.class})
public class TestSuite {}
