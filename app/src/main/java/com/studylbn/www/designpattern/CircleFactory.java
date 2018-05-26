package com.studylbn.www.designpattern;

/**
 * Created by LiuBin on 2018/5/26 18:46.
 */

public class CircleFactory extends Factory {
    @Override
    public Shape create() {
        return new Circle();
    }
}
