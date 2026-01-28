package com.example.androidtutor;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToastConceptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_concept);

        Button btnToast = findViewById(R.id.btnShowToast);

        btnToast.setOnClickListener(v ->
                Toast.makeText(
                        ToastConceptActivity.this,
                        "This is a Toast message!",
                        Toast.LENGTH_SHORT
                ).show()
        );
    }
}

