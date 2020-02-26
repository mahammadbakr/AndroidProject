package com.example.htg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    private TextView textview;
    private Animation bottomToTop;

    protected AlphaAnimation fadeIn;
    protected AlphaAnimation fadeOut;

    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textview = findViewById(R.id.textView);
        linearLayout = findViewById(R.id.linear);
        Animation aniFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.text_transition);
        linearLayout.startAnimation(aniFade);


    }
}
