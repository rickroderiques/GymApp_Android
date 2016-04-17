package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.TrackProgress;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface ITrackProgressFactory {
    TrackProgress createProgress(String sessionGoal);
}
