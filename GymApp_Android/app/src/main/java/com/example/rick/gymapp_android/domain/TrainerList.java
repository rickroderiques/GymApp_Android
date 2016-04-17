package com.example.rick.gymapp_android.domain;

import java.io.Serializable;

/**
 * Created by Rick on 17-Apr-16.
 */
public class TrainerList implements Serializable {

    private String id;
    private String trainerName; //instructor from make booking
    private String speciality;
    private String gender;

    public String getId() {
        return id;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGender() {
        return gender;
    }

    public TrainerList() {
    }
    public TrainerList(Builder builder) {
        this.id = builder.id;
        this.trainerName = builder.trainerName;
        this.speciality = builder.speciality;
        this.gender = builder.gender;
    }

    public static class Builder{

        String id;
        String trainerName;
        String speciality;
        String gender;

        public Builder setId(String value) {
            this.id = value;
            return this;
        }

        public Builder setTrainerName(String value) {
            this.trainerName = value;
            return this;
        }

        public Builder setSpeciality(String value) {
            this.speciality = value;
            return this;
        }

        public Builder setGender(String value) {
            this.gender = value;
            return this;
        }

        public Builder copy(TrainerList value)
        {
            this.id = value.id;
            this.trainerName = value.trainerName;
            this.speciality = value.speciality;
            this.gender = value.gender;

            return this;
        }

        public TrainerList build()
        {
            return new TrainerList(this);
        }
    }

}
