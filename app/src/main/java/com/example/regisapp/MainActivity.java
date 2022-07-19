package com.example.regisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.name);
        ed2 = findViewById(R.id.address);
        ed3 = findViewById(R.id.phone);
        ed4 = findViewById(R.id.email);
        btnOk = findViewById(R.id.btnok);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ed1.getText().toString();
                String address = ed2.getText().toString();
                String phone = ed3.getText().toString();
                String email = ed4.getText().toString();
                String text = "your name " + "\t" + name + "\n" +
                        "your address " + "\t" + address + "\n" +
                        "your phone " + "\t" + phone + "\n" +
                        "your email " + "\t" + email + "\n";

                Toast.makeText(MainActivity.this, text.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}