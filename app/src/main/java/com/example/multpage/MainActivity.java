package com.example.multpage;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conn = new Intent(getApplicationContext(), MainActivity2.class);
                startActivityForResult(conn, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        e1=findViewById(R.id.editTextTextPersonName);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String res = data.getStringExtra("planets");
                //Toast.makeText(getApplicationContext(), "Total =" + res, Toast.LENGTH_LONG).show();
                e1.setText("Total number of planets ="+res);
            }
        }
    }
}