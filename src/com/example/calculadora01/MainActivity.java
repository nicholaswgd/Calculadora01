package com.example.calculadora01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	double n1, n2, resultado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText num1    = (EditText) findViewById(R.id.editTextValor1);
		final EditText num2    = (EditText) findViewById(R.id.editTextValor2);
		final EditText result  = (EditText) findViewById(R.id.editTextResultado);
		
        Button btSomar = (Button)   findViewById(R.id.buttonSoma);
        Button btSubtrair    = (Button)   findViewById(R.id.buttonSubtracao);
        Button btDividir     = (Button)   findViewById(R.id.buttonDivisao);
        Button btMultiplicar = (Button)   findViewById(R.id.buttonMultiplicacao);
        
    
      //SOMA
        btSomar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				n1 = Double.parseDouble(num1.getText().toString());
				n2 = Double.parseDouble(num2.getText().toString());	

				resultado = n1+n2;

				result.setText(String.valueOf(resultado));
			}
		});
		
        //Subtrai
        btSubtrair.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				n1 = Double.parseDouble(num1.getText().toString());
				n2 = Double.parseDouble(num2.getText().toString());	

				resultado = n1-n2;

				result.setText(String.valueOf(resultado));
			}
		});

        //DIVIDE
        btDividir.setOnClickListener(new View.OnClickListener() {

  			public void onClick(View v) {
  				n1 = Double.parseDouble(num1.getText().toString());
  				n2 = Double.parseDouble(num2.getText().toString());	

  				resultado = n1/n2;

  				result.setText(String.valueOf(resultado));
  			}
  		});

          //MULTIPLICA
        btMultiplicar.setOnClickListener(new View.OnClickListener() {

    			public void onClick(View v) {
    				n1 = Double.parseDouble(num1.getText().toString());
    				n2 = Double.parseDouble(num2.getText().toString());	

    				resultado = n1*n2;

    				result.setText(String.valueOf(resultado));
    			}
    		});
        
        
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
