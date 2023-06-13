package com.bergony.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{


    public BaseballCoach() {
        System.out.println("In construcotr: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutos in batting pratice.";
    }
}
