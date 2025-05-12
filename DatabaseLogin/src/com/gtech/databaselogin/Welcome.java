package com.gtech.databaselogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends Activity {
	TextView tv;
	Button b1,b2;
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
         setContentView(R.layout.welcome);
         tv=(TextView) findViewById(R.id.textView1);
         b1=(Button) findViewById(R.id.button1);
         b2=(Button) findViewById(R.id.button2);
         Intent in=getIntent();
         Bundle b=in.getExtras();
         String user=b.getString("key");
         tv.setText("Welcome "+user);
         
         b1.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				Intent in=new Intent(getApplicationContext(),Login.class);
 				startActivity(in);
 				
 			}
 		});
         
         b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Thread t=new Thread()
				{
					
					
					public void run()
					{
						try {
							sleep(5000);
							Intent in1=new Intent(getApplicationContext(),NearestEVStation.class);
							startActivity(in1);
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				
				t.start();
				
				
				//Intent in1=new Intent(getApplicationContext(),NearestEVStation.class);
 				//startActivity(in1);
				
			}
		});
       
      
         
	}

}
