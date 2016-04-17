package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.TrainerList;
import com.example.rick.gymapp_android.factory.ITrainerListFactory;

import java.util.UUID;

/**
 * Created by Rick on 17-Apr-16.
 */
public class TrainerListFactory implements ITrainerListFactory {

    private static TrainerListFactory factory = null;

    public TrainerListFactory() {

    }

    public static TrainerListFactory getFactoryInstance() {
        if (factory == null) {
            factory = new TrainerListFactory();
        }
        return factory;
    }

    public TrainerList createTrainer(String trainerName, String speciality, String gender) {
        TrainerList memberDetails = new TrainerList
                .Builder()
                .setId(UUID.randomUUID().toString())
                .setTrainerName(trainerName)
                .setSpeciality(speciality)
                .setGender(gender)
                .build();
        return memberDetails;
    }
}
