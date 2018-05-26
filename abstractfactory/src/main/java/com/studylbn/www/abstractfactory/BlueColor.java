package com.studylbn.www.abstractfactory;

import android.util.Log;

/**
 * Created by LiuBin on 2018/5/26 23:57.
 */

public class BlueColor implements Color {
    @Override
    public void fill() {
        Log.e("aaaa", "Color:Blue");
    }
}
