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

public class GalE extends Activity {
	
	Button sendEmail1;
	Button openWebsiteCiaCan;
	EditText Sub1;
	EditText msg1;
	
	Button sendEmail2;
	Button openWebsiteColKea;
	EditText Sub2;
	EditText msg2;
	
	Button sendEmail3;
	Button openWebsitePauCon;
	EditText Sub3;
	EditText msg3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gal_e);
		// Show the Up button in the action bar.
		
		sendEmail1=(Button)findViewById(R.id.sendEmailCiaCan);
		sendEmail1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub1=(EditText)findViewById(R.id.SubjectCiaCan);
				String SubjectJimDal=Sub1.getText().toString();
				msg1=(EditText)findViewById(R.id.messageCiaCan);
				String msg1str = msg1.getText().toString();
				
				sendEmail1(SubjectJimDal,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"ciaran.cannon@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteCiaCan=(Button)findViewById(R.id.CiaCanwebsite);
		openWebsiteCiaCan.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http:/www.finegael.ie/our-people/ministers/ciaran-cannon"));
				startActivity(WebsiteJoeCar);
			}
			});
		
		
		
		sendEmail2=(Button)findViewById(R.id.sendEmailColKea);
		sendEmail2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub2=(EditText)findViewById(R.id.SubjectColKea);
				String SubjectNoeHar=Sub2.getText().toString();
				msg2=(EditText)findViewById(R.id.messageColKea);
				String msg2str = msg2.getText().toString();
				
				sendEmail1(SubjectNoeHar,msg2str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"colm.keaveney@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		/*openWebsiteRicBar=(Button)findViewById(R.id.RicBarwebsite);
		openWebsiteRicBar.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://richardboydbarrett.ie"));
				startActivity(WebsiteJoeCar);
			}
			});*/
		
		
		sendEmail3=(Button)findViewById(R.id.sendEmailPauCon);
		sendEmail3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub3=(EditText)findViewById(R.id.SubjectPauCon);
				String SubjectNoeHar=Sub3.getText().toString();
				msg3=(EditText)findViewById(R.id.messagePauCon);
				String msg3str = msg3.getText().toString();
				
				sendEmail1(SubjectNoeHar,msg3str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"paulj.connaughton@oir.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsitePauCon=(Button)findViewById(R.id.PauConwebsite);
		openWebsitePauCon.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://paulconnaughton.ie"));
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
		getMenuInflater().inflate(R.menu.gal_e, menu);
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
