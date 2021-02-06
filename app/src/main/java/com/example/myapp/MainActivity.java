package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText PersonName;
    Button btn;
    TextView textN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonName=(EditText)findViewById(R.id.PersonName);
        btn=(Button)findViewById(R.id.btn);
        textN=(TextView)findViewById(R.id.textN);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= PersonName.getText().toString();
                textN.setText("Hello "+name);
            }
        });


    }
}