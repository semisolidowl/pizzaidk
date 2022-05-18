package com.example.pizzaidk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        Spinner s=findViewById(R.id.sizeOption);
        ArrayAdapter<CharSequence> SpinnerAdapter = ArrayAdapter.createFromResource(
        );
*/
        RadioGroup cp = findViewById(R.id.calzorpizz);
        cp.setOnClickListener(this);

        CheckBox cb = findViewById(R.id.checkBox);
        cb.setOnClickListener(this);
        for(int i=0; i<=15; i++){
            cb = findViewById(R.id.checkBox+i);
            cb.setOnClickListener(this);
        }


        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View view) {
    
    }
}