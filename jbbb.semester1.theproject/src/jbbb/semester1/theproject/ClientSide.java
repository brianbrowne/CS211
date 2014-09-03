package jbbb.semester1.theproject;

import jbbb.semester1.theproject.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.database.Cursor;
import android.os.Build;

public class ClientSide extends Activity {

	// Initialise some elements:
	Button submitButton;
	EditText Etitle;
	EditText Eauthor;
	EditText Esubject;
	EditText Emodule;
	EditText Ecomment;
	String title;
	String author;
	String subject;				//initialise variables
	String module;
	String comment;
	TextView testview;

	
	
	
	DBAdapter myDb;		//create an instance of the database adapter

	@Override
	protected void onCreate(Bundle savedInstanceState) {				//when the activity is created
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_client_side);
		// Show the Up button in the action bar.
		setupActionBar();
		submitButton = (Button)findViewById(R.id.CSSubmit);
		Etitle = (EditText)findViewById(R.id.editBookTitle);
		Eauthor = (EditText)findViewById(R.id.editBookAuthor);				//assign the initialised elements to the actual UI elements using the element ID's
		Esubject = (EditText)findViewById(R.id.editBookSubject);
		Emodule = (EditText)findViewById(R.id.editModuleCode);
		Ecomment = (EditText)findViewById(R.id.editComment);
		testview = (TextView)findViewById(R.id.testview);
		openDB();															//open the database
	}
	
	protected void onDestroy() {					//when the activity is closed
		super.onDestroy();						
		closeDB();									//close the database.
	}
	
	private void openDB() {							//create a method that when called opens the sql database through the adapter we have written
		myDb = new DBAdapter(this);					
		myDb.open();
	}
	private void closeDB() {				//make method to close the database
		myDb.close();					
	}
	
	public void onClickCSSubmit(View v){					//when you click the submit button
		
		title = Etitle.getText().toString();
		author = Eauthor.getText().toString();					//get text entered into the UI elements, cast them as Strings and store them in the initialised varaibles
		subject = Esubject.getText().toString();
		module = Emodule.getText().toString();
		comment = Ecomment.getText().toString();
		
		long newID = myDb.insertRow(title,author,subject,module,comment);			//call the insertRow method and save the returned ID as a long
		//testview.setText("hello"); (just for testing if the Text Views were working

		Cursor cursor = myDb.getRow(newID);			//create a new cursor and get the row just created and pass it to the cursor
		displayRecordSet(cursor);					//display the row the cursor retrieved
				
		
	}
	
	private void displayRecordSet(Cursor cursor) {
		String message = "";
		// populate the message from the cursor
		
		// Reset cursor to start, checking to see if there's data:
		if (cursor.moveToFirst()) {
			do {
				// Process the data:
				int id = cursor.getInt(DBAdapter.COL_ROWID);
				String name = cursor.getString(DBAdapter.COL_TITLE);
				String author = cursor.getString(DBAdapter.COL_AUTHOR);
				String subject = cursor.getString(DBAdapter.COL_SUBJECT);
				String module = cursor.getString(DBAdapter.COL_MODULE);
				String comment = cursor.getString(DBAdapter.COL_COMMENT);
				
				// Append data to the message:
				message += "id=" + id
						   +", Title=" + name
						   +", Author=" + author
						   +", Subject=" + subject
						   +", Module =" + module
						   +", Comment=" + comment
						   +"\n";
			} while(cursor.moveToNext());
		}
		
		// Close the cursor to avoid a resource leak.
		cursor.close();
		
		displayText(message);
	}
	
	private void displayText(String message) {
        TextView textView = (TextView) findViewById(R.id.testview);
        textView.setText(message);
	}
	
	///////////////////////////////////////////////////////////
	//////			old test code		//////////////////////
	//////////////////////////////////////////////////////////
	
	/*
	 * This was just used in some of the earlier attempts at getting the database working
	 * it would submit a hard coded entry into the database and we would check if we could
	 * then retrieve it.
	 */
	
	
//	public void onClick_AddRecord(View v) {
//		
//		long newId = myDb.insertRow("sampleTitle,","sampleAuthor","sampleSubject","sampleModule","sampleComment");
		
		// Query for the record we just added.
		// Use the ID:
//		Cursor cursor = myDb.getRow(newId);
//		displayRecordSet(cursor);
//	}
	
	///////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////
	
	

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
		getMenuInflater().inflate(R.menu.client_side, menu);
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
