package com.example.rick.gymapp_android.domain;

import com.example.rick.gymapp_android.factory.ILocateGymFactory;
import com.example.rick.gymapp_android.factory.Impl.LocateGymFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 17-Apr-16.
 */
public class LocateGymTest {
    private static ILocateGymFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = LocateGymFactory.getFactoryInstance();
    }

    @Test
    public void testLocateGymCreation() throws Exception
    {
        LocateGym locateGym = factory.createLocation("Grid Iron", "Cavendish");
        Assert.assertEquals("Grid Iron", locateGym.getGymType());
        Assert.assertEquals("Cavendish", locateGym.getArea());
        Assert.assertNotNull(locateGym.getId());
    }

    @Test
    public void testLocateGymUpdate() throws Exception{
        LocateGym locateGym = factory.createLocation("Grid Iron", "Cavendish");
        Assert.assertEquals("Grid Iron", locateGym.getGymType());
        Assert.assertEquals("Cavendish", locateGym.getArea());
        Assert.assertNotNull(locateGym.getId());

        LocateGym updateLocateGym = new LocateGym.Builder()
                .copy(locateGym)
                .setGymType("Full Fit Gym")
                .build();
        Assert.assertEquals("Full Fit Gym", updateLocateGym.getGymType());
        Assert.assertEquals("Cavendish", updateLocateGym.getArea()); //copy() reason for this method
    }

}