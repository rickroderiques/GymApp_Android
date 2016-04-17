package com.example.rick.gymapp_android.domain;

import com.example.rick.gymapp_android.factory.ISessionListFactory;
import com.example.rick.gymapp_android.factory.Impl.SessionListFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 17-Apr-16.
 */
public class SessionListTest {

    private static ISessionListFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = SessionListFactory.getFactoryInstance();
    }
    @Test
    public void testSessionListCreation() throws Exception
    {
        SessionList sessionList = factory.createSession("Ride", "Cardio");
        Assert.assertEquals("Ride", sessionList.getSessionName());
        Assert.assertEquals("Cardio", sessionList.getSessionType());
    }

    @Test
    public void testSessionListUpdate() throws Exception{
        SessionList sessionList = factory.createSession("Ride", "Cardio");
        Assert.assertEquals("Ride", sessionList.getSessionName());
        Assert.assertEquals("Cardio", sessionList.getSessionType());

        SessionList updateSessionList = new SessionList.Builder()
                .copy(sessionList)
                .setSessionName("Yoga")
                .build();
        Assert.assertEquals("Yoga", updateSessionList.getSessionName());
        Assert.assertEquals("Cardio", updateSessionList.getSessionType());

    }

}