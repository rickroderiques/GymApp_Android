package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.SessionList;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface ISessionListFactory {
    SessionList createSession(String sessionName, String sessionType);
}
