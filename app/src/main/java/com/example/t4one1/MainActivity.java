package com.example.t4one1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button buttonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNext = findViewById(R.id.button);
        buttonNext.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        EditText et1=findViewById(R.id.editTextText1);
        EditText et2=findViewById(R.id.editTextText2);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("name", et1.getEditableText().toString());
        intent.putExtra("surname", et2.getEditableText().toString());
        startActivity(intent);
    }
}