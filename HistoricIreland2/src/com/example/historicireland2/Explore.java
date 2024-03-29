package com.example.historicireland2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.location.Location;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;

public class Explore extends FragmentActivity implements LocationListener
{
	private GoogleMap googlemap;
	DataSource data;
	Context context=this;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_explore);
		// Show the Up button in the action bar.
		setupActionBar();


		googlemap=((MapFragment)getFragmentManager().findFragmentById(R.id.googlemap)).getMap();
		googlemap.setMyLocationEnabled(true);//Enable GPS Location.
		googlemap.setMapType(GoogleMap.MAP_TYPE_HYBRID);//Set teh map to be hybrid when the activity starts up.


		StrictMode.enableDefaults();
		getData();
	}

	public void getData()
	{
		String result ="";
		InputStream isr=null;
		try
		{
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost("http://localhost/android_connect/get_all_products.php");
			
			
			//AlertDialog.Builder builder=new AlertDialog.Builder(this);
			//builder.setTitle("Connecting");
			
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			isr = entity.getContent();
			
			

		} 
		catch (Exception e) 
		{
			Log.e("log_tag", "Error in http connection " + e.toString());
		}
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					isr, "iso-8859-1"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			isr.close();
			result = sb.toString();
		} catch (Exception e) {
			Log.e("log_tag", "Error converting result " + e.toString());
		}
		try
		{
			//JSONArray jArray=new JSONArray(result);
			
			List<dataObject> m = data.getMyMarkers();
			for(int i=0;i<((JSONArray) m).length();i++)
			{
				
				String[] slatlng = m.get(i).getPosition1().split(" ");
				String[] slatlng2 = m.get(i).getPosition2().split(" ");
				LatLng lat=new LatLng(Double.valueOf(slatlng[0]), Double.valueOf(slatlng2[0]));
				//JSONObject json=jArray.getJSONObject(i);	    		
				googlemap.addMarker(new MarkerOptions()
				.title(m.get(i).getTitle())
				.snippet(m.get(i).getSnippet())
				.position(lat));
			}
		}catch(Exception e)
		{
			Log.e("log_tag", "Error Parsing Data"+e.toString());
		}

	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.explore, menu);
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

	@Override
	public void onLocationChanged(Location arg0) {
		// TODO Auto-generated method stub

	}

}
