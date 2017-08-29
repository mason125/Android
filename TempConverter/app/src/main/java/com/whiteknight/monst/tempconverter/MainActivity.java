package com.whiteknight.monst.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    //objects
    Kelvin K = new Kelvin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI var setup
        final EditText input = (EditText) findViewById(R.id.Input);
        final EditText F = (EditText) findViewById(R.id.FBox);


        //input change listener
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                double value = Double.parseDouble(input.getText().toString());

                //switch()
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
    }
}
