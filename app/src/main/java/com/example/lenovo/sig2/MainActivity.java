package com.example.lenovo.sig2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button incButton;
    EditText nameEditText;
    TextView nameTextView;
    String nameExtractedFromEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incButton= findViewById(R.id.increaseButton);


        nameEditText = findViewById(R.id.nameEditText);

        nameTextView= findViewById(R.id.nameTextView);



    }

    public void increaseCount(View view){
        nameExtractedFromEditText = nameEditText.getText().toString();
        nameTextView.setText(nameExtractedFromEditText);
    }

}
