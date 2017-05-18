package com.example.lenovo.prointesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Requirement extends AppCompatActivity {

    Button nextR1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requirement);
       // TextView t = (TextView) findViewById(R.id.textReq);
       // t.setMovementMethod(new ScrollingMovementMethod());
        /*t.setText("S that you're building your dream house. You've purchased the land, hired the architect and secured your construction crew. That's a good place to start, but without your blueprint, your dream house will remain just that - a dream. Your blueprint gives the architect, contractor, electrician, plumber, and anyone involved in the build, a clear idea of what needs to be done to finish the house." +
                " This plan provides them with the requirements needed to complete their jobs.\n" +
                "\n" +
                "Project requirements are conditions or tasks that must be completed to ensure the success or completion of the project." +
                " They provide a clear picture of the work that needs to be done."); */

        WebView webR = (WebView) findViewById(R.id.webReq);
        String data = "<html><body><h3>What is Requirement:</h3>" +
                "<p> Imagine that you're building your dream house." +
                " You've purchased the land, hired the architect and secured your construction crew." +
                " That's a good place to start, but without your blueprint, your dream house will remain just that " +
                "- a dream. Your blueprint gives the architect, contractor, electrician," +
                " plumber, and anyone involved in the build, a clear idea of what needs to be done to finish the house.</p> " +
                "<p>Project requirements are conditions or tasks that must be completed to ensure the success or completion of the project." +
                "They provide a clear picture of the work that needs to be done.</p>"+
                "</body></html>";
        webR.loadData(data, "text/html", "UTF-8");

         nextR1 = (Button) findViewById(R.id.nextR1);
         nextR1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Requirement.this, Requirement2.class);
                 startActivity(intent);
             }
         });

        /*t.setText("Imagine that you're building your dream house. You've purchased the land, hired the architect and secured your construction crew. That's a good place to start, but without your blueprint, your dream house will remain just that - a dream. Your blueprint gives the architect, contractor, electrician, plumber, and anyone involved in the build, a clear idea of what needs to be done to finish the house." +
                " This plan provides them with the requirements needed to complete their jobs.\n" +
                "\n" +
                "Project requirements are conditions or tasks that must be completed to ensure the success or completion of the project." +
                " They provide a clear picture of the work that needs to be done.");
        */
    }
}
