package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.TrainerList;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface ITrainerListFactory {
    TrainerList createTrainer(String trainerName, String speciality, String gender);
}
