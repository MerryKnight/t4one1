package com.example.t4one1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    TextView textViewName, textViewSurname,textViewChange;
    EditText editTextSubject;
    Button buttonEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewName = findViewById(R.id.textView);
        textViewSurname = findViewById(R.id.textView2);

        editTextSubject = findViewById(R.id.editTextText5);
        buttonEnter = findViewById(R.id.button2);
        textViewChange = findViewById(R.id.textView4);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String surname = intent.getStringExtra("surname");

        textViewName.setText(name);
        textViewSurname.setText(surname);

        buttonEnter.setOnClickListener(this);




    }
    @Override
    public void onClick(View v) {
        String subject = editTextSubject.getText().toString();
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtra("subject", subject);
        startActivityForResult(intent, 1);
    }

    ActivityResultLauncher<Intent> mStartForResult =
            registerForActivityResult(new
                            ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>() {
                        @Override
                        public void onActivityResult(ActivityResult result) {
                            if(result.getResultCode() == MainActivity2.RESULT_OK)
                            {
                                Intent intent = result.getData();
                                String preferredTime = data.getStringExtra("preferredTime");
                                textViewChange.setText(preferredTime);
                            }
                        }
            });
}
