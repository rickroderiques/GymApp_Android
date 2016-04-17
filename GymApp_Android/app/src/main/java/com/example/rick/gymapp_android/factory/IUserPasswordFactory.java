package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.UserPassword;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface IUserPasswordFactory {
    UserPassword createUser(String username, String user_password);
}
