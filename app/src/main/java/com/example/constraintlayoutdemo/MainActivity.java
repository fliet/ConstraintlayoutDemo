package com.example.constraintlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button basicUseBtn = findViewById(R.id.basic_use_btn);
        Button advancedUseBtn = findViewById(R.id.advanced_use_btn);
        Button guideLineBtn = findViewById(R.id.guide_line_use_btn);
        Button advancedUse2Btn = findViewById(R.id.advanced_use_2_btn);

        basicUseBtn.setOnClickListener(this);
        advancedUseBtn.setOnClickListener(this);
        guideLineBtn.setOnClickListener(this);
        advancedUse2Btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.basic_use_btn:
                startActivity(new Intent(this, BasicUseActivity.class));
                break;
            case R.id.advanced_use_btn:
                startActivity(new Intent(this, AdvancedActivity.class));
                break;
            case R.id.guide_line_use_btn:
                startActivity(new Intent(this, GuideLineActivity.class));
                break;
            case R.id.advanced_use_2_btn:
                startActivity(new Intent(this, Advanced2Activity.class));
                break;
            default:
                break;
        }
    }
}
