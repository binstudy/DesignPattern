package com.studylbn.www.designpattern;

/**
 * Created by LiuBin on 2018/5/26 19:04.
 */

public abstract class Factory1 {
    public abstract <T extends Shape> T create(Class<T> clz);
}
