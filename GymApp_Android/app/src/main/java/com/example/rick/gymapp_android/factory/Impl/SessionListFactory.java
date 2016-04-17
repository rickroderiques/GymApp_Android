package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.SessionList;
import com.example.rick.gymapp_android.factory.ISessionListFactory;

import java.util.UUID;

/**
 * Created by Rick on 17-Apr-16.
 */
public class SessionListFactory implements ISessionListFactory {


    private static SessionListFactory factory = null;

    public SessionListFactory()
    {

    }
    public static SessionListFactory getFactoryInstance()
    {
        if(factory == null)
        {
            factory = new SessionListFactory();
        }
        return factory;
    }

    public SessionList createSession(String sessionName, String sessionType)
    {
        SessionList sessionList = new SessionList
                .Builder()
                .setId(UUID.randomUUID().toString())
                .setSessionName(sessionName)
                .setSessionType(sessionType)
                .build();
        return sessionList;
    }
}
