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

public class Mayo extends Activity {
	
	Button sendEmail1;
	Button openWebsiteDarCal;
	EditText Sub1;
	EditText msg1;
	
	Button sendEmail2;
	Button openWebsiteEndKen;
	EditText Sub2;
	EditText msg2;
	
	Button sendEmail3;
	Button openWebsiteJohMah;
	EditText Sub3;
	EditText msg3;
	
	Button sendEmail4;
	Button openWebsiteMicRin;
	EditText Sub4;
	EditText msg4;
	
	Button sendEmail5;
	Button openWebsiteMicMul;
	EditText Sub5;
	EditText msg5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mayo);
		// Show the Up button in the action bar.
		
		
		sendEmail1=(Button)findViewById(R.id.sendEmailDarCal);
		sendEmail1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub1=(EditText)findViewById(R.id.SubjectDarCal);
				String SubjectJimDal=Sub1.getText().toString();
				msg1=(EditText)findViewById(R.id.messageDarCal);
				String msg1str = msg1.getText().toString();
				
				sendEmail1(SubjectJimDal,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"dara.calleary@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteDarCal=(Button)findViewById(R.id.DarCalwebsite);
		openWebsiteDarCal.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://daracalleary.ie"));
				startActivity(WebsiteJoeCar);
			}
			});
		
		
		sendEmail2=(Button)findViewById(R.id.sendEmailEndKen);
		sendEmail2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub2=(EditText)findViewById(R.id.SubjectEndKen);
				String SubjectJimDal=Sub2.getText().toString();
				msg2=(EditText)findViewById(R.id.messageEndKen);
				String msg1str = msg2.getText().toString();
				
				sendEmail1(SubjectJimDal,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"taoiseach@taoiseach.gov.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteEndKen=(Button)findViewById(R.id.EndKenwebsite);
		openWebsiteEndKen.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.finegael.ie/our-people/taoiseach/enda-kenny/"));
				startActivity(WebsiteJoeCar);
			}
			});
		
		
		sendEmail3=(Button)findViewById(R.id.sendEmailJohMah);
		sendEmail3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub3=(EditText)findViewById(R.id.SubjectJohMah);
				String SubjectJimDal=Sub3.getText().toString();
				msg3=(EditText)findViewById(R.id.messageJohMah);
				String msg1str = msg3.getText().toString();
				
				sendEmail1(SubjectJimDal,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"john.omahony@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteJohMah=(Button)findViewById(R.id.JohMahwebsite);
		openWebsiteJohMah.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.johnomahony.ie"));
				startActivity(WebsiteJoeCar);
			}
			});
		
		
		sendEmail4=(Button)findViewById(R.id.sendEmailMicRin);
		sendEmail4.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub4=(EditText)findViewById(R.id.SubjectMicRin);
				String SubjectJimDal=Sub4.getText().toString();
				msg4=(EditText)findViewById(R.id.messageMicRin);
				String msg1str = msg4.getText().toString();
				
				sendEmail1(SubjectJimDal,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"michael.ring@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		/*openWebsiteMicRin=(Button)findViewById(R.id.MicRinwebsite);
		openWebsiteMicRin.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("finegael.ie/our-people/tds/peter-fitzpatrick/index.xml"));
				startActivity(WebsiteJoeCar);
			}
			});*/
		
		
		sendEmail5=(Button)findViewById(R.id.sendEmailMicMul);
		sendEmail5.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub5=(EditText)findViewById(R.id.SubjectMicMul);
				String SubjectJimDal=Sub5.getText().toString();
				msg5=(EditText)findViewById(R.id.messageMicMul);
				String msg1str = msg5.getText().toString();
				
				sendEmail1(SubjectJimDal,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"michelle.mulherin@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		/*openWebsitePetFit=(Button)findViewById(R.id.PetFitwebsite);
		openWebsitePetFit.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("finegael.ie/our-people/tds/peter-fitzpatrick/index.xml"));
				startActivity(WebsiteJoeCar);
			}
			});*/
		
		
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
		getMenuInflater().inflate(R.menu.mayo, menu);
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
