package com.example.lenovo.prointesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class testSummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_summary);

        WebView webR = (WebView) findViewById(R.id.webSummary);
        String data = "<html><body><h3>Test Summary Report:</h3>" +
                "<p> When all the testing activities are completed, test summary report is created to summaries the" +
                " entire testing activities performed." +
                "</p>"+
                "<p> Main key highlights in Test Summary Report are:</p>" +
                "<ol>" +
                "<li>Purpose of the Report</li>" +
                "<li>Scope of the Testing performed</li>" +
                "<li>Exclusions, Assumptions, and Limitations considered during Testing</li>" +
                "<li>Variations from Plan</li>" +
                "<li>Executed Script Summary All Runs details</li>" +
                "<li>Defects, Deviation and Exception Resolution Details and Rationale</li>" +
                "<li>Conclusion</li>" +
                "<li>Acceptance Statement</li>" +
                "<li>Terms and Definitions</li>" +
                "<li>Supporting References</li>" +
                "</ol>"+
                "</body></html>";
        webR.loadData(data, "text/html", "UTF-8");
    }
}
