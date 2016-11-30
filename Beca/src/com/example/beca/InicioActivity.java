package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InicioActivity extends Activity {
	
	ImageView img;
	TextView tv3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
		
		img = (ImageView) findViewById(R.id.iv1);
		tv3 = (TextView) findViewById(R.id.tv3);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
		return true;
	}
	
	public void Info(View view){
		
		String a = "";
		
		if(tv3.getText().toString().equals(""))
		{
			img.setVisibility(0);
		 a = "La Coordinación Nacional de Becas de Educación Superior (CNBES) C O N V O C A N,"
				+ " a los/las estudiantes de Licenciatura y Técnico Superior Universitario (TSU)"
				+ " que hayan ingresado o se encuentren realizando estudios en "
				+ "Instituciones Públicas de Educación Superior (IPES) en México "
				+ "para que obtengan una beca de Manutención.";
		}
		
		img.setVisibility(1);
		tv3.setText(a);
		
	}
	public void Becas(View view){
		Intent x =new Intent (this,BecasActivity.class);
    	startActivity(x);
	}
	
	public void Tips (View view){
		Intent x =new Intent (this,TipsActivity.class);
    	startActivity(x);
	}
	}


