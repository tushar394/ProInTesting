package com.example.lenovo.prointesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class testScript extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_script);


        WebView webR = (WebView) findViewById(R.id.webScript);
        String data = "<html>" +
                "<p>Once the Test plan is approved, we can start with Test Design Activities.</p>" +
                "<body><h3>Test Case Format:</h3>" +
                "<p> The test cases are designed with respect to each Testable requirement. " +
                "Generally, Test cases contains following attributes-</p>" +
                "<ol>" +
                "<li><h4>Objective:</h4>The objective of the test is mentioned in this section. Usually, " +
                "objective is in short and clear." +
                "E.g. Verify the error message is displayed, when invalid email format is entered in " +
                "'Email address' field.</li>" +
                "<li><h4>Requirements Covered:</h4> In this section, we mention the Requirement numbers which is " +
                "covered in the Test case." +
                "E.g. Requirement Covered: FR 2.4.1</li>" +
                "<li><h4>Prerequisites: </h4>Before executing test case, if certain set up is required to start" +
                " with test execution, then those conditions are listed in this section." +
                "E.g.: Tester should have access to ... module of application.</li>" +
                "<li><h4>Test Data:</h4>In this section, list all the test data which are required to execute this test case." +
                "E.g. Test data for email- xyz@abc.com</li>" +
                "<li><h4>Step number and description:</h4>In this section, we write down all the steps for a test case" +
                " with number." +
                "E.g. Step 1: Enter invalid email format in 'Email Address' field and click 'Enter'.</li>" +
                "<li><h4>Expected Result:</h4>This section specifies what would be expected behaviour of an application" +
                " if the step is executed." +
                "E.g. Error message is displayed by entering invalid address in 'Email address' field.</li>" +
                "<li><h4>Actual Result:</h4> This section will be populated during test execution. This section captures the actual" +
                " behaviour of an application during test execution." +
                "E.g. Error message is displayed by entering invalid address in 'Email address' field." +
                "(During Test Execution, If Actual result is not matched with Expected result then appropriate defect will be " +
                "created.</li>" +
                "</ol>" +
                "<p> Once all the test scripts are created, we have to make sure that each testable requirement is mappedcorrectly" +
                "(Requirement Traceability). All tst cases may need to send for review. Reviewer can be Test Lead, Business Analyst" +
                "QA person etc."+
                /*"<p>Simple example of test case is shown below:"+
                "<table border=\"1\">" +
                "<td rowspan=2; colspan=2;>Ramesh Raman</td>" +
                "<td>5000</td>" +
                "<tr>" +
                "<td>Shabbir Hussein</td>" +

                "</tr>" +
                "</table>"+*/
                "</body></html>";
        webR.loadData(data, "text/html", "UTF-8");

    }
}
