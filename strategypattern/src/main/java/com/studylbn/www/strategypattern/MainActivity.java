package com.studylbn.www.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Utils(new OperationAdd()).doOperation(3, 5);
        new Utils(new OperationSubstruct()).doOperation(3, 5);
    }
}
