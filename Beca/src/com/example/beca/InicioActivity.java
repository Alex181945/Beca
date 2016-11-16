package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class InicioActivity extends Activity {
	
	TextView tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
		
		tv2 = (TextView) findViewById(R.id.tv2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
		return true;
	}
	
	public void Info(View view){
		
		String a = "La Coordinación Nacional de Becas de Educación Superior (CNBES) C O N V O C A N,"
				+ " a los/las estudiantes de Licenciatura y Técnico Superior Universitario (TSU)"
				+ " que hayan ingresado o se encuentren realizando estudios en "
				+ "Instituciones Públicas de Educación Superior (IPES) en México "
				+ "para que obtengan una beca de Manutención.";
		
		tv2.setText(a);
		
	}
	
	public void Becas(View view){
		Intent x =new Intent (this,BecasActivity.class);
    	startActivity(x);
	}

}
