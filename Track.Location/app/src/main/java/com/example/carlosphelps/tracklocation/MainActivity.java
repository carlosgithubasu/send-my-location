package com.example.carlosphelps.tracklocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.view.ViewPager;

/**
 super.onCreate  calls method of parent's class (e.g.framework classes handling life cycles)
 R means Resource; layout means design; main is the xml you have created under res->layout->main.xml
 findViewById(int) to retrieve the widgets in that UI that you need to interact with programmatically.
 */


public class MainActivity extends AppCompatActivity {


     public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
     ViewPager viewPager;
     CustomSwipeAdapter  adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter= new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
    }






    /** Called when the user clicks the Send button */
    public void getStarted(View view) {

        // Do something in response to button
        Intent intent = new Intent(this, getStartedActivity.class);
        intent.putExtra(EXTRA_MESSAGE,"Who do you want to locate?");
        startActivity(intent);
    }
}
