package com.studylbn.www.designpattern;

/**
 * Created by LiuBin on 2018/5/26 18:33.
 */

public class SquareFactory extends Factory {
    @Override
    public Shape create() {
        return new Square();

    }
}
