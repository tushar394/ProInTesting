package com.example.lenovo.prointesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class lifecycle extends AppCompatActivity {

    Button reqA, testPlan, testScripts, execution, bSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        reqA= (Button) findViewById(R.id.button);
        testPlan= (Button) findViewById(R.id.testPlan);
        testScripts= (Button) findViewById(R.id.testScriptDes);
        execution=(Button)findViewById(R.id.testExection);
        bSummary=(Button)findViewById(R.id.summary);
        WebView webR = (WebView) findViewById(R.id.lifeCycle);
        String data = "<html><body><h4>Software Testing Lifecycle(STLC)</h4>STLC is associated with the following phases." +
                "Each phase has its own significance and Enrty-Exit criterea. " +
                " "+
                "</body></html>";
        webR.loadData(data, "text/html", "UTF-8");

        reqA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lifecycle.this,Requirement.class);
                startActivity(intent);
            }
        });
        testPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lifecycle.this,testPlan.class);
                startActivity(intent);
            }
        });
        testScripts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lifecycle.this,testScript.class);
                startActivity(intent);
            }
        });
        execution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lifecycle.this,testExecution.class);
                startActivity(intent);
            }
        });
        bSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lifecycle.this,testSummary.class);
                startActivity(intent);
            }
        });

    }

}
