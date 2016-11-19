package com.example.beca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BecasActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_becas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.becas, menu);
		return true;
	}
	
	public void Manut(View view){
		Intent x =new Intent (this,ManutencionActivity.class);
    	startActivity(x);
	}
	public void Trans (View view){
		Intent x =new Intent (this,TransporteActivity.class);
    	startActivity(x);
	}
	
	
	public void reg (View view){
		Intent x =new Intent (this,InicioActivity.class);
    	startActivity(x);
    
	}

}
