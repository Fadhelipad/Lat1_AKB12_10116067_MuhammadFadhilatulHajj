package com.example.lat1_akb12_10116067_muhammadfadhilatulhajj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_main3); ///start
        //final EditText name = (EditText) findViewById(R.id.edit_textdata);
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,Main32Activity.class);

                startActivity(i);
            }
        });
        ////end
    }
}