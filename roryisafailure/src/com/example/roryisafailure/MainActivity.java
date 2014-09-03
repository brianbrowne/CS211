package com.example.roryisafailure;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		Typeface externalFont = Typeface.createFromAsset(getAssets(), "fonts/trebuc.TTF");
		textView1.setTypeface(externalFont);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
