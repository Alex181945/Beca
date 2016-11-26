package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class PagotActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pagot);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pagot, menu);
		return true;
	}
	
	public void dere (View view){
    	Intent x =new Intent (this,DerechostActivity.class);
    	startActivity(x);
    }
	
	public void reg (View view){
    	Intent x =new Intent (this,FechatActivity.class);
    	startActivity(x);
    }

}
