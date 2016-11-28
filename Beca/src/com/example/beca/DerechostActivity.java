package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class DerechostActivity extends Activity {
	TextView tv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_derechost);
		
		tv4 = (TextView) findViewById(R.id.tv4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.derechost, menu);
		return true;
	}
	
	
public void leer (View view){
		
		String a = "";
		
		if(tv4.getText().toString().equals(""))
		{
		
		
		
		 a = "Los becarios adquieren los derechos y las obligaciones especificados en el" +
		 		" Acuerdo número 16/12/15 por el que se emiten las Reglas de Operación del " +
		 		"Programa Nacional de Becas para el ejercicio fiscal 2016, publicado en el Diario Oficial " +
		 		"de la Federación el 30 de diciembre de 2015 en el numeral 3.5, el cual puede " +
		 		"consultarse en la página de la CNBES, en su sección BECARIOS, " +
		 		"opción Derechos, obligaciones, suspensiones y cancelaciones.";
		}
		
		tv4.setText(a);
		
	}
public void reg (View view){
	Intent x =new Intent (this,PagotActivity.class);
	startActivity(x);
}
}



