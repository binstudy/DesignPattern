package com.studylbn.www.strategypattern;

import android.util.Log;

/**
 * Created by LiuBin on 2018/7/15 16:30.
 */

public class Utils {
    private Strategy strategy;

    public Utils(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doOperation(int num1, int num2) {
        Log.e("add", strategy.doOperation(num1, num2) + "");
    }
}
