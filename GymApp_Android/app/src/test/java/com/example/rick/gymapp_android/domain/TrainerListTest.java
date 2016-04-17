package com.example.rick.gymapp_android.domain;

import com.example.rick.gymapp_android.factory.ITrainerListFactory;
import com.example.rick.gymapp_android.factory.Impl.TrainerListFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 17-Apr-16.
 */
public class TrainerListTest {

    private ITrainerListFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = TrainerListFactory.getFactoryInstance();
    }


    @Test
    public void testTrainerCreation() throws Exception
    {
        TrainerList trainerList = factory.createTrainer("Lance", "Yoga", "Male");
        Assert.assertEquals("Lance", trainerList.getTrainerName());
        Assert.assertEquals("Yoga", trainerList.getSpeciality());
        Assert.assertEquals("Male", trainerList.getGender());
    }

    @Test
    public void testTrainerUpdate() throws Exception{

        TrainerList trainerList = factory.createTrainer("Lance", "Yoga", "Male");
        Assert.assertEquals("Lance", trainerList.getTrainerName());
        Assert.assertEquals("Yoga", trainerList.getSpeciality());

        TrainerList updateTrainer = new TrainerList.Builder()
                .copy(trainerList)
                .setSpeciality("Weights")
                .build();
        Assert.assertEquals("Weights", updateTrainer.getSpeciality());

    }
}