package com.example.chenquan.marqueetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MarqueeTextView marqueeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        marqueeTextView = (MarqueeTextView) findViewById(R.id.martv);
        marqueeTextView.setText("                                     啦啦啦啦啦啦");
    }
}
