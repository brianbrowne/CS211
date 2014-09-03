package jbbb.semester1.theproject;

import jbbb.semester1.theproject.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivityTheProject extends Activity {

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 * 
	 * Within the onCreate method there are 4 intents that are attached to onClickListeners each calling the respective 
	 * class that it tells it to call
	 *  
	 */
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_the_project);
		
		/*
		 * This button is initialize as FindYourRoom, it is linked to the button with the id 'LecLoc' and 
		 * when it is clicked it will use the intent initialized as 'intent' will start the 'TheRooms'  class
		 * and bring up the activity linked to that class. 
		 */
		
		Button FindYourRoom = (Button) findViewById(R.id.trigger);
		FindYourRoom.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent=new Intent(v.getContext(),TheRooms.class);
				startActivityForResult(intent,0);
			}
		});
		
		/*
		 * This button is initialize as FindYourLecHall, it is linked to the button with the id 'LecLoc' and 
		 * when it is clicked it will use the intent initialized as 'intent2' will start the 'LectLocator'  class
		 * and bring up the activity linked to that class. 
		 */
		
		Button FindYourLecHall = (Button) findViewById(R.id.LecLoc);
		FindYourLecHall.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent2=new Intent(v.getContext(),LectLocator.class);
				startActivityForResult(intent2,0);
			}
		});
		
		/*
		 * This button is initialize as SellBooks, it is linked to the button with the id cliSide and 
		 * when it is clicked it will use the intent initialized as 'intent3' will start the 'ClientSide'  class
		 * and bring up the activity linked to that class. 
		 */
		
		Button SellBooks = (Button) findViewById(R.id.cliSide);
		SellBooks.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent3=new Intent(v.getContext(),ClientSide.class);
				startActivityForResult(intent3,0);
			}
		});
		
		/*
		 * This button is initialize as BuyBooks, it is linked to the button with the id SerSide and 
		 * when it is clicked it will use the intent initialized as 'intent4' will start the 'SerSide'  class
		 * and bring up the activity linked to that class. 
		 */
		
		Button BuyBooks = (Button) findViewById(R.id.SerSide);
		BuyBooks.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent4=new Intent(v.getContext(),ServerSide.class);
				startActivityForResult(intent4,0);
			}
		});
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_the_project, menu);
		return true;
	}

}
