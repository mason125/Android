package com.whiteknight.monst.tempconverter;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.*;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //objects
    Kelvin Ke = new Kelvin();
    Celsius Ce = new Celsius();
    Fahrenheit Fa = new Fahrenheit();
    DecimalFormat df = new DecimalFormat("###.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI var setup
        final EditText input = (EditText) findViewById(R.id.Input);
        final EditText F = (EditText) findViewById(R.id.FBox);
        final EditText C = (EditText) findViewById(R.id.CBox);
        final EditText K = (EditText) findViewById(R.id.KBox);
        final RadioButton FBtn = (RadioButton) findViewById(R.id.FBtn);
        final RadioButton CBtn = (RadioButton) findViewById(R.id.CBtn);
        final RadioButton KBtn = (RadioButton) findViewById(R.id.KBtn);
        final RadioGroup group = (RadioGroup) findViewById(R.id.unit);


        //input change listener
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(!input.getText().toString().equals("")) {//make sure the textbox is not empty

                    //get text value only if there is a value in the textbox
                    double value = Double.parseDouble(input.getText().toString());

                    if (FBtn.isChecked()) {//Fahrenheit
                        // input data into fields
                        C.setText(Double.toString(Fa.Celsius(value)));
                        K.setText(Double.toString(Fa.Kelvin(value)));

                        //master field
                        F.setText(input.getText().toString());
                    }


                    if (CBtn.isChecked())//Celsius
                    {
                        //input data into fields
                        F.setText(Double.toString(Ce.Fahrenheit(value)));
                        K.setText(Double.toString(Ce.Kelvin(value)));

                        //master field
                        C.setText(input.getText().toString());

                    }

                    if (KBtn.isChecked()) {
                        //input data into fields
                        F.setText(Double.toString(Ke.Fahrenheit(value)));
                        C.setText(Double.toString(Ke.Celsius((value))));

                        //master field
                        K.setText(input.getText().toString());
                    }

                }
            }
        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {



            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(!input.getText().toString().equals("")) {//make sure the textbox is not empty

                    //get text value only if there is a value in the textbox
                    double value = Double.parseDouble(input.getText().toString());

                    if (FBtn.isChecked()) {//Fahrenheit
                        // input data into fields
                        C.setText(Double.toString(Fa.Celsius(value)));
                        K.setText(Double.toString(Fa.Kelvin(value)));

                        //master field
                        F.setText(input.getText().toString());
                    }


                    if (CBtn.isChecked())//Celsius
                    {
                        //input data into fields
                        F.setText(Double.toString(Ce.Fahrenheit(value)));
                        K.setText(Double.toString(Ce.Kelvin(value)));

                        //master field
                        C.setText(input.getText().toString());

                    }

                    if (KBtn.isChecked()) {
                        //input data into fields
                        F.setText(Double.toString(Ke.Fahrenheit(value)));
                        C.setText(Double.toString(Ke.Celsius((value))));

                        //master field
                        K.setText(input.getText().toString());
                    }

                }
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

    }

}
