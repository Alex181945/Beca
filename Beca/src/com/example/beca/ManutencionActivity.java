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
		
		String a = "1. Ser mexicano.\n"+
        "2. Estar inscrito en una IPES de México para iniciar o continuar estudios de nivel superior.\n"+
        "3. Provenir de un hogar cuyo ingreso sea igual o menor a cuatro salarios mínimos per cápita (por persona) vigentes al momento de solicitar la beca.";
		
		tv2.setText(a);
}
	public void reg (View view){
    	Intent x =new Intent (this,BecasActivity.class);
    	startActivity(x);
    }
	
	
	

}
