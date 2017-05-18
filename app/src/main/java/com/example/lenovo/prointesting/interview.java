package com.example.lenovo.prointesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class interview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        WebView webR = (WebView) findViewById(R.id.webInterview);
        String data = "<html><body><h5>1. What is White Box Testing:</h5>" +
                "<p> In White Box Testing (also known as Clear Box Testing, " +
                " Transparent Box Testing,Open Box Testing, Glass Box Testing, Code-Based Testing or Structural Testing), tester" +
                "tests the internal logic and structure of the code of the item being tested" +
                " </p>"+
                "</body></html>";
        webR.loadData(data, "text/html", "UTF-8");




    }
}
