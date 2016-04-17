package com.example.rick.gymapp_android.domain;

import java.io.Serializable;

/**
 * Created by Rick on 17-Apr-16.
 */
public class TrackProgress implements Serializable{

    private String id;
    private String sessionGoal; //keeping competition with your friend list how much times gone to the gym.

    //news feed

    public String getId() {
        return id;
    }

    public String getSessionGoal() {
        return sessionGoal;
    }

    public TrackProgress() {
    }
    public TrackProgress(Builder builder) {
        this.id = builder.id;
        this.sessionGoal = builder.sessionGoal;

    }

    public static class Builder{
        private String id;
        private String sessionGoal; //keeping competition with your friend list how much times gone to the gym.


        public Builder setId(String value) {
            this.id = value;
            return this;
        }

        public Builder setSessionGoal(String value) {
            this.sessionGoal = value;
            return this;
        }

        public Builder copy(TrackProgress value)
        {
            this.id = value.id;
            this.sessionGoal = value.sessionGoal;
            return this;
        }

        public TrackProgress build() {
            return new TrackProgress(this);
        }
    }
}
