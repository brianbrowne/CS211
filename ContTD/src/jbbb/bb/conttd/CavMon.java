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

public class CavMon extends Activity {
	
	Button sendEmailHeaHum;
	Button openWebsiteHeaHum;
	EditText Sub1;
	EditText msg1;
	
	Button sendEmailSeaCon;
	Button openWebsiteSeaCon;
	EditText Sub2;
	EditText msg2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cav_mon);
		// Show the Up button in the action bar.
		
		
		sendEmailHeaHum=(Button)findViewById(R.id.sendEmailHeaHum);
		sendEmailHeaHum.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub1=(EditText)findViewById(R.id.SubjectHeaHum);
				String Subject1=Sub1.getText().toString();
				msg1=(EditText)findViewById(R.id.messageHeaHum);
				String msg1str = msg1.getText().toString();
				
				sendEmail1(Subject1,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"heather.humphreys@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteHeaHum=(Button)findViewById(R.id.HeatherHumphreyswebsite);
		openWebsiteHeaHum.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsitePatDer=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.heatherhumphreys.ie"));
				startActivity(WebsitePatDer);
			}
			});
		
		
		
		
		sendEmailSeaCon=(Button)findViewById(R.id.sendEmailSeaCon);
		sendEmailSeaCon.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub2=(EditText)findViewById(R.id.SubjectSeaCon);
				String SubjectSeaCon=Sub2.getText().toString();
				msg2=(EditText)findViewById(R.id.messageSeaCon);
				String msg2str = msg2.getText().toString();
				
				sendEmail1(SubjectSeaCon,msg2str);
			}

			private void sendEmail1(String subject2, String msg2) 
			{
				String [] to=new String [] {"sean.conlan@oireachtas.ie "};
				Intent emailIntent2 =new Intent(Intent.ACTION_SEND);
				emailIntent2.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent2.putExtra(Intent.EXTRA_SUBJECT,subject2);
				emailIntent2.putExtra(Intent.EXTRA_TEXT,msg2);
				emailIntent2.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent2,"Email"));
				
			}
		});
		
		openWebsiteSeaCon=(Button)findViewById(R.id.SeanConlanwebsite);
		openWebsiteSeaCon.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsitePhilHog=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.seanconlan.ie "));
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
		getMenuInflater().inflate(R.menu.cav_mon, menu);
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
