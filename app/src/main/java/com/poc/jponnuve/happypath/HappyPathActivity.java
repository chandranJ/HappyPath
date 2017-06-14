package com.poc.jponnuve.happypath;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class HappyPathActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HappyAdapter adapter;
    Button go;
    EditText number;
    String[] albumList={"AHI “10X-Automation” Rapid Provisioning","Ford Access Management Request (FAM)","Global Headcount Management (GHM)","Launch of SoA (Statement of Applicability) Process - Initial Implementation Phase","Reduced Control Reviews Due To Uploaded Document Updates"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_happy_path);
       /* ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);*/
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        go=(Button) findViewById(R.id.go);
        number=(EditText) findViewById(R.id.number);

        adapter = new HappyAdapter(this, albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int position=Integer.parseInt(number.getText().toString());
                DetailViewActivity(position);

            }
        });
    }

    private void DetailViewActivity(int pos) {
        Intent detail= new Intent(this,DetailViewActivity.class);
        detail.putExtra("position",pos);
        this.startActivity(detail);
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
