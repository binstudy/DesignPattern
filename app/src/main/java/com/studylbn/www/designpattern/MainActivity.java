package com.studylbn.www.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Simple Factory 
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Factory1 factory1 = new BaseFactory1();
        Shape square = factory1.create(Square.class);
        square.draw();
        Shape circle = factory1.create(Circle.class);
        circle.draw();
    }
}
