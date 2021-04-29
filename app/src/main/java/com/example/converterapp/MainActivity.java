package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button convert;
EditText kshs;
TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking with XML

        convert=findViewById(R.id.convert);
        kshs=findViewById(R.id.kshs);
        output=findViewById(R.id.output);

        //execution

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code
                if (kshs.length() == 0) {
                    output.setText("Enter Amount First");
                }

                else{
                    double amountKsh = Double.parseDouble(kshs.getText().toString());
                double amountUSD = (amountKsh / 109.65);
                output.setText("USD: " + amountUSD);
            }

               // Toast.makeText(MainActivity.this, "Working", Toast.LENGTH_SHORT).show();
            }
        });
    }
}