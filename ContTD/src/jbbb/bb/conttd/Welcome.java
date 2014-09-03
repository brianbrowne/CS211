package jbbb.bb.conttd;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Welcome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		Button FindYourRoom = (Button) findViewById(R.id.button1);
		FindYourRoom.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent=new Intent(v.getContext(),CarlKil.class);
				startActivityForResult(intent,0);
			}
		});
		
		Button CavanMonaghan = (Button) findViewById(R.id.button2);
		CavanMonaghan.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent2=new Intent(v.getContext(),CavMon.class);
				startActivityForResult(intent2,0);
			}
		});
		
		Button Clare = (Button) findViewById(R.id.button3);
		Clare.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent3=new Intent(v.getContext(),Clare.class);
				startActivityForResult(intent3,0);
			}
		});
		
		Button CorkNorthCentral = (Button) findViewById(R.id.button5);
		CorkNorthCentral.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent4=new Intent(v.getContext(),CNC.class);
				startActivityForResult(intent4,0);
			}
		});
		
		Button CorkNorthWest = (Button) findViewById(R.id.button6);
		CorkNorthWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent5=new Intent(v.getContext(),CNW.class);
				startActivityForResult(intent5,0);
			}
		});
		
		Button CorkEast = (Button) findViewById(R.id.button4);
		CorkEast.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent6=new Intent(v.getContext(),CoEa.class);
				startActivityForResult(intent6,0);
			}
		});
		
		Button CorkSouthCentral = (Button) findViewById(R.id.button7);
		CorkSouthCentral.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent7=new Intent(v.getContext(),CSC.class);
				startActivityForResult(intent7,0);
			}
		});
		
		Button CorkSouthWest = (Button) findViewById(R.id.button8);
		CorkSouthWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent8=new Intent(v.getContext(),CSW.class);
				startActivityForResult(intent8,0);
			}
		});
		
		Button DonegalSouthWest = (Button) findViewById(R.id.button9);
		DonegalSouthWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent9=new Intent(v.getContext(),DSW.class);
				startActivityForResult(intent9,0);
			}
		});
		
		Button DublinCentral = (Button) findViewById(R.id.button10);
		DublinCentral.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent10=new Intent(v.getContext(),DubCen.class);
				startActivityForResult(intent10,0);
			}
		});
		
		Button DublinMidWest = (Button) findViewById(R.id.button11);
		DublinMidWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent11=new Intent(v.getContext(),DMW.class);
				startActivityForResult(intent11,0);
			}
		});
		
		Button DublinNorth = (Button) findViewById(R.id.button12);
		DublinNorth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent12=new Intent(v.getContext(),DubNor.class);
				startActivityForResult(intent12,0);
			}
		});
		
		Button DublinNorthCentral = (Button) findViewById(R.id.button13);
		DublinNorthCentral.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent13=new Intent(v.getContext(),DNC.class);
				startActivityForResult(intent13,0);
			}
		});
		
		Button DublinNorthEast = (Button) findViewById(R.id.button15);
		DublinNorthEast.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent15=new Intent(v.getContext(),DNE.class);
				startActivityForResult(intent15,0);
			}
		});
		
		Button DublinNorthWest = (Button) findViewById(R.id.button14);
		DublinNorthWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent14=new Intent(v.getContext(),DNW.class);
				startActivityForResult(intent14,0);
			}
		});
		
		Button DublinSouth = (Button) findViewById(R.id.button16);
		DublinSouth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent16=new Intent(v.getContext(),DubSou.class);
				startActivityForResult(intent16,0);
			}
		});
		
		Button DublinSouthCentral = (Button) findViewById(R.id.button17);
		DublinSouthCentral.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent17=new Intent(v.getContext(),DSC.class);
				startActivityForResult(intent17,0);
			}
		});
		
		Button DublinSouthEast = (Button) findViewById(R.id.button18);
		DublinSouthEast.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent18=new Intent(v.getContext(),DSE.class);
				startActivityForResult(intent18,0);
			}
		});
		
		Button DublinSouthWest = (Button) findViewById(R.id.button19);
		DublinSouthWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent19=new Intent(v.getContext(),DubSW.class);
				startActivityForResult(intent19,0);
			}
		});
		
		Button DublinWest = (Button) findViewById(R.id.button20);
		DublinWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent20=new Intent(v.getContext(),DubWes.class);
				startActivityForResult(intent20,0);
			}
		});
		
		Button DunLaoghaire = (Button) findViewById(R.id.button21);
		DunLaoghaire.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent21=new Intent(v.getContext(),DunLao.class);
				startActivityForResult(intent21,0);
			}
		});
		
		Button GalwayEast = (Button) findViewById(R.id.button22);
		GalwayEast.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent22=new Intent(v.getContext(),GalE.class);
				startActivityForResult(intent22,0);
			}
		});
		
		Button GalwayWest = (Button) findViewById(R.id.button23);
		GalwayWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent23=new Intent(v.getContext(),GalW.class);
				startActivityForResult(intent23,0);
			}
		});
		
		Button KerryNorthLimerickWest = (Button) findViewById(R.id.button24);
		KerryNorthLimerickWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent24=new Intent(v.getContext(),KerryNor.class);
				startActivityForResult(intent24,0);
			}
		});
		
		Button KerrySouth = (Button) findViewById(R.id.button25);
		KerrySouth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent25=new Intent(v.getContext(),KerrySou.class);
				startActivityForResult(intent25,0);
			}
		});
		
		Button KildareNorth = (Button) findViewById(R.id.button26);
		KildareNorth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent26=new Intent(v.getContext(),KilNor.class);
				startActivityForResult(intent26,0);
			}
		});
		
		Button KildareSouth = (Button) findViewById(R.id.button27);
		KildareSouth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent27=new Intent(v.getContext(),KilSou.class);
				startActivityForResult(intent27,0);
			}
		});
		
		Button LaoisOffaly = (Button) findViewById(R.id.button28);
		LaoisOffaly.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent28=new Intent(v.getContext(),LaoOff.class);
				startActivityForResult(intent28,0);
			}
		});
		
		Button LimerickEast = (Button) findViewById(R.id.button29);
		LimerickEast.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent29=new Intent(v.getContext(),LimE.class);
				startActivityForResult(intent29,0);
			}
		});
		
		Button LimerickCity = (Button) findViewById(R.id.button30);
		LimerickCity.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent30=new Intent(v.getContext(),LimW.class);
				startActivityForResult(intent30,0);
			}
		});
		
		Button LongFordWestmeath = (Button) findViewById(R.id.button31);
		LongFordWestmeath.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent31=new Intent(v.getContext(),LongWest.class);
				startActivityForResult(intent31,0);
			}
		});
		
		Button Louth = (Button) findViewById(R.id.button32);
		Louth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent32=new Intent(v.getContext(),Louth.class);
				startActivityForResult(intent32,0);
			}
		});
		
		Button Mayo = (Button) findViewById(R.id.button33);
		Mayo.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent33=new Intent(v.getContext(),Mayo.class);
				startActivityForResult(intent33,0);
			}
		});
		
		Button MeathEast = (Button) findViewById(R.id.button34);
		MeathEast.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent34=new Intent(v.getContext(),MeE.class);
				startActivityForResult(intent34,0);
			}
		});
		
		Button MeathWest = (Button) findViewById(R.id.button35);
		MeathWest.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent35=new Intent(v.getContext(),MeW.class);
				startActivityForResult(intent35,0);
			}
		});
		
		Button RoscommonLeitrimSouth = (Button) findViewById(R.id.button36);
		RoscommonLeitrimSouth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent36=new Intent(v.getContext(),RosSL.class);
				startActivityForResult(intent36,0);
			}
		});
		
		Button SligoLeitrimNorth = (Button) findViewById(R.id.button37);
		SligoLeitrimNorth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent37=new Intent(v.getContext(),SlNL.class);
				startActivityForResult(intent37,0);
			}
		});
		
		Button TippNorth = (Button) findViewById(R.id.button38);
		TippNorth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent38=new Intent(v.getContext(),TippN.class);
				startActivityForResult(intent38,0);
			}
		});
		
		Button TippSouth = (Button) findViewById(R.id.button39);
		TippSouth.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent39=new Intent(v.getContext(),TippS.class);
				startActivityForResult(intent39,0);
			}
		});
		
		Button Waterford = (Button) findViewById(R.id.button40);
		Waterford.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent40=new Intent(v.getContext(),Watf.class);
				startActivityForResult(intent40,0);
			}
		});
		
		Button Wexford = (Button) findViewById(R.id.button41);
		Wexford.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent41=new Intent(v.getContext(),Wexf.class);
				startActivityForResult(intent41,0);
			}
		});
		
		Button Wicklow = (Button) findViewById(R.id.button42);
		Wicklow.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent42=new Intent(v.getContext(),Wick.class);
				startActivityForResult(intent42,0);
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}
