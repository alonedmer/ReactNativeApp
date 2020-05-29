package com.react.android;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "reactnativeapp";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //AsyncTask.execute(() -> { });
    }
}
