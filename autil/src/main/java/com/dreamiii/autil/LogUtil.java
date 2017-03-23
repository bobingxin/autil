package com.dreamiii.autil;

import android.util.Log;

/**
 * Created by bbx on 2017/3/23.
 */

public class LogUtil {

    public static boolean ISLOGSHOW = true;

    public static void e(String tag, String msg) {
        if(!ISLOGSHOW)
            return;
        Log.e(tag, msg);
    }

    public static void d(String tag, String msg) {
        if(!ISLOGSHOW)
            return;
        Log.d(tag, msg);
    }

    public static void i(String tag, String msg) {
        if(!ISLOGSHOW)
            return;
        Log.i(tag, msg);
    }

    public static void w(String tag, String msg) {
        if(!ISLOGSHOW)
            return;
        Log.w(tag, msg);
    }

    public static void v(String tag, String msg) {
        if(!ISLOGSHOW)
            return;
        Log.v(tag, msg);
    }



}
