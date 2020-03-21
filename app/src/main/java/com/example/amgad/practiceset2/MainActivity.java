package com.example.amgad.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int raspberryPrice = 5;
        display("2 Boxes: $"+raspberryPrice);
    }
    public void display(String i){
        TextView t = findViewById(R.id.display_text_view);
        t.setText(i);
    }
}
