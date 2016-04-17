package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.TrackProgress;
import com.example.rick.gymapp_android.factory.ITrackProgressFactory;

import java.util.UUID;

/**
 * Created by Rick on 17-Apr-16.
 */
public class TrackProgressFactory implements ITrackProgressFactory {


    private static TrackProgressFactory factory = null;

    private TrackProgressFactory(){

    }

    /**creating the instance of the class*/
    public static TrackProgressFactory getFactoryInstance() {
        if(factory == null)
        {
            factory = new TrackProgressFactory();
        }
        return factory;
    }


    public TrackProgress createProgress(String sessionGoal)
    {
        TrackProgress trackProgress = new TrackProgress
                .Builder()
                .setId(UUID.randomUUID().toString())
                .setSessionGoal(sessionGoal)
                .build();
        return trackProgress;
    }
}
