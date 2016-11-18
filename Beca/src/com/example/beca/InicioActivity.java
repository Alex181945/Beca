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
		
		String a = "La Coordinaci�n Nacional de Becas de Educaci�n Superior (CNBES) C O N V O C A N,"
				+ " a los/las estudiantes de Licenciatura y T�cnico Superior Universitario (TSU)"
				+ " que hayan ingresado o se encuentren realizando estudios en "
				+ "Instituciones P�blicas de Educaci�n Superior (IPES) en M�xico "
				+ "para que obtengan una beca de Manutenci�n.";
		
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
				"2. Estar inscrito en una IPES de M�xico para iniciar o continuar" +
				" estudios de nivel superior." +
				"3. Provenir de un hogar cuyo ingreso sea igual o menor " +
				"a cuatro salarios m�nimos per c�pita (por persona) vigentes al momento de solicitar la beca." +
				"4. Ser alumno regular (no adeudar asignaturas de ciclos escolares anteriores y cursar las materias " +
				"de acuerdo con el plan de estudios que corresponda. 5.-Promedio general m�nimo de calificaci�n de" +
				" 8.0 (ocho) o su equivalente en una escala de 0 (cero) a 10 (diez)6. Los solicitantes no deben haber " +
				"concluido estudios de licenciatura, ni contar con t�tulo profesional de ese nivel o superior." +
				"7. Postularse como aspirante a trav�s del registro de su solicitud de beca en el Sistema �nico de Beneficiarios de Educaci�n Superior (SUBES), en la " +
				"p�gina electr�nica: www.subes.sep.gob.mx";
		
		tv2.setText(b);

	}*/
	/*public void Manutenci�n (View view){
		Intent x =new Intent (this,ManutencionActivity.class);
    	startActivity(x);
	}*/

}
