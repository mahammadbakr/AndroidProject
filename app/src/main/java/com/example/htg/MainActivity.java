package com.example.htg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ImageButton kurdishBtnl;
    private ImageButton englishBtnl;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kurdishBtnl= findViewById(R.id.ku_btn);
        kurdishBtnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onChangeLan("it");
            }
        });
        englishBtnl= findViewById(R.id.en_btn);
        englishBtnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onChangeLan("en");
            }
        });



    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
        public void onAboutClick(View view){
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);

    }

    public void onHalabjaClick(View view){
        Intent intent = new Intent(this,HalabjaActivity.class);
        startActivity(intent);

    }

    public void onPlace(View view){
        Intent intent= new Intent(this,PlacesActivity.class);
        startActivity(intent);

    }

    public void onExit(View view){
//        finish();
//        System.exit(0);
        onBackPressed();
    }

    public void onChangeLan(String lan){

        String local = this.getResources().getConfiguration().locale.getLanguage();

        if(local=="en" && lan=="it") {
            Locale locale = new Locale("it");
            Resources res = getResources();
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration conf = res.getConfiguration();
            conf.locale = locale;
            res.updateConfiguration(conf, dm);
            finish();
            Intent refresh = new Intent(this, MainActivity.class);
            startActivity(refresh);
            Toast.makeText(this, "Locale in kurdish !", Toast.LENGTH_LONG).show();
        }else if(local=="it" && lan=="en"){
            Locale locale = new Locale("en");
            Resources res = getResources();
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration conf = res.getConfiguration();
            conf.locale = locale;
            res.updateConfiguration(conf, dm);
            finish();
            Intent refresh = new Intent(this, MainActivity.class);
            startActivity(refresh);
            Toast.makeText(this, "Locale in English !", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Language already in use !", Toast.LENGTH_LONG).show();
        }
    }


}
