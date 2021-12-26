package com.example.lab2form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView orientationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.orientationTextView = (TextView) this.findViewById(R.id.orientationText);
        int orientation = this.getResources().getConfiguration().orientation;
        this.setOrientation(orientation);
    }

    public void setOrientation(int orientation){
        if(orientation == Configuration.ORIENTATION_PORTRAIT){
            this.orientationTextView.setText(this.getResources().getString(R.string.portraitOrientation));
        }
        else if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            this.orientationTextView.setText(this.getResources().getString(R.string.landscapeOrientation));
        } else {
            this.orientationTextView.setText("orientation undefined");
        }
    }

    @Override
    public void onConfigurationChanged(Configuration config){
        super.onConfigurationChanged(config);
        this.setOrientation(config.orientation);
    }
}