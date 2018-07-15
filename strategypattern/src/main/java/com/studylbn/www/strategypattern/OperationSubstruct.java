package com.studylbn.www.strategypattern;

/**
 * Created by LiuBin on 2018/7/15 16:24.
 */

public class OperationSubstruct implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
