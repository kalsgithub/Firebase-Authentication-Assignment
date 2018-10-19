package com.mcs.kalherath.moviesapp;

import android.app.Application;

import com.firebase.client.Firebase;

public class MoviesApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();;
        Firebase.setAndroidContext(this);
    }
}
