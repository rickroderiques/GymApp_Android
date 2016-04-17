package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.TrackVisits;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface ITrackVisitsFactory {
    TrackVisits createVisit(String dateTimeOfVisit, String gymVisisted);
}
