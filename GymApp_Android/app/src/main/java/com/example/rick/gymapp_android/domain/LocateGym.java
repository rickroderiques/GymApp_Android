package com.example.rick.gymapp_android.domain;

import java.io.Serializable;

/**
 * Created by Rick on 17-Apr-16.
 */
public class LocateGym implements Serializable {

    private String id;
    private String gymType; //full gym or just a grid circuit gym
    private String area;
    //some how connect a map x_x


    public String getId() {
        return id;
    }

    public String getGymType() {
        return gymType;
    }

    public String getArea() {
        return area;
    }

    private LocateGym(){}

    private LocateGym(Builder builder)
    {
        this.id = builder.id;
        this.gymType = builder.gymType;
        this.area = builder.area;
    }

    public static class Builder{
        private String gymType; //full gym or just a grid circuit gym
        private String area;
        private String id;

        public Builder setId(String value) {
            this.id = value;
            return this;
        }

        public Builder setGymType(String value) {
            this.gymType = value;
            return this;
        }

        public Builder setArea(String value) {
            this.area = value;
            return this;
        }

        public Builder copy(LocateGym value) {
            this.id = value.id;
            this.area = value.area;
            this.gymType = value.gymType;

            return this;
        }
        public LocateGym build() {
            return new LocateGym(this);
        }
    }

}
