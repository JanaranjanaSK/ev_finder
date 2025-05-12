package com.gtech.databaselogin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Zeon extends Activity {
ImageButton ib1,ib2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zeon);
		
		ib1=(ImageButton) findViewById(R.id.imageButton1);
		ib2=(ImageButton) findViewById(R.id.imageButton2);
		
		
		ib1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Bundle bun=new Bundle();
				String value="25";
				
				Intent in=new Intent(getApplicationContext(),Calculation.class);
				bun.putString("abc", value);
				in.putExtras(bun);
				startActivity(in);
			}
		});
		
ib2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Bundle bun=new Bundle();
				String value="22";
				
				Intent in=new Intent(getApplicationContext(),Calculation.class);
				bun.putString("abc", value);
				in.putExtras(bun);
				startActivity(in);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.zeon, menu);
		return true;
	}

}
