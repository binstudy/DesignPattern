package com.studylbn.www.abstractfactory;

import android.util.Log;

/**
 * Created by LiuBin on 2018/5/26 23:57.
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        Log.e("aaaa", "Circle:draw() method.");
    }
}
