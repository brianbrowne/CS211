package com.example.hellowordl2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity 
{
	public final static String EXTRA_MESSAGE="com.example.HelloWordl2.Message";
	
	public void sendMessage(View view)
	{
		Intent intent = new Intent(getBaseContext(),DisplayMessageActivity.class);
		intent.putExtra("key",0);
		startActivity(intent);
		}
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
