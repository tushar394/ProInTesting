package com.example.lenovo.prointesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Requirement2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requirement2);

        WebView webR = (WebView) findViewById(R.id.webReq2);
        String data = "<html><body>We have seen what is the 'Requirement'. Now, let's see which are " +
                "different types of requirements in software engineering." +
                "<h3>Different Types of Requirements : </h3>" +
                "<h4> 1.Functional Requirements</h4>" +
                "<p> The requirements which are associated with the functionality of an application are called functional requirements.<br>" +
                " For e.g. a typical search engine functional requirement could be: The system shall accept a list of keywords and should return" +
                " a list of links whose content matches to that of the given keywords.</p>" +
                " <p>During System Test, we have to cover all these requirements in the test cases. </p>" +
                "<h4> 2.Non Functional Requirements</h4>" +
                "<p> The requirements which are not associated to functionality of an application are called Non functional requirements.</p>" +
                "<p>For e.g. Requirements related to Security, Performance, Compliance, Disatser Recovery, Scalability," +
                " Accessibility, Backup etc. are fallen under this categories.<br><br>"+
                "<p>Aart form these, there are Design requirements, Physical requirements, User Requirements etc. " +
                "We covers User Requirements in User Accepetance Testing</p>"+


                "<h3 style=\"color:#FF0000\";>Role of Testing team in this phase:</h3> "+
                "<p>In requirement analysis phase, test team analyse the customer requirements from a testing point" +
                " of view to find the testable requirements. The project team may interact with\n" +
                "various stakeholders to know the requirements in detail so that they can produce test cases which " +
                "are associated with these requirements.</p>"+
                "</body></html>";
        webR.loadData(data, "text/html", "UTF-8");


    }
}
