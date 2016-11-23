package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class CalenManActivity extends Activity {
	
	TextView tv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calen_man);
		
		tv4 = (TextView) findViewById(R.id.tv4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calen_man, menu);
		return true;
	}
	
	
public void doc (View view){
		
		String a = "";
		
		if(tv4.getText().toString().equals(""))
		{
		
		
		
		 a = "1.Acuse generado por SUBES del registro a beca de Manutención,firmado por el aspirante.\n " +
		 		"2. Constancia original de ingresos económicos mensuales por cada integrante" +
		 		"que aporte al gasto del hogar, de máximo 3 meses de antigüedad.\n " +
		 		"3. Copia de un comprobante de domicilio (recibo de luz, agua,teléfono) " +
		 		"de máximo 3 meses de antigüedad.\n " +
		 		"4. Las alumnas que estén embarazadas, presentar constancia médica original" +
		 		"que lo acredite.\n " +
		 		"5. Los alumnos que sean padres o madres, presentar copia del acta de nacimiento de los hijos.\n" +
		 		"6. Los estudiantes que tengan alguna discapacidad, presentar constancia" +
		 		"médica original que acredite que tiene alguna discapacidad motriz, visual o auditiva";

		}
		
		tv4.setText(a);
		
	}


public void reg (View view){
	Intent x =new Intent (this,ManutencionActivity.class);
	startActivity(x);

}
public void FecMan (View view){
	Intent x =new Intent (this,FechaManActivity.class);
	startActivity(x);
}


}

