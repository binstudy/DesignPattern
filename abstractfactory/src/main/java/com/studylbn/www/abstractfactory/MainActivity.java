package com.studylbn.www.abstractfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Factory redSquareFactory = new RedSquareFactory();
        redSquareFactory.createShape().draw();
        redSquareFactory.createColor().fill();
        Factory blueCircleFactory = new BlueCircleFactory();
        blueCircleFactory.createShape().draw();
        blueCircleFactory.createColor().fill();
    }
}
