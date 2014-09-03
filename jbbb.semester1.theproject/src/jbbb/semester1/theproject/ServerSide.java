/*
 * This code mimics the storing and retrieving of information that would take place had we a server to
 * run this on. It lacks the actual network code for the server/client socket connection that would need to take place
 * but the principle is the same, we were just unable to secure a server to run the app on.
 * 
 *  Instead the database runs entirely on the machine with the information being stored locally rather than on a server.
 */


package jbbb.semester1.theproject;

import jbbb.semester1.theproject.R;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ServerSide extends Activity {
	
	Button displaydatabase;
	Button deletedatabase;		//initialise some buttons and views.
	TextView databaseshow;
	
	DBAdapter myDb;			//create an instance of the database adapter
	
	private void openDB() {
		myDb = new DBAdapter(this);		//make a method that when called opens the sql database through the adapter we have written
		myDb.open();
	}
	private void closeDB() {
		myDb.close();					//make a method that will close the database after we are done.
	}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {		//when the activity is created:
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_server_side);
		openDB();													//open the database
		displaydatabase = (Button)findViewById(R.id.ddb);			//set the initialised buttons and views to the actual UI elements.
		deletedatabase = (Button)findViewById(R.id.deletedb);
		databaseshow = (TextView)findViewById(R.id.databaseshow);
	}
	
	protected void onDestroy() {
		super.onDestroy();				//when the activity is closed
		closeDB();						//close the database
	}
	
	public void onClickdisplaydatabase(View v){			//when you click "Display Database"
		
		displayText("Clicked display record!");			//display confirmation text
		
		Cursor cursor = myDb.getAllRows();				//set the cursor to select all of the rows (all the information in the database)
		displayRecordSet(cursor);						//pass the cursor with the rows to the method that displays it on screen
		
	}
	
	public void onClickdeletedatabase(View v){			//when you click "Delete Database" (This would not be available on the actual
														//phone app but since we don't have a server to demonstrate this is to show
														//that we do actually have a delete function)		
		displayText("Clicked clear all!");				//Display confirmation text		
		myDb.deleteAll();								//delete entire database
			
	}
	
	private void displayRecordSet(Cursor cursor) {			//take in a cursor holding certain rows/columns
		String message = "";
		// Create a String that will be populated by the cursor and printed by the method.
		
		// Reset cursor to start, checking to see if there's data available in the database.
		if (cursor.moveToFirst()) {
			do {
				// Process the database:
				int id = cursor.getInt(DBAdapter.COL_ROWID);
				String name = cursor.getString(DBAdapter.COL_TITLE);
				String author = cursor.getString(DBAdapter.COL_AUTHOR);				//pass the information from each column of the row to the cursor
				String subject = cursor.getString(DBAdapter.COL_SUBJECT);
				String module = cursor.getString(DBAdapter.COL_SUBJECT);
				String comment = cursor.getString(DBAdapter.COL_SUBJECT);
				
				// Append data to the message:
				message += "id=" + id
						   +", Title=" + name
						   +", Author=" + author
						   +", Subject=" + subject
						   +", Module =" + module
						   +", Comment=" + comment
						   +"\n";
			} while(cursor.moveToNext());		//while there is still data move the cursor to the next row.
		}
		
		// Close the cursor to avoid a resource leak.
		cursor.close();
		
		displayText(message);	//pass all the information stored in the cursor (all the rows that were parsed) to the method that will display on the text view.
	}
	

	private void displayText(String message) {									//take in string
        TextView textView = (TextView) findViewById(R.id.databaseshow);			//find the text view through its ID
        textView.setText(message);												//display the string to the text view
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {						
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.server_side, menu);
		return true;
	}

}
