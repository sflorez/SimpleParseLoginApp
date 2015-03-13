package com.simpleparseloginapp.sebastianflorez.simpleparseloginapp;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Sebastian Florez on 3/13/2015.
 */
public class SimpleParseLoginApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Required - Initialize the Parse SDK
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "7Qpfmqm7lB40IF9MeqWJZI5BKZNkocFIVUitZxtU", "Pgf377zKHoSiJd4bc8tjGdG9diNFWvt0d3R9rNzz");

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);


    }
}