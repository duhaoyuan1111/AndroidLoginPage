package com.example.helloalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv4;
    private TextView mTv5,mTv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4 = findViewById(R.id.tv_3);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTv4.getPaint().setAntiAlias(true);

        mTv5 = findViewById(R.id.tv_4);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        mTv5.getPaint().setAntiAlias(true);
        mTv6 = findViewById(R.id.tv_5);
        mTv6.setSelected(true);

    }
}