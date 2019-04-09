package com.example.a19134355_7.aplicacion4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        texto = (TextView) findViewById(R.id.TextViewMain);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            String saludo = bundle.getString("saludo");
            Toast.makeText(SecondActivity.this,saludo, Toast.LENGTH_LONG).show();
            texto.setText(saludo);
        }else
        {
            Toast.makeText(SecondActivity.this,"esta vacio",Toast.LENGTH_LONG).show();
        }
    }
}
