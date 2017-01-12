package com.example.lenovo.prointesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lifecycle extends AppCompatActivity {

    Button reqA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        reqA= (Button) findViewById(R.id.button);



        reqA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lifecycle.this,Requirement.class);
                startActivity(intent);
            }
        });

    }
}
