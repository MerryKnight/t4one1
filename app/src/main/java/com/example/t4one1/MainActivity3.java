package com.example.t4one1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{
    EditText editTextDay, editTextTime, editTextComments;
    Button buttonOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editTextDay = findViewById(R.id.editTextText);
        editTextTime = findViewById(R.id.editTextText3);
        editTextComments = findViewById(R.id.editTextText4);
        buttonOK = findViewById(R.id.button3);

        buttonOK.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        String preferredTime = editTextTime.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("preferredTime", preferredTime);
        setResult(RESULT_OK, intent);
        mStartForResult.launch(intent);
        Toast.makeText(MainActivity3.this, "Время занятия успешно передано", Toast.LENGTH_SHORT).show();
        finish();
    }
}
