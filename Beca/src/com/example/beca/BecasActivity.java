package com.example.beca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BecasActivity extends Activity {
	
	TextView tv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_becas);
		
		tv4 = (TextView) findViewById(R.id.tv4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.becas, menu);
		return true;
	}
	
public void regis (View view){
	String a = "";
	
	if(tv4.getText().toString().equals(""))
	{
		
		
		 a = 
				"Para el registro en el SUBES deberán contar con:\n" +
				"a)	Clave Única de Registro de Población (CURP) actualizada, " +
				"la cual deberá verificarse en la página electrónica:\n" +
				"https://consultas.curp.gob.mx/CurpSP/gobmx/inicio.jsp\n" +
				"b)	Cuenta personal activa de correo electrónico.\n" +
				"c)	Ficha escolar actualizada por parte de su IPES y activada por " +
				"el propio estudiante desde su cuenta en el SUBES, " +
				"en el menú “Perfil”, apartado “Información escolar”.\n" +
				"(http://www.cnbes.sep.gob.mx/2-principal/49-reg_subes)";
	}
		
		tv4.setText(a);
		
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
