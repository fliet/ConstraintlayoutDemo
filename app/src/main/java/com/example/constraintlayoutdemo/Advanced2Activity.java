package com.example.constraintlayoutdemo;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Placeholder;

public class Advanced2Activity extends AppCompatActivity implements View.OnClickListener {

    private Group group;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_2);

        TextView textView = findViewById(R.id.text11);
        group = findViewById(R.id.group);
        Button updateLayoutBtn = findViewById(R.id.btn_51);
        constraintLayout = findViewById(R.id.constraintLayout);

        textView.setOnClickListener(this);
        updateLayoutBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text11:
                //textView.setVisibility(View.GONE);
                group.setVisibility(View.GONE);
                break;
            case R.id.btn_51:

                /*
                    注意点
                        新的布局最外层必须是ConstraintLayout
                        所有View必须有id
                  */
                TransitionManager.beginDelayedTransition(constraintLayout);

                // 方法一
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(this, R.layout.activity_dynamic_update_layout);
                constraintSet.applyTo(constraintLayout);

                // 方法二
                /*ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.connect(R.id.text51, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START,0);
                constraintSet.applyTo(constraintLayout);*/
                break;
            default:
                Placeholder placeholder = findViewById(R.id.place_holder);
                placeholder.setContentId(v.getId());
                break;
        }


    }
}
