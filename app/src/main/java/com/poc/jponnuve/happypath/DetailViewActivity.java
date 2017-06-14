package com.poc.jponnuve.happypath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MTAMILM1 on 6/12/2017.
 */

public class DetailViewActivity extends AppCompatActivity{

    TextView tittletext,desctext,keytext,releasetext,aftertext,beforetext,savingtext,applytext,regiontext,targettext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailview);
        tittletext=(TextView)findViewById(R.id.tittletext);
        desctext=(TextView)findViewById(R.id.destext);

        keytext=(TextView)findViewById(R.id.keytext);
        releasetext=(TextView)findViewById(R.id.releasetext);
        aftertext=(TextView)findViewById(R.id.aftertext);
        beforetext=(TextView)findViewById(R.id.beforetext);
        savingtext=(TextView)findViewById(R.id.savingtext);
        applytext=(TextView)findViewById(R.id.applytext);
        regiontext=(TextView)findViewById(R.id.regiontext);
        targettext=(TextView)findViewById(R.id.targettext);

        int pos=getIntent().getIntExtra("position",-1);
        String[] title={"","AHI “10X-Automation” Rapid Provisioning","Ford Access Management Request (FAM)","Global Headcount Management (GHM)","Launch of SoA (Statement of Applicability) Process - Initial Implementation Phase","Reduced Control Reviews Due To Uploaded Document Updates"};
        String[] desc={"","With the launch of 10X-Automation delivery speed improvements for SQL Server and WAS/IHS in QA/Prod, provisioning of most Transaction Pattern virtual/shared EDC infrastructure can now be completed in 1-5 days.","Customer self-help tool developed to automate customer requests to shared drive folders with minimal interaction from the help desk. This tool addresses multiple pain points with shared drive access requests. Time to fulfill requests before: up to two weeks; After: 1 day","Improved Global Headcount management through common global process and tool, providing global visibility to headcount actuals, consistent entry of forecasts by IT operations teams, and coordinated consolidation and alignment of forecasts.","The IT Internal Controls/Security and Controls Transformation team have introduced new major improvements that will enable Ford to rapidly identify and articulate effective controls by sharing cybersecurity best practices.","The decoupling of Network/Business Flow/Ports & Protocols eliminates the need to re-open, re-review and re-publish the ACR for a document change."};
        String[] key={"","Vibrant Workplace; Value Creation @ Market Speed"};
        String[] release={"","R9 (Mar 2017)"};
        String[] after={"","25 Days","10 Days","15 Days","12 Days","9 Days"};
        String[] before={"","5 Days","1 Day","6 Days","2 Days","3 Days"};
        String[] saving={"","20 Days","9 Days","9 Days","10 Days","6 Days"};
        String[] apply={"","Core & Emerging "};
        String[] region={"","All"};
        String[] target={"","All IT"};

       tittletext.setText(title[pos]);
        desctext.setText(desc[pos]);
        keytext.setText(key[1]);
        releasetext.setText(release[1]);
        aftertext.setText(after[pos]);
        beforetext.setText(before[pos]);
        savingtext.setText(saving[pos]);
        applytext.setText(apply[1]);
        regiontext.setText(region[1]);
        targettext.setText(target[1]);
    }

}
