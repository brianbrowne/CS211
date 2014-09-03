package com.example.historicireland;


import java.util.List;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

public class add_to_database extends Activity 
{
	private GoogleMap googlemap;
	DataSource data;
	Context context=this;
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_database);
		// Show the Up button in the action bar.
		setupActionBar();
		
		
		
		List<dataObject> m = data.getMyMarkers();
		for (int i=0; i<m.size();i++)
		{
			String[] slatlng =m.get(i).getPosition().split(" ");
			LatLng lat=new LatLng(Double.valueOf(slatlng[0]), Double.valueOf(slatlng[1]));
			googlemap.addMarker(new MarkerOptions()
					.title(m.get(i).getTitle())
					.snippet(m.get(i).getSnippet())
					.position(lat)
			);
			
		}
		
		data.addMarker(new dataObject("Title", "snippet", "37.83628 -122"));
		
		
		data=new DataSource(context);
		data.open();
		data.close();
		
		
		
		
		
	}


	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_to_database, menu);
		return true;
	}

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
