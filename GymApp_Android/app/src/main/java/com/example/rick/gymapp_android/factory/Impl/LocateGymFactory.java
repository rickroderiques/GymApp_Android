package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.LocateGym;
import com.example.rick.gymapp_android.factory.ILocateGymFactory;

import java.util.UUID;

/**
 * Created by Rick on 17-Apr-16.
 */
public class LocateGymFactory implements ILocateGymFactory {
    private static LocateGymFactory factory = null;

    public LocateGymFactory(){}

    public static LocateGymFactory getFactoryInstance()
    {
        if(factory == null)
            factory = new LocateGymFactory();

        return factory;
    }

    public LocateGym createLocation(String gymType, String area)
    {
        LocateGym locateGym = new LocateGym
                .Builder()
                .setId(UUID.randomUUID().toString())
                .setGymType(gymType)
                .setArea(area)
                .build();

        return locateGym;
    }
}
