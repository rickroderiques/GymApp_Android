package com.example.rick.gymapp_android.domain;

import com.example.rick.gymapp_android.factory.IUserPasswordFactory;
import com.example.rick.gymapp_android.factory.Impl.UserPasswordFactory;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 17-Apr-16.
 */
public class UserPasswordTest {
    private IUserPasswordFactory factory;

    /**using singleton to create the object*/
    @Before
    public void setUp() throws Exception {
        factory = UserPasswordFactory.getFactoryInstance();
    }

    @Test
    public void testUserCreation() throws Exception{

        /**using the domain classes*/
        UserPassword userPassword = factory.createUser("Rick", "funnyguy123");
        Assert.assertEquals(userPassword.getUsername(), "Rick");
        Assert.assertEquals(userPassword.getUser_password(), "funnyguy123");
    }

    @Test
    public void testUserUpdate() throws Exception
    {
        UserPassword userPassword = factory.createUser("Geneve",  "girl321");
        Assert.assertEquals("Geneve", userPassword.getUsername());
        Assert.assertEquals("girl321", userPassword.getUser_password());

        //updating

        UserPassword updateUserPassword = new UserPassword.Builder()
                .copy(userPassword) //1.copying the userPassword details
                .user_password("password") //2.then overwriting password
                .build();
        //testing the update
        Assert.assertEquals("password", updateUserPassword.getUser_password());
        Assert.assertEquals(userPassword.getUsername(), updateUserPassword.getUsername());

    }
}