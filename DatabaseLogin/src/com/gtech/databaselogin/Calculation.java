package com.gtech.databaselogin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculation);
		
		final EditText e1=(EditText) findViewById(R.id.editText1);
		final EditText e2=(EditText) findViewById(R.id.editText2);
		final EditText e3=(EditText) findViewById(R.id.editText3);
		
		Button b1=(Button) findViewById(R.id.button1);
		
		Bundle bun=getIntent().getExtras();
		String b=bun.getString("abc");
		
		e1.setText(b.toString());
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mm=e1.getText().toString();
				String nn=e2.getText().toString();
				Integer i=Integer.parseInt(mm);
				Integer kw=Integer.parseInt(nn);
				
				Integer res=i*kw;
				
				e3.setText(res.toString());
				
			}
		});
		
		Button b2=(Button) findViewById(R.id.button2);
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendSMS();
			}

			private void sendSMS() {
				// TODO Auto-generated method stub
				SmsManager sm=SmsManager.getDefault();
				
				String mob="9025983771";
				String msg="Amount Has been Debited from Your Account Soon,Thank You..";
				
				sm.sendTextMessage(mob, null, msg, null, null);
				Toast.makeText(getApplicationContext(), "Debited", 0).show();
				
				Intent in1=new Intent(getApplicationContext(),Login.class);
				startActivity(in1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculation, menu);
		return true;
	}

}
