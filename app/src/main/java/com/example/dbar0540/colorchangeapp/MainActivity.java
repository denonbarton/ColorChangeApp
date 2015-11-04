package com.example.dbar0540.colorchangeapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity

{
    private Button colorButton;
    private RelativeLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorButton = (Button) findViewById(R.id.changeColor);
        background = (RelativeLayout) findViewById(R.id.background);
        setupListeners();
    }

    private void setupListeners()
    {
        colorButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeColors();
            }

        });
    }

    private void changeColors()
    {
        int redColor;
        int blueColor;
        int greenColor;

        redColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, blueColor, greenColor));


    }

}
