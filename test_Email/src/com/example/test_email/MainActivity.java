package com.example.test_email;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	Button sendEmail;
	EditText msg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sendEmail=(Button)findViewById(R.id.button_Send_Email);
		sendEmail.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				msg=(EditText)findViewById(R.id.LocationDescription);
				String message=msg.getText().toString();
				sendEmail(message);
			}
		});
	}

	protected void sendEmail(String message) 
	{
		String [] to=new String [] {"brian.browne93@gmail.com"};
		String subject=("test message app");
		Intent emailIntent =new Intent(Intent.ACTION_SEND);
		emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
		emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
		emailIntent.putExtra(Intent.EXTRA_TEXT,message);
		emailIntent.setType("message/rfc822");
		startActivity(Intent.createChooser(emailIntent,"Email"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
