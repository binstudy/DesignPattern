package com.studylbn.www.abstractfactory;

/**
 * Created by LiuBin on 2018/5/27 0:31.
 */

public class RedSquareFactory extends Factory {
    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public Color createColor() {
        return new RedColor();
    }
}
