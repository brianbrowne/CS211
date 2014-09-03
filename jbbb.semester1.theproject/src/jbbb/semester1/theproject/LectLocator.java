package jbbb.semester1.theproject;


import jbbb.semester1.theproject.R;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LectLocator extends android.support.v4.app.FragmentActivity implements LocationListener
{
	
	//initialize a GoogleMap object that is universal to the whole java class. 
	private GoogleMap mapTS;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lect_locator);
		// Show the Up button in the action bar.
		//setupActionBar();
		
		//Create a MapFragment called mapTS so that you can add and delete things from the map. 
		mapTS=((MapFragment)getFragmentManager().findFragmentById(R.id.map2)).getMap();
		
		mapTS.setMyLocationEnabled(true);//This enables the GPS Location Services which are built into Google Maps V2  
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//set the map so that when the Activity is selected the map will automatically be in Hybrid mode
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
	
	public void onClickRoom61(View v)
	{
		LatLng RoomLoc =new LatLng (53.37894298,-6.59620105);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Upstairs, Opposite Swimming Pool"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	
	public void onClickRoom62(View v)
	{
		LatLng RoomLoc =new LatLng (53.37895578,-6.59624396);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Upstairs, Opposite Swimming Pool"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	
	public void onClickAPT(View v)
	{
		LatLng RoomLoc =new LatLng (53.38565921,-6.5988618);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("River Apartment Reception, Student Apartments"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}

	public void onClickAX1(View v)
	{
		LatLng RoomLoc =new LatLng (53.38408504,-6.59811614);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor, Auxilia Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	
	public void onClickAX2(View v)
	{
		LatLng RoomLoc =new LatLng (53.38412723,-6.59821808);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor, Auxilia Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickBL(View v)
	{
		LatLng RoomLoc =new LatLng (53.38352251,-6.6031909);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("1st Floor, Dep of Biology, Callan Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickBR(View v)
	{
		LatLng RoomLoc =new LatLng (53.37799637,-6.59588992);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor, Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickCC1(View v)
	{
		LatLng RoomLoc =new LatLng (53.38097232,-6.5965122);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Computer Centre, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickCC2(View v)
	{
		LatLng RoomLoc =new LatLng (53.38098192,-6.5962708);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Computer Centre, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickCH(View v)
	{
		LatLng RoomLoc =new LatLng (53.37987476,-6.59570217);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Stoyte House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickCS1(View v)
	{
		LatLng RoomLoc =new LatLng (53.3826682,-6.60254717);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor, Dep of Computer Science, Callan Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickCS2(View v)
	{
		LatLng RoomLoc =new LatLng (53.3826714,-6.60225749);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor, Dep of Computer Science, Callan Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickCSR(View v)
	{
		LatLng RoomLoc =new LatLng (53.38307827,-6.60261677);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor, Dep of Computer Science, Callan Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickELT(View v)
	{
		LatLng RoomLoc =new LatLng (53.38338543,-6.59776197);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor, Education House, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickESR(View v)
	{
		LatLng RoomLoc =new LatLng (53.38330224,-6.59771369);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor, Education House, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickGR(View v)
	{
		LatLng RoomLoc =new LatLng (53.37855049,-6.59645305);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor,Rhetoric House,South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickHA(View v)
	{
		LatLng RoomLoc =new LatLng (53.3836574,-6.60139904);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickHB(View v)
	{
		LatLng RoomLoc =new LatLng (53.38372779,-6.60138831);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickHC(View v)
	{
		LatLng RoomLoc =new LatLng (53.38380459,-6.60141514);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickHD(View v)
	{
		LatLng RoomLoc =new LatLng (53.38386538,-6.60146878);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickHE(View v)
	{
		LatLng RoomLoc =new LatLng (53.38400936,-6.60160826);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickHF(View v)
	{
		LatLng RoomLoc =new LatLng (53.38404776,-6.60180137);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickHH(View v)
	{
		LatLng RoomLoc =new LatLng (53.38357741,-6.60187111);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickIONSEM(View v)
	{
		LatLng RoomLoc =new LatLng (53.38479006,-6.60087869);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor,Iontas Building,North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJH1(View v)
	{
		LatLng RoomLoc =new LatLng (53.38417894,-6.60026179);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor,John Hume Building,North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJH2(View v)
	{
		LatLng RoomLoc =new LatLng (53.38401256,-6.60017596);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor,John Hume Building,North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJH3(View v)
	{
		LatLng RoomLoc =new LatLng (53.38396457,-6.60012768);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Ground Floor,John Hume Building,North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJH4(View v)
	{
		LatLng RoomLoc =new LatLng (53.38392937,-6.60010622);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("First Floor,John Hume Building,North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJH5(View v)
	{
		LatLng RoomLoc =new LatLng (53.38387818,-6.6000794);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("First Floor,John Hume Building,North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJH6(View v)
	{
		LatLng RoomLoc =new LatLng (53.38383338,-6.60004185);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("First Floor,John Hume Building,North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJH7(View v)
	{
		LatLng RoomLoc =new LatLng (53.38377259,-6.60009012);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("First Floor,John Hume Building,North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickKC1(View v)
	{
		LatLng RoomLoc =new LatLng (53.38406375,-6.59364209);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Kairos Communications, Moyglare Road, Maynooth"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickKC2(View v)
	{
		LatLng RoomLoc =new LatLng (53.38411495,-6.59374402);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(RoomLoc, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(RoomLoc).title("Kairos Communications, Moyglare Road, Maynooth"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickLC(View v)
	{

		LatLng LNGCORR =new LatLng (53.38017332,-6.59591673);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(LNGCORR, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(LNGCORR).title("Long Corridor, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT1(View v)
	{
		LatLng JHT4 =new LatLng (53.38413094,-6.60037444);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT4, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT4).title("John Hume Lecture Tutorial Room 1, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT2(View v)
	{
		LatLng JHT4 =new LatLng (53.38408615,-6.60041199);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT4, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT4).title("John Hume Lecture Tutorial Room 2, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT3(View v)
	{
		LatLng JHT4 =new LatLng (53.38400936,-6.60036371);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT4, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT4).title("John Hume Lecture Tutorial Room 3, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT4(View v)
	{
		LatLng JHT4 =new LatLng (53.383997,-6.600283);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT4, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT4).title("John Hume Lecture Tutorial Room 4, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT5(View v)
	{

		LatLng JHT5 =new LatLng (53.38397462,-6.60024045);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT5, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT5).title("John Hume Lecture Tutorial Room 5, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT6(View v)
	{

		LatLng JHT6 =new LatLng (53.38392982,-6.60019754);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT6, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT6).title("John Hume Lecture Tutorial Room 6, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT7(View v)
	{

		LatLng JHT7 =new LatLng (53.38387223,-6.60014389);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT7, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT7).title("John Hume Lecture Tutorial Room 7, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT8(View v)
	{

		LatLng JHT8 =new LatLng (53.38382104,-6.60011171);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT8, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT8).title("John Hume Lecture Tutorial Room 8, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT9(View v)
	{

		LatLng JHT9 =new LatLng (53.38378264,-6.60007952);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT9, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT9).title("John Hume Lecture Tutorial Room 9, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickJHT10(View v)
	{

		LatLng JHT10 =new LatLng (53.38375704,-6.60003661);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("John Hume Lecture Tutorial Room 10, upstairs, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickLGH(View v)
	{

		LatLng JHT10 =new LatLng (53.37825609,-6.59647987);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickMAH(View v)
	{

		LatLng JHT10 =new LatLng (53.37817289,-6.5963404);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickMCL(View v)
	{

		LatLng JHT10 =new LatLng (53.37822729,-6.59646378);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickMLLL(View v)
	{

		LatLng JHT10 =new LatLng (53.37831689,-6.59827159);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Lower Loftus, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickMPL(View v)
	{

		LatLng JHT10 =new LatLng (53.3837826,-6.59903883);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("MAP Lodge, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickMS1(View v)
	{

		LatLng JHT10 =new LatLng (53.3781637,-6.59630298);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Dep of Maths and Statistics, Top Floor, Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickMS2(View v)
	{

		LatLng JHT10 =new LatLng (53.3781125,-6.59632444);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Dep of Maths and Statistics, Top Floor, Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickMTL(View v)
	{

		LatLng JHT10 =new LatLng (53.37785649,-6.59607767);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Music Technology Laboratory, Behind Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickNMR(View v)
	{

		LatLng JHT10 =new LatLng (53.3782021,-6.59646391);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickOCR(View v)
	{

		LatLng JHT10 =new LatLng (53.3780613,-6.59610986);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Logic House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickPCT(View v)
	{

		LatLng JHT10 =new LatLng (53.38322586,-6.60042285);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("First Floor, Science Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickPH(View v)
	{

		LatLng JHT10 =new LatLng (53.38036527,-6.59604549);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Stoyte House, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickRH221(View v)
	{

		LatLng JHT10 =new LatLng (53.38359702,-6.59789085);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Second Floor, Rowan House, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickRVH(View v)
	{

		LatLng JHT10 =new LatLng (53.37941809,-6.59529447);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Riverstown Lodge, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickRYE(View v)
	{

		LatLng JHT10 =new LatLng (53.38490885,-6.59911393);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Riverstown Lodge, South Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickSLT(View v)
	{

		LatLng JHT10 =new LatLng (53.38336025,-6.60305142);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Biology Dep, Callan Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickTH1(View v)
	{

		LatLng JHT10 =new LatLng (53.38364181,-6.60150646);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickTH2(View v)
	{

		LatLng JHT10 =new LatLng (53.3837634,-6.60160302);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Arts Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickATC(View v)
	{

		LatLng JHT10 =new LatLng (53.38381459,-6.59903883);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Map Lodge, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	public void onClickIONTH(View v)
	{

		LatLng JHT10 =new LatLng (53.38462729,-6.60025119);//co-ordinates
		CameraUpdate update2=CameraUpdateFactory.newLatLngZoom(JHT10, 17);//gives the app a cameraupdate function to center on JHL5 and to zoom in by 16
		mapTS.animateCamera(update2);//tells google maps to update
		mapTS.setMapType(GoogleMap.MAP_TYPE_HYBRID);//sets the map type to google hybrid
		mapTS.addMarker(new MarkerOptions().position(JHT10).title("Ground Floor, Iontas Building, North Campus"));//adds a marker on JHL5 and this marker when pressed will say "John Hume Lecture theatre 5"	
	}
	
	
	
	
	
	
	
	
	

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	//private void setupActionBar() {

	//	getActionBar().setDisplayHomeAsUpEnabled(true);

	//}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lect_locator, menu);
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
