package com.example.rorypractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivityRory extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.rorypractice.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_rory);
	}
	
	public void sendMessage(View view) {
	    Intent intent = new Intent(this, SecondPageRory.class);
	    EditText editText = (EditText) findViewById(R.id.editText1);
	    String message = editText.getText().toString();
	    intent.putExtra(EXTRA_MESSAGE, message);
	    startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_rory, menu);
		return true;
	}

}
