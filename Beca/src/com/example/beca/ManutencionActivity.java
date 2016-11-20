package com.example.beca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ManutencionActivity extends Activity {
	
	TextView  tv2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manutencion);
		
		tv2 = (TextView)findViewById(R.id.tv2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.manutencion, menu);
		return true;
	}
public void req(View view){
	

String a = "";
	
	if(tv2.getText().toString().equals(""))
	{
	
	
		
		 a = "1. Ser mexicano.\n"+
        "2. Estar inscrito en una IPES de México para iniciar o continuar estudios de nivel superior.\n"+
        "3. Provenir de un hogar cuyo ingreso sea igual o menor a cuatro salarios mínimos per cápita (por persona) " +
        "vigentes al momento de solicitar la beca.\n 4. Ser alumno regular.\n " +
        "5.-Promedio general mínimo de calificación de 8.0 (ocho) o su equivalente en una escala de" +
        " 0 (cero) a 10 (diez). \n 6. Los solicitantes no deben haber concluido estudios de licenciatura, ni contar" +
        "con título profesional de ese nivel o superior. \n" +
        "7. Postularse como aspirante a través del registro de su solicitud de beca en el " +
        "Sistema Único de Beneficiarios de Educación Superior (SUBES).";
	}


		
		tv2.setText(a);
}


	public void reg (View view){
    	Intent x =new Intent (this,BecasActivity.class);
    	startActivity(x);
    }
	
	
	

}
