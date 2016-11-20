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
	
public void req(View view){
		
		String a = "Los alumnos que requieran solicitar la beca complementaria “Apoya tu Transporte” deben:\n"+
        "1.-Ser beneficiarios del programa PROSPERA, Programa de Inclusión Social.\n"+
        "2.-Comprobar un gasto por concepto de transporte para trasladarse a su\n"+
        "IPES por un monto igual o mayor a $500.00 (quinientos pesos 00/00 M.N.) mensuales.";
		
		tv2.setText(a);
}


	public void reg (View view){
    	Intent x =new Intent (this,BecasActivity.class);
    	startActivity(x);
    }
	

}
