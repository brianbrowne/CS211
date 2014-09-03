package com.example.mapsemultest;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainActivity extends FragmentActivity 
{
	//private GoogleMap googlemap;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//googlemap=((MapFragment)getFragmentManager().findFragmentById(R.id.googlemap)).getMap();
		//googlemap.setMyLocationEnabled(true);//Enable GPS Location.
		//googlemap.setMapType(GoogleMap.MAP_TYPE_HYBRID);//Set teh map to be hybrid when the activity starts up.
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
