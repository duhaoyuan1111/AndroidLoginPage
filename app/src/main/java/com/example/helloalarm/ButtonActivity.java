package com.example.helloalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3 = findViewById(R.id.btn_1);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "btn1:好耶！", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View view){

        Toast.makeText(this, "好耶！", Toast.LENGTH_SHORT).show();

    }
}