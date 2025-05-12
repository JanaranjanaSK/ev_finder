package com.gtech.databaselogin;

import java.util.ArrayList;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class KarurEV extends Activity {
	ListView lv1;
	ArrayList<String> al;
	ArrayAdapter<String> aa;
	Intent in,in1;
	String value,url;
	Bundle bun;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_karur_ev);
		
	lv1=(ListView) findViewById(R.id.listView1);
		
		al=new ArrayList<String>();
		aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,al);
		lv1.setAdapter(aa);
		
		
		al.add("Slot:1 Available\n 50-60 kw, Rs25/kwh");
		al.add("Direction");
		al.add("----------------------------------------");
		
		al.add("Slot:2 Charging\n 50-60 kw, Rs22/kwh");
		al.add("Direction");
		al.add("----------------------------------------");
		
		al.add("Unvailable\n 50-60 kw, Rs20/kwh");
		al.add("Direction");
		al.add("----------------------------------------");
		
		aa.notifyDataSetChanged();
		
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
		
					
					 in=new Intent(getApplicationContext(),Zeon.class);
					
					startActivity(in);
					break;
				case 1:
					url="https://www.google.com/maps/dir/11.5149349,78.0309535/VIA+Charging+Station,+Family+Restaurant,+2,+Semmadai,+near+11+to+11,+inside+Karur,+Manmangalam,+Tamil+Nadu+639006/@11.2713828,77.7182124,10z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3baa2f923b784845:0x69f3292d06f72d43!2m2!1d78.068175!2d11.0122168?entry=ttu&g_ep=EgoyMDI0MTExOS4yIKXMDSoJLDEwMjExMjM0SAFQAw%3D%3D";
					
					 in1=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
					startActivity(in1);
					
					break;
					
					
				case 3:
					
					
					Intent in=new Intent(getApplicationContext(),Zeon.class);
					
					startActivity(in);
					break;
				case 4:
				 url="https://www.google.com/maps/dir/11.5149349,78.0309535/VIA+Charging+Station,+Family+Restaurant,+2,+Semmadai,+near+11+to+11,+inside+Karur,+Manmangalam,+Tamil+Nadu+639006/@11.2713828,77.7182124,10z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3baa2f923b784845:0x69f3292d06f72d43!2m2!1d78.068175!2d11.0122168?entry=ttu&g_ep=EgoyMDI0MTExOS4yIKXMDSoJLDEwMjExMjM0SAFQAw%3D%3D";
					
				 in1=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
					startActivity(in1);
					
					break;
					
				case 6:
					Toast.makeText(getApplicationContext(), "Sorry.. Unavailable", 0).show();
					break;
				case 7:
					 url="https://www.google.com/maps/dir/11.5149349,78.0309535/VIA+Charging+Station,+Family+Restaurant,+2,+Semmadai,+near+11+to+11,+inside+Karur,+Manmangalam,+Tamil+Nadu+639006/@11.2713828,77.7182124,10z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3baa2f923b784845:0x69f3292d06f72d43!2m2!1d78.068175!2d11.0122168?entry=ttu&g_ep=EgoyMDI0MTExOS4yIKXMDSoJLDEwMjExMjM0SAFQAw%3D%3D";
					
					 in1=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
					startActivity(in1);
					
					break;

				default:
					break;
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.karur_ev, menu);
		return true;
	}

}
