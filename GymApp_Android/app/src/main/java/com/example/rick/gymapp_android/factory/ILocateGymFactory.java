package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.LocateGym;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface ILocateGymFactory {
    LocateGym createLocation(String gymType, String area);
}
