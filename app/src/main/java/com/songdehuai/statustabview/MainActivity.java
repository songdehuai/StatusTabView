package com.songdehuai.statustabview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private StatusView status_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.tip_tv);
        status_view = findViewById(R.id.status_view);

        status_view.setOnSelectedListener(new StatusView.OnSelectedListener() {
            @Override
            public void onSelected(int index) {
                textView.setText("" + index);
            }
        });

    }
}
