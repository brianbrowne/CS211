package com.example.historicireland2;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLHelper extends SQLiteOpenHelper
{

	public static final String TABLE_NAME="locations";
	public static final String ID_COL="loc_id";
	public static final String TITLE="loc_title";
	public static final String SNIPPET="loc_snippet";
	public static final String POSITION1="loc_position1";
	public static final String POSITION2="loc_position2";
	
	private static final int D_VERSION=1;
	private static final String DB_name="irelandlocations.db";
	private static final String DB_CREATE=
		"create table" + TABLE_NAME+ "["+ID_COL + "integer primary key auatoncrement, " +TITLE+
		"text" +SNIPPET+"text"+POSITION1+"text+POSITION2+text]";
	
	public MySQLHelper(Context context) {
		super(context, DB_name, null, D_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DB_CREATE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
		onCreate(db);
		
	}
	
}
