package com.studylbn.www.abstractfactory;

import android.util.Log;

/**
 * Created by LiuBin on 2018/5/27 0:43.
 */

public class BlueCircleFactory extends Factory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        Log.e("a","aaa");
        return new BlueColor();
    }
}
