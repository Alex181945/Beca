package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class FechatActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fechat);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fechat, menu);
		return true;
	}
	
	public void reg (View view){
    	Intent x =new Intent (this,CalenManActivity.class);
    	startActivity(x);
    }
	
	public void pagos (View view){
    	Intent x =new Intent (this,PagomActivity.class);
    	startActivity(x);
    }

}
