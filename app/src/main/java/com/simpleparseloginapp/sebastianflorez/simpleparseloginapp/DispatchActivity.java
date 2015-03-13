package com.simpleparseloginapp.sebastianflorez.simpleparseloginapp;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.parse.Parse;
import com.parse.ui.ParseLoginDispatchActivity;

/**
 * Created by Sebastian Florez on 3/13/2015.
 */
public class DispatchActivity extends ParseLoginDispatchActivity {
    @Override
    protected Class<?> getTargetClass() {
        return MainActivity.class;
    }
}