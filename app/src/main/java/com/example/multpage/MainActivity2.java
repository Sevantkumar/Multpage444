package com.example.multpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URLConnection;

public class MainActivity2 extends AppCompatActivity {
    Button b2;
    int total=9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in=getIntent();
        b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.putExtra("planets",Integer.toString(total));
                setResult(RESULT_OK,in);
                finish();
            }
        });
    }
}