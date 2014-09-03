package jbbb.semester1.theproject;

import jbbb.semester1.theproject.R;							import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;		import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;				import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;		import android.location.Location;
import android.location.LocationListener;					import android.os.Bundle;
import android.view.Menu;									import android.view.MenuItem;
import android.view.View;									import android.support.v4.app.NavUtils;

public class TheRooms extends android.support.v4.app.FragmentActivity implements LocationListener
{
	private GoogleMap map;//GoogleMap object that is universal to this class

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_the_rooms);
		setupActionBar();

		//Initialized MapFragment which allows you to manipulate the map
		map=((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		map.setMyLocationEnabled(true);//Enable GPS Location.
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//Set teh map to be hybrid when the activity starts up.

	}
	
	@Override
	public void onLocationChanged(Location location) {
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
	
	/*
	 * Below are all the classes for the buttons.
	 * The buttons know how to act based on the 'onClick...'.
	 * Each button in the xml class has an android:onClick="......." and when a button is clicked the corresponding class 
	 * below listens for the click from the xml class and then runs the code for the button.
	 * 
	 *  Each button contains a unique set of co-ordinates, initializes a CamerUpdateFactory that is set to zoom in on the 
	 *  given coordinates and at a magnification of 17, the third line tells the map to update.
	 *  
	 *  The second last line sets the map to Hybrid because prior to having this when the device was changed from landscape
	 *  to horizontal the map would change back to default Google Maps view.
	 *  
	 *  The final line sets a marker to appear at the given coordinates with, when the marker is clicked, a certain string 
	 *  is displayed which contains brief descriptions of the room.
	 * 
	 */

	public void onClickJHL5(View v)
	{
		LatLng JHL5 =new LatLng (53.38378272,-6.60015464);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHL5, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHL5).title("John Hume Lecture Theater 5, downstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}

	public void onClickJHL6(View v)
	{
		LatLng JHL6 =new LatLng (53.38375064,-6.60001515);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHL6, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHL6).title("John Hume Lecture Theater 6, downstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}

	public void onClickJHT4(View v)
	{
		LatLng JHT4 =new LatLng (53.383997,-6.600283);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT4, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHT4).title("John Hume Lecture Tutorial Room 4, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT5(View v)
	{
		LatLng JHT5 =new LatLng (53.38397462,-6.60024045);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT5, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHT5).title("John Hume Lecture Tutorial Room 5, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT6(View v)
	{
		LatLng JHT6 =new LatLng (53.38392982,-6.60019754);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT6, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHT6).title("John Hume Lecture Tutorial Room 6, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT7(View v)
	{
		LatLng JHT7 =new LatLng (53.38387223,-6.60014389);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT7, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHT7).title("John Hume Lecture Tutorial Room 7, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT8(View v)
	{
		LatLng JHT8 =new LatLng (53.38382104,-6.60011171);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT8, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHT8).title("John Hume Lecture Tutorial Room 8, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT9(View v)
	{
		LatLng JHT9 =new LatLng (53.38378264,-6.60007952);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT9, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHT9).title("John Hume Lecture Tutorial Room 9, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT10(View v)
	{
		LatLng JHT10 =new LatLng (53.38375704,-6.60003661);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(JHT10).title("John Hume Lecture Tutorial Room 10, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickLOLOF(View v)
	{
		LatLng LOLOF =new LatLng (53.378416,-6.598406);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(LOLOF, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(LOLOF).title("Lower Loftus, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickLNGCORR(View v)
	{
		LatLng LNGCORR =new LatLng (53.38017332,-6.59591673);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(LNGCORR, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(LNGCORR).title("Long Corridor, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickRYEHA(View v)
	{
		LatLng RYEHA =new LatLng (53.384848,-6.599146);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RYEHA, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(RYEHA).title("Rye Hall, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}

	public void onClickMSH(View v)
	{
		LatLng MSH =new LatLng (53.38442903,-6.60355568);
		CameraUpdate update=CameraUpdateFactory.newLatLngZoom(MSH, 17);
		map.animateCamera(update);
		//map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		map.addMarker(new MarkerOptions().position(MSH).title("Main Sports Hall, North Campus"));
	}
	public void onClickIONFOY(View v)
	{
		LatLng IONFOY =new LatLng (53.384528,-6.600477);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(IONFOY, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(IONFOY).title("Iontas Foyer, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickSSHA(View v)
	{
		LatLng SSHA =new LatLng (53.384835,-6.603717);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(SSHA, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(SSHA).title("Small Sports Hall, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickAAX1(View v)
	{
		LatLng AAX1 =new LatLng (53.384105,-6.598191);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(AAX1, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		map.animateCamera(update2);//tells google maps to update
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		map.addMarker(new MarkerOptions().position(AAX1).title("Auxilla AX1, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}

	private void setupActionBar() {
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.the_rooms, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}