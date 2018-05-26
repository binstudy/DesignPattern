package com.studylbn.www.designpattern;

/**
 * Created by LiuBin on 2018/5/26 19:17.
 */

public class BaseFactory1 extends Factory1 {
    @Override
    public <T extends Shape> T create(Class<T> clz) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) shape;
    }
}
