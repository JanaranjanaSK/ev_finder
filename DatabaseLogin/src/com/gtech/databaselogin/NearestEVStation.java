package com.gtech.databaselogin;

import java.util.ArrayList;

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

public class NearestEVStation extends Activity {
ListView lv1;
ArrayList<String> al;
ArrayAdapter<String> aa;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nearest_evstation);
		
		lv1=(ListView) findViewById(R.id.listView1);
	
		
		al=new ArrayList<String>();
		aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,al);
		lv1.setAdapter(aa);
		
	
		al.add("Zeon Charging Stattion\n," +" Madurai Byepass Road\n," +" Service Road, Karur-639001.\n(Near to Subbana Hotel,LGB Nagar");
		al.add("Use");
		
		al.add("**************************************************************");
		
		al.add("VIA Charging Station\n Family Restaurant, 2, Semmadai, near 11 to 11, inside Karur\n, Manmangalam\n, Tamil Nadu 639006\n 090428 27290");
		al.add("Available");
		
		al.add("**************************************************************");
		al.add("Electric Vehicle Only\n X2JJ+J76, Athur, Karur, Tamil Nadu 639002\n ");
		al.add("Temporary Closed");
		
		al.add("**************************************************************");
		
		
		aa.notifyDataSetChanged();
		
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case 1:
					Toast.makeText(getApplicationContext(), "Sorry its in Use.. Kindly Move on Next Station..", 0).show();
					
					break;
				case 4:
					Toast.makeText(getApplicationContext(), "Most Welcome...", 0).show();
					
					Intent in=new Intent(getApplicationContext(),KarurEV.class);
					startActivity(in);
					
					break;
				case 7:
					Toast.makeText(getApplicationContext(), "Sorry out Of Service... Move Next One", 0).show();
					
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
		getMenuInflater().inflate(R.menu.nearest_evstation, menu);
		return true;
	}

}
