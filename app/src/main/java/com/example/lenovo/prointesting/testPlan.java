package com.example.lenovo.prointesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class testPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_plan);

        WebView webR = (WebView) findViewById(R.id.webPlan);
        String data = "<html><body><h3>Test Plan Document:</h3>" +
                "<p> Generally, Test Lead prepares Test plan document. <br>" +
                "The plan generally contains a full understanding of what the ultimate workflow will be." +
                "In testing, a test plan offers complete testing information regarding an upcoming testing" +
                "effort, including scope of testing, schedule, Test deliverables, release criteria and risks and" +
                "contingencies etc.</p>"+

                "<h3>Test Strategy & Planning</h3>" +
                "<p>Test Analyst/Manager will prepare the Test Strategy and Test Plan documents." +
                "Activities carried out at the Test Strategy level are as given below. These details will be" +
                "documented in the Test Strategy document:</p>"+
                "<ul>" +
                "<li>Define test objectives, scope of testing, testing phases, activities and identify environment " +
                "in which testing should be performed.</li>"+
                "<li>Define test organization and role and responsibility of individual in the organization</li>" +
                "<li>Review the requirements to identify test items</li>"+
                "<li>Identify & Define testing process and procedures</li>"+
                "<li>Decide suitable testing tools, techniques and practices</li>"+
                "<li>Identify high risk components which may require enhanced levels of testing</li>"+
                "<li>Evaluate the scope for automating the application</li>" +
                "</ul>"+
                "<h4 style=\"color:#FF0000\";>Test plan template, based on IEEE 829 format contains below information</h4>" +
                "<ul>"+
                "<li>Test Plan Identifier (TPI).</li>"+
                "<li>References</li>" +
                "<li>Test Items</li>"+
                "<li>Introduction</li>" +
                "<li>Software risk Issue</li>"+
                "<li>Features to be tested</li>" +
                "<li>Features not to tested</li>"+
                "<li>Approach</li>" +
                "<li>Item Pass / Fail Criteria</li>"+
                "<li>Entry & exit criteria</li>" +
                "<li>Suspension criteria and resumption requirements</li>"+
                "<li>Test deliverables</li>" +
                "<li>Remaining test tasks</li>"+
                "<li>Environmental needs</li>" +
                "<li>Staffing and training needs</li>"+
                "<li>Responsibilities</li>" +
                "<li>Planning risks and contingencies</li>"+
                "<li>Approvals</li>" +
                "<li>Glossary</li>"+

                "</ul>"+

                "</body></html>";
        webR.loadData(data, "text/html", "UTF-8");


    }
}
