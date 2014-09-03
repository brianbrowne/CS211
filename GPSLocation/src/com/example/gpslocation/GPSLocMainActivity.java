package com.example.gpslocation;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.Menu;


public class GPSLocMainActivity extends android.support.v4.app.FragmentActivity implements LocationListener {
	
	private GoogleMap map;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_gpsloc_main);
	
	
	
	map=((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
	
	MapFragment MapFrag=(MapFragment) getFragmentManager().findFragmentById(R.id.map);
	map=MapFrag.getMap();
	
	map.setMyLocationEnabled(true);
	map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
	
	
	
	
	}
	
	
	@Override
	public void onLocationChanged(Location location){
		// TODO Auto-generated method stub
		}
	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		}
	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		}
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gpsloc_main, menu);
		return true;
	}




	

}
