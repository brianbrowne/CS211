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

public class CarlKil extends Activity {
	
	Button sendEmail1;
	Button openWebsitePatDer;
	EditText Sub1;
	EditText msg1;
	
	Button sendEmail2;
	Button openWebsitePhilHog;
	EditText Sub2;
	EditText msg2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carl_kil);
		// Show the Up button in the action bar.
		
		
		sendEmail1=(Button)findViewById(R.id.sendEmail1);
		sendEmail1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub1=(EditText)findViewById(R.id.Subject1);
				String Subject1=Sub1.getText().toString();
				msg1=(EditText)findViewById(R.id.message1);
				String msg1str = msg1.getText().toString();
				
				sendEmail1(Subject1,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"pat.deering@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsitePatDer=(Button)findViewById(R.id.patrickDeeringwebsite);
		openWebsitePatDer.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsitePatDer=new Intent(Intent.ACTION_VIEW,Uri.parse("http://patdeering.ie"));
				startActivity(WebsitePatDer);
			}
			});
		
		
		
		sendEmail2=(Button)findViewById(R.id.sendEmailPhilHogan);
		sendEmail2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub2=(EditText)findViewById(R.id.SubjectPhilHogan);
				String SubjectPhilHogan=Sub2.getText().toString();
				msg2=(EditText)findViewById(R.id.messagePhilHogan);
				String msg2str = msg2.getText().toString();
				
				sendEmail1(SubjectPhilHogan,msg2str);
			}

			private void sendEmail1(String subject2, String msg2) 
			{
				String [] to=new String [] {"phil.hogan@oireachtas.ie "};
				Intent emailIntent2 =new Intent(Intent.ACTION_SEND);
				emailIntent2.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent2.putExtra(Intent.EXTRA_SUBJECT,subject2);
				emailIntent2.putExtra(Intent.EXTRA_TEXT,msg2);
				emailIntent2.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent2,"Email"));
				
			}
		});
		
		openWebsitePatDer=(Button)findViewById(R.id.philhoganwebsite);
		openWebsitePatDer.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsitePhilHog=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.philhogan.ie"));
				startActivity(WebsitePhilHog);
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
		getMenuInflater().inflate(R.menu.carl_kil, menu);
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
