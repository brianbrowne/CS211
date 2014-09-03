package com.example.historicireland2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivityHI2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_hi2);
        
        Button Explore = (Button) findViewById(R.id.Explore);
		Explore.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent=new Intent(v.getContext(),Explore.class);
				startActivityForResult(intent,0);
			}
		});
		
		Button Database = (Button) findViewById(R.id.Database);
		Database.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent2=new Intent(v.getContext(),Database.class);
				startActivityForResult(intent2,0);
			}
		});
		
		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_hi2, menu);
        return true;
    }
    
}
