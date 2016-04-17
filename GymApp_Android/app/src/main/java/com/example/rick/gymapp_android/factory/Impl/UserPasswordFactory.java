package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.UserPassword;
import com.example.rick.gymapp_android.factory.IUserPasswordFactory;

import java.util.UUID;

/**
 * Created by Rick on 17-Apr-16.
 */
public class UserPasswordFactory implements IUserPasswordFactory {

    private static UserPasswordFactory userFactory = null;

    private UserPasswordFactory(){

    }

    /**creating the instance of the class*/
    public static UserPasswordFactory getFactoryInstance() {
        if(userFactory == null)
        {
            userFactory = new UserPasswordFactory();
        }
        return userFactory;
    }

    public UserPassword createUser(String name, String user_password)
    {
        UserPassword userPassword = new UserPassword
                .Builder()
                .setId(UUID.randomUUID().toString())
                .username(name)
                .user_password(user_password)
                .build();
        return userPassword;
    }
}
