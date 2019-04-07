package com.example.lat1_akb12_10116067_muhammadfadhilatulhajj;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
// Nim : 10116067
// Nama : Muhammad Fadhilatul Hajj
// kelas : IF-2 akb-2
// Tanggal buat : 6 april 2019


        public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                ///start
                //final EditText name = (EditText) findViewById(R.id.edit_textdata);
                Button button = (Button) findViewById(R.id.button1);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,Main2Activity.class);

                        startActivity(i);
                    }
                });
                ////end
    }
}
