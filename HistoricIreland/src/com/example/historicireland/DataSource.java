package com.example.historicireland;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DataSource 
{
	MySQLHelper dbHelper;
	SQLiteDatabase db;
	String [] cols={MySQLHelper.TITLE, MySQLHelper.SNIPPET, MySQLHelper.POSITION};
	
	public DataSource(Context c)
	{
		dbHelper=new MySQLHelper(c);
	}
	
	public void open()
	{
		db=dbHelper.getWritableDatabase();
	}
	public void close()
	{
		db.close();
	}
	public void addMarker(dataObject m)
	{
		ContentValues v = new ContentValues();
		v.put(MySQLHelper.TITLE, m.getTitle());
		v.put(MySQLHelper.SNIPPET, m.getSnippet());
		v.put(MySQLHelper.POSITION, m.getPosition());
		
		db.insert(MySQLHelper.TABLE_NAME, null, v);
	}
	public List<dataObject> getMyMarkers()
	{
		List<dataObject> markers=new ArrayList<dataObject>();
		
		Cursor cursor =db.query(MySQLHelper.TABLE_NAME, cols, null, null, null, null, null);
		cursor.moveToFirst();
		while(!cursor.isAfterLast())
		{
			dataObject m =cursorToMarker(cursor);
			markers.add(m);
			cursor.moveToNext();
		}
		cursor.close();
		
		return markers;
	}
	private dataObject cursorToMarker(Cursor cursor)
	{
		dataObject m=new dataObject();
		m.setTitle(cursor.getString(0));
		m.setSnippet(cursor.getString(1));
		m.setPosition(cursor.getString(2));
		
		return m;
	}
	
	
	
	
	
	
}
