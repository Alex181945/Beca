package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class CalenTransActivity extends Activity {
	
	TextView tv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calen_trans);
		
		tv4 = (TextView) findViewById(R.id.tv4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calen_trans, menu);
		return true;
	}
public void doc (View view){
		
		String a = "";
		
		if(tv4.getText().toString().equals(""))
		{
		
		
		
		 a = "1. Constancia original de ingresos económicos mensuales por cada integrante" +
		 		"que aporte al gasto del hogar.\n" +
		 		"a) Comprobante original de ingreso mensual expedido por fuente de" +
		 		"trabajo de cada integrante que aporte gasto del hogar.\n" +
		 		"b) En caso de recibir pago mediante cheque o efectivo," +
		 		"presentar copia de los recibos de un mes.\n" +
		 		"c) Carta original del alumno en la que manifieste, bajo protesta de decir" +
		 		"verdad,si el alumno es menor de edad," +
		 		"dicha carta deberá ser expedida por el tutor." +
		 		"2. Los alumnos pertenecientes a familias beneficiadas de PROSPERA," +
		 		"Programa de Inclusión Social, presentar copia de su formato para" +
		 		"acreditar que pertenecen al programa.";

		}
		
		tv4.setText(a);
		
	}
public void reg (View view){
	Intent x =new Intent (this,TransporteActivity.class);
	startActivity(x);

}
public void Fechat(View view){
	Intent x =new Intent (this,FechatActivity.class);
	startActivity(x);
}

}
