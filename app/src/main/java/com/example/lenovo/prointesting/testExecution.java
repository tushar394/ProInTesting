package com.example.lenovo.prointesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class testExecution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_execution);

        WebView webR = (WebView) findViewById(R.id.webExecution);
        String data = "<html>" +
                "<p>Once the Test Scripts are approved, we can start with Test Execution." +
                " is most important phase in the STLC</p>" +
                "<body><h3>Test Execution</h3> is most important phase in the STLC" +
                "<p> The software build produced by developers should be made available on Test environment.<br> " +
                "Please note: Development environment and Test environment should be different.</p>" +
                "<p>Test Execution can be performed at least in two cycles. In first cycle, all the test cases are executed. " +
                "In second cycle we execute the test cases which have failed in first cycle." +
                " Sometimes, we need to execute all test cases again in second cycle.</p>" +
                "<p>Appropriate Defect/Deviation/ Observation is created if expected result does not match with actual result.<br>" +
                "When the defect is created, following are the attributes should be mention corresponding to the defect-</p>"+
                "<ol>" +
                "<li>Defect Id</li>" +
                "<li>Project Name and Release</li>"+
                "<li>Build Version and Module</li>"+
                "<li>Defect Summary</li>"+
                "<li>Defect Description</li>"+
                "<li>Steps to Reproduce</li>"+
                "<li>Expected Result and Actual Result</li>"+
                "<li>Screenshots with proper highlights of the defects</li>"+
                "<li>Assigned To</li>"+
                "<li>STLC Phase in which defect is raised.</li>"+
                "<li>Priority</li>"+
                "<li>Severity</li>"+
                "</ol>"+
                "</body></html>";
                webR.loadData(data, "text/html", "UTF-8");


    }
}
