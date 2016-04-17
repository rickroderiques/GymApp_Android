package com.example.rick.gymapp_android.domain;

import java.io.Serializable;

/**
 * Created by Rick on 17-Apr-16.
 */
public class CreateUserSchedule implements Serializable {
    String membershipNumber; // from member table to keep track of the schedules created by users
    String gymLocation; //session table
    String sessionType;
    String dateTime;

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public String getGymLocation() {
        return gymLocation;
    }

    public String getSessionType() {
        return sessionType;
    }

    public String getDateTime() {
        return dateTime;
    }

    public CreateUserSchedule(){}

    public CreateUserSchedule(Builder builder)
    {
        this.membershipNumber = builder.membershipNumber;
        this.gymLocation = builder.gymLocation;
        this.sessionType = builder.sessionType;
        this.dateTime = builder.dateTime;
    }

    public static class Builder
    {
        String membershipNumber;
        String gymLocation;
        String sessionType;
        String dateTime;

        public Builder setMembershipNumber(String value) {
            this.membershipNumber = value;
            return this;
        }

        public Builder setGymLocation(String value) {
            this.gymLocation = value;
            return this;
        }

        public Builder setSessionType(String value) {
            this.sessionType = value;
            return this;
        }

        public Builder setDateTime(String value) {
            this.dateTime = value;
            return this;
        }

        public Builder copy(CreateUserSchedule value) {

            this.membershipNumber = value.membershipNumber;
            this.gymLocation = value.gymLocation;
            this.sessionType = value.sessionType;
            this.dateTime = value.dateTime;

            return this;
        }

        public CreateUserSchedule build(){return new CreateUserSchedule(this);}
    }
}
