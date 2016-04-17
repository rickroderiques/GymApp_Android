package com.example.rick.gymapp_android.domain;

import java.io.Serializable;

/**
 * Created by Rick on 17-Apr-16.
 */
public class UserPassword implements Serializable {

    private String id;
    private String username;
    private String user_password;

    public String getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }

    public String getUser_password() {
        return user_password;
    }

    private UserPassword() {
    }

    private UserPassword(Builder builder)
    {
        this.username = builder.username;
        this.user_password = builder.user_password;
    }


    /**Builder class*/
    public static class Builder {
        private String id;
        private String username;
        private String user_password;

        public Builder setId(String value) {
            this.id = value;
            return this;
        }

        public Builder username(String value) {
            this.username = value;
            return this;
        }

        public Builder user_password(String value) {
            this.user_password = value;
            return this;
        }

        public Builder copy(UserPassword value)
        {
            this.id = value.id;
            this.username = value.username;
            this.user_password = value.user_password;

            return this;
        }

        public UserPassword build()
        {
            return new UserPassword(this);
        }
    }
}
