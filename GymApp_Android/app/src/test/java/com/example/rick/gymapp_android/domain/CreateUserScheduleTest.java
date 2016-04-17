package com.example.rick.gymapp_android.domain;

import com.example.rick.gymapp_android.factory.ICreateUserScheduleFactory;
import com.example.rick.gymapp_android.factory.Impl.CreateUserScheduleFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 17-Apr-16.
 */
public class CreateUserScheduleTest {

    public ICreateUserScheduleFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = CreateUserScheduleFactory.getFactoryInstance();
    }


    @Test
    public void testAccountCreation() throws Exception
    {
        //if this get clicked it can show further details of the schedule
        CreateUserSchedule createUserSchedule = factory.createSchedule("M220592", "Parow", "Cardio", "17-04-2016, 19:00");
        Assert.assertEquals("M220592", createUserSchedule.getMembershipNumber());
        Assert.assertEquals("Parow", createUserSchedule.getGymLocation());
        Assert.assertEquals("Cardio", createUserSchedule.getSessionType());
        Assert.assertEquals("17-04-2016, 19:00", createUserSchedule.getDateTime());
        Assert.assertNotNull(createUserSchedule.getMembershipNumber());
    }

    @Test
    public void testAccountUpdate() throws Exception{
        CreateUserSchedule createUserSchedule = factory.createSchedule("M220592", "Parow", "Cardio", "17-04-2016, 19:00");
        Assert.assertEquals("M220592", createUserSchedule.getMembershipNumber());
        Assert.assertEquals("Parow", createUserSchedule.getGymLocation());
        Assert.assertEquals("Cardio", createUserSchedule.getSessionType());
        Assert.assertEquals("17-04-2016, 19:00", createUserSchedule.getDateTime());
        Assert.assertNotNull(createUserSchedule.getMembershipNumber());

        CreateUserSchedule updateSchedule = new CreateUserSchedule
                .Builder()
                .copy(createUserSchedule)
                .setDateTime("17-04-2016, 20:00")
                .build();
        Assert.assertEquals("17-04-2016, 20:00", updateSchedule.getDateTime());
        Assert.assertEquals("M220592", updateSchedule.getMembershipNumber());
        Assert.assertEquals("Cardio", updateSchedule.getSessionType());

    }
}