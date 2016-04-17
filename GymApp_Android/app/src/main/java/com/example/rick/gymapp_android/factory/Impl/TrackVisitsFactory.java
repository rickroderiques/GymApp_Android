package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.TrackVisits;
import com.example.rick.gymapp_android.factory.ITrackVisitsFactory;

/**
 * Created by Rick on 17-Apr-16.
 */
public class TrackVisitsFactory implements ITrackVisitsFactory {

    private static TrackVisitsFactory factory = null;

    private TrackVisitsFactory(){

    }

    /**creating the instance of the class*/
    public static TrackVisitsFactory getFactoryInstance() {
        if(factory == null)
        {
            factory = new TrackVisitsFactory();
        }
        return factory;
    }


    private String dateTimeOfVisit;//can visit twice in one day
    private String gymVisisted; //can pull from the same table as gym location



    public TrackVisits createVisit(String dateTimeOfVisit, String gymVisisted)
    {
        TrackVisits trackVisits = new TrackVisits
                .Builder()
                .setDateTimeOfVisit(dateTimeOfVisit)
                .setGymVisisted(gymVisisted)
                .build();
        return trackVisits;
    }
}
