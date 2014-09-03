package jbbb.bb.conttd;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class Clare extends Activity {

	Button sendEmail1;
	Button openWebsiteJoeCar;
	EditText Sub1;
	EditText msg1;
	
	Button sendEmailPatBre;
	Button openWebsitePatBre;
	EditText Sub2;
	EditText msg2;
	
	Button sendEmailTimDoo;
	Button openWebsiteTimDoo;
	EditText Sub3;
	EditText msg3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clare);
		// Show the Up button in the action bar.
		
		
		sendEmail1=(Button)findViewById(R.id.sendEmailJoeCar);
		sendEmail1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub1=(EditText)findViewById(R.id.SubjectJoeCar);
				String SubjectJoeCar=Sub1.getText().toString();
				msg1=(EditText)findViewById(R.id.messageJoeCar);
				String msg1str = msg1.getText().toString();
				
				sendEmail1(SubjectJoeCar,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"joe.carey@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteJoeCar=(Button)findViewById(R.id.JoeCarwebsite);
		openWebsiteJoeCar.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.joecarey.ie"));
				startActivity(WebsiteJoeCar);
			}
			});
		
		
		
		
		sendEmailPatBre=(Button)findViewById(R.id.sendEmailPatBre);
		sendEmailPatBre.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub2=(EditText)findViewById(R.id.SubjectPatBre);
				String SubjectPatBre=Sub2.getText().toString();
				msg2=(EditText)findViewById(R.id.messagePatBre);
				String msg2str = msg2.getText().toString();
				
				sendEmail1(SubjectPatBre,msg2str);
			}

			private void sendEmail1(String subject2, String msg2) 
			{
				String [] to=new String [] {"pat.breen@oireachtas.ie"};
				Intent emailIntent2 =new Intent(Intent.ACTION_SEND);
				emailIntent2.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent2.putExtra(Intent.EXTRA_SUBJECT,subject2);
				emailIntent2.putExtra(Intent.EXTRA_TEXT,msg2);
				emailIntent2.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent2,"Email"));
				
			}
		});
		
		openWebsitePatBre=(Button)findViewById(R.id.PatBrewebsite);
		openWebsitePatBre.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsitePatBre=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.patbreen.ie"));
				startActivity(WebsitePatBre);
			}
			});
		
		
		
		sendEmailTimDoo=(Button)findViewById(R.id.sendEmailTimDoo);
		sendEmailTimDoo.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub3=(EditText)findViewById(R.id.SubjectTimDoo);
				String SubjectTimDoo=Sub3.getText().toString();
				msg3=(EditText)findViewById(R.id.messageTimDoo);
				String msg3str = msg3.getText().toString();
				
				sendEmail1(SubjectTimDoo,msg3str);
			}

			private void sendEmail1(String subject3, String msg3) 
			{
				String [] to=new String [] {"timmy.dooley@oireachtas.ie"};
				Intent emailIntent2 =new Intent(Intent.ACTION_SEND);
				emailIntent2.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent2.putExtra(Intent.EXTRA_SUBJECT,subject3);
				emailIntent2.putExtra(Intent.EXTRA_TEXT,msg3);
				emailIntent2.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent2,"Email"));
				
			}
		});
		
		openWebsiteTimDoo=(Button)findViewById(R.id.TimDoowebsite);
		openWebsiteTimDoo.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteTimDoo=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.fiannafail.ie/people/timmy-dooley"));
				startActivity(WebsiteTimDoo);
			}
			});
		
		
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.clare, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
