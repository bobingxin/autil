package com.dreamiii.androidutil;

import android.app.Application;

import com.dreamiii.autil.Utils;

/**
 * Created by bbx on 2017/3/23.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
    }
}
