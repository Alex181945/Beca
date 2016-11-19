package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class TransporteActivity extends Activity {
	
	TextView  tv2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transporte);
		tv2 = (TextView)findViewById(R.id.tv2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.transporte, menu);
		return true;
	}
	public void reg (View view){
    	Intent x =new Intent (this,BecasActivity.class);
    	startActivity(x);
    }
	

}
