package jbbb.bb.conttd;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KerrySou extends Activity {
	
	Button sendEmail1;
	Button openWebsiteBreGri;
	EditText Sub1;
	EditText msg1;
	
	Button sendEmail2;
	Button openWebsiteMicRae;
	EditText Sub2;
	EditText msg2;
	
	Button sendEmail3;
	Button openWebsiteTomFle;
	EditText Sub3;
	EditText msg3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kerry_sou);
		
		sendEmail1=(Button)findViewById(R.id.sendEmailBreGri);
		sendEmail1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub1=(EditText)findViewById(R.id.SubjectBreGri);
				String SubjectJimDal=Sub1.getText().toString();
				msg1=(EditText)findViewById(R.id.messageBreGri);
				String msg1str = msg1.getText().toString();
				
				sendEmail1(SubjectJimDal,msg1str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"brendan.griffin@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		openWebsiteBreGri=(Button)findViewById(R.id.BreGriwebsite);
		openWebsiteBreGri.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://brendangriffin.ie"));
				startActivity(WebsiteJoeCar);
			}
			});
		
		
		
		sendEmail2=(Button)findViewById(R.id.sendEmailMicRae);
		sendEmail2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub2=(EditText)findViewById(R.id.SubjectMicRae);
				String SubjectNoeHar=Sub2.getText().toString();
				msg2=(EditText)findViewById(R.id.messageMicRae);
				String msg2str = msg2.getText().toString();
				
				sendEmail1(SubjectNoeHar,msg2str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"michael.healy-rae@oireachtas.ie"};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		/*openWebsiteMarFer=(Button)findViewById(R.id.MarFerwebsite);
		openWebsiteMarFer.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.sinnfein.ie/contents/14984"));
				startActivity(WebsiteJoeCar);
			}
			});*/
		
		
		sendEmail3=(Button)findViewById(R.id.sendEmailTomFle);
		sendEmail3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Sub3=(EditText)findViewById(R.id.SubjectTomFle);
				String SubjectNoeHar=Sub3.getText().toString();
				msg3=(EditText)findViewById(R.id.messageTomFle);
				String msg2str = msg3.getText().toString();
				
				sendEmail1(SubjectNoeHar,msg2str);
			}

			private void sendEmail1(String subject1, String msg1) 
			{
				String [] to=new String [] {"tom.fleming@oireachtas.ie "};
				Intent emailIntent =new Intent(Intent.ACTION_SEND);
				emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject1);
				emailIntent.putExtra(Intent.EXTRA_TEXT,msg1);
				emailIntent.setType("message/rfc822");
				startActivity(Intent.createChooser(emailIntent,"Email"));
				
			}
		});
		
		/*openWebsiteMarFer=(Button)findViewById(R.id.MarFerwebsite);
		openWebsiteMarFer.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v)
			{
				Intent WebsiteJoeCar=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.sinnfein.ie/contents/14984"));
				startActivity(WebsiteJoeCar);
			}
			});*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kerry_sou, menu);
		return true;
	}

}
