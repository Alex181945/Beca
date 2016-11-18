package com.example.beca;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class TipsActivity extends Activity {
	
	
	private TextView tv1,tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tips);
	
		  tv1=(TextView) findViewById(R.id.tv1);
		  tv2=(TextView) findViewById(R.id.tv2);
		  /*tv3=(TextView) findViewById(R.id.tv3);
		  tv4=(TextView) findViewById(R.id.tv4);*/
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
	
	 public void tip1(View view){
	    	
	    	String tip1 = "";
	    	
	    	if(tv2.getText().toString().equals("")){
	    		
	    		tip1 =
	    		
	    		"PONER RECOMPENSAS\nDescansa cada 50-60 minutos y haz algo que te sea placentero durante 10 minutos:"+
	    		"•	Toma agua\n"+
	    		"•	Pasea a tu perro\n"+
	    		"•	Toma un aperitivo\n";
	    		

	    	}
	    	
	    	tv2.setText(tip1);
	    }

}
