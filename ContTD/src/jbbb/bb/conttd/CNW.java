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

public class CNW extends Activity {
	
	Button sendEmail1;
	Button openWebsiteAinCol;
	EditText Sub1;
	EditText msg1;
	
	Button sendEmail2;
	Button openWebsiteMicCre;
	EditText Sub2;
	EditText msg2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cnw);
		// Show the Up button in the action bar.
		sendEmail1=(Button)findViewById(R.id.sendEmailAinCol);
		sendEmail1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub1=(EditText)findViewById(R.id.SubjectAinCol);
				String SubjectAinCol=Sub1.getText().toString();
				msg1=(EditText)findViewById(R.id.messageAinCol);
				String msg1str = msg1.getText().toString();
				
				sendEmail1(SubjectAinCol,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"aine.collins@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteAinCol=(Button)findViewById(R.id.AinColwebsite);
		openWebsiteAinCol.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://ainecollins.wordpress.com"));
				startActivity(WebsiteJoeCar);
			}
			});
		
		
		
		sendEmail2=(Button)findViewById(R.id.sendEmailMicCre);
		sendEmail2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub2=(EditText)findViewById(R.id.SubjectMicCre);
				String SubjectMicCre=Sub2.getText().toString();
				msg2=(EditText)findViewById(R.id.messageMicCre);
				String msg2str = msg2.getText().toString();
				
				sendEmail1(SubjectMicCre,msg2str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"michael.creed@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteMicCre=(Button)findViewById(R.id.MicCrewebsite);
		openWebsiteMicCre.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://michaelcreedfg.wordpress.com"));
				startActivity(WebsiteJoeCar);
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
		getMenuInflater().inflate(R.menu.cnw, menu);
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
