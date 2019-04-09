package com.example.a19134355_7.aplicacion4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private View btn;
        private final String SALUDO= "Hola a todos desde otro activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.ButtonMain);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                //Toast.makeText(MainActivity.this,"Click en siguiente",Toast.LENGTH_LONG).show();
                Intent intent= new Intent( MainActivity.this,SecondActivity.class);
                intent.putExtra("saludo",SALUDO);
                startActivity(intent);
            }
        });
    }
}
