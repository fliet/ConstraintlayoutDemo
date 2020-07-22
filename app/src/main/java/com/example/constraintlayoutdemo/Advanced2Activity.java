package com.example.constraintlayoutdemo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

public class Advanced2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_2);
    }

    @Override
    public void onClick(View v) {
        Placeholder placeholder = findViewById(R.id.place_holder);
        placeholder.setContentId(v.getId());
    }
}
