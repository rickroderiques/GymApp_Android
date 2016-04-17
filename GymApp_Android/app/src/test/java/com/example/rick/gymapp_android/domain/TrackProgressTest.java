package com.example.rick.gymapp_android.domain;

import com.example.rick.gymapp_android.factory.ITrackProgressFactory;
import com.example.rick.gymapp_android.factory.Impl.TrackProgressFactory;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 17-Apr-16.
 */
public class TrackProgressTest {

    private ITrackProgressFactory factory;

    /**using singleton to create the object*/
    @Before
    public void setUp() throws Exception {
        factory = TrackProgressFactory.getFactoryInstance();
    }

    @Test
    public void testProgressCreation() throws Exception{

        TrackProgress trackProgress = factory.createProgress("6");
        Assert.assertEquals(trackProgress.getSessionGoal(), "6");
        Assert.assertNotNull(trackProgress.getId());
    }

    @Test
    public void testProgressUpdate() throws Exception
    {
        TrackProgress trackProgress = factory.createProgress("6");
        Assert.assertEquals(trackProgress.getSessionGoal(), "6");

        //updating
        TrackProgress updateProgress = new TrackProgress.Builder()
                .copy(trackProgress) //1.copying the userPassword details
                .setSessionGoal("5") //2.then overwriting password
                .build();
        //testing the update
        Assert.assertEquals("5", updateProgress.getSessionGoal());
        Assert.assertNotNull(updateProgress.getId());

    }

}