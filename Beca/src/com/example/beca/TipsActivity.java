package com.example.beca;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class TipsActivity extends Activity {
	
	
	private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tips);
	
		  tv1=(TextView) findViewById(R.id.tv1);
		  tv2=(TextView) findViewById(R.id.tv2);
		  tv3=(TextView) findViewById(R.id.tv3);
		  tv4=(TextView) findViewById(R.id.tv4);
		  tv5=(TextView) findViewById(R.id.tv5);
		  tv6=(TextView) findViewById(R.id.tv6);
		  tv7=(TextView) findViewById(R.id.tv7);

		  
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tips, menu);
		return true;
	}
	
	public void Manut(View view){
		Intent x =new Intent (this,ManutencionActivity.class);
    	startActivity(x);
	}
	public void reg (View view){
		Intent x =new Intent (this,InicioActivity.class);
    	startActivity(x);
	}
	 public void tip1(View view){
	    	
	    	String tip1 = "";
	    	
	    	if(tv4.getText().toString().equals("")){
	    		
	    		tip1 =
	    		
	    		"PONER RECOMPENSAS\nDescansa cada 50-60 minutos y haz algo que te sea placentero durante 10 minutos:\n"+
	    		"•	Toma agua\n"+
	    		"•	Pasea a tu perro\n"+
	    		"•	Toma un aperitivo\n";
	    		

	    	}
	    	
	    	tv4.setText(tip1);
	    }
	 
	 
	 public void tip2 (View view){
	    	
	    	String tip2 = "";
	    	
	    	if(tv5.getText().toString().equals("")){
	    		
	    		tip2 =
	    		
	    				"ELIMINA DISTRACCIONES\n " +
	    				"•	Evita redes sociales y WhatsApp. Esconde el móvil o apágalo.\n" +
	    				"•	Si trabajas con el ordenador/laptop, usa programas o " +
	    				"aplicaciones que bloquean el acceso a redes sociales \n" +
	    				"•	Si estudias en la biblioteca, intenta ponerte en un lugar que no te permita distraerte.";

	    		

	    	}
	    	
	    	tv5.setText(tip2);
	    }
	 
	 public void tip3 (View view){
	    	
	    	String tip3 = "";
	    	
	    	if(tv6.getText().toString().equals("")){
	    		
	    		tip3 =
	    				"CREAR MAPAS MENTAL\n" +
	    				"Los mapas mentales son una de las mejores formas de" +
	    				"recordar la estructura de un contenido.\n" +
	    				"Si tienes que desarrollar largos temas, te resultará una herramienta excelente.";
	    	}
	    	
	    	tv6.setText(tip3);
	    }
	 
	 
	 public void tip4 (View view){
	    	
	    	String tip4 = "";
	    	
	    	if(tv7.getText().toString().equals("")){
	    		
	    		tip4 =
	    				"LEE EN VOZ ALTA\n" +
	    				"Lee en voz alta al repasar una lectura en lugar\n" +
	    				" de estar en silencio, esto te ayudará a retener la información.";

	    	}
	    	
	    	tv7.setText(tip4);
	    }
	 
 
	 
	 

}
