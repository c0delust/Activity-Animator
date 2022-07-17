package com.example.activityanimator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        intent = new Intent(this, SecondActivity.class);
    }

    public void fadeAnimation(View view) {
        startActivity(intent);
        AnimateActivity.Fade(this);
    }

    public void cardAnimation(View view) {
        startActivity(intent);
        AnimateActivity.Card(this);
    }

    public void diagonalAnimation(View view) {
        startActivity(intent);
        AnimateActivity.Diagonal(this);
    }

    public void shrinkAnimation(View view) {
        startActivity(intent);
        AnimateActivity.Shrink(this);
    }

    public void spinAnimation(View view) {
        startActivity(intent);
        AnimateActivity.Spin(this);
    }

    public void splitAnimation(View view) {
        startActivity(intent);
        AnimateActivity.Split(this);
    }

    public void slideUpAnimation(View view) {
        startActivity(intent);
        AnimateActivity.SlideUp(this);
    }

    public void slideDownAnimation(View view) {
        startActivity(intent);
        AnimateActivity.SlideDown(this);
    }

    public void slideRightAnimation(View view) {
        startActivity(intent);
        AnimateActivity.SlideRight(this);
    }

    public void slideLeftAnimation(View view) {
        startActivity(intent);
        AnimateActivity.SlideLeft(this);
    }

    public void swipeRightAnimation(View view) {
        startActivity(intent);
        AnimateActivity.SwipeRight(this);
    }

    public void swipeLeftAnimation(View view) {
        startActivity(intent);
        AnimateActivity.SwipeLeft(this);
    }

    public void inAndOutAnimation(View view) {
        startActivity(intent);
        AnimateActivity.InAndOut(this);
    }

    public void windMillAnimation(View view) {
        startActivity(intent);
        AnimateActivity.WindMill(this);
    }

    public void zoomAnimation(View view) {
        startActivity(intent);
        AnimateActivity.Zoom(this);
    }
}