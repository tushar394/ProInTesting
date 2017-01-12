package com.example.lenovo.prointesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class systemT extends AppCompatActivity {

    Button btLife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_t);

        btLife= (Button) findViewById(R.id.life);



        btLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(systemT.this,lifecycle.class);
                startActivity(intent);
            }
        });

    }
}
