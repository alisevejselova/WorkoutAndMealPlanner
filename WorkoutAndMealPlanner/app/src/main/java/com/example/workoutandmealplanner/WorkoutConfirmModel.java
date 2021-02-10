package com.example.workoutandmealplanner;


public class WorkoutConfirmModel {

    private String username;
    private String level;
    private String type;
    private String duration;
    private String date;

    public WorkoutConfirmModel( String username, String level, String type, String duration,String date) {
        this.username=username;
        this.level = level;
        this.type = type;
        this.duration = duration;
        this.date = date;
    }

//    public String getUsername () {
//        return username;
//    }
//    public void setUsername (String username){
//        this.username= username;
//    }

    public String getLevel () {
        return level;
    }
    public void setLevel (String level){
        this.level= level;
    }
    public String getType () {
        return type;
    }
    public void setType (String type){
        this.type = type;
    }
    public String getDuration () {
        return duration;
    }
    public void setDuration (String duration){
        this.duration = duration;
    }
    public String getDate () {
        return date;
    }
    public void setDate (String date){
        this.date = date;
    }


}