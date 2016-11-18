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
	
	public void Tips (View view){
		Intent x =new Intent (this,TipsActivity.class);
    	startActivity(x);
	}
	


	
	/*public void Req(View view){
		
		String b = "1. Ser mexicano." +
				"2. Estar inscrito en una IPES de México para iniciar o continuar" +
				" estudios de nivel superior." +
				"3. Provenir de un hogar cuyo ingreso sea igual o menor " +
				"a cuatro salarios mínimos per cápita (por persona) vigentes al momento de solicitar la beca." +
				"4. Ser alumno regular (no adeudar asignaturas de ciclos escolares anteriores y cursar las materias " +
				"de acuerdo con el plan de estudios que corresponda. 5.-Promedio general mínimo de calificación de" +
				" 8.0 (ocho) o su equivalente en una escala de 0 (cero) a 10 (diez)6. Los solicitantes no deben haber " +
				"concluido estudios de licenciatura, ni contar con título profesional de ese nivel o superior." +
				"7. Postularse como aspirante a través del registro de su solicitud de beca en el Sistema Único de Beneficiarios de Educación Superior (SUBES), en la " +
				"página electrónica: www.subes.sep.gob.mx";
		
		tv2.setText(b);

	}*/
	/*public void Manutención (View view){
		Intent x =new Intent (this,ManutencionActivity.class);
    	startActivity(x);
	}*/

}
